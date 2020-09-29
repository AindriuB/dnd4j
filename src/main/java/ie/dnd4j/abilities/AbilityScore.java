package ie.dnd4j.abilities;

import ie.dnd4j.Calculation;

public class AbilityScore implements Calculation {

    private Ability ability;
    
    private int bonus;

    private int total;
    
    private int base;
    
    private int modifier;
    
    public AbilityScore(Ability ability, int base) {
	super();
	this.ability = ability;
	this.base = base;
	this.total = base + bonus;
	this.calculate();
    }
    
    public AbilityScore(Ability ability, int bonus, int base) {
	super();
	this.ability = ability;
	this.base = base;
	this.bonus = bonus;
	this.total = base + bonus;
	this.calculate();
    }
    
    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public int getScore() {
        return base;
    }

    public void setScore(int base) {
        this.base = base;
    }

    public int getModifier() {
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
    

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void calculate() {
	this.total = base + bonus;
	this.modifier = ((total - 10 )/ 2);
    }


    
    
}
