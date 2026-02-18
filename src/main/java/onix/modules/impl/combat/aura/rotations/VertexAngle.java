package onix.modules.impl.combat.aura.rotations;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import onix.modules.impl.combat.Aura;
import onix.modules.impl.combat.aura.Angle;
import onix.modules.impl.combat.aura.MathAngle;
import onix.modules.impl.combat.aura.impl.RotateConstructor;

public class VertexAngle extends RotateConstructor {
    public VertexAngle() {
        super("Vertex");
    }

    @Override
    public Angle limitAngleChange(Angle currentAngle, Angle targetAngle, Vec3d vec3d, Entity entity) {
        Aura aura = Aura.getInstance();
        Angle angleDelta = MathAngle.calculateDelta(currentAngle, targetAngle);
        float yawDelta = angleDelta.getYaw(), pitchDelta = angleDelta.getPitch();
        Angle moveAngle = new Angle(currentAngle.getYaw(), currentAngle.getPitch());
        moveAngle.setYaw( currentAngle.getYaw() + yawDelta);
        moveAngle.setPitch( currentAngle.getPitch() + pitchDelta);
        return moveAngle;
    }

    @Override
    public Vec3d randomValue() {
        return null;
    }
}
