package ie.dnd4j.search;

import ie.dnd4j.items.BaseItem;
import ie.dnd4j.items.Item;

public class ItemPredicate implements SearchPredicate<BaseItem> {

    @Override
    public boolean match(BaseItem target) {
	if(target instanceof Item) {
	    return true;
	} else {
	    return false;
	    
	}
	
    }
    

}
