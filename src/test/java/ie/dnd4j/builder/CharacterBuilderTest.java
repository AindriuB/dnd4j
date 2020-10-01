package ie.dnd4j.builder;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import ie.dnd4j.JsonFileWriterTest;
import ie.dnd4j.abilities.Ability;
import ie.dnd4j.character.Alignment;
import ie.dnd4j.character.Attributes;
import ie.dnd4j.character.PlayerCharacter;
import ie.dnd4j.character.Traits;
import ie.dnd4j.classes.BaseClass;
import ie.dnd4j.items.Armour;
import ie.dnd4j.items.ArmourType;
import ie.dnd4j.items.Item;
import ie.dnd4j.race.Race;
import ie.dnd4j.rules.stats.ArmourClassBuffRule;
import ie.dnd4j.rules.stats.ArmourClassRule;
import ie.dnd4j.rules.stats.RacialAbilityModifier;

public class CharacterBuilderTest extends JsonFileWriterTest {
    
    private Race elf;
    
    private BaseClass baseClass;
    
    private Traits traits;
    
    private Armour armour;
    
    private Item item;

    private Attributes attributes;
    @Before
    public void setUp() {
	elf = new Race();
	elf.setRacialAbilityModifier(new RacialAbilityModifier(0,2,0,0,0,0));
	elf.setLanguage(Arrays.asList("common", "elvish"));
	elf.setName("Elf");
	elf.setSpeed(30);
	
	baseClass = new BaseClass("Rogue");
	baseClass.setDescription("Rogue");
	baseClass.setHitDice(8);
	baseClass.setLevel(1);
	
	traits = new Traits();
	traits.setAge(10);
	traits.setAlignment(Alignment.CE);
	traits.setClimbSpeed(10);
	traits.setEyes("blue");
	traits.setFlySpeed(20);
	traits.setGender("female");
	traits.setHair("brown");
	traits.setHeight("4ft6");
	traits.setMovementSpeed(10);
	traits.setName("Test Name");
	traits.setSwimSpeed(10);
	traits.setWeight(10);
	
	attributes = new Attributes();
	attributes.setHitPoints(10);
	
	
	
	armour = new Armour();
	armour.setArmour("Light");
	armour.setName("Studded Leather");
	armour.setCategory("Armour");
	armour.setCost(10);
	armour.setCurrency("gp");
	armour.setEquiped(true);
	armour.setSlot("body");
	armour.addRule(new ArmourClassRule(13, ArmourType.forString(armour.getArmour())));
	
	
	item = new Item();
	item.setName("Ring or protection");
	item.setCategory("Ring");
	item.setCost(10);
	item.setCurrency("gp");
	item.setEquiped(true);
	item.setSlot("body");
	item.addRule(new ArmourClassBuffRule(1));
    }

    @Test
    public void testBuild() {
	CharacterBuilder builder = new CharacterBuilder();
	
	builder.abilityScores(10, 11, 12, 13, 14, 15);
	builder.addClass(baseClass);
	builder.race(elf);
	builder.attributes(attributes);
	builder.traits(traits);
	builder.withItem(armour);
	builder.withItem(item);
	
	PlayerCharacter character = builder.build();
	
	
	assertEquals(10, character.getAbilities().get(Ability.STRENGTH).getTotal());
	assertEquals(0, character.getAbilities().get(Ability.STRENGTH).getModifier());
	assertEquals(13, character.getAbilities().get(Ability.DEXTERITY).getTotal());
	assertEquals(1, character.getAbilities().get(Ability.DEXTERITY).getModifier());
	assertEquals(12, character.getAbilities().get(Ability.CONSTITUTION).getTotal());
	assertEquals(1, character.getAbilities().get(Ability.CONSTITUTION).getModifier());
	assertEquals(13, character.getAbilities().get(Ability.INTELLIGENCE).getTotal());
	assertEquals(1, character.getAbilities().get(Ability.INTELLIGENCE).getModifier());
	assertEquals(14, character.getAbilities().get(Ability.WISDOM).getTotal());
	assertEquals(2, character.getAbilities().get(Ability.WISDOM).getModifier());
	assertEquals(15, character.getAbilities().get(Ability.CHARISMA).getTotal());
	assertEquals(2, character.getAbilities().get(Ability.CHARISMA).getModifier());
	
	assertEquals(1, character.getClasses().size());
	assertEquals(baseClass, character.getClasses().get("Rogue"));
	assertEquals(traits, character.getTraits());
	
	assertEquals(elf, character.getRace());
	

	writeOutput(character, "src/test/resources/test-output/character.json");
	
    }

}
