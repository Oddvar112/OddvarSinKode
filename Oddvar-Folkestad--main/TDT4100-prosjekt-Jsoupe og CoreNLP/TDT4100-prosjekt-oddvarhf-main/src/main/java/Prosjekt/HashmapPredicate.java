package Prosjekt;

import java.util.Map;
import java.util.function.Predicate;


public class HashmapPredicate implements Predicate<Map.Entry<String, Long>> {

@Override
public boolean test(Map.Entry<String, Long> entry) {
    String[] keyParts = entry.getKey().split(" ");
    return keyParts.length > 1 && entry.getValue() > 1;       //Filterer ut småfeil gjort av NLP da den gjorde det dårlig på småord på norsk. 
    
}

    
}
