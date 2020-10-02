package ie.dnd4j;

import java.util.HashSet;
import java.util.List;

public abstract class TagableEntity {

    private HashSet<String> tags;

    public TagableEntity() {
	tags = new HashSet<String>();
    }

    public boolean hasTag(String tag) {
	return tags.contains(tag);
    }

    public void tag(String tag) {
	tags.add(tag);
    }

    public void tag(List<String> tags) {
	for (String tag : tags) {
	    this.tags.add(tag);
	}
    }

    public HashSet<String> getTags() {
        return tags;
    }
    
}
