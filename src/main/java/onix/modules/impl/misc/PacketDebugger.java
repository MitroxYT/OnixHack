package onix.modules.impl.misc;

import net.minecraft.network.packet.c2s.common.CommonPongC2SPacket;
import net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket;
import onix.events.api.EventHandler;
import onix.events.impl.PacketEvent;
import onix.modules.module.ModuleStructure;
import onix.modules.module.category.ModuleCategory;
import onix.modules.module.setting.implement.MultiSelectSetting;
import onix.util.string.chat.ChatMessage;

public class PacketDebugger extends ModuleStructure {
    private final MultiSelectSetting debugValues = new MultiSelectSetting("toDebug","debuggind").value("InventoryClicks","Transaction");
    public PacketDebugger() {
        super("Debug", ModuleCategory.MISC);
        settings(debugValues);
    }
    @EventHandler
    public void onPacket(PacketEvent event) {
        if (event.getPacket() instanceof ClickSlotC2SPacket packet && debugValues.isSelected("InventoryClicks")) {
            ChatMessage.brandmessage("[click] slot: " + packet.slot() + " action: " + packet.actionType() + " clickID: " + packet.button());
        }
        if (event.getPacket() instanceof CommonPongC2SPacket packet && debugValues.isSelected("Transaction")) {
            ChatMessage.brandmessage("[pong] id: " + packet.getParameter());
        }
    }
}
