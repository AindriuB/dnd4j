package ie.dnd4j.skills;

import ie.dnd4j.abilities.Ability;

public enum SkillType {

    ATHLETICS("Athletics", Ability.STRENGTH),
    ACROBATICS("Acrobatics", Ability.DEXTERITY),
    SLEIGHT_OF_HAND("Sleight of Hand", Ability.DEXTERITY),
    STEALTH("Stealth", Ability.DEXTERITY),
    ARCANA("Arcana", Ability.INTELLIGENCE),
    HISTORY("History", Ability.INTELLIGENCE),
    INVESTIGATION("Investigation", Ability.INTELLIGENCE),
    NAUTURE("Nature", Ability.INTELLIGENCE),
    RELIGION("Religion",Ability.INTELLIGENCE),
    ANIMAL_HANDLING("Animal Handling", Ability.WISDOM),
    INSIGHT("Insight",Ability.WISDOM),
    MEDICINE("Medicine", Ability.WISDOM),
    PERCEPTION("Perception",Ability.WISDOM),
    SURVIVAL("Survival", Ability.WISDOM),
    DECPETION("Deception", Ability.CHARISMA),
    INTIMIDATION("Intimidation",Ability.CHARISMA),
    PERFORMANCE("Performance",Ability.CHARISMA),
    PERSUASION("Persuasion", Ability.CHARISMA);

    private String value;
    private Ability base;

    SkillType(String value, Ability base) {
	this.value = value;
	this.base = base;
    }

    public String getValue() {
	return value;
    }

    public void setValue(String value) {
	this.value = value;
    }

    public Ability getBase() {
        return base;
    }

    public void setBase(Ability base) {
        this.base = base;
    }
    
    

}
