package ie.dnd4j.builder;

import ie.dnd4j.character.Alignment;
import ie.dnd4j.character.Traits;

public class TraitsBuilder extends EntityBuilder<Traits> {
    
    private static TraitsBuilder SELF;
    
    private Alignment alignment;
    
    private String name;
    
    private String gender;
    
    private int age;
    
    private String height;
    
    private int weight;
    
    private String eyes;
    
    private String skin;
    
    private String hair;
    
    private int movementSpeed;
    
    private int flySpeed;
    
    private int climbSpeed;
    
    private int swimSpeed;
    
    
    public TraitsBuilder alignment(Alignment alignment) {
        this.alignment = alignment;
        return this;
    }


    public TraitsBuilder name(String name) {
        this.name = name;
        return this;
    }


    public TraitsBuilder gender(String gender) {
        this.gender = gender;
        return this;
    }


    public TraitsBuilder age(int age) {
        this.age = age;
        return this;
    }


    public TraitsBuilder height(String height) {
        this.height = height;
        return this;
    }


    public TraitsBuilder weight(int weight) {
        this.weight = weight;
        return this;
    }


    public TraitsBuilder eyes(String eyes) {
        this.eyes = eyes;
        return this;
    }


    public TraitsBuilder skin(String skin) {
        this.skin = skin;
        return this;
    }


    public TraitsBuilder hair(String hair) {
        this.hair = hair;
        return this;
    }


    public TraitsBuilder movementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
        return this;
    }


    public TraitsBuilder flySpeed(int flySpeed) {
        this.flySpeed = flySpeed;
        return this;
    }


    public TraitsBuilder climbSpeed(int climbSpeed) {
        this.climbSpeed = climbSpeed;
        return this;
    }


    public TraitsBuilder swimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
        return this;
    }

    public static TraitsBuilder getInstance() {
	if(SELF == null) {
	    SELF = new TraitsBuilder();
	} 
	return SELF;
    }
    
    
    public Traits build() {
	Traits characterAttributes = new Traits();
	characterAttributes.setAge(age);
	characterAttributes.setAlignment(alignment);
	characterAttributes.setClimbSpeed(climbSpeed);
	characterAttributes.setEyes(eyes);
	characterAttributes.setFlySpeed(flySpeed);
	characterAttributes.setGender(gender);
	characterAttributes.setHair(hair);
	characterAttributes.setHeight(height);
	characterAttributes.setMovementSpeed(movementSpeed);
	characterAttributes.setName(name);
	characterAttributes.setSkin(skin);
	characterAttributes.setSwimSpeed(swimSpeed);
	characterAttributes.setWeight(weight);
	return characterAttributes;
    }

}
