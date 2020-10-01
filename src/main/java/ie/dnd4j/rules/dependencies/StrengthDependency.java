package ie.dnd4j.rules.dependencies;

import ie.dnd4j.abilities.Ability;
import ie.dnd4j.character.BaseEntity;

public class StrengthDependency implements Dependency {

    private int check;
    
    public StrengthDependency(int check) {
	this.check = check;
    }
    
    @Override
    public boolean checkDependency(BaseEntity entity) {
	if(entity.getAbilities().get(Ability.STRENGTH).getTotal() >= check) {
	    return true;
	}
	return false;
    }

    public int getCheck() {
        return check;
    }

    public void setCheck(int check) {
        this.check = check;
    }
    

}
