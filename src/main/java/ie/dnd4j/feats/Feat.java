package ie.dnd4j.feats;

import java.util.List;

import ie.dnd4j.TagableEntity;
import ie.dnd4j.rules.Rule;

public class Feat extends TagableEntity {
    
    private String name;
    
    private String type;
    
    private String description;
    
    private List<Rule> rules;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    

}
