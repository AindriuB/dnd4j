package ie.dnd4j.items;

public enum ArmourType {
    
    HEAVY("Heavy"), MEDIUM("Medium"), LIGHT("LIGHT");

    private String type;
    
    ArmourType(String type){
	this.type = type;
    }
    
    
    public static ArmourType forString(String value) {
	for(ArmourType type: ArmourType.values()) {
	    if(type.toString().toLowerCase().equals(value.toLowerCase())) {
		return type;
	    }
	}
	return null;
    }
    
    
    @Override
    public String toString() {
        return type;
    }

    
}
