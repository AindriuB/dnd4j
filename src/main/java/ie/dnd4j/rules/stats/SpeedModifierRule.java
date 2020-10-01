package ie.dnd4j.rules.stats;

import ie.dnd4j.character.BaseEntity;
import ie.dnd4j.rules.AbstractRule;

public class SpeedModifierRule extends AbstractRule {
    
    private int modifier;
    
    public SpeedModifierRule(int modifier) {
	this.modifier = modifier;
    }

    @Override
    public BaseEntity applyRule(BaseEntity entity) {
	entity.getAttributes().setSpeed(Integer.max(0, entity.getAttributes().getSpeed() + modifier));
	return entity;
    }

    public int getModifier() {
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }
    
    

}
