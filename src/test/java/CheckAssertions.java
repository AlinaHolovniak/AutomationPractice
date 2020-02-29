import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckAssertions {
    String str1 = "aaa";
    String str2 = "aaa";
    String str3 = "bbb";

    @Test
    public void test1() {
        Assert.assertEquals(str1, str2);
    }

    @Test
    public void test2() {
        Assert.assertEquals(str1, str3);
    }

    @Test
    public void test3() {
        Assert.assertTrue(1 == 1);
    }

    @Test
    public void test4() {
        Assert.assertTrue(1 == 2);
    }

    @Test
    public void test5() {
        Assert.assertFalse(1 == 2);
    }

    @Test
    public void test6() {
        Assert.assertFalse(1 == 1);
    }
}



