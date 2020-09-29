package ie.dnd4j.skills;

import ie.dnd4j.abilities.Ability;

public abstract class BaseSkill {
    
    private String type;
    
    private Ability abilityModifier;
    
    private int value;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Ability getAbilityModifier() {
        return abilityModifier;
    }

    public void setAbilityModifier(Ability abilityModifier) {
        this.abilityModifier = abilityModifier;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    

}
