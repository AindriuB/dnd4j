package ie.dnd4j.rules;

import java.util.HashMap;
import java.util.Map;

import ie.dnd4j.abilities.Ability;
import ie.dnd4j.abilities.AbilityScore;
import ie.dnd4j.character.BaseEntity;

public class RacialAbilityModifier implements AbilityModifier {
   
    
    private Map<Ability, Integer> abilities;
    
    public RacialAbilityModifier(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
	abilities = new HashMap<Ability, Integer>();
	abilities.put(Ability.STRENGTH, strength);
	abilities.put(Ability.DEXTERITY, dexterity);
	abilities.put(Ability.CONSTITUTION,constitution);
	abilities.put(Ability.INTELLIGENCE,intelligence);
	abilities.put(Ability.WISDOM, wisdom);
	abilities.put(Ability.CHARISMA, charisma);
    }

    public Map<Ability, Integer> getAbilityModifiers() {
	return abilities;
    }

    
    public BaseEntity applyRule(BaseEntity entity) {
	
	for(Ability ability: this.abilities.keySet()) {
	    AbilityScore score = entity.getAbilities().get(ability);
	    score.setBonus(abilities.get(ability));
	    score.calculate();
	    entity.getAbilities().put(ability, score);
	}
	return entity;
    }

}
