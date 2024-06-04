import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
import java.util.Date;
import java.util.EventObject;

public class login_signUp extends Frame  {

    Label lblTitle = new Label("RUPP M6");
    Label lblLogin = new Label("Login Form");
    Label lblRegister = new Label("Register Form");
    Label lblUsername = new Label("Username : ");
    Label lblPassword = new Label("Password : ");
    Label lblFirstName = new Label("First Name : ");
    Label lblLastName = new Label("Last Name : ");
    Label lblGender = new Label("Gender : ");
    Label lblDoB = new Label("Date of Birth : ");
    Label lblPhone = new Label("Phone : ");
    Label lblEmail = new Label("E-mail : ");
    TextField txtUsername = new TextField();
    TextField txtPassword = new TextField();
    TextField txtF_name = new TextField();
    TextField txtL_name = new TextField();
    Choice chGender = new Choice();
    TextField  txtDoB = new TextField();
    TextField txtPhone = new TextField();
    TextField txtEmail = new TextField();
    Button btnLogin = new Button(" Login");
    Button btnLogin1 = new Button(" Login");
    Button btnRegister = new Button(" Register ");
    Button btnRegister1 = new Button(" Register ");
    Button btnBack = new Button(" Back ");
    Button btnBack1 = new Button(" Back ");
    Button btnNext = new Button(" Next ");
    Button btnExit = new Button(" Exit ");
    int i = 0;

    public void First_Form(){
        remove(btnBack);
        remove(lblLogin);
        remove(lblUsername);
        remove(lblPassword);
        remove(lblGender);
        remove(lblDoB);
        remove(lblPhone);
        remove(lblEmail);
        remove(txtUsername);
        remove(txtPassword);
        remove(chGender);
        remove(txtDoB);
        remove(txtPhone);
        remove(txtEmail);
        remove(btnLogin1);
        remove(btnRegister1);
        remove(btnLogin);
        remove(txtF_name);
        remove(txtL_name);
        remove(lblFirstName);
        remove(lblLastName);
        remove(lblRegister);

        setSize(300 , 350);
        setVisible(true);
        setLayout(null);
        setResizable(false);
        setTitle("Login or Register Form");
        setLocationRelativeTo(null);
        lblTitle.setBounds(100,50,100,20);
        lblTitle.setFont(new Font("Arial",Font.BOLD, 20));
        add(lblTitle);
        btnLogin.setBounds(10 , 100 ,70 , 20);
        add(btnLogin);
        btnRegister.setBounds(90 , 100 , 70 , 20);
        add(btnRegister);
        btnExit.setBounds(190 , 100 , 70 , 20);
        add(btnExit);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null , "Login on First page");
                login_form();
            }
        });
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null , "Register on First page");
                register_form();
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
    public void login_form(){
        remove(lblTitle);
        remove(btnRegister);
        remove(btnLogin);
        setSize(400, 300);
        setTitle("Login Form");
        lblLogin.setBounds(180, 50, 200, 30);
        lblLogin.setFont(new Font("Arial", Font.BOLD, 20));
        add(lblLogin);
        lblUsername.setBounds(50, 100, 100, 20);
        add(lblUsername);
        txtUsername.setBounds(170, 100, 200, 20);
        add(txtUsername);
        lblPassword.setBounds(50, 140, 100, 20);
        add(lblPassword);
        txtPassword.setBounds(170, 140, 200, 20);
        add(txtPassword);
        btnBack.setBounds(50, 220, 70, 20);
        btnLogin1.setBounds(130, 220, 70, 20);
        btnExit.setBounds(300, 220, 70, 20);

        add(btnBack);
//        add(btnExit);
        add(btnLogin1);
        btnLogin1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null , "Login on second page");
            }
        });
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                First_Form();
            }
        });


    }
    public void register_form(){
        remove(lblTitle);
        remove(btnRegister);
        remove(btnLogin);
        setSize(400, 400);
        setTitle("Register Form");
        lblRegister.setBounds(130, 50, 200, 30);
        lblRegister.setFont(new Font("Arial", Font.BOLD, 20));
        add(lblRegister);
        lblFirstName.setBounds(50, 100, 100, 20);
        add(lblFirstName);
        txtF_name.setBounds(170, 100, 200, 20);
        add(txtF_name);
        lblLastName.setBounds(50, 140, 100, 20);
        add(lblLastName);
        txtL_name.setBounds(170, 140, 200, 20);
        add(txtL_name);
        lblGender.setBounds(50 ,180 , 100 , 20);
        add(lblGender);
        chGender.setBounds(170  , 180 , 200 , 20);
        chGender.add("Male");
        chGender.add("Female");
        add(chGender);
        lblDoB.setBounds(50 , 220 , 100 , 20);
        add(lblDoB);
        txtDoB.setBounds(170 , 220 , 200 , 20);
        add(txtDoB);
        lblPhone.setBounds(50,260 , 100 ,20 );
        add(lblPhone);
        txtPhone.setBounds(170 , 260 , 200 , 20 );
        add(txtPhone);
        lblEmail.setBounds(50, 300 , 100 , 20);
        add(lblEmail);
        txtEmail.setBounds(170 , 300 , 200 , 20);
        add(txtEmail);

        btnBack1.setBounds(50, 350, 70, 20);
        add(btnBack1);
        btnNext.setBounds(130, 350, 70, 20);
        add(btnNext);
        btnExit.setBounds(300, 350, 70, 20);
        btnBack1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                First_Form();
            }
        });

    }

//public void addAll(){
//    setSize(300 , 350);
//    setVisible(true);
//    setLayout(null);
//    setResizable(false);
//    setTitle("Login or Register Form");
//    setLocationRelativeTo(null);
//    lblTitle.setBounds(100,50,100,20);
//    lblTitle.setFont(new Font("Arial",Font.BOLD, 20));
////        add(lblTitle);
//    btnLogin.setBounds(10 , 100 ,70 , 20);
////        add(btnLogin);
//    btnRegister.setBounds(90 , 100 , 70 , 20);
////        add(btnRegister);
//    btnExit.setBounds(190 , 100 , 70 , 20);
////        add(btnExit);
//    btnLogin.addActionListener(this);
//    btnRegister.addActionListener(this);
//    btnExit.addActionListener(this);
//    addWindowListener(new WindowAdapter() {
//        @Override
//        public void windowClosing(WindowEvent e) {
//            System.exit(0);
//        }
//    });
//    add(btnLogin);
//    add(btnRegister);
//    add(btnExit);
//    add(lblTitle);
//
//}


//    public void actionPerformed(ActionEvent er){
//        if (er.getSource() == btnLogin){












//            public void actionPerformed(ActionEvent er){
//                if (er.getSource() == btnLogin) {
//
//
//                    JOptionPane.showMessageDialog(null, "Choose Login");
//                }
//                if (er.getSource() == btnBack) {
//                    back = true;
//                    setVisible(false);
//                    JOptionPane.showMessageDialog(null, "Choose Back");
//
//                }
//                if (er.getSource() == btnExit) {
//                    System.exit(0);
//
//                }
//            }
//        }
//        if(er.getSource() == btnRegister){
//            btnregister = true;
////            System.exit(0);
//            JOptionPane.showMessageDialog(null,btnregister);
//        }
//        if(er.getSource() == btnExit){
//            System.exit(0);
//
//        }
//        JOptionPane.showMessageDialog(null , "hello");
//    }






}
