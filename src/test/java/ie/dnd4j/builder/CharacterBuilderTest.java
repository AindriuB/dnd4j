package ie.dnd4j.builder;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import ie.dnd4j.PlayerCharacter;
import ie.dnd4j.abilities.Ability;
import ie.dnd4j.character.Alignment;
import ie.dnd4j.character.Traits;
import ie.dnd4j.classes.BaseClass;
import ie.dnd4j.race.Race;
import ie.dnd4j.rules.RacialAbilityModifier;

public class CharacterBuilderTest {
    
    private Race elf;
    
    private BaseClass baseClass;
    
    private Traits traits;
    
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
    }

    @Test
    public void testBuild() {
	CharacterBuilder builder = new CharacterBuilder();
	
	builder.abilityScores(10, 11, 12, 13, 14, 15);
	builder.addClass(baseClass);
	builder.race(elf);
	builder.traits(traits);
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
	
    }

}
