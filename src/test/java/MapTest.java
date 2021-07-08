import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



import java.util.HashMap;
import java.util.Map;


class MapTest{
    Map<Integer,Object> map = new HashMap<>();

    @Test
    void putGet(){
        map.put(1,'a');
        map.put(2,5);
        map.put(3,"adaf");
        Object element = map.get(2);

        assertEquals(element,5);

    }

    @Test
    void containsValue(){
        map.put(1,'c');
        map.put(2,5);
        map.put(3,"adaf");
        boolean hasValue = map.containsValue('c');

        assertTrue(hasValue);
    }

    @Test
    void containsKey(){
        map.put(1,'c');
        map.put(2,5);
        map.put(3,"adaf");
        boolean hasKey = map.containsKey(3);

        assertTrue(hasKey);
    }

    @Test
    void replace(){
        map.put(1,'c');
        map.replace(1,54);
        Object element = map.get(1);

        assertEquals(element,54);
    }

    @Test
    void size(){
        map.put(1,45);
        map.put(2,"2112");
        map.put(3,2.40);

        int size = map.size();

        assertEquals(size,3);
    }

    @Test
    void isEmpty(){

        boolean isEmpty = map.isEmpty();

        assertTrue(isEmpty);
    }

    @Test
    void remove(){
        Map<Integer, Object> testMap = new HashMap<>();

        map.put(1,45);
        map.put(2,"2112");
        map.put(3,2.40);
        map.put(4,"hello");

        testMap.put(1,45);
        testMap.put(2,"2112");
        testMap.put(4,"hello");

        map.remove(3);

        assertEquals(map,testMap);

    }
        }