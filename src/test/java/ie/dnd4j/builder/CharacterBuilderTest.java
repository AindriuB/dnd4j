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
import ie.dnd4j.rules.stats.RacialAbilityModifierRule;
import ie.dnd4j.skills.SkillType;

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
	elf.setRacialAbilityModifier(new RacialAbilityModifierRule(0,2,0,0,0,0));
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
	CharacterBuilder builder = CharacterBuilder.getInstance();
	
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
    
    
    @Test
    public void testBuild_Skills() {
	CharacterBuilder builder = CharacterBuilder.getInstance();
	
	builder.abilityScores(8, 15, 15, 14, 12, 8);
	builder.addClass(baseClass);
	builder.race(elf);
	builder.attributes(attributes);
	builder.traits(traits);
	builder.withSkillProfficiency(SkillType.ACROBATICS);
	builder.withSkillProfficiency(SkillType.PERCEPTION);
	builder.withSkillProfficiency(SkillType.STEALTH);
	builder.withSkillProfficiency(SkillType.SLEIGHT_OF_HAND);
	builder.withExpertise(SkillType.STEALTH);
	builder.withExpertise(SkillType.ACROBATICS);
	
	PlayerCharacter character = builder.build();
	
	
	assertEquals(8, character.getAbilities().get(Ability.STRENGTH).getTotal());
	assertEquals(-1, character.getAbilities().get(Ability.STRENGTH).getModifier());
	assertEquals(17, character.getAbilities().get(Ability.DEXTERITY).getTotal());
	assertEquals(3, character.getAbilities().get(Ability.DEXTERITY).getModifier());
	assertEquals(15, character.getAbilities().get(Ability.CONSTITUTION).getTotal());
	assertEquals(2, character.getAbilities().get(Ability.CONSTITUTION).getModifier());
	assertEquals(14, character.getAbilities().get(Ability.INTELLIGENCE).getTotal());
	assertEquals(2, character.getAbilities().get(Ability.INTELLIGENCE).getModifier());
	assertEquals(12, character.getAbilities().get(Ability.WISDOM).getTotal());
	assertEquals(1, character.getAbilities().get(Ability.WISDOM).getModifier());
	assertEquals(8, character.getAbilities().get(Ability.CHARISMA).getTotal());
	assertEquals(-1, character.getAbilities().get(Ability.CHARISMA).getModifier());

	
	assertEquals(3, character.getSkills().get(SkillType.PERCEPTION).getScore());
	assertEquals(5, character.getSkills().get(SkillType.SLEIGHT_OF_HAND).getScore());

	assertEquals(7, character.getSkills().get(SkillType.ACROBATICS).getScore());
	assertEquals(7, character.getSkills().get(SkillType.STEALTH).getScore());

	writeOutput(character, "src/test/resources/test-output/character.json");
	
    }

}
