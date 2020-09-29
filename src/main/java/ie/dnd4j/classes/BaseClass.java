package ie.dnd4j.classes;

import java.util.List;

public abstract class BaseClass {
    
    
    private String type;
    
    private int level;
    
    private int hitDice;
    
    private String description;
    
    private List<ClassFeature> classFeatures;
    
    
    
    public BaseClass(String type) {
	this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ClassFeature> getClassFeatures() {
        return classFeatures;
    }

    public void setClassFeatures(List<ClassFeature> classFeatures) {
        this.classFeatures = classFeatures;
    }

    public int getHitDice() {
        return hitDice;
    }

    public void setHitDice(int hitDice) {
        this.hitDice = hitDice;
    }
    
    

}
