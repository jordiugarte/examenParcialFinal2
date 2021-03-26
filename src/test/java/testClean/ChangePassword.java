package testClean;

import org.junit.Test;
import pomPages.todoLy.*;
import singletonSession.Session;

public class ChangePassword {

    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    CenterSection centerSection = new CenterSection();
    String user = "jordi@ugarte.com";
    String pwd = "12345678901";
    String newPwd = "123456789012";

    @Test
    public void verifyChangePassword() throws InterruptedException {
        Session.getSession().getDriver().get("http://todo.ly/");
        mainPage.loginImage.click();
        loginModal.loginAction(user, pwd);

        centerSection.settingsButton.click();
        centerSection.oldPassword.set(pwd);
        centerSection.newPassword.set(newPwd);
        centerSection.okButton.click();

        centerSection.logoutButton.click();
        mainPage.loginImage.click();
        loginModal.loginAction(user, newPwd);

        Thread.sleep(2000);
    }
}
