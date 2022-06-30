import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class junitTestPalindromeFunction {

    private palindromeFunction junitTest;

    @BeforeMethod
    public void setUp() {

        //Before create the object
        //Önce nesne oluşturuyoruz

        junitTest = new palindromeFunction();
    }

    @Test
    public void palindrometest(){

        //Create the test value and test result
        //Test edilecek değerleri ve sonuçlarını oluşturuyoruz
        String[] value = {"asa", "tenet", "ey edip adanada pide ye", "rotator","door","desktop"};
        String[] res = {"true", "true", "true", "true", "false", "false"};

        //Runing the test case, if any test case failed return failed and case number
        //Testler koşuluyor, eğer başarız bir test varsa failed yazar ve test nosunu ekler
        for(int i = 0; i < res.length; i++){
            Assert.assertEquals(res[i],junitTest.Palindrome(value[i]), "failed " + i);
        }

        }
    }


