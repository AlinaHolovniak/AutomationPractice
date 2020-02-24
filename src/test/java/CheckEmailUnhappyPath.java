import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class CheckEmailUnhappyPath {

    @DataProvider(name= "NegativeEmail")
    public static Object [][] getNegativeEmail() {
        return new Object [][] {
                {"__@mail.com"},
                {"abC%~23@mail.com"},
                {"aaabbbcccdddeee1111222333ABC@mail.com"},
                {"emailmail.com"},
                {"email@%$.com"},
                {"email@longmail.com"},
                {"email@mail.commmm"},
                {"email@mail.COM"},
                {"email@mail.c"},
                {"email@mail"},
                {""},
        };
    }

    @Test (dataProvider = "NegativeEmail")
    public void checkUnhappyEmailCase(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertFalse(actualResult);

    }
}
