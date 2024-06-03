import java.awt.*;

public class Login extends Frame {
    Label Username = new Label("Username : ");
    Label Password = new Label("Password : ");
    TextField txtUsername = new TextField();
    TextField txtPassword = new TextField();
    Button btnback = new Button("Back ");
    Button btnLogin = new Button("Login");
    Button btnExit = new Button("Exit");

    Login(){
        setSize(400 , 300);
        setVisible(true);

    }

}
