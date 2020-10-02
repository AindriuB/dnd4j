package ie.dnd4j.character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import ie.dnd4j.abilities.Ability;
import ie.dnd4j.abilities.AbilityScore;
import ie.dnd4j.classes.BaseClass;
import ie.dnd4j.items.BaseItem;
import ie.dnd4j.race.Race;
import ie.dnd4j.religion.Deity;
import ie.dnd4j.skills.Skill;
import ie.dnd4j.skills.SkillType;
import ie.dnd4j.spells.Spell;

public abstract class BaseEntity {

   
    private Traits traits;
    
    private String vision;
    
    private Deity deity;
    
    private Race race;
   
    private Attributes attributes;
    
    private Map<String, BaseClass> classes;
   
    private Map<Ability, AbilityScore> abilities;
    
    private List<String> armourProficincies;
    
    private List<String> weaponProficincies;
    
    private List<String> toolProficincies;
    
    private List<String> languages;
    
    private List<BaseItem> inventory;

    private HashSet<BaseItem> equipedItems;
    
    private List<Spell> spells;
    
    private Map<SkillType, Skill> skills;
    
    private int level;
    
    private int profficiencyBonus;
    
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
	classes = new HashMap<String, BaseClass>();
	inventory = new ArrayList<BaseItem>();
	equipedItems = new HashSet<BaseItem>();
	spells = new ArrayList<Spell>();
	skills = new HashMap<SkillType, Skill>();
	level = 1;
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
	classes = new HashMap<String, BaseClass>();
	inventory = new ArrayList<BaseItem>();
	equipedItems = new HashSet<BaseItem>();
	spells = new ArrayList<Spell>();
	skills = new HashMap<SkillType, Skill>();
	level = 1;
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


    public Deity getDeity() {
        return deity;
    }


    public void setDeity(Deity deity) {
        this.deity = deity;
    }



    public String getVision() {
        return vision;
    }


    public void setVision(String vision) {
        this.vision = vision;
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



    public Map<String, BaseClass> getClasses() {
        return classes;
    }


    public void setClasses(Map<String, BaseClass> classes) {
        this.classes = classes;
    }


    public Traits getTraits() {
        return traits;
    }


    public void setTraits(Traits traits) {
        this.traits = traits;
    }


    public Attributes getAttributes() {
        return attributes;
    }


    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }
    
    public void addItemToInventory(BaseItem item) {
	if(item.isEquiped()) {
	   equipItem(item);
	}
	this.inventory.add(item);
    }
    
    public void equipItem(BaseItem item) {
	if(inventory.contains(item)) {
	    equipedItems.add(item);
	}
    }
    
    public void unequipItem(BaseItem item) {
	if(equipedItems.contains(item)) {
	    equipedItems.remove(item);
	}
    }


    public List<BaseItem> getInventory() {
        return inventory;
    }


    public void setInventory(List<BaseItem> inventory) {
        this.inventory = inventory;
        for(BaseItem item : this.inventory) {
            if(item.isEquiped()) {
        	equipItem(item);
            }
        }
    }


    public HashSet<BaseItem> getEquipedItems() {
        return equipedItems;
    }


    public void setEquipedItems(HashSet<BaseItem> equipedItems) {
        this.equipedItems = equipedItems;
    }

    public void addSpell(Spell spell) {
	this.spells.add(spell);
    }

    public List<Spell> getSpells() {
        return spells;
    }


    public void setSpells(List<Spell> spells) {
        this.spells = spells;
    }


    public Map<SkillType, Skill> getSkills() {
        return skills;
    }


    public void setSkills(Map<SkillType, Skill> skills) {
        this.skills = skills;
    }


    public int getProfficiencyBonus() {
        return profficiencyBonus;
    }


    public void setProfficiencyBonus(int profficiencyBonus) {
        this.profficiencyBonus = profficiencyBonus;
    }


    public int getLevel() {
        return level;
    }


    public void setLevel(int level) {
        this.level = level;
    }
    
   
       
}
