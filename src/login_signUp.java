import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

public class login_signUp extends Login implements ActionListener{
    Label lblTitle = new Label("RUPP M6");
    Button btnLogin = new Button(" Login ");
    Button btnRegister = new Button(" Register ");
    Button btnExit = new Button(" Exit ");
    login_signUp(){
        setSize(300 , 350);
        setVisible(true);
        setLayout(null);
        setResizable(false);
        setTitle("Login or Register Form");
        setLocationRelativeTo(null);
        lblTitle.setBounds(20,50,70,20);
        add(lblTitle);
        btnLogin.setBounds(10 , 100 ,70 , 20);
        add(btnLogin);
        btnRegister.setBounds(90 , 100 , 70 , 20);
        add(btnRegister);
        btnExit.setBounds(190 , 100 , 70 , 20);
        add(btnExit);
        btnLogin.addActionListener(this);
        btnRegister.addActionListener(this);
        btnExit.addActionListener(this);


}
    public void actionPerformed(ActionEvent er){
        if (er.getSource() == btnLogin){
            setVisible(false);
            new Login();


            JOptionPane.showMessageDialog(null,"Choose Login");
        }
        if(er.getSource() == btnRegister){
//            System.exit(0);
            JOptionPane.showMessageDialog(null,"Choose Register");

        }
        if(er.getSource() == btnExit){
            System.exit(0);
        }

    }




}
