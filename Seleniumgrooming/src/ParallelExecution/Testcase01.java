package ParallelExecution;

import org.testng.annotations.Test;

public class Testcase01 extends BasePage
{
@Test
public void login()
{
LoginPage lp = new LoginPage(driver);
lp.EnterUsn();
lp.Enterpsw();
lp.ClickLogin();
}
}
