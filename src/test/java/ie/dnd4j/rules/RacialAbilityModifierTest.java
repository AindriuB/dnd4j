package ie.dnd4j.rules;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ie.dnd4j.abilities.Ability;
import ie.dnd4j.character.BaseEntity;
import ie.dnd4j.character.PlayerCharacter;

public class RacialAbilityModifierTest {
    
    private BaseEntity entity;
    
    @Before
    public void setUp() {
	entity = new PlayerCharacter(11, 11, 11, 11, 11, 11);
    }

    @Test
    public void testRacialAbilityModifier() {
	RacialAbilityModifier human = new RacialAbilityModifier(1, 1, 1, 1, 1, 1);
	assertEquals(1, human.getAbilityModifiers().get(Ability.STRENGTH).intValue());
	assertEquals(1, human.getAbilityModifiers().get(Ability.DEXTERITY).intValue());
	assertEquals(1, human.getAbilityModifiers().get(Ability.CONSTITUTION).intValue());
	assertEquals(1, human.getAbilityModifiers().get(Ability.INTELLIGENCE).intValue());
	assertEquals(1, human.getAbilityModifiers().get(Ability.WISDOM).intValue());
	assertEquals(1, human.getAbilityModifiers().get(Ability.CHARISMA).intValue());
    }

    @Test
    public void testApplyRule_Human() {

	entity = new PlayerCharacter(11, 11, 11, 11, 11, 11);
	RacialAbilityModifier human = new RacialAbilityModifier(1, 1, 1, 1, 1, 1);
	human.applyRule(entity);
	
	assertEquals(12, entity.getAbilities().get(Ability.STRENGTH).getTotal());
	assertEquals(1, entity.getAbilities().get(Ability.STRENGTH).getModifier());
	assertEquals(12, entity.getAbilities().get(Ability.DEXTERITY).getTotal());
	assertEquals(1, entity.getAbilities().get(Ability.DEXTERITY).getModifier());
	assertEquals(12, entity.getAbilities().get(Ability.CONSTITUTION).getTotal());
	assertEquals(1, entity.getAbilities().get(Ability.CONSTITUTION).getModifier());
	assertEquals(12, entity.getAbilities().get(Ability.INTELLIGENCE).getTotal());
	assertEquals(1, entity.getAbilities().get(Ability.INTELLIGENCE).getModifier());
	assertEquals(12, entity.getAbilities().get(Ability.WISDOM).getTotal());
	assertEquals(1, entity.getAbilities().get(Ability.WISDOM).getModifier());
	assertEquals(12, entity.getAbilities().get(Ability.CHARISMA).getTotal());
	assertEquals(1, entity.getAbilities().get(Ability.CHARISMA).getModifier());
	
	
    }
    
    
    @Test
    public void testApplyRule_Elf() {

	entity = new PlayerCharacter(12, 12, 12, 12, 12, 12);
	RacialAbilityModifier elf = new RacialAbilityModifier(0, 2, 0, 0, 0, 0); 
	
	elf.applyRule(entity);
	
	assertEquals(12, entity.getAbilities().get(Ability.STRENGTH).getTotal());
	assertEquals(1, entity.getAbilities().get(Ability.STRENGTH).getModifier());
	assertEquals(14, entity.getAbilities().get(Ability.DEXTERITY).getTotal());
	assertEquals(2, entity.getAbilities().get(Ability.DEXTERITY).getModifier());
	assertEquals(12, entity.getAbilities().get(Ability.CONSTITUTION).getTotal());
	assertEquals(1, entity.getAbilities().get(Ability.CONSTITUTION).getModifier());
	assertEquals(12, entity.getAbilities().get(Ability.INTELLIGENCE).getTotal());
	assertEquals(1, entity.getAbilities().get(Ability.INTELLIGENCE).getModifier());
	assertEquals(12, entity.getAbilities().get(Ability.WISDOM).getTotal());
	assertEquals(1, entity.getAbilities().get(Ability.WISDOM).getModifier());
	assertEquals(12, entity.getAbilities().get(Ability.CHARISMA).getTotal());
	assertEquals(1, entity.getAbilities().get(Ability.CHARISMA).getModifier());
	
	
    }

}
