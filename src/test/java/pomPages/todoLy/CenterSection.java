package pomPages.todoLy;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

import java.sql.Driver;

public class CenterSection {
    public Button settingsButton = new Button(By.xpath("//a[contains(.,'Settings')]"));
    public TextBox oldPassword = new TextBox(By.xpath("//input[@id='TextPwOld']"));
    public TextBox newPassword = new TextBox( By.xpath("//input[@id='TextPwNew']"));
    public Button okButton = new Button(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']"));
    public Button logoutButton = new Button(By.xpath("//a[contains(.,'Logout')]"));

    public CenterSection() {
    }
}