package ie.dnd4j.tables;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharacterAdvancementTableTest {

    @Test
    public void testProficienyBonus() {
	assertEquals(2, CharacterAdvancementTable.proficienyBonus(1));
	assertEquals(2, CharacterAdvancementTable.proficienyBonus(2));
	assertEquals(2, CharacterAdvancementTable.proficienyBonus(3));
	assertEquals(2, CharacterAdvancementTable.proficienyBonus(4));
	assertEquals(3, CharacterAdvancementTable.proficienyBonus(5));
	assertEquals(3, CharacterAdvancementTable.proficienyBonus(6));
	assertEquals(3, CharacterAdvancementTable.proficienyBonus(7));
	assertEquals(3, CharacterAdvancementTable.proficienyBonus(8));
	assertEquals(4, CharacterAdvancementTable.proficienyBonus(9));
	assertEquals(4, CharacterAdvancementTable.proficienyBonus(10));
	assertEquals(4, CharacterAdvancementTable.proficienyBonus(11));
	assertEquals(4, CharacterAdvancementTable.proficienyBonus(12));
	assertEquals(5, CharacterAdvancementTable.proficienyBonus(13));
	assertEquals(5, CharacterAdvancementTable.proficienyBonus(14));
	assertEquals(5, CharacterAdvancementTable.proficienyBonus(15));
	assertEquals(5, CharacterAdvancementTable.proficienyBonus(16));
	assertEquals(6, CharacterAdvancementTable.proficienyBonus(17));
	assertEquals(6, CharacterAdvancementTable.proficienyBonus(18));
	assertEquals(6, CharacterAdvancementTable.proficienyBonus(19));
	assertEquals(6, CharacterAdvancementTable.proficienyBonus(20));
    }

    @Test
    public void testExperiencePoints() {
	assertEquals(0, CharacterAdvancementTable.experiencePoints(1));
	assertEquals(300, CharacterAdvancementTable.experiencePoints(2));
	assertEquals(900, CharacterAdvancementTable.experiencePoints(3));
	assertEquals(2700, CharacterAdvancementTable.experiencePoints(4));
	assertEquals(6500, CharacterAdvancementTable.experiencePoints(5));
	assertEquals(14000, CharacterAdvancementTable.experiencePoints(6));
	assertEquals(23000, CharacterAdvancementTable.experiencePoints(7));
	assertEquals(34000, CharacterAdvancementTable.experiencePoints(8));
	assertEquals(48000, CharacterAdvancementTable.experiencePoints(9));
	assertEquals(64000, CharacterAdvancementTable.experiencePoints(10));
	assertEquals(85000, CharacterAdvancementTable.experiencePoints(11));
	assertEquals(100000, CharacterAdvancementTable.experiencePoints(12));
	assertEquals(120000, CharacterAdvancementTable.experiencePoints(13));
	assertEquals(140000, CharacterAdvancementTable.experiencePoints(14));
	assertEquals(165000, CharacterAdvancementTable.experiencePoints(15));
	assertEquals(195000, CharacterAdvancementTable.experiencePoints(16));
	assertEquals(225000, CharacterAdvancementTable.experiencePoints(17));
	assertEquals(265000, CharacterAdvancementTable.experiencePoints(18));
	assertEquals(305000, CharacterAdvancementTable.experiencePoints(19));
	assertEquals(355000, CharacterAdvancementTable.experiencePoints(20));
    }

}
