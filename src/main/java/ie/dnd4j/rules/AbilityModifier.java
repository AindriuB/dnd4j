package ie.dnd4j.rules;

import java.util.Map;

import ie.dnd4j.abilities.Ability;

public interface AbilityModifier extends Rule {
    
    Map<Ability, Integer> getAbilityModifiers();
    
}
