package ro.nicuch.elementals.protection;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.YamlConfiguration;

import com.google.common.collect.Lists;

import ro.nicuch.elementals.Elementals;

public class Field {
    private final String id;
    private final UUID owner;
    private final Block maxLoc;
    private final Block minLoc;
    private final List<UUID> members = Lists.newArrayList();
    private final int chunkX;
    private final int chunkZ;
    private final World world;
    private final YamlConfiguration config;
    private final File file;

    public Field(String id, UUID owner, Block maxLoc, Block minLoc, Chunk chunk, World world) {
        this.id = id;
        this.owner = owner;
        this.maxLoc = maxLoc;
        this.minLoc = minLoc;
        this.chunkX = chunk.getX();
        this.chunkZ = chunk.getZ();
        this.world = world;
        this.file = new File(
                Elementals.get().getDataFolder() + File.separator + "regiuni" + File.separator + this.id + ".yml");
        this.config = YamlConfiguration.loadConfiguration(this.file);
        if (this.file.exists())
            this.members.addAll(FieldUtil.convertStringsToUUIDs(this.config.getStringList("members")));
        this.save();
    }

    public String getId() {
        return this.id;
    }

    public UUID getOwner() {
        return this.owner;
    }

    public boolean isOwner(UUID uuid) {
        return this.owner.toString().equals(uuid.toString());
    }

    public Block getMaximLocation() {
        return this.maxLoc;
    }

    public Block getMinimLocation() {
        return this.minLoc;
    }

    public Field addMember(UUID uuid) {
        if (this.isMember(uuid))
            return this;
        this.members.add(uuid);
        this.save();
        return this;
    }

    public Field removeMember(UUID uuid) {
        if (!this.isMember(uuid))
            return this;
        this.members.remove(uuid);
        this.save();
        return this;
    }

    public boolean isMember(UUID uuid) {
        return this.members.contains(uuid);
    }

    public int getChunkX() {
        return this.chunkX;
    }

    public int getChunkZ() {
        return this.chunkZ;
    }

    public World getWorld() {
        return this.world;
    }

    public List<UUID> getMembers() {
        return this.members;
    }

    public Field setMembers(List<UUID> uuid) {
        this.members.clear();
        this.members.addAll(uuid);
        this.save();
        return this;
    }

    public void save() {
        try {
            this.config.set("members", FieldUtil.convertUUIDsToStrings(this.members));
            this.config.save(this.file);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void delete() {
        this.file.delete();
    }

    public void remove() {
        try {
            this.finalize();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
