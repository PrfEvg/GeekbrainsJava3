import Lesson6.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestArray {
    @Test
    public void test1arrayAfterFour() {
        int[] in = new int[]{1,1,2,4,1,1,1,1};
        int[] out = new int[]{1,1,1,1};
        Assertions.assertArrayEquals(out, Main.arrAfterFour(in));
    }

    @Test
    public void test2arrayAfterFour() {
        int[] in = new int[]{1, 1, 2, 3, 3, 5, 6};
        Assertions.assertThrows(RuntimeException.class, ()->
                Main.arrAfterFour(in));
    }

    @Test
    public void test1arrOneAndFour(){
        int[] in = new int[]{2,3,5,6,7};
        Assertions.assertFalse(Main.arrOneAndFour(in));
    }

    @Test
    public void test2arrOneAndFour(){
        int[] in = new int[]{1,1,4,4};
        Assertions.assertTrue(Main.arrOneAndFour(in));
    }



}

