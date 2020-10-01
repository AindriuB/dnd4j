package ie.dnd4j.rules.stats;

import ie.dnd4j.character.BaseEntity;
import ie.dnd4j.rules.AbstractRule;

public class ArmourClassBuffRule extends AbstractRule {

    private int buff;

    public ArmourClassBuffRule(int buff) {
	super();
	this.buff = buff;
    }

    @Override
    public BaseEntity applyRule(BaseEntity entity) {
	entity.getAttributes().setArmourClass(entity.getAttributes().getArmourClass() + buff);
	return entity;
    }

    public int getBuff() {
        return buff;
    }

    public void setBuff(int buff) {
        this.buff = buff;
    }

}
