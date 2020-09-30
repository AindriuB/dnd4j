package ie.dnd4j;

import java.util.HashMap;
import java.util.Map;

import ie.dnd4j.items.BaseItem;
import ie.dnd4j.race.Language;
import ie.dnd4j.race.Race;
import ie.dnd4j.spells.Spell;

public class Compendium {
    
    private String source;

    private Map<String, Spell> spells;
    private Map<String, Language> languages;
    private Map<String, BaseItem> items;
    private Map<String, Race> races;
    
    public Compendium(String source) {
	this.source = source;
	spells = new HashMap<String, Spell>();
	languages = new HashMap<String, Language>();
	items = new HashMap<String, BaseItem>();
	races = new HashMap<String, Race>();
    }
    
    public Compendium() {
	this.source = "unknown";
	spells = new HashMap<String, Spell>();
	languages = new HashMap<String, Language>();
	items = new HashMap<String, BaseItem>();
	races = new HashMap<String, Race>();
    }
    
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public Map<String, Spell> getSpells() {
        return spells;
    }
    public void setSpells(Map<String, Spell> spells) {
        this.spells = spells;
    }
    public Map<String, Language> getLanguages() {
        return languages;
    }
    public void setLanguages(Map<String, Language> languages) {
        this.languages = languages;
    }
    public Map<String, BaseItem> getItems() {
        return items;
    }
    public void setItems(Map<String, BaseItem> items) {
        this.items = items;
    }

    public Map<String, Race> getRaces() {
        return races;
    }

    public void setRaces(Map<String, Race> races) {
        this.races = races;
    }
    
    
}
