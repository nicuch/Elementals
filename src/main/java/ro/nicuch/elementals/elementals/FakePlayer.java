package ro.nicuch.elementals.elementals;

import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Achievement;
import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.EntityEffect;
import org.bukkit.GameMode;
import org.bukkit.Instrument;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Note;
import org.bukkit.Particle;
import org.bukkit.Server;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.Statistic;
import org.bukkit.WeatherType;
import org.bukkit.World;
import org.bukkit.advancement.Advancement;
import org.bukkit.advancement.AdvancementProgress;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.block.Block;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationAbandonedEvent;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Villager;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.InventoryView.Property;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MainHand;
import org.bukkit.inventory.Merchant;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.map.MapView;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.util.Vector;

@SuppressWarnings("deprecation")
public class FakePlayer implements Player {
    private Location loc;

    public FakePlayer(Location loc) {
        this.loc = loc;
    }

    @Override
    public void closeInventory() {
    }

    @Override
    public Inventory getEnderChest() {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public int getExpToLevel() {
        return 0;
    }

    @Override
    public GameMode getGameMode() {
        return GameMode.CREATIVE;
    }

    @Override
    public PlayerInventory getInventory() {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public ItemStack getItemInHand() {
        return new ItemStack(Material.AIR);
    }

    @Override
    public ItemStack getItemOnCursor() {
        return new ItemStack(Material.AIR);
    }

    @Override
    public MainHand getMainHand() {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public String getName() {
        return "Fake";
    }

    @Override
    public InventoryView getOpenInventory() {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public int getSleepTicks() {
        return 0;
    }

    @Override
    public boolean isBlocking() {
        return false;
    }

    @Override
    public boolean isSleeping() {
        return false;
    }

    @Override
    public InventoryView openEnchanting(Location arg0, boolean arg1) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public InventoryView openInventory(Inventory arg0) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public void openInventory(InventoryView arg0) {
    }

    @Override
    public InventoryView openMerchant(Villager arg0, boolean arg1) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public InventoryView openWorkbench(Location arg0, boolean arg1) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public void setGameMode(GameMode arg0) {
    }

    @Override
    public void setItemInHand(ItemStack arg0) {
    }

    @Override
    public void setItemOnCursor(ItemStack arg0) {
    }

    @Override
    public boolean setWindowProperty(Property arg0, int arg1) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public boolean addPotionEffect(PotionEffect arg0) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public boolean addPotionEffect(PotionEffect arg0, boolean arg1) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public boolean addPotionEffects(Collection<PotionEffect> arg0) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public Collection<PotionEffect> getActivePotionEffects() {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public boolean getCanPickupItems() {
        return true;
    }

    @Override
    public EntityEquipment getEquipment() {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public double getEyeHeight() {
        return 0;
    }

    @Override
    public double getEyeHeight(boolean arg0) {
        return 0;
    }

    @Override
    public Location getEyeLocation() {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public Player getKiller() {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public double getLastDamage() {
        return 0;
    }

    @Override
    public List<Block> getLastTwoTargetBlocks(Set<Material> arg0, int arg1) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public Entity getLeashHolder() throws IllegalStateException {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public List<Block> getLineOfSight(Set<Material> arg0, int arg1) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public int getMaximumAir() {
        return 0;
    }

    @Override
    public int getMaximumNoDamageTicks() {
        return 0;
    }

    @Override
    public int getNoDamageTicks() {
        return 0;
    }

    @Override
    public int getRemainingAir() {
        return 0;
    }

    @Override
    public boolean getRemoveWhenFarAway() {
        return false;
    }

    @Override
    public Block getTargetBlock(Set<Material> arg0, int arg1) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public boolean hasAI() {
        return true;
    }

    @Override
    public boolean hasLineOfSight(Entity arg0) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public boolean hasPotionEffect(PotionEffectType arg0) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public boolean isCollidable() {
        return false;
    }

    @Override
    public boolean isGliding() {
        return false;
    }

    @Override
    public boolean isLeashed() {
        return false;
    }

    @Override
    public void removePotionEffect(PotionEffectType arg0) {
    }

    @Override
    public void setAI(boolean arg0) {
    }

    @Override
    public void setCanPickupItems(boolean arg0) {
    }

    @Override
    public void setCollidable(boolean arg0) {
    }

    @Override
    public void setGliding(boolean arg0) {
    }

    @Override
    public void setLastDamage(double arg0) {
    }

    @Override
    public boolean setLeashHolder(Entity arg0) {
        return false;
    }

    @Override
    public void setMaximumAir(int arg0) {
    }

    @Override
    public void setMaximumNoDamageTicks(int arg0) {
    }

    @Override
    public void setNoDamageTicks(int arg0) {
    }

    @Override
    public void setRemainingAir(int arg0) {
    }

    @Override
    public void setRemoveWhenFarAway(boolean arg0) {
    }

    @Override
    public AttributeInstance getAttribute(Attribute arg0) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public boolean eject() {
        return false;
    }

    @Override
    public String getCustomName() {
        return "Fake";
    }

    @Override
    public int getEntityId() {
        return EntityType.PLAYER.getTypeId();
    }

    @Override
    public float getFallDistance() {
        return 0;
    }

    @Override
    public int getFireTicks() {
        return 0;
    }

    @Override
    public EntityDamageEvent getLastDamageCause() {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public Location getLocation() {
        return this.loc;
    }

    @Override
    public Location getLocation(Location arg0) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public int getMaxFireTicks() {
        return 0;
    }

    @Override
    public List<Entity> getNearbyEntities(double arg0, double arg1, double arg2) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public Entity getPassenger() {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public Server getServer() {
        return Bukkit.getServer();
    }

    @Override
    public int getTicksLived() {
        return 0;
    }

    @Override
    public EntityType getType() {
        return EntityType.PLAYER;
    }

    @Override
    public UUID getUniqueId() {
        return UUID.randomUUID();
    }

    @Override
    public Entity getVehicle() {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public Vector getVelocity() {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public World getWorld() {
        return this.loc.getWorld();
    }

    @Override
    public boolean hasGravity() {
        return true;
    }

    @Override
    public boolean isCustomNameVisible() {
        return true;
    }

    @Override
    public boolean isDead() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isGlowing() {
        return false;
    }

    @Override
    public boolean isInsideVehicle() {
        return false;
    }

    @Override
    public boolean isInvulnerable() {
        return false;
    }

    @Override
    public boolean isSilent() {
        return false;
    }

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public boolean leaveVehicle() {
        return false;
    }

    @Override
    public void playEffect(EntityEffect arg0) {
    }

    @Override
    public void remove() {
    }

    @Override
    public void setCustomName(String arg0) {
    }

    @Override
    public void setCustomNameVisible(boolean arg0) {
    }

    @Override
    public void setFallDistance(float arg0) {
    }

    @Override
    public void setFireTicks(int arg0) {
    }

    @Override
    public void setGlowing(boolean arg0) {
    }

    @Override
    public void setGravity(boolean arg0) {
    }

    @Override
    public void setInvulnerable(boolean arg0) {
    }

    @Override
    public void setLastDamageCause(EntityDamageEvent arg0) {
    }

    @Override
    public boolean setPassenger(Entity arg0) {
        return false;
    }

    @Override
    public void setSilent(boolean arg0) {
    }

    @Override
    public void setTicksLived(int arg0) {
    }

    @Override
    public void setVelocity(Vector arg0) {
    }

    @Override
    public boolean teleport(Location arg0) {
        return false;
    }

    @Override
    public boolean teleport(Entity arg0) {
        return false;
    }

    @Override
    public boolean teleport(Location arg0, TeleportCause arg1) {
        return false;
    }

    @Override
    public boolean teleport(Entity arg0, TeleportCause arg1) {
        return false;
    }

    @Override
    public List<MetadataValue> getMetadata(String arg0) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public boolean hasMetadata(String arg0) {
        return false;
    }

    @Override
    public void removeMetadata(String arg0, Plugin arg1) {
    }

    @Override
    public void setMetadata(String arg0, MetadataValue arg1) {
    }

    @Override
    public void sendMessage(String arg0) {
    }

    @Override
    public void sendMessage(String[] arg0) {
    }

    @Override
    public PermissionAttachment addAttachment(Plugin arg0) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public PermissionAttachment addAttachment(Plugin arg0, int arg1) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public PermissionAttachment addAttachment(Plugin arg0, String arg1, boolean arg2) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public PermissionAttachment addAttachment(Plugin arg0, String arg1, boolean arg2, int arg3) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public Set<PermissionAttachmentInfo> getEffectivePermissions() {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public boolean hasPermission(String arg0) {
        return true;
    }

    @Override
    public boolean hasPermission(Permission arg0) {
        return true;
    }

    @Override
    public boolean isPermissionSet(String arg0) {
        return true;
    }

    @Override
    public boolean isPermissionSet(Permission arg0) {
        return true;
    }

    @Override
    public void recalculatePermissions() {
    }

    @Override
    public void removeAttachment(PermissionAttachment arg0) {
    }

    @Override
    public boolean isOp() {
        return true;
    }

    @Override
    public void setOp(boolean arg0) {
    }

    @Override
    public void damage(double arg0) {
    }

    @Override
    public void damage(double arg0, Entity arg1) {
    }

    @Override
    public double getHealth() {
        return 20;
    }

    @Override
    public double getMaxHealth() {
        return 20;
    }

    @Override
    public void resetMaxHealth() {
    }

    @Override
    public void setHealth(double arg0) {
    }

    @Override
    public void setMaxHealth(double arg0) {
    }

    @Override
    public <T extends Projectile> T launchProjectile(Class<? extends T> arg0) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public <T extends Projectile> T launchProjectile(Class<? extends T> arg0, Vector arg1) {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public void abandonConversation(Conversation arg0) {
    }

    @Override
    public void abandonConversation(Conversation arg0, ConversationAbandonedEvent arg1) {
    }

    @Override
    public void acceptConversationInput(String arg0) {
    }

    @Override
    public boolean beginConversation(Conversation arg0) {
        return false;
    }

    @Override
    public boolean isConversing() {
        return false;
    }

    @Override
    public long getFirstPlayed() {
        return System.currentTimeMillis();
    }

    @Override
    public long getLastPlayed() {
        return System.currentTimeMillis();
    }

    @Override
    public Player getPlayer() {
        return this;
    }

    @Override
    public boolean hasPlayedBefore() {
        return false;
    }

    @Override
    public boolean isBanned() {
        return false;
    }

    @Override
    public boolean isOnline() {
        return true;
    }

    @Override
    public boolean isWhitelisted() {
        return true;
    }

    @Override
    public void setWhitelisted(boolean arg0) {
    }

    @Override
    public Map<String, Object> serialize() {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public Set<String> getListeningPluginChannels() {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public void sendPluginMessage(Plugin arg0, String arg1, byte[] arg2) {
    }

    @Override
    public void awardAchievement(Achievement arg0) {
    }

    @Override
    public boolean canSee(Player arg0) {
        return true;
    }

    @Override
    public void chat(String arg0) {
    }

    @Override
    public void decrementStatistic(Statistic arg0) throws IllegalArgumentException {
    }

    @Override
    public void decrementStatistic(Statistic arg0, int arg1) throws IllegalArgumentException {
    }

    @Override
    public void decrementStatistic(Statistic arg0, Material arg1) throws IllegalArgumentException {
    }

    @Override
    public void decrementStatistic(Statistic arg0, EntityType arg1) throws IllegalArgumentException {
    }

    @Override
    public void decrementStatistic(Statistic arg0, Material arg1, int arg2) throws IllegalArgumentException {
    }

    @Override
    public void decrementStatistic(Statistic arg0, EntityType arg1, int arg2) {
    }

    @Override
    public InetSocketAddress getAddress() {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public boolean getAllowFlight() {
        return false;
    }

    @Override
    public Location getBedSpawnLocation() {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public Location getCompassTarget() {
        return this.loc;
    }

    @Override
    public String getDisplayName() {
        return "Fake";
    }

    @Override
    public float getExhaustion() {
        return 0;
    }

    @Override
    public float getExp() {
        return 0;
    }

    @Override
    public float getFlySpeed() {
        return 1;
    }

    @Override
    public int getFoodLevel() {
        return 20;
    }

    @Override
    public double getHealthScale() {
        return 2;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public String getPlayerListName() {
        return "Fake";
    }

    @Override
    public long getPlayerTime() {
        return System.currentTimeMillis();
    }

    @Override
    public long getPlayerTimeOffset() {
        return 0;
    }

    @Override
    public WeatherType getPlayerWeather() {
        return WeatherType.CLEAR;
    }

    @Override
    public float getSaturation() {
        return 0;
    }

    @Override
    public Scoreboard getScoreboard() {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public Entity getSpectatorTarget() {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public int getStatistic(Statistic arg0) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public int getStatistic(Statistic arg0, Material arg1) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public int getStatistic(Statistic arg0, EntityType arg1) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public int getTotalExperience() {
        return 0;
    }

    @Override
    public float getWalkSpeed() {
        return 1;
    }

    @Override
    public void giveExp(int arg0) {
    }

    @Override
    public void giveExpLevels(int arg0) {
    }

    @Override
    public boolean hasAchievement(Achievement arg0) {
        return true;
    }

    @Override
    public void hidePlayer(Player arg0) {
    }

    @Override
    public void incrementStatistic(Statistic arg0) throws IllegalArgumentException {
    }

    @Override
    public void incrementStatistic(Statistic arg0, int arg1) throws IllegalArgumentException {
    }

    @Override
    public void incrementStatistic(Statistic arg0, Material arg1) throws IllegalArgumentException {
    }

    @Override
    public void incrementStatistic(Statistic arg0, EntityType arg1) throws IllegalArgumentException {
    }

    @Override
    public void incrementStatistic(Statistic arg0, Material arg1, int arg2) throws IllegalArgumentException {
    }

    @Override
    public void incrementStatistic(Statistic arg0, EntityType arg1, int arg2) throws IllegalArgumentException {
    }

    @Override
    public boolean isFlying() {
        return false;
    }

    @Override
    public boolean isHealthScaled() {
        return false;
    }

    @Override
    public boolean isOnGround() {
        return true;
    }

    @Override
    public boolean isPlayerTimeRelative() {
        return false;
    }

    @Override
    public boolean isSleepingIgnored() {
        return false;
    }

    @Override
    public boolean isSneaking() {
        return false;
    }

    @Override
    public boolean isSprinting() {
        return false;
    }

    @Override
    public void kickPlayer(String arg0) {
    }

    @Override
    public void loadData() {
    }

    @Override
    public boolean performCommand(String arg0) {
        return false;
    }

    @Override
    public void playEffect(Location arg0, Effect arg1, int arg2) {
    }

    @Override
    public <T> void playEffect(Location arg0, Effect arg1, T arg2) {
    }

    @Override
    public void playNote(Location arg0, byte arg1, byte arg2) {
    }

    @Override
    public void playNote(Location arg0, Instrument arg1, Note arg2) {
    }

    @Override
    public void playSound(Location arg0, Sound arg1, float arg2, float arg3) {
    }

    @Override
    public void playSound(Location arg0, String arg1, float arg2, float arg3) {
    }

    @Override
    public void removeAchievement(Achievement arg0) {
    }

    @Override
    public void resetPlayerTime() {
    }

    @Override
    public void resetPlayerWeather() {
    }

    @Override
    public void resetTitle() {
    }

    @Override
    public void saveData() {
    }

    @Override
    public void sendBlockChange(Location arg0, Material arg1, byte arg2) {
    }

    @Override
    public void sendBlockChange(Location arg0, int arg1, byte arg2) {
    }

    @Override
    public boolean sendChunkChange(Location arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        return false;
    }

    @Override
    public void sendMap(MapView arg0) {
    }

    @Override
    public void sendRawMessage(String arg0) {
    }

    @Override
    public void sendSignChange(Location arg0, String[] arg1) throws IllegalArgumentException {
    }

    @Override
    public void sendTitle(String arg0, String arg1) {
    }

    @Override
    public void setAllowFlight(boolean arg0) {
    }

    @Override
    public void setBedSpawnLocation(Location arg0) {
    }

    @Override
    public void setBedSpawnLocation(Location arg0, boolean arg1) {
    }

    @Override
    public void setCompassTarget(Location arg0) {
    }

    @Override
    public void setDisplayName(String arg0) {
    }

    @Override
    public void setExhaustion(float arg0) {
    }

    @Override
    public void setExp(float arg0) {
    }

    @Override
    public void setFlySpeed(float arg0) throws IllegalArgumentException {
    }

    @Override
    public void setFlying(boolean arg0) {
    }

    @Override
    public void setFoodLevel(int arg0) {
    }

    @Override
    public void setHealthScale(double arg0) throws IllegalArgumentException {
    }

    @Override
    public void setHealthScaled(boolean arg0) {
    }

    @Override
    public void setLevel(int arg0) {
    }

    @Override
    public void setPlayerListName(String arg0) {
    }

    @Override
    public void setPlayerTime(long arg0, boolean arg1) {
    }

    @Override
    public void setPlayerWeather(WeatherType arg0) {
    }

    @Override
    public void setResourcePack(String arg0) {
    }

    @Override
    public void setSaturation(float arg0) {
    }

    @Override
    public void setScoreboard(Scoreboard arg0) throws IllegalArgumentException, IllegalStateException {
    }

    @Override
    public void setSleepingIgnored(boolean arg0) {
    }

    @Override
    public void setSneaking(boolean arg0) {
    }

    @Override
    public void setSpectatorTarget(Entity arg0) {
    }

    @Override
    public void setSprinting(boolean arg0) {
    }

    @Override
    public void setStatistic(Statistic arg0, int arg1) throws IllegalArgumentException {
    }

    @Override
    public void setStatistic(Statistic arg0, Material arg1, int arg2) throws IllegalArgumentException {
    }

    @Override
    public void setStatistic(Statistic arg0, EntityType arg1, int arg2) {
    }

    @Override
    public void setTexturePack(String arg0) {
    }

    @Override
    public void setTotalExperience(int arg0) {
    }

    @Override
    public void setWalkSpeed(float arg0) throws IllegalArgumentException {
    }

    @Override
    public void showPlayer(Player arg0) {
    }

    @Override
    public void spawnParticle(Particle arg0, Location arg1, int arg2) {
    }

    @Override
    public <T> void spawnParticle(Particle arg0, Location arg1, int arg2, T arg3) {
    }

    @Override
    public void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4) {
    }

    @Override
    public <T> void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4, T arg5) {
    }

    @Override
    public void spawnParticle(Particle arg0, Location arg1, int arg2, double arg3, double arg4, double arg5) {
    }

    @Override
    public <T> void spawnParticle(Particle arg0, Location arg1, int arg2, double arg3, double arg4, double arg5,
                                  T arg6) {

    }

    @Override
    public void spawnParticle(Particle arg0, Location arg1, int arg2, double arg3, double arg4, double arg5,
                              double arg6) {
    }

    @Override
    public void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4, double arg5, double arg6,
                              double arg7) {
    }

    @Override
    public <T> void spawnParticle(Particle arg0, Location arg1, int arg2, double arg3, double arg4, double arg5,
                                  double arg6, T arg7) {
    }

    @Override
    public <T> void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4, double arg5,
                                  double arg6, double arg7, T arg8) {
    }

    @Override
    public void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4, double arg5, double arg6,
                              double arg7, double arg8) {
    }

    @Override
    public <T> void spawnParticle(Particle arg0, double arg1, double arg2, double arg3, int arg4, double arg5,
                                  double arg6, double arg7, double arg8, T arg9) {
    }

    @Override
    public Spigot spigot() {
        throw new UnsupportedOperationException("Unsuported.");
    }

    @Override
    public void stopSound(Sound arg0) {
    }

    @Override
    public void stopSound(String arg0) {
    }

    @Override
    public void updateInventory() {
    }

    @Override
    public PotionEffect getPotionEffect(PotionEffectType arg0) {
        return null;
    }

    @Override
    public boolean isHandRaised() {
        return false;
    }

    @Override
    public InventoryView openMerchant(Merchant arg0, boolean arg1) {
        return null;
    }

    @Override
    public boolean addScoreboardTag(String arg0) {
        return false;
    }

    @Override
    public int getPortalCooldown() {
        return 0;
    }

    @Override
    public Set<String> getScoreboardTags() {
        return null;
    }

    @Override
    public boolean removeScoreboardTag(String arg0) {
        return false;
    }

    @Override
    public void setPortalCooldown(int arg0) {
    }

    @Override
    public void playSound(Location arg0, Sound arg1, SoundCategory arg2, float arg3, float arg4) {
    }

    @Override
    public void playSound(Location arg0, String arg1, SoundCategory arg2, float arg3, float arg4) {
    }

    @Override
    public void sendTitle(String arg0, String arg1, int arg2, int arg3, int arg4) {
    }

    @Override
    public void stopSound(Sound arg0, SoundCategory arg1) {
    }

    @Override
    public void stopSound(String arg0, SoundCategory arg1) {
    }

    @Override
    public boolean addPassenger(Entity arg0) {
        return false;
    }

    @Override
    public List<Entity> getPassengers() {
        return null;
    }

    @Override
    public boolean removePassenger(Entity arg0) {
        return false;
    }

    @Override
    public void setResourcePack(String arg0, byte[] arg1) {
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public int getCooldown(Material arg0) {
        return 0;
    }

    @Override
    public Entity getShoulderEntityLeft() {
        return null;
    }

    @Override
    public Entity getShoulderEntityRight() {
        return null;
    }

    @Override
    public boolean hasCooldown(Material arg0) {
        return false;
    }

    @Override
    public void setCooldown(Material arg0, int arg1) {

    }

    @Override
    public void setShoulderEntityLeft(Entity arg0) {

    }

    @Override
    public void setShoulderEntityRight(Entity arg0) {

    }

    @Override
    public AdvancementProgress getAdvancementProgress(Advancement arg0) {
        return null;
    }

    @Override
    public String getLocale() {
        return null;
    }

    @Override
    public PistonMoveReaction getPistonMoveReaction() {
        return null;
    }

    @Override
    public void hidePlayer(Plugin plugin, Player player) {
    }

    @Override
    public void showPlayer(Plugin plugin, Player player) {
    }
}
