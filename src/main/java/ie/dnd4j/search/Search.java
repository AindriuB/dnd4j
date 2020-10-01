package ie.dnd4j.search;

import java.util.ArrayList;
import java.util.List;

import ie.dnd4j.TagableEntity;

public class Search {
    
    
    public static <T> List<T> findAll(List<? extends T> objects, SearchPredicate<T> predicate){
	List<T> resultsList = new ArrayList<T>();
	for(T obj : objects) {
	    if(predicate.match(obj)) {
		resultsList.add(obj);
	    }
	}
	return resultsList;
    }
    
    public static <T> T findFirst(List<? extends T> objects, SearchPredicate<T> predicate){
	for(T obj : objects) {
	    if(predicate.match(obj)) {
		return obj;
	    }
	}
	return null;
    }
    
    
}
