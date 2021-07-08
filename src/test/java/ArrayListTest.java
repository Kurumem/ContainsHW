import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayListTest {
    List<Object> arrayList = new ArrayList<>();

    @Test
    void add() {
        List<Object> testArrayList = Arrays.asList(1,10,11);

        arrayList.add(1);
        arrayList.add(10);
        arrayList.add(11);

        assertEquals(arrayList, testArrayList);
    }
    @Test
    void clear(){

        arrayList.add(1);
        arrayList.add(51);
        arrayList.add(44);

        arrayList.clear();

        assertTrue(arrayList.isEmpty());
    }

    @Test
    void get(){
        List<Object> testArrayList =  Arrays.asList(5,44,56);

        Object element = testArrayList.get(1);

        assertEquals(element,44);
    }

    @Test
    void size(){
        List<Object> testArrayList =  Arrays.asList(5,44,56,14,23);

        int size = testArrayList.size();

        assertEquals(size,5);
    }



}