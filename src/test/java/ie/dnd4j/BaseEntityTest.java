package ie.dnd4j;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

import ie.dnd4j.abilities.Ability;
import ie.dnd4j.abilities.AbilityScore;

public class BaseEntityTest {

    @Test
    public void testBaseEntity() {
	BaseEntity entity = new BaseEntity();
	
	Map<Ability, AbilityScore> abilities = entity.getAbilities();
	
	assertEquals(-1, abilities.get(Ability.STRENGTH).getModifier());
	assertEquals(-1, abilities.get(Ability.DEXTERITY).getModifier());
	assertEquals(-1, abilities.get(Ability.CONSTITUTION).getModifier());
	assertEquals(-1, abilities.get(Ability.INTELLIGENCE).getModifier());
	assertEquals(-1, abilities.get(Ability.WISDOM).getModifier());
	assertEquals(-1, abilities.get(Ability.CHARISMA).getModifier());
    }
    
    
    
    @Test
    public void testBaseEntity_standardArray() {
	BaseEntity entity = new BaseEntity(16,15,14,13,12,11);
	
	Map<Ability, AbilityScore> abilities = entity.getAbilities();
	
	assertEquals(3, abilities.get(Ability.STRENGTH).getModifier());
	assertEquals(2, abilities.get(Ability.DEXTERITY).getModifier());
	assertEquals(2, abilities.get(Ability.CONSTITUTION).getModifier());
	assertEquals(1, abilities.get(Ability.INTELLIGENCE).getModifier());
	assertEquals(1, abilities.get(Ability.WISDOM).getModifier());
	assertEquals(0, abilities.get(Ability.CHARISMA).getModifier());
    }

}
