package ie.dnd4j.search;

import java.util.ArrayList;
import java.util.List;

public class Search {
    
    
    public static <T> List<T> findAll(Iterable<? extends T> objects, SearchPredicate<T> predicate){
	List<T> resultsList = new ArrayList<T>();
	for(T obj : objects) {
	    if(predicate.match(obj)) {
		resultsList.add(obj);
	    }
	}
	return resultsList;
    }
    
    public static <T> T findFirst(Iterable<? extends T> objects, SearchPredicate<T> predicate){
	for(T obj : objects) {
	    if(predicate.match(obj)) {
		return obj;
	    }
	}
	return null;
    }
    
    
}
