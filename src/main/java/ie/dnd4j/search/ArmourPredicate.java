package ie.dnd4j.search;

import ie.dnd4j.items.Armour;
import ie.dnd4j.items.BaseItem;

public class ArmourPredicate implements SearchPredicate<BaseItem> {

    @Override
    public boolean match(BaseItem target) {
	if(target instanceof Armour) {
	    return true;
	} else {
	    return false;
	    
	}
	
    }
    

}
