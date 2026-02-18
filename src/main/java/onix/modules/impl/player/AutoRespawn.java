package onix.modules.impl.player;

import antidaunleak.api.annotation.Native;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import onix.events.api.EventHandler;
import onix.events.impl.DeathScreenEvent;
import onix.events.impl.PacketEvent;
import onix.modules.module.ModuleStructure;
import onix.modules.module.category.ModuleCategory;
import onix.modules.module.setting.implement.SelectSetting;

@SuppressWarnings("all")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AutoRespawn extends ModuleStructure {

    SelectSetting modeSetting = new SelectSetting("Режим", "Выберите, что будет использоваться").value("Default");

    public AutoRespawn() {
        super("AutoRespawn", "Auto Respawn", ModuleCategory.PLAYER);
        settings(modeSetting);
    }

    @EventHandler
    public void onPacket(PacketEvent e) {
    }

    @EventHandler
    @Native(type = Native.Type.VMProtectBeginMutation)
    public void onDeathScreen(DeathScreenEvent e) {
        if (modeSetting.isSelected("Default")) {
            mc.player.requestRespawn();
            mc.setScreen(null);
        }
    }
}