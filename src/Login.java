import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Login extends Frame {
    Label Username = new Label("Username : ");
    Label Password = new Label("Password : ");
    TextField txtUsername = new TextField();
    TextField txtPassword = new TextField();
    Button btnback = new Button("Back ");
    Button btnLogin = new Button("Login");
    Button btnExit = new Button("Exit");

    public Login(){
        setSize(400 , 300);
        setVisible(true);
        setTitle("Login Form");



        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}
