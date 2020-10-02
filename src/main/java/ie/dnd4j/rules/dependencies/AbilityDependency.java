package ie.dnd4j.rules.dependencies;

import ie.dnd4j.abilities.Ability;
import ie.dnd4j.character.BaseEntity;

public class AbilityDependency implements Dependency {

    private Ability ability;
    private int check;
    
    public AbilityDependency(Ability ability, int check) {
	this.ability = ability;
	this.check = check;
    }
    
    @Override
    public boolean checkDependency(BaseEntity entity) {
	if(entity.getAbilities().get(ability).getTotal() >= check) {
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
