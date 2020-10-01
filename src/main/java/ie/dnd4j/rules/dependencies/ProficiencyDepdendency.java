package ie.dnd4j.rules.dependencies;

import ie.dnd4j.character.BaseEntity;

public class ProficiencyDepdendency implements Dependency {
    
    private String proficiency;
    
    public ProficiencyDepdendency(String proficiency) {
	this.proficiency = proficiency;
    }

    @Override
    public boolean checkDependency(BaseEntity entity) {
	if(entity.getArmourProficincies().contains(proficiency)){
	    return true;
	} else {
	    return false;
	}
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }
    

}
