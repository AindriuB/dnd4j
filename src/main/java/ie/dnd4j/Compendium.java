package ie.dnd4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ie.dnd4j.character.background.Background;
import ie.dnd4j.classes.PlayerClass;
import ie.dnd4j.feats.Feat;
import ie.dnd4j.items.BaseItem;
import ie.dnd4j.race.Language;
import ie.dnd4j.race.Race;
import ie.dnd4j.religion.Deity;
import ie.dnd4j.spells.Spell;

public class Compendium {
    
    private String source;

    private Map<String, Spell> spells;
    private Map<String, Language> languages;
    private Map<String, BaseItem> items;
    private Map<String, Race> races;
    private Map<String, PlayerClass> classes;
    private Map<String, Background> backgrounds;
    private Map<String, Deity> deities;
    private Map<String, Feat> feats;
    private List<String> sources;
    public Compendium(String source) {
	this.source = source;
	spells = new HashMap<String, Spell>();
	languages = new HashMap<String, Language>();
	items = new HashMap<String, BaseItem>();
	races = new HashMap<String, Race>();
	deities = new HashMap<String, Deity>();
	feats = new HashMap<String, Feat>();
	classes = new HashMap<String, PlayerClass>();
	feats = new HashMap<String, Feat>();
	backgrounds = new HashMap<String, Background>();
	sources = new ArrayList<String>();
    }
    
    public Compendium() {
	this.source = "unknown";
	spells = new HashMap<String, Spell>();
	languages = new HashMap<String, Language>();
	items = new HashMap<String, BaseItem>();
	races = new HashMap<String, Race>();
	deities = new HashMap<String, Deity>();
	feats = new HashMap<String, Feat>();
	classes = new HashMap<String, PlayerClass>();
	feats = new HashMap<String, Feat>();
	backgrounds = new HashMap<String, Background>();
	sources = new ArrayList<String>();
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

    public Map<String, Deity> getDeities() {
        return deities;
    }

    public void setDeities(Map<String, Deity> deities) {
        this.deities = deities;
    }

    public Map<String, Feat> getFeats() {
        return feats;
    }

    public void setFeats(Map<String, Feat> feats) {
        this.feats = feats;
    }

    public Map<String, PlayerClass> getClasses() {
        return classes;
    }

    public void setClasses(Map<String, PlayerClass> classes) {
        this.classes = classes;
    }

    public Map<String, Background> getBackgrounds() {
        return backgrounds;
    }

    public void setBackgrounds(Map<String, Background> backgrounds) {
        this.backgrounds = backgrounds;
    }

    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
    }
    
    
}
