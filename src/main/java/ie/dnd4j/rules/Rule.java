package ie.dnd4j.rules;

import ie.dnd4j.character.BaseEntity;

public interface Rule {
    
    boolean isApplicable(BaseEntity entity);

        
    BaseEntity applyRule(BaseEntity entity);

}
