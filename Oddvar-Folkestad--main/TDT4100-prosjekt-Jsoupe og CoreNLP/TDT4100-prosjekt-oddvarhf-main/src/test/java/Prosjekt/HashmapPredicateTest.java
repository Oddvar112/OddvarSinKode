package Prosjekt;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;
import java.util.AbstractMap;
import java.util.Map;

public class HashmapPredicateTest {

    @Test
    void testSingleWordKey() {
        HashmapPredicate predicate = new HashmapPredicate();
        Map.Entry<String, Long> entry = new AbstractMap.SimpleEntry<>("ord", 1L);
        assertFalse(predicate.test(entry));
    }

    @Test
    void testMultiWordKeyWithPositiveValue() {
        HashmapPredicate predicate = new HashmapPredicate();
        Map.Entry<String, Long> entry = new AbstractMap.SimpleEntry<>("ord ord", 1L);
        assertFalse(predicate.test(entry));
    }

    @Test
    void testMultiWordKeyWithZeroValue() {
        HashmapPredicate predicate = new HashmapPredicate();
        Map.Entry<String, Long> entry = new AbstractMap.SimpleEntry<>("ord ord", 0L);
        assertFalse(predicate.test(entry));
    }

    @Test
    void testMultiWordKeyWithNegativeValue() {
        HashmapPredicate predicate = new HashmapPredicate();
        Map.Entry<String, Long> entry = new AbstractMap.SimpleEntry<>("ord ord", -1L);
        assertFalse(predicate.test(entry));
    }

    @Test
    void testEmptyKey() {
        HashmapPredicate predicate = new HashmapPredicate();
        Map.Entry<String, Long> entry = new AbstractMap.SimpleEntry<>("", 1L);
        assertFalse(predicate.test(entry));
    }

}