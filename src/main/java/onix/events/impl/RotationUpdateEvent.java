package onix.events.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import onix.events.api.events.Event;

@Getter
@AllArgsConstructor
public class RotationUpdateEvent implements Event {
    byte type;
}
