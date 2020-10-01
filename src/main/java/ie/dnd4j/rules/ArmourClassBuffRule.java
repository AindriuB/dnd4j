package ie.dnd4j.rules;

import ie.dnd4j.character.BaseEntity;

public class ArmourClassBuffRule implements Rule {

    private int buff;

    public ArmourClassBuffRule(int buff) {
	this.buff = buff;
    }

    @Override
    public BaseEntity applyRule(BaseEntity entity) {
	entity.getAttributes().setArmourClass(entity.getAttributes().getArmourClass() + buff);
	return entity;
    }

}
