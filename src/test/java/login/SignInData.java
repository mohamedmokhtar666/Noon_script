package login;

import org.testng.annotations.DataProvider;

public class SignInData {
    @DataProvider(name = "signin-provider")
    public static Object [] [] signInData ()
    {
        Object [] [] data = new Object [1] [3];
        data[0][0]="mohamedmok2411994@gmail.com";
        data[0][1]="123456789";
        data[0][2]=true;
        return data;

    }
}
