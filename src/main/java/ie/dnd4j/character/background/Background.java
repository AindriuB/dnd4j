package ie.dnd4j.character.background;

import java.util.List;

import ie.dnd4j.TagableEntity;
import ie.dnd4j.rules.Rule;

public class Background extends TagableEntity {
    
    public String name;

    public String description;
    
    public List<String> personality;
    
    public List<String> ideal;
    
    public List<String> bond;
    
    public List<String> flaw;
    
    public List<Rule> rules;

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

    public List<String> getPersonality() {
        return personality;
    }

    public void setPersonality(List<String> personality) {
        this.personality = personality;
    }

    public List<String> getIdeal() {
        return ideal;
    }

    public void setIdeal(List<String> ideal) {
        this.ideal = ideal;
    }

    public List<String> getBond() {
        return bond;
    }

    public void setBond(List<String> bond) {
        this.bond = bond;
    }

    public List<String> getFlaw() {
        return flaw;
    }

    public void setFlaw(List<String> flaw) {
        this.flaw = flaw;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }
    
}
