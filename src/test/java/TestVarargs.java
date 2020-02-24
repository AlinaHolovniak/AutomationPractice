import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVarargs {

    @Test
    public void testSumNumber() {
        VarargsExample vararg = new VarargsExample();
        Assert.assertEquals(vararg.sumNumber(1, 2, 3, 4), 10);
    }
}