package ie.dnd4j.rules;

import ie.dnd4j.abilities.Ability;
import ie.dnd4j.character.BaseEntity;

public class ArmourClassRule implements Rule {
    
    private int armourClass;
    
    public ArmourClassRule(int armourClass) {
	this.armourClass = armourClass;
    }

    @Override
    public BaseEntity applyRule(BaseEntity entity) {
	int ac = armourClass + entity.getAbilities().get(Ability.DEXTERITY).getModifier();
	entity.getAttributes().setArmourClass(ac);
	return entity;
    }

}
