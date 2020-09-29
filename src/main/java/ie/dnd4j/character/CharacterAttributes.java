package ie.dnd4j.character;

public class CharacterAttributes {
    
    private String name;
    
    private String gender;
    
    private int age;
    
    private String height;
    
    private int weight;
    
    private String eyes;
    
    private String skin;
    
    private String hair;
    
    private Alignment alignment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }
    
    public CharacterAttributes() {
	
    }

    public CharacterAttributes(String name, String gender, int age, String height, int weight, String eyes, String skin,
	    String hair, Alignment alignment) {
	super();
	this.name = name;
	this.gender = gender;
	this.age = age;
	this.height = height;
	this.weight = weight;
	this.eyes = eyes;
	this.skin = skin;
	this.hair = hair;
	this.alignment = alignment;
    }
    
    
    
}
