package ie.dnd4j.rules.dependencies;

import ie.dnd4j.character.BaseEntity;

public interface Dependency {
    
    boolean checkDependency(BaseEntity entity);

}
