# dnd4j 

Library for building characters in Dungeons and Dragons 5th edition.

### Use

Using the builder is the best way of creating a character sheet.

```java
CharacterBuilder builder = CharacterBuilder.getInstance();

builder.abilityScores(10, 11, 12, 13, 14, 15);
builder.addClass(baseClass);
builder.race(elf);
builder.attributes(attributes);
builder.traits(traits);
builder.withItem(armour);
builder.withItem(item);

PlayerCharacter character = builder.build();
```


### Compendiums
See [dnd4j-tools](https://github.com/AindriuB/dnd4j-tools) for compendium builders that can use this library. 


### Compatibility

java 1.6
