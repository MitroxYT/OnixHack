package onix.modules.impl.combat;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import onix.events.api.EventHandler;
import onix.events.impl.InteractEntityEvent;
import onix.modules.module.ModuleStructure;
import onix.modules.module.category.ModuleCategory;
import onix.util.repository.friend.FriendUtils;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class NoFriendDamage extends ModuleStructure {

    public NoFriendDamage() {
        super("NoFriendDamage", "No Friend Damage", ModuleCategory.COMBAT);
    }

    @EventHandler
    public void onAttack(InteractEntityEvent e) {
        e.setCancelled(FriendUtils.isFriend(e.getEntity()));
    }
}

