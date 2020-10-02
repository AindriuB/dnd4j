package ie.dnd4j.skills;

import ie.dnd4j.Calculation;
import ie.dnd4j.TagableEntity;

public class Skill extends TagableEntity implements Calculation {
    
    private SkillType type;
    
    private int proficiencyBonus;
    
    private boolean expertise;
    
    private int base;

    private int score;

    public SkillType getType() {
        return type;
    }

    public void setType(SkillType type) {
        this.type = type;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public boolean isExpertise() {
        return expertise;
    }

    public void setExpertise(boolean expertise) {
        this.expertise = expertise;
    }

    @Override
    public void calculate() {
	if(expertise) {
	    proficiencyBonus *= 2;
	} 
	this.score = this.base + proficiencyBonus; 
    }
    
    

}
