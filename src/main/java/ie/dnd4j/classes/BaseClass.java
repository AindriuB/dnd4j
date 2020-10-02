package ie.dnd4j.classes;

public class BaseClass {
    
    
    private String type;
    
    private int level;
    
    private int hitDice;
    
    private String description;
    
    
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

    public int getHitDice() {
        return hitDice;
    }

    public void setHitDice(int hitDice) {
        this.hitDice = hitDice;
    }
    
    

}
