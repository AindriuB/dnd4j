package ie.dnd4j.rules.stats;

import ie.dnd4j.rules.AbstractRule;
import ie.dnd4j.skills.SkillType;

public abstract class AbstractSkillRule extends AbstractRule {

    public SkillType type;
    
    public AbstractSkillRule(SkillType type) {
	super();
	this.type = type;
   }

    public SkillType getType() {
        return type;
    }

    public void setType(SkillType type) {
        this.type = type;
    }
    
    

}
