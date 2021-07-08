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

    @Test
    void contains(){
        List<Object> testArrayList =  Arrays.asList(5,44,56,14,23);

        boolean contains = testArrayList.contains(56);

        assertTrue(contains);
    }
    @Test
    void containsAll(){
        List<Object> firstTestArrayList =  Arrays.asList(5,44,56,14,23);
        List<Object> secondTestArrayList =  Arrays.asList(44,56,23);

        boolean containsAll = firstTestArrayList.containsAll(secondTestArrayList);

        assertTrue(containsAll);
    }

    @Test
    void addAll(){
        List<Object> testArrayList =  Arrays.asList(5,34,21,55,41);

        arrayList.addAll(testArrayList);

        assertEquals(arrayList,testArrayList);

    }

    @Test
    void remove(){
        List<Object> testArrayList =  Arrays.asList(1,44);

        arrayList.add(1);
        arrayList.add(51);
        arrayList.add(44);
        arrayList.remove(1);

        assertEquals(arrayList,testArrayList);
    }

    @Test
    void removeAll(){
        List<Object> firstTestArrayList =  Arrays.asList(34,21,66);
        List<Object> secondTestArrayList =  Arrays.asList(11,77);


        arrayList.add(11);
        arrayList.add(34);
        arrayList.add(77);
        arrayList.add(21);
        arrayList.add(66);
        arrayList.removeAll(firstTestArrayList);

        assertEquals(arrayList,secondTestArrayList);
    }

    @Test
    void retainAll(){
        List<Object> testArrayList =  Arrays.asList(34,21,66);


        arrayList.add(11);
        arrayList.add(34);
        arrayList.add(77);
        arrayList.add(21);
        arrayList.add(66);
        arrayList.retainAll(testArrayList);

        assertEquals(arrayList,testArrayList);
    }

    @Test
    void indexOf(){
        List<Object> testArrayList =  Arrays.asList(34,21,66);

        Object index = testArrayList.indexOf(21);

        assertEquals(index,1);
    }





}