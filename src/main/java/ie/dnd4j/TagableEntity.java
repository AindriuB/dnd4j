package ie.dnd4j;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class TagableEntity {

    private Map<String, String> tags;

    public TagableEntity() {
	tags = new HashMap<String, String>();
    }

    public boolean hasTag(String tag) {
	return tags.containsKey(tag);
    }

    public void tag(String tag) {
	tags.put(tag, tag);
    }

    public void tag(List<String> tags) {
	for (String tag : tags) {
	    this.tags.put(tag, tag);
	}
    }
}
