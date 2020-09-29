package ie.dnd4j.builder;

import java.util.HashMap;
import java.util.Map;

import ie.dnd4j.EntityBuilder;
import ie.dnd4j.PlayerCharacter;
import ie.dnd4j.abilities.Ability;
import ie.dnd4j.abilities.AbilityScore;
import ie.dnd4j.character.CharacterAttributes;
import ie.dnd4j.classes.BaseClass;
import ie.dnd4j.race.Race;

public class CharacterBuilder extends EntityBuilder<PlayerCharacter>{
    
    private Map<Ability, AbilityScore> abilityScores;
        
    private CharacterAttributes attributes;
    
    private Race race;


    private Map<String,BaseClass> baseClasses;
    
    public CharacterBuilder() {
	baseClasses = new  HashMap<String, BaseClass>();
    }
    

    public CharacterBuilder abilityScores(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
	abilityScores = new HashMap<Ability, AbilityScore>();
	abilityScores.put(Ability.STRENGTH, new AbilityScore(Ability.STRENGTH, strength));
	abilityScores.put(Ability.DEXTERITY, new AbilityScore(Ability.DEXTERITY, dexterity));
	abilityScores.put(Ability.CONSTITUTION, new AbilityScore(Ability.CONSTITUTION, constitution));
	abilityScores.put(Ability.INTELLIGENCE, new AbilityScore(Ability.INTELLIGENCE, intelligence));
	abilityScores.put(Ability.WISDOM, new AbilityScore(Ability.WISDOM, wisdom));
	abilityScores.put(Ability.CHARISMA, new AbilityScore(Ability.CHARISMA, charisma));
	
	return this;
    }
    
    public CharacterBuilder characterAttributes(CharacterAttributes attributes) {
	this.attributes = attributes;
	return this;
    }
    
    
    public CharacterBuilder race(Race race) {
	this.race = race;
	return this;
    }
    
    public CharacterBuilder addClass(BaseClass baseClass) {
	this.baseClasses.put(baseClass.getType(), baseClass);
	return this;
    }
    
    public PlayerCharacter build() {
	
	PlayerCharacter character = new PlayerCharacter();
	character.setAttributes(attributes);
	character.setRace(race);
	character.setAbilities(abilityScores);
	character.setClasses(baseClasses);

	     
	
	//Apply Racials
	if(character.getRace() != null) {
	    character.getRace().getRacialAbilityModifier().applyRule(character);
	}
	

	return character;
    }

}
