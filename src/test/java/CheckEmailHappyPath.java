import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CheckEmailHappyPath {

    @DataProvider(name = "PositiveEmails")
    public Object[][] getPositiveEmails() {
        return new Object[][]{
                {"111@12.com"},
                {"emailABCDE!__!__!__!@EmAiL.email"},
        };
    }

    @Test(dataProvider = "PositiveEmails")
    public static void checkValidEmail(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertTrue(actualResult, "Email " + email +" is not valid. It must match regular expression ^[a-zA-Z0-9_!]{3,20}@[a-zA-Z0-9]{2,5}\\.[a-z]{2,5}$");
    }
}
