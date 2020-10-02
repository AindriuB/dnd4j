package ie.dnd4j.rules.characater;

import ie.dnd4j.character.BaseEntity;
import ie.dnd4j.rules.AbstractRule;

public class GrantLanguageRule extends AbstractRule {
    
    
    private String language;
    
    public GrantLanguageRule(String language) {
	this.language = language;
    }

    @Override
    public BaseEntity applyRule(BaseEntity entity) {
	entity.getLanguages().add(language);
	return entity;
    }

}
