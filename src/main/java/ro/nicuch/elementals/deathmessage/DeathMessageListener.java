package ro.nicuch.elementals.deathmessage;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Wolf;
import org.bukkit.entity.ZombieVillager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.projectiles.BlockProjectileSource;

import net.citizensnpcs.api.CitizensAPI;
import ro.nicuch.elementals.Elementals;
import ro.nicuch.elementals.User;
import ro.nicuch.elementals.elementals.ElementalsUtil;

public class DeathMessageListener implements Listener {

    @EventHandler
    public void event(EntityDamageEvent event) {
        if (CitizensAPI.getNPCRegistry().isNPC(event.getEntity()))
            return;
        if (!event.getEntity().getType().equals(EntityType.PLAYER))
            return;
        Elementals.getUser((Player) event.getEntity()).setLastDamageCause(event.getCause());
    }

    @EventHandler
    public void event(PlayerDeathEvent event) {
        if (CitizensAPI.getNPCRegistry().isNPC(event.getEntity()))
            return;
        User user = Elementals.getUser(event.getEntity());
        switch (user.getLastDamageCause()) {
            case BLOCK_EXPLOSION:
                event.setDeathMessage(user.getBase().getDisplayName() + " �9a facut poc.");
                break;
            case CONTACT:
                event.setDeathMessage(user.getBase().getDisplayName() + " �9a imbratisat un cactus.");
                break;
            case DROWNING:
                if (user.isInPvp())
                    event.setDeathMessage(
                            user.getBase().getDisplayName() + " �9nu a vrut sa fie omorat de alt jucator si s-a inecat.");
                else
                    event.setDeathMessage(user.getBase().getDisplayName() + " �9s-a inecat.");
                break;
            case ENTITY_ATTACK:
                Entity damager = ((EntityDamageByEntityEvent) event.getEntity().getLastDamageCause()).getDamager();
                switch (damager.getType()) {
                    case PLAYER:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de "
                                + ((Player) damager).getDisplayName() + "�a.");
                        break;
                    case BLAZE:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un blaze.");
                        break;
                    case CAVE_SPIDER:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un paianjen de pestera.");
                        break;
                    case ENDER_DRAGON:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de dragon.");
                        break;
                    case ENDERMAN:
                        if (ElementalsUtil.hasTag(damager, "end_monster")) {
                            event.setDeathMessage(
                                    user.getBase().getDisplayName() + " �9a fost omorat de un �5Enderman de End�9.");
                            break;
                        }
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un enderman.");
                        break;
                    case ENDERMITE:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un endermite.");
                        break;
                    case GIANT:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un gigant?!");
                        break;
                    case GUARDIAN:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un gardian.");
                        break;
                    case IRON_GOLEM:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un golem de fier.");
                        break;
                    case MAGMA_CUBE:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un cub de magma.");
                        break;
                    case PIG_ZOMBIE:
                        if (ElementalsUtil.hasTag(damager, "lava_monster")) {
                            event.setDeathMessage(
                                    user.getBase().getDisplayName() + " �9a fost omorat de un �4Zombie de Lava�9.");
                            break;
                        }
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un pigman.");
                        break;
                    case SILVERFISH:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un peste argintiu.");
                        break;
                    case SKELETON:
                        if (ElementalsUtil.hasTag(damager, "herobrine")) {
                            event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de �cHerobrine�9.");
                            break;
                        }
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un schelete.");
                        break;
                    case WITHER_SKELETON:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un schelete wither.");
                        break;
                    case STRAY:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un stray.");
                        break;
                    case WOLF:
                        if (((Wolf) damager).isTamed())
                            event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un caine.");
                        else
                            event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un lup.");
                        break;
                    case ZOMBIE:
                        if (ElementalsUtil.hasTag(damager, "ice_monster")) {
                            event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un Zombie de Gheata.");
                            break;
                        } else if (ElementalsUtil.hasTag(damager, "herobrine")) {
                            event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de �cHerobrine�9.");
                            break;
                        }
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un zombie.");
                        break;
                    case HUSK:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un husk.");
                        break;
                    case ZOMBIE_VILLAGER:
                        switch (((ZombieVillager) damager).getVillagerProfession()) {
                            case BLACKSMITH:
                                event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un zombie fierar.");
                                break;
                            case BUTCHER:
                                event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un zombie macelar.");
                                break;
                            case FARMER:
                                event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un zombie fermier.");
                                break;
                            case LIBRARIAN:
                                event.setDeathMessage(
                                        user.getBase().getDisplayName() + " �9a fost omorat de un zombie bibliotecar.");
                                break;
                            case PRIEST:
                                event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un zombie regal.");
                                break;
                            case NITWIT:
                                event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un zombie ciudat.");
                                break;
                            default:
                                event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un zombie villager.");
                                break;
                        }
                        break;
                    case POLAR_BEAR:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un urs polar.");
                        break;
                    case SPIDER:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un paianjen.");
                        break;
                    case SLIME:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un slime.");
                        break;
                    case VINDICATOR:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un vindicator.");
                        break;
                    case VEX:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un demon.");
                        break;
                    case EVOKER:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un magician.");
                        break;
                    case EVOKER_FANGS:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost mancat.");
                        break;
                    default:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a murit.");
                        break;
                }
                break;
            case ENTITY_EXPLOSION:
                switch (((EntityDamageByEntityEvent) event.getEntity().getLastDamageCause()).getDamager().getType()) {
                    case CREEPER:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a imbratisat un creeper.");
                        break;
                    case PRIMED_TNT:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a s-a jucat cu TNT.");
                        break;
                    case MINECART_TNT:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a s-a jucat cu TNT pe sinele de tren.");
                        break;
                    case FIREBALL:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a a intalnit un ghast.");
                        break;
                    case DRAGON_FIREBALL:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a a intalnit un dragon.");
                        break;
                    default:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a e explodat.");
                        break;
                }
                break;
            case FALL:
                event.setDeathMessage(user.getBase().getDisplayName() + " �9a incercat sa zboare.");
                break;
            case FALLING_BLOCK:
                event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost lovit in cap cu o nicovala.");
                break;
            case FIRE:
            case FIRE_TICK:
                event.setDeathMessage(user.getBase().getDisplayName() + " �9a vrut sa devina friptura.");
                break;
            case LAVA:
                if (user.isInPvp())
                    event.setDeathMessage(user.getBase().getDisplayName()
                            + " �9nu a vrut sa fie omorat de alt jucator si s-a aruncat in lava.");
                else
                    event.setDeathMessage(user.getBase().getDisplayName() + " �9a inotat in lava.");
                break;
            case LIGHTNING:
                event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost fulgerat.");
                break;
            case MAGIC:
                event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost transformat in broasca.");
                break;
            case POISON:
                event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost otravit.");
                break;
            case PROJECTILE:
                if (((Projectile) ((EntityDamageByEntityEvent) event.getEntity().getLastDamageCause()).getDamager())
                        .getShooter() instanceof BlockProjectileSource) {
                    event.setDeathMessage(user.getBase().getDisplayName()
                            + " �9a incercat sa verifice daca mai sunt sageti in dispenser.");
                    break;
                }
                Entity dmgr = (Entity) ((Projectile) ((EntityDamageByEntityEvent) event.getEntity().getLastDamageCause())
                        .getDamager()).getShooter();
                switch (dmgr.getType()) {
                    case BLAZE:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un blaze.");
                        break;
                    case PLAYER:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de "
                                + ((Player) dmgr).getDisplayName() + "�a.");
                        break;
                    case SNOWMAN:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un om de zapada.");
                        break;
                    case SKELETON:
                        if (dmgr.hasMetadata("herobrine")) {
                            event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de �cHerobrine�9.");
                            break;
                        }
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un schelete.");
                        break;
                    case GHAST:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat de un ghast.");
                        break;
                    case WITHER:
                        event.setDeathMessage(user.getBase().getDisplayName() + "�9, witherul are 3 capete iar tu doar unul.");
                        break;
                    case ENDER_DRAGON:
                        event.setDeathMessage(user.getBase().getDisplayName() + "�9, nu te pune cu dragonul.");
                        break;
                    case LLAMA:
                        event.setDeathMessage(user.getBase().getDisplayName() + "�9a fost scuipat de o lama.");
                        break;
                    default:
                        event.setDeathMessage(user.getBase().getDisplayName() + " �9a murit.");
                        break;
                }
                break;
            case STARVATION:
                event.setDeathMessage(user.getBase().getDisplayName() + "�9, unde iti este mancarea?");
                break;
            case SUFFOCATION:
                event.setDeathMessage(user.getBase().getDisplayName() + " �9a devenit una cu pamantul.");
                break;
            case SUICIDE:
                event.setDeathMessage(user.getBase().getDisplayName() + " �9si-a luat adio de la viata.");
                break;
            case THORNS:
                event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost intepat (putin).");
                break;
            case VOID:
                event.setDeathMessage(user.getBase().getDisplayName() + "�9, cum ai ajuns in void? O.o");
                break;
            case WITHER:
                event.setDeathMessage(user.getBase().getDisplayName() + "�9, witherul are 3 capete iar tu doar unul.");
                break;
            case DRAGON_BREATH:
                event.setDeathMessage(user.getBase().getDisplayName() + " �9a simtit un miros neplacut.");
                break;
            case FLY_INTO_WALL:
                event.setDeathMessage(user.getBase().getDisplayName() + " �9s-a dat cu capul de pereti.");
                break;
            case HOT_FLOOR:
                event.setDeathMessage(user.getBase().getDisplayName() + " �9a mers pe unde nu trebuia.");
                break;
            case CRAMMING:
                event.setDeathMessage(user.getBase().getDisplayName() + " �9a fost omorat cu o imbratisare.");
                break;
            case MELTING:
                event.setDeathMessage(user.getBase().getDisplayName() + " �9s-a topit de la caldura.");
                break;
            case ENTITY_SWEEP_ATTACK:
                event.setDeathMessage(user.getBase().getDisplayName() + " �9se afla in raza unui atac.");
                break;
            default:
                event.setDeathMessage(user.getBase().getDisplayName() + " �9a murit.");
                break;
        }
    }
}
