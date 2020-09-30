package ie.dnd4j.character;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TraitsBuilderTest {

    @Test
    public void testBuild() {
	
	TraitsBuilder builder = TraitsBuilder.getInstance();
	
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
	
	Traits  traits = builder.build();
	
	assertEquals(20, traits.getAge());
	assertEquals(Alignment.N, traits.getAlignment());
	assertEquals(10, traits.getClimbSpeed());
	assertEquals("brown", traits.getEyes());
	assertEquals(60, traits.getFlySpeed());
	assertEquals("female", traits.getGender());
	assertEquals("brown", traits.getHair());
	assertEquals("5ft6", traits.getHeight());
	assertEquals(30, traits.getMovementSpeed());
	assertEquals("Test Character", traits.getName());
	assertEquals("pale", traits.getSkin());
	assertEquals(15, traits.getSwimSpeed());
	assertEquals(115, traits.getWeight());
	
    }

}
