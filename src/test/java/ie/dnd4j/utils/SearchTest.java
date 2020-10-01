package ie.dnd4j.utils;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ie.dnd4j.TagableEntity;
import ie.dnd4j.items.Armour;
import ie.dnd4j.items.BaseItem;
import ie.dnd4j.items.Item;
import ie.dnd4j.items.Weapon;
import ie.dnd4j.search.Search;
import ie.dnd4j.search.TagSearchPredicate;

public class SearchTest {

    private List<BaseItem> items;
    private Item item1;
    private Item item2;
    private Item item3;
    private Armour armour1;
    private Armour armour2;
    private Armour armour3;
    private Weapon weapon1;
    private Weapon weapon2;
    private Weapon weapon3;

    @Before
    public void setUp() {
	items = new ArrayList<BaseItem>();
	item1 = new Item();
	item1.tag("item1");
	items.add(item1);
	item2 = new Item();
	item2.tag("item2");
	items.add(item2);
	item3 = new Item();
	item3.tag("item3");
	items.add(item3);
	armour1 = new Armour();
	armour1.tag("shield");
	items.add(armour1);
	armour2 = new Armour();
	armour2.tag("shield");
	items.add(armour2);
	armour3 = new Armour();
	armour3.tag("armour");
	items.add(armour3);
	weapon1 = new Weapon();
	weapon1.tag("sword");
	items.add(weapon1);
	weapon2 = new Weapon();
	weapon2.tag("bow");
	items.add(weapon2);
	weapon3 = new Weapon();
	weapon3.tag("sword");
	items.add(weapon3);

    }

    @Test
    public void testFindAll() {
	List<TagableEntity> results = Search.findAll(items, new TagSearchPredicate("sword"));
	assertEquals(2, results.size());
	assertEquals(weapon1, results.get(0));
	assertEquals(weapon3, results.get(1));
    }

    @Test
    public void testFindFirst() {
	TagableEntity entity = Search.findFirst(items, new TagSearchPredicate("sword"));
	assertEquals(weapon1, entity);
    }

}
