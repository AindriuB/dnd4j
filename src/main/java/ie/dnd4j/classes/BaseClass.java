package ie.dnd4j.classes;

import java.util.List;

import ie.dnd4j.TagableEntity;
import ie.dnd4j.feats.Feat;
import ie.dnd4j.rules.Rule;

public abstract class BaseClass extends TagableEntity {
    
    private String name;
    
    private String type;
    
    private String description;

    private int level;
    
    private int hitDice;
    
 
    private List<Rule> rules;
    
    private List<Feat> features;
    
    
    public BaseClass(String type) {
	this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHitDice() {
        return hitDice;
    }

    public void setHitDice(int hitDice) {
        this.hitDice = hitDice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    public List<Feat> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feat> features) {
        this.features = features;
    }
    
    

}
