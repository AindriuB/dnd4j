package ie.dnd4j.character;

public enum Alignment {

    LG("Lawful good"),  NG("Neutral good"), CG("Chaotic good"), LN("Lawful neutral"), N("Neutral"), CN("Chaotic neutral"), LE("Lawful evil"), NE("Neutral evil"), CE("Chaotic evil"); 
    
    private String value;
    
    
    public static Alignment forString(String value) {
	for(Alignment type: Alignment.values()) {
	    if(type.toString().toLowerCase().equals(value.toLowerCase())) {
		return type;
	    }
	}
	return null;
    }
    
    public static Alignment forTag(String tag) {
	if(tag == null ) {
	    return null;
	}
	for(Alignment type: Alignment.values()) {
	    if(type.toString().toLowerCase().equals(tag.toLowerCase())) {
		return type;
	    }
	}
	return null;
    }
    private Alignment(String value) {
	this.value = value;
    }


    public String getValue() {
        return value;
    }
    
    
}
