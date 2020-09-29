package ie.dnd4j.abilities;

public class AbilityScore {

    private Ability ability;
    
    private int score;
    
    private int modifier;
    

    public AbilityScore(Ability ability, int score) {
	super();
	this.ability = ability;
	this.score = score;
	this.modifier = ((score - 10 )/ 2);
    }
    
    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getModifier() {
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }


    
    
}
