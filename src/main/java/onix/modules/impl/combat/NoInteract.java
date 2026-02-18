package onix.modules.impl.combat;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import onix.modules.module.ModuleStructure;
import onix.modules.module.category.ModuleCategory;
import onix.util.Instance;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class NoInteract extends ModuleStructure {
    public static NoInteract getInstance() {
        return Instance.get(NoInteract.class);
    }

    public NoInteract() {
        super("NoInteract", "No Interact", ModuleCategory.COMBAT);
    }
}
