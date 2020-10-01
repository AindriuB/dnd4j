package ie.dnd4j.items;

import java.util.ArrayList;
import java.util.List;

import ie.dnd4j.TagableEntity;
import ie.dnd4j.rules.Rule;

public abstract class BaseItem extends TagableEntity {

    private String name;
    
    private String description;
    
    private String slot;

    
    private String source;
    
    private int cost;
    
    private String category;
    
    private String currency;
    
    private String weight;
    
    private String type;
    
    private Boolean stackable;
    
    private String proficiency;
    
    private boolean equiped;
    
    private List<Rule> rules;
    
    public BaseItem() {
	rules = new ArrayList<Rule>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }


    public Boolean getStackable() {
        return stackable;
    }

    public void setStackable(Boolean stackable) {
        this.stackable = stackable;
    }

    public boolean isEquiped() {
        return equiped;
    }

    public void setEquiped(boolean equiped) {
        this.equiped = equiped;
    }
    
    public void addRule(Rule rule) {
        this.rules.add(rule);
    }
    

    public List<Rule> getRules() {
        return rules;
    }
    

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((category == null) ? 0 : category.hashCode());
	result = prime * result + cost;
	result = prime * result + ((currency == null) ? 0 : currency.hashCode());
	result = prime * result + ((description == null) ? 0 : description.hashCode());
	result = prime * result + (equiped ? 1231 : 1237);
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((proficiency == null) ? 0 : proficiency.hashCode());
	result = prime * result + ((slot == null) ? 0 : slot.hashCode());
	result = prime * result + ((source == null) ? 0 : source.hashCode());
	result = prime * result + ((stackable == null) ? 0 : stackable.hashCode());
	result = prime * result + ((type == null) ? 0 : type.hashCode());
	result = prime * result + ((weight == null) ? 0 : weight.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	BaseItem other = (BaseItem) obj;
	if (category == null) {
	    if (other.category != null)
		return false;
	} else if (!category.equals(other.category))
	    return false;
	if (cost != other.cost)
	    return false;
	if (currency == null) {
	    if (other.currency != null)
		return false;
	} else if (!currency.equals(other.currency))
	    return false;
	if (description == null) {
	    if (other.description != null)
		return false;
	} else if (!description.equals(other.description))
	    return false;
	if (equiped != other.equiped)
	    return false;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	if (proficiency == null) {
	    if (other.proficiency != null)
		return false;
	} else if (!proficiency.equals(other.proficiency))
	    return false;
	if (slot == null) {
	    if (other.slot != null)
		return false;
	} else if (!slot.equals(other.slot))
	    return false;
	if (source == null) {
	    if (other.source != null)
		return false;
	} else if (!source.equals(other.source))
	    return false;
	if (stackable == null) {
	    if (other.stackable != null)
		return false;
	} else if (!stackable.equals(other.stackable))
	    return false;
	if (type == null) {
	    if (other.type != null)
		return false;
	} else if (!type.equals(other.type))
	    return false;
	if (weight == null) {
	    if (other.weight != null)
		return false;
	} else if (!weight.equals(other.weight))
	    return false;
	return true;
    }

    
    
    
}
