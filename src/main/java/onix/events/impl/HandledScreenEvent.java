package onix.events.impl;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.screen.slot.Slot;
import onix.events.api.events.Event;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HandledScreenEvent implements Event {
    DrawContext drawContext;
    Slot slotHover;
    int backgroundWidth, backgroundHeight;
}
