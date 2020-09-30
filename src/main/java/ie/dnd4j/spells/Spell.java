package ie.dnd4j.spells;

import ie.dnd4j.TagableEntity;

public class Spell extends TagableEntity {
    
    private String classes;
    
    private String name;
    
    private String description;
   
    private String school;
    
    private String duration;
    private String castTime;
    
    private String range;
    private Boolean verbalComponent;
    private Boolean somaticComponent;
    private Boolean materialComponent;
    private String materialComponens;
    private Boolean concentration;
    private Boolean ritual;
    private int level;

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCastTime() {
        return castTime;
    }

    public void setCastTime(String castTime) {
        this.castTime = castTime;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public Boolean getVerbalComponent() {
        return verbalComponent;
    }

    public void setVerbalComponent(Boolean verbalComponent) {
        this.verbalComponent = verbalComponent;
    }

    public Boolean getSomaticComponent() {
        return somaticComponent;
    }

    public void setSomaticComponent(Boolean somaticComponent) {
        this.somaticComponent = somaticComponent;
    }

    public Boolean getMaterialComponent() {
        return materialComponent;
    }

    public void setMaterialComponent(Boolean materialComponent) {
        this.materialComponent = materialComponent;
    }

    public String getMaterialComponens() {
        return materialComponens;
    }

    public void setMaterialComponens(String materialComponens) {
        this.materialComponens = materialComponens;
    }

    public Boolean getConcentration() {
        return concentration;
    }

    public void setConcentration(Boolean concentration) {
        this.concentration = concentration;
    }

    public Boolean getRitual() {
        return ritual;
    }

    public void setRitual(Boolean ritual) {
        this.ritual = ritual;
    }
    
    

}
