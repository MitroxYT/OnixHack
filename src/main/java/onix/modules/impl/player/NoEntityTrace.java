package onix.modules.impl.player;

import net.minecraft.item.ItemStack;
import onix.modules.module.ModuleStructure;
import onix.modules.module.category.ModuleCategory;
import onix.modules.module.setting.implement.BooleanSetting;
import onix.util.Instance;

public class NoEntityTrace extends ModuleStructure {

    private final BooleanSetting noSword = new BooleanSetting("Выключать с мечом", "d").setValue(true);

    public NoEntityTrace() {
        super("NoEntityTrace", "No Entity Trace", ModuleCategory.PLAYER);
        settings(noSword);
    }

    public static NoEntityTrace getInstance() {
        return Instance.get(NoEntityTrace.class);
    }

    public boolean shouldIgnoreEntityTrace() {
        if (!isState() || mc.player == null) return false;
        if (!noSword.isValue()) return true;

        ItemStack stack = mc.player.getMainHandStack();
        String key = stack.getItem().getTranslationKey().toLowerCase();
        return !key.contains("sword");
    }

}