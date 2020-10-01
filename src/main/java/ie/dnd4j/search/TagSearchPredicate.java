package ie.dnd4j.search;

import ie.dnd4j.TagableEntity;

public class TagSearchPredicate implements SearchPredicate<TagableEntity> {

    private String tag;

    public TagSearchPredicate(String tag) {
	this.tag = tag;
    }

    @Override
    public boolean match(TagableEntity target) {
	if (target.hasTag(tag)) {
	    return true;
	} else {
	    return false;
	}
    }

}
