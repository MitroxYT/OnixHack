package onix.modules.impl.render;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import onix.events.api.EventHandler;
import onix.events.impl.TickEvent;
import onix.modules.module.ModuleStructure;
import onix.modules.module.category.ModuleCategory;
import onix.modules.module.setting.implement.SelectSetting;
import onix.util.Instance;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ItemPhysic extends ModuleStructure {
    public static ItemPhysic getInstance() {
        return Instance.get(ItemPhysic.class);
    }

    public SelectSetting mode = new SelectSetting("Физика", "").value("Обычная").selected("Обычная");

    public ItemPhysic() {
        super("ItemPhysic", "Item Physic", ModuleCategory.RENDER);
//        setup(mode);
    }

    @EventHandler
    public void onTick(TickEvent e) {
    }
}