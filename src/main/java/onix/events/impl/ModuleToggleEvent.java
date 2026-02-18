package onix.events.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import onix.events.api.events.Event;
import onix.modules.module.ModuleStructure;

@Getter
@AllArgsConstructor
public class ModuleToggleEvent implements Event {
    private final ModuleStructure module;
    private final boolean enabled;
}