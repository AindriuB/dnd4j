package ie.dnd4j.rules;

import ie.dnd4j.character.BaseEntity;

public class FlatArmourClassRule implements Rule {

    private int armourClass;
    
    public FlatArmourClassRule(int armourClass) {
	this.armourClass = armourClass; 
    }
    @Override
    public BaseEntity applyRule(BaseEntity entity) {
	entity.getAttributes().setArmourClass(armourClass);
	return entity;
    }

}
