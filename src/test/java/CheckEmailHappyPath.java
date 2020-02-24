import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class CheckEmailHappyPath {

    @DataProvider (name = "PositiveEmail")
    public static Object [][] getData () {
        return new Object [][] {
                {"111@mail.com"},
                {"abcdABCD__!__!__1234@mail.com"},
                {"___@mail.com"},
                {"email!!@Az.com"},
                {"email_2@AAAAA.com"},
                {"email@111.com"},
                {"email@mail.ua"},
                {"email@gmail.commm"}
        };
    }

    @Test (dataProvider = "PositiveEmail")
    public static void checkRightEmail(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertTrue(actualResult);

    }
}
