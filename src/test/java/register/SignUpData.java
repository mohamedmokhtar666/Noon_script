package register;

import org.testng.annotations.DataProvider;

public class SignUpData {
    @DataProvider(name = "signup-provider")
    public static Object [] [] signInData ()
    {
        Object [] [] data = new Object [1] [3];
        data[0][0]="mohamedalyyywgyr2ygy9298762711156614218@gmail.com";
        data[0][1]="11236540999";
        data[0][2]=true;
        return data;

    }
}
