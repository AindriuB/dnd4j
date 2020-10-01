package ie.dnd4j.rules;

import java.util.ArrayList;
import java.util.List;

import ie.dnd4j.character.BaseEntity;
import ie.dnd4j.rules.dependencies.Dependency;

public abstract class AbstractRule implements Rule {
    
    protected List<Dependency> dependencies;
    
    public AbstractRule() {
	dependencies = new ArrayList<Dependency>();
    }

    public void addDependency(Dependency dependency) {
	this.dependencies.add(dependency);
    }
    
    
    
    @Override
    public boolean isApplicable(BaseEntity entity) {
	
	if(dependencies.isEmpty()) {
	    return true;
	}
	
	for(Dependency dependency: this.dependencies) {
	    if(!dependency.checkDependency(entity)) {
		return false;
	    }
	}
	
	return true;
    }

    public List<Dependency> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<Dependency> dependencies) {
        this.dependencies = dependencies;
    }
    
    

}
