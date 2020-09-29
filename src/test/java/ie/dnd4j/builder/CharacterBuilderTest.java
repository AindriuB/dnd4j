package ie.dnd4j.builder;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import ie.dnd4j.PlayerCharacter;
import ie.dnd4j.abilities.Ability;
import ie.dnd4j.character.Alignment;
import ie.dnd4j.character.CharacterAttributes;
import ie.dnd4j.classes.BaseClass;
import ie.dnd4j.race.Race;
import ie.dnd4j.rules.RacialAbilityModifier;

public class CharacterBuilderTest {
    
    private Race elf;
    
    private BaseClass baseClass;
    
    private CharacterAttributes attributes;
    
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
	
	attributes = new CharacterAttributes();
	attributes.setAge(10);
	attributes.setAlignment(Alignment.CE);
	attributes.setClimbSpeed(10);
	attributes.setEyes("blue");
	attributes.setFlySpeed(20);
	attributes.setGender("female");
	attributes.setHair("brown");
	attributes.setHeight("4ft6");
	attributes.setMovementSpeed(10);
	attributes.setName("Test Name");
	attributes.setSwimSpeed(10);
	attributes.setWeight(10);
    }

    @Test
    public void testBuild() {
	CharacterBuilder builder = new CharacterBuilder();
	
	builder.abilityScores(10, 11, 12, 13, 14, 15);
	builder.addClass(baseClass);
	builder.race(elf);
	builder.characterAttributes(attributes);
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
	assertEquals(attributes, character.getAttributes());
	
	assertEquals(elf, character.getRace());
	
    }

}
