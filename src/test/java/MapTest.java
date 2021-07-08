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
        }