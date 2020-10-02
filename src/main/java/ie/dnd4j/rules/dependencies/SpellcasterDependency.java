package ie.dnd4j.rules.dependencies;

import ie.dnd4j.character.BaseEntity;

public class SpellcasterDependency implements Dependency {

    @Override
    public boolean checkDependency(BaseEntity entity) {
	if (entity.getSpells().isEmpty()) {
	    return false;
	} else {
	    return true;
	}
    }

}
