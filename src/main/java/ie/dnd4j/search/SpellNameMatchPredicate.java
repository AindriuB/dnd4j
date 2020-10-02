package ie.dnd4j.search;

import ie.dnd4j.spells.Spell;

public class SpellNameMatchPredicate implements SearchPredicate<Spell> {

    private String search;

    public SpellNameMatchPredicate(String search) {
	this.search = search;
    }

    @Override
    public boolean match(Spell target) {
	if (target.getName().equals(search)) {
	    return true;
	} else {
	    return false;
	}
    }

}
