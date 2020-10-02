package ie.dnd4j.search;

import ie.dnd4j.spells.Spell;

public class SpellClassTypePredicate implements SearchPredicate<Spell> {

    private String search;

    public SpellClassTypePredicate(String search) {
	this.search = search;
    }

    @Override
    public boolean match(Spell target) {
	if (target.getClasses().contains(search)) {
	    return true;
	} else {
	    return false;
	}
    }

}
