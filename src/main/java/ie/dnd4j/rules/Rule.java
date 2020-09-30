package ie.dnd4j.rules;

import ie.dnd4j.character.BaseEntity;

public interface Rule {
    
    
    BaseEntity applyRule(BaseEntity entity);

}
