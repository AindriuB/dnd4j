package ie.dnd4j.search;

public interface SearchPredicate<T> {

    boolean match(T target);
    
}
