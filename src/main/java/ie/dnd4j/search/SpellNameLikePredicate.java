package ie.dnd4j.search;

import ie.dnd4j.spells.Spell;

public class SpellNameLikePredicate implements SearchPredicate<Spell> {

    private String search;

    public SpellNameLikePredicate(String search) {
	this.search = search;
    }

    @Override
    public boolean match(Spell target) {
	if (target.getName().contains(search)) {
	    return true;
	} else {
	    return false;
	}
    }

}
