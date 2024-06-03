import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Login extends register implements ActionListener {
    Label lblLogin = new Label("Login ");
    Label Username = new Label("Username : ");
    Label Password = new Label("Password : ");
    TextField txtUsername = new TextField();
    TextField txtPassword = new TextField();
    Button btnBack = new Button("Back ");
    Button btnLogin = new Button("Login");
    Button btnExit = new Button("Exit");

        public boolean back = false;
    Login() {
        setSize(400, 300);
        setVisible(true);
        setTitle("Login Form");
        setResizable(false);
        setLayout(null);
        lblLogin.setBounds(180, 50, 200, 30);
        lblLogin.setFont(new Font("Arial", Font.BOLD, 20));
//        add(lblLogin);
        Username.setBounds(50, 100, 100, 20);
//        add(Username);
        txtUsername.setBounds(170, 100, 200, 20);
//        add(txtUsername);
        Password.setBounds(50, 140, 100, 20);
        txtPassword.setBounds(170, 140, 200, 20);
        btnBack.setBounds(50, 220, 70, 20);
        btnLogin.setBounds(130, 220, 70, 20);
        btnExit.setBounds(300, 220, 70, 20);
        btnLogin.addActionListener(this);
        btnBack.addActionListener(this);
        btnExit.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    void addAll() {
        add(lblLogin);
        add(Username);
        add(txtUsername);
        add(Password);
        add(txtPassword);
        add(btnBack);
        add(btnExit);
        add(btnLogin);

    }

    public void actionPerformed(ActionEvent er) {
        if (er.getSource() == btnLogin) {


            JOptionPane.showMessageDialog(null, "Choose Login");
        }
        if (er.getSource() == btnBack) {
            back = true;
            setVisible(false);
            JOptionPane.showMessageDialog(null, "Choose Back");

        }
        if (er.getSource() == btnExit) {
            System.exit(0);

        }

    }
}
