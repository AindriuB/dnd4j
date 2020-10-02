package ie.dnd4j.rules.stats;

import ie.dnd4j.character.BaseEntity;
import ie.dnd4j.skills.Skill;
import ie.dnd4j.skills.SkillType;

public class SkillProfficiencyRule extends AbstractSkillRule {

    public SkillProfficiencyRule(SkillType type) {
	super(type);
    }

    @Override
    public BaseEntity applyRule(BaseEntity entity) {
	Skill skill = entity.getSkills().get(this.type);
	skill.setProficiencyBonus(entity.getProfficiencyBonus());
	skill.calculate();
	return entity;
    }

}
