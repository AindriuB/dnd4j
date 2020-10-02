package ie.dnd4j.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ie.dnd4j.abilities.Ability;
import ie.dnd4j.abilities.AbilityScore;
import ie.dnd4j.character.Attributes;
import ie.dnd4j.character.PlayerCharacter;
import ie.dnd4j.character.Traits;
import ie.dnd4j.classes.BaseClass;
import ie.dnd4j.items.Armour;
import ie.dnd4j.items.BaseItem;
import ie.dnd4j.items.Item;
import ie.dnd4j.race.Race;
import ie.dnd4j.religion.Deity;
import ie.dnd4j.rules.Rule;
import ie.dnd4j.search.ArmourPredicate;
import ie.dnd4j.search.ItemPredicate;
import ie.dnd4j.search.Search;

public class CharacterBuilder extends EntityBuilder<PlayerCharacter> {

    private Map<Ability, AbilityScore> abilityScores;

    private Attributes attributes;

    private Traits traits;

    private Race race;

    private Deity deity;
    
    private Map<String, BaseClass> baseClasses;

    private List<BaseItem> items;

    public CharacterBuilder() {
	baseClasses = new HashMap<String, BaseClass>();
	this.items = new ArrayList<BaseItem>();
    }

   
    public CharacterBuilder abilityScores(int strength, int dexterity, int constitution, int intelligence, int wisdom,
	    int charisma) {
	abilityScores = new HashMap<Ability, AbilityScore>();
	abilityScores.put(Ability.STRENGTH, new AbilityScore(Ability.STRENGTH, strength));
	abilityScores.put(Ability.DEXTERITY, new AbilityScore(Ability.DEXTERITY, dexterity));
	abilityScores.put(Ability.CONSTITUTION, new AbilityScore(Ability.CONSTITUTION, constitution));
	abilityScores.put(Ability.INTELLIGENCE, new AbilityScore(Ability.INTELLIGENCE, intelligence));
	abilityScores.put(Ability.WISDOM, new AbilityScore(Ability.WISDOM, wisdom));
	abilityScores.put(Ability.CHARISMA, new AbilityScore(Ability.CHARISMA, charisma));

	return this;
    }
    
    
    public static CharacterBuilder getInstance() {
	return new CharacterBuilder();
    }

    public CharacterBuilder traits(Traits traits) {
	this.traits = traits;
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

    public CharacterBuilder abilityScores(Map<Ability, AbilityScore> abilityScores) {
	this.abilityScores = abilityScores;
	return this;
    }
    
    public CharacterBuilder deity(Deity deity) {
	this.deity = deity;
	return this;
    }

    public CharacterBuilder attributes(Attributes attributes) {
	this.attributes = attributes;
	return this;
    }

    public void setBaseClasses(Map<String, BaseClass> baseClasses) {
	this.baseClasses = baseClasses;
    }

    public void withItem(BaseItem item) {
	this.items.add(item);
    }

    public PlayerCharacter build() {

	PlayerCharacter character = new PlayerCharacter();
	traits.setMovementSpeed(race.getSpeed());
	character.setTraits(traits);
	character.setAttributes(attributes);
	character.setRace(race);
	character.setAbilities(abilityScores);
	character.setClasses(baseClasses);
	character.setInventory(items);
	character.setDeity(deity);

	// Apply Racial ability modifiers
	if (character.getRace() != null) {
	    character.getRace().getRacialAbilityModifier().applyRule(character);
	}

	// Calculate AC
	// Apply item modifiers
	List<BaseItem> equipedArmour = Search.findAll(character.getEquipedItems(), new ArmourPredicate());
	if (equipedArmour.size() > 0) {
	    for (BaseItem armour : equipedArmour) {
		Armour a = (Armour)armour;
		for(Rule r: a.getRules()) {
		    r.applyRule(character);
		}
	    }
	}
	
	// Calculate AC
	// Apply item modifiers
	List<BaseItem> equipedItems = Search.findAll(character.getEquipedItems(), new ItemPredicate());
	if (equipedArmour.size() > 0) {
	    for (BaseItem item : equipedItems) {
		Item i = (Item)item;
		for(Rule r: i.getRules()) {
		    r.applyRule(character);
		}
	    }
	}
	
	return character;
    }

}
