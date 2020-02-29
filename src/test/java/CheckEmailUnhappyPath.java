import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailUnhappyPath {

    @DataProvider(name = "NegativeEmails")
    public Object[][] getNegativeEmail() {
        return new Object[][]{
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
                null,
                {" "},
                {"\t"},
        };
    }

    @Test(dataProvider = "NegativeEmails")
    public void checkUnhappyEmailCase(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertFalse(actualResult, "Email " + email + " is valid");
    }
}
