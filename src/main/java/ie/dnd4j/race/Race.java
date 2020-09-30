package ie.dnd4j.race;

import java.util.List;

import ie.dnd4j.rules.RacialAbilityModifier;

public class Race {
    
    private String name;
    
    private String description;
    
    private int speed;
    
    private List<String> language;

    private RacialAbilityModifier racialAbilityModifier;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public RacialAbilityModifier getRacialAbilityModifier() {
        return racialAbilityModifier;
    }

    public void setRacialAbilityModifier(RacialAbilityModifier racialAbilityModifier) {
        this.racialAbilityModifier = racialAbilityModifier;
    }

    

}
