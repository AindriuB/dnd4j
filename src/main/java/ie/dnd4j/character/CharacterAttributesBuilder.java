package ie.dnd4j.character;

import ie.dnd4j.EntityBuilder;

public class CharacterAttributesBuilder extends EntityBuilder<CharacterAttributes> {
    
    private static CharacterAttributesBuilder SELF;
    
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
    
    
    public CharacterAttributesBuilder alignment(Alignment alignment) {
        this.alignment = alignment;
        return this;
    }


    public CharacterAttributesBuilder name(String name) {
        this.name = name;
        return this;
    }


    public CharacterAttributesBuilder gender(String gender) {
        this.gender = gender;
        return this;
    }


    public CharacterAttributesBuilder age(int age) {
        this.age = age;
        return this;
    }


    public CharacterAttributesBuilder height(String height) {
        this.height = height;
        return this;
    }


    public CharacterAttributesBuilder weight(int weight) {
        this.weight = weight;
        return this;
    }


    public CharacterAttributesBuilder eyes(String eyes) {
        this.eyes = eyes;
        return this;
    }


    public CharacterAttributesBuilder skin(String skin) {
        this.skin = skin;
        return this;
    }


    public CharacterAttributesBuilder hair(String hair) {
        this.hair = hair;
        return this;
    }


    public CharacterAttributesBuilder movementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
        return this;
    }


    public CharacterAttributesBuilder flySpeed(int flySpeed) {
        this.flySpeed = flySpeed;
        return this;
    }


    public CharacterAttributesBuilder climbSpeed(int climbSpeed) {
        this.climbSpeed = climbSpeed;
        return this;
    }


    public CharacterAttributesBuilder swimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
        return this;
    }

    public static CharacterAttributesBuilder getInstance() {
	if(SELF == null) {
	    SELF = new CharacterAttributesBuilder();
	} 
	return SELF;
    }
    
    
    public CharacterAttributes build() {
	CharacterAttributes characterAttributes = new CharacterAttributes();
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
