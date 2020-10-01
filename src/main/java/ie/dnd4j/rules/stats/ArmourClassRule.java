package ie.dnd4j.rules.stats;

import ie.dnd4j.abilities.Ability;
import ie.dnd4j.character.BaseEntity;
import ie.dnd4j.items.ArmourType;
import ie.dnd4j.rules.AbstractRule;

public class ArmourClassRule extends AbstractRule {
    
    private ArmourType type;
    
    private int armourClass;
    
    public ArmourClassRule(int armourClass, ArmourType type) {
	super();
	this.type = type;
	this.armourClass = armourClass;
    }

    @Override
    public BaseEntity applyRule(BaseEntity entity) {
	int dexterity = entity.getAbilities().get(Ability.DEXTERITY).getModifier();
	int ac = 10 + dexterity;
	switch(type) {
	case LIGHT:
	    ac = armourClass + dexterity;
	    break;
	case MEDIUM:
            ac = armourClass + Integer.min(2, dexterity);
            break;
	case HEAVY:
            ac = armourClass;
            break;
        default: 
            ac = armourClass;
            break;
	}
	entity.getAttributes().setArmourClass(ac);
	return entity;
    }

    public ArmourType getType() {
        return type;
    }

    public void setType(ArmourType type) {
        this.type = type;
    }

    public int getArmourClass() {
        return armourClass;
    }

    public void setArmourClass(int armourClass) {
        this.armourClass = armourClass;
    }

}
