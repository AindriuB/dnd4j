package ie.dnd4j;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ie.dnd4j.abilities.Ability;
import ie.dnd4j.abilities.AbilityScore;
import ie.dnd4j.character.CharacterAttributes;
import ie.dnd4j.race.Race;

public class BaseEntity {

   
    private CharacterAttributes attributes;
    
    private int movementSpeed;
    
    private int flySpeed;
    
    private int climbSpeed;
    
    private int swimSpeed;
    
    private String vision;
    
    private String deity;
    
    private Race race;
   
    private Map<Ability, AbilityScore> abilities;
    
    private List<String> armourProficincies;
    
    private List<String> weaponProficincies;
    
    private List<String> toolProficincies;
    
    private List<String> languages;
    
    
    
    public BaseEntity() {
	abilities = new HashMap<Ability, AbilityScore>();
	abilities.put(Ability.STRENGTH, new AbilityScore(Ability.STRENGTH, 8));
	abilities.put(Ability.DEXTERITY, new AbilityScore(Ability.DEXTERITY, 8));
	abilities.put(Ability.CONSTITUTION, new AbilityScore(Ability.CONSTITUTION, 8));
	abilities.put(Ability.INTELLIGENCE, new AbilityScore(Ability.INTELLIGENCE, 8));
	abilities.put(Ability.WISDOM, new AbilityScore(Ability.WISDOM, 8));
	abilities.put(Ability.CHARISMA, new AbilityScore(Ability.CHARISMA, 8));
	
	armourProficincies = Collections.emptyList();
	weaponProficincies = Collections.emptyList();
	toolProficincies = Collections.emptyList();
	languages = Collections.emptyList();
	
    }
    
    
    public BaseEntity(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
	abilities = new HashMap<Ability, AbilityScore>();
	abilities.put(Ability.STRENGTH, new AbilityScore(Ability.STRENGTH, strength));
	abilities.put(Ability.DEXTERITY, new AbilityScore(Ability.DEXTERITY, dexterity));
	abilities.put(Ability.CONSTITUTION, new AbilityScore(Ability.CONSTITUTION, constitution));
	abilities.put(Ability.INTELLIGENCE, new AbilityScore(Ability.INTELLIGENCE, intelligence));
	abilities.put(Ability.WISDOM, new AbilityScore(Ability.WISDOM, wisdom));
	abilities.put(Ability.CHARISMA, new AbilityScore(Ability.CHARISMA, charisma));
	
	armourProficincies = Collections.emptyList();
	weaponProficincies = Collections.emptyList();
	toolProficincies = Collections.emptyList();
	languages = Collections.emptyList();
    }


    public Map<Ability, AbilityScore> getAbilities() {
        return abilities;
    }


    public void setAbilities(Map<Ability, AbilityScore> abilities) {
        this.abilities = abilities;
    }



    public Race getRace() {
        return race;
    }


    public void setRace(Race race) {
        this.race = race;
    }


    public String getDeity() {
        return deity;
    }


    public void setDeity(String deity) {
        this.deity = deity;
    }


    public int getMovementSpeed() {
        return movementSpeed;
    }


    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }


    public int getFlySpeed() {
        return flySpeed;
    }


    public void setFlySpeed(int flySpeed) {
        this.flySpeed = flySpeed;
    }


    public int getClimbSpeed() {
        return climbSpeed;
    }


    public void setClimbSpeed(int climbSpeed) {
        this.climbSpeed = climbSpeed;
    }


    public int getSwimSpeed() {
        return swimSpeed;
    }


    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }


    public String getVision() {
        return vision;
    }


    public void setVision(String vision) {
        this.vision = vision;
    }


    public CharacterAttributes getAttributes() {
        return attributes;
    }


    public void setAttributes(CharacterAttributes attributes) {
        this.attributes = attributes;
    }


    public List<String> getArmourProficincies() {
        return armourProficincies;
    }


    public void setArmourProficincies(List<String> armourProficincies) {
        this.armourProficincies = armourProficincies;
    }


    public List<String> getWeaponProficincies() {
        return weaponProficincies;
    }


    public void setWeaponProficincies(List<String> weaponProficincies) {
        this.weaponProficincies = weaponProficincies;
    }


    public List<String> getToolProficincies() {
        return toolProficincies;
    }


    public void setToolProficincies(List<String> toolProficincies) {
        this.toolProficincies = toolProficincies;
    }


    public List<String> getLanguages() {
        return languages;
    }


    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }
    
    

}
