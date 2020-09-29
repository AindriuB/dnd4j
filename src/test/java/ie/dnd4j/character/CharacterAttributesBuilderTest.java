package ie.dnd4j.character;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharacterAttributesBuilderTest {

    @Test
    public void testBuild() {
	
	CharacterAttributesBuilder builder = CharacterAttributesBuilder.getInstance();
	
	builder.age(20);
	builder.alignment(Alignment.N);
	builder.climbSpeed(10);
	builder.eyes("brown");
	builder.flySpeed(60);
	builder.gender("female");
	builder.hair("brown");
	builder.height("5ft6");
	builder.movementSpeed(30);
	builder.name("Test Character");
	builder.skin("pale");
	builder.swimSpeed(15);
	builder.weight(115);
	
	CharacterAttributes  attributes = builder.build();
	
	assertEquals(20, attributes.getAge());
	assertEquals(Alignment.N, attributes.getAlignment());
	assertEquals(10, attributes.getClimbSpeed());
	assertEquals("brown", attributes.getEyes());
	assertEquals(60, attributes.getFlySpeed());
	assertEquals("female", attributes.getGender());
	assertEquals("brown", attributes.getHair());
	assertEquals("5ft6", attributes.getHeight());
	assertEquals(30, attributes.getMovementSpeed());
	assertEquals("Test Character", attributes.getName());
	assertEquals("pale", attributes.getSkin());
	assertEquals(15, attributes.getSwimSpeed());
	assertEquals(115, attributes.getWeight());
	
    }

}
