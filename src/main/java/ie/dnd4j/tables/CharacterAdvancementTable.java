package ie.dnd4j.tables;

public class CharacterAdvancementTable {

    public static int proficienyBonus(int level) {
	int base = 2;
	if (level <= 4) {
	    return base;
	} else if (level > 4 && level <= 8) {
	    return base + 1;
	} else if (level > 8 && level <= 12) {
	    return base + 2;
	} else if (level > 12 && level <= 16) {
	    return base + 3;
	} else {
	    return base + 4;
	}
    }

    public static int experiencePoints(int level) {

	switch (level) {
	case 1:
	    return 0;
	case 2:
	    return 300;
	case 3:
	    return 900;
	case 4:
	    return 2700;
	case 5:
	    return 6500;
	case 6:
	    return 14000;
	case 7:
	    return 23000;
	case 8:
	    return 34000;
	case 9:
	    return 48000;
	case 10:
	    return 64000;
	case 11:
	    return 85000;
	case 12:
	    return 100000;
	case 13:
	    return 120000;
	case 14:
	    return 140000;
	case 15:
	    return 165000;
	case 16:
	    return 195000;
	case 17:
	    return 225000;
	case 18:
	    return 265000;
	case 19:
	    return 305000;
	case 20:
	    return 355000;
	default:
	    return 0;
	}

    }
}
