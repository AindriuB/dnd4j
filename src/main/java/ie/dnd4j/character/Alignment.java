package ie.dnd4j.character;

public enum Alignment {

    LG("Lawful good"),  NG("Neutral good"), CG("Chaotic good"), LN("Lawful neutral"), N("Neutral"), CN("Chaotic neutral"), LE("Lawful evil"), NE("Neutral evil"), CE("Chaotic evil"); 
    
    private String value;
    
    
    private Alignment(String value) {
	this.value = value;
    }


    public String getValue() {
        return value;
    }
    
    
}
