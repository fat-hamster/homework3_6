import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HomeWorkTest {
    HomeWork homeWork = new HomeWork();
    ArrayList<Integer> source1 = new ArrayList(Arrays.asList(1, 3, 2, 6, 4, 3, 6, 9));
    ArrayList<Integer> source2 = new ArrayList(Arrays.asList(8, 6, 3, 6, 2, 3, 4, 9));
    ArrayList<Integer> source3 = new ArrayList(Arrays.asList(2, 3, 2, 6, 5, 3, 6, 9));

    @Test
    void extract() {
        ArrayList<Integer> res1 = new ArrayList(Arrays.asList(3, 6, 9));
        ArrayList<Integer> res2 = new ArrayList(Arrays.asList(9));

        Assertions.assertEquals(res1, homeWork.extract(source1));
        Assertions.assertEquals(res2, homeWork.extract(source2));
        Assertions.assertThrows(RuntimeException.class, () -> homeWork.extract(source3));
    }

    @Test
    void isContains() {
        Assertions.assertTrue(homeWork.isContains(source1));
        Assertions.assertTrue(homeWork.isContains(source2));
        Assertions.assertFalse(homeWork.isContains(source3));
    }
}