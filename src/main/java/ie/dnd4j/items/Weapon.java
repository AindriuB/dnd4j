package ie.dnd4j.items;

public class Weapon extends BaseItem {
    
    private String range;
    
    private String damage;
    
    private String damageType;
    

    private String versatile;
    

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public String getVersatile() {
        return versatile;
    }

    public void setVersatile(String versatile) {
        this.versatile = versatile;
    }
    
}
