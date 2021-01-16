package BankAccountTest;
import homework4.ATMApp.BankAccount;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BankAccountTestSuits {
    @Test
    public void withdrawTest() {
        BankAccount test1 = new BankAccount(500);
       double result =  test1.withdraw(100);
       Assert.assertEquals(400,result,0);

    }

    @Test
    public void interogateTest(){
        BankAccount test2 = new BankAccount(700);
        double result = test2.interogate();
        Assert.assertEquals(700,result,0);
    }
    @Test
    public void addMoneyTest(){
        BankAccount test2 = new BankAccount(700);
        double result = test2.addMoney(150);
        Assert.assertEquals(850,result,0);
    }
}
