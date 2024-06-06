import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
import java.util.Date;
import java.util.EventObject;
import java.util.Objects;
import java.util.jar.JarEntry;

public class login_signUp extends JFrame {

    Label lblTitle = new Label("RUPP M6");
    Label lblLogin = new Label("Login Form");
    Label lblRegister = new Label("Register Form");
    Label lblConfrim  = new Label("Confirm You Register");
    Label lblUsername = new Label("Username : ");
    Label lblPassword = new Label("Password : ");
    Label lblConfirm_Pass = new Label("Confirm Password : ");
    Label lblFirstName = new Label("First Name : ");
    Label lblLastName = new Label("Last Name :  ");
    Label lblGender = new Label("Gender : ");
    Label lblDoB = new Label("Date of Birth : ");
    Label lblPhone = new Label("Phone : ");
    Label lblEmail = new Label("E-mail : ");
    JLabel lblShowF_Name = new JLabel();
    JLabel lblShowL_Name = new JLabel();
    JLabel lblShowGender = new JLabel();
    JLabel lblShowPhone = new JLabel();
    JLabel lblSemester1 = new JLabel("Semester 1");
    JLabel lblSemester2 = new JLabel("Semester 2");
    TextField txtUsername = new TextField();
    TextField txtPassword = new TextField();
    TextField txtConfirm_Pass = new TextField();
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
    Button btnBack2 = new Button( " Back ");
    Button btnNext = new Button(" Next ");
    Button btnExit = new Button(" Exit ");
    int i = 0;

//    String F_name , L_Name , Username , password , ;


    public void addAll(){

        add(lblTitle);
        add(lblLogin);
        add(lblRegister);
        add(lblConfrim);
        add(lblUsername);
        add(lblPassword);
        add(lblFirstName);
        add(lblLastName);
        add(lblGender);
        add(lblDoB);
        add(lblPhone);
        add(lblEmail);
        add(txtUsername);
        add(txtPassword);
        add(txtF_name);
        add(txtL_name);
        add(txtDoB);
        add(txtPhone);
        add(txtEmail);
        add(btnLogin);
        add(btnLogin1);
        add(btnRegister);
        add(btnRegister1);
        add(btnBack);
        add(btnBack1);
        add(btnNext);
        add(btnExit);
    }
    public void removeAlls(){

        remove(lblTitle);
        remove(lblLogin);
        remove(lblRegister);
        remove(lblConfrim);
        remove(lblUsername);
        remove(lblPassword);
        remove(lblConfirm_Pass);
        remove(lblFirstName);
        remove(lblLastName);
        remove(lblGender);
        remove(lblDoB);
        remove(lblPhone);
        remove(lblEmail);
        remove(lblShowF_Name);
        remove(lblShowL_Name);
        remove(lblShowGender);
        remove(lblShowPhone);
        remove(lblSemester1);
        remove(lblSemester2);
        remove(txtUsername);
        remove(txtPassword);
        remove(txtConfirm_Pass);
        remove(txtF_name);
        remove(txtL_name);
        remove(txtDoB);
        remove(txtPhone);
        remove(txtEmail);
        remove(btnLogin);
        remove(btnLogin1);
        remove(btnRegister);
        remove(btnRegister1);
        remove(btnBack);
        remove(btnBack1);
        remove(btnBack2);
        remove(btnNext);
        remove(btnExit);
        remove(chGender);

    }

    public void First_Form(){
        firstForm:
        removeAlls();
        setSize(300 , 200);
        setVisible(true);
        setLayout(null);
        setResizable(false);
        setTitle("Login or Register Form");
        setLocationRelativeTo(null);
        lblTitle.setBounds(100,50,100,20);
        lblTitle.setFont(new Font("Arial",Font.BOLD, 20));
        add(lblTitle);
        btnLogin.setBounds(20 , 100 ,70 , 20);
        add(btnLogin);
        btnRegister.setBounds(100 , 100 , 70 , 20);
        add(btnRegister);
        btnExit.setBounds(190 , 100 , 70 , 20);
        add(btnExit);
        add(btnLogin);
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
                if(i == 0) {
                    login_form();
                    i++;
                }
            }
        });
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null , "Register on First page");
                if(i == 0) {
                    register_form();
                    i++;
                }
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
        lblLogin.setBounds(150, 30, 200, 30);
        lblLogin.setFont(new Font("Arial", Font.BOLD, 20));
        add(lblLogin);
        lblUsername.setBounds(30, 100, 100, 20);
        add(lblUsername);
        txtUsername.setBounds(150, 100, 200, 20);
        add(txtUsername);
        lblPassword.setBounds(30, 140, 100, 20);
        add(lblPassword);
        txtPassword.setBounds(150, 140, 200, 20);
        add(txtPassword);
        btnBack.setBounds(30, 200, 70, 20);
        btnLogin1.setBounds(120, 200, 70, 20);
        btnExit.setBounds(280, 200, 70, 20);

        add(btnBack);
        add(btnExit);
        add(btnLogin1);
        btnLogin1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               profile();
            }
        });
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(i == 1) {
                    i--;
                    First_Form();
                }
            }
        });


    }
    public void register_form(){
        removeAlls();
        setSize(400, 410);
        setTitle("Register Form");
        lblRegister.setBounds(130, 30, 200, 30);
        lblRegister.setFont(new Font("Arial", Font.BOLD, 20));
        add(lblRegister);
        lblFirstName.setBounds(30, 80, 100, 20);
        add(lblFirstName);
        txtF_name.setBounds(150, 80, 200, 20);
        add(txtF_name);
        lblLastName.setBounds(30, 120, 100, 20);
        add(lblLastName);
        txtL_name.setBounds(150, 120, 200, 20);
        add(txtL_name);
        lblGender.setBounds(30 ,160 , 100 , 20);
        add(lblGender);
        chGender.removeAll();
        chGender.setBounds(150  , 160 , 200 , 20);
        chGender.add("Male");
        chGender.add("Female");
        add(chGender);
        lblDoB.setBounds(30 , 200 , 100 , 20);
        add(lblDoB);
        txtDoB.setBounds(150 , 200 , 200 , 20);
        add(txtDoB);
        lblPhone.setBounds(30,240 , 100 ,20 );
        add(lblPhone);
        txtPhone.setBounds(150 , 240 , 200 , 20 );
        add(txtPhone);
        lblEmail.setBounds(30, 280 , 100 , 20);
        add(lblEmail);
        txtEmail.setBounds(150 , 280 , 200 , 20);
        add(txtEmail);

        btnBack1.setBounds(30, 330, 70, 20);
        add(btnBack1);
        btnNext.setBounds(150, 330, 70, 20);
        add(btnNext);
        btnExit.setBounds(280, 330, 70, 20);
        add(btnExit);
        btnBack1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(i == 1) {
                    First_Form();
                    i--;
                }
            }
        });
        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(i == 1) {
                    confirm_from();
                    i++;
                }
            }
        });
    }
    public void confirm_from(){
        removeAlls();
        setSize(400 , 280);
        lblConfrim.setBounds(100, 20, 250, 30);
        lblConfrim.setFont(new Font("Arial", Font.BOLD, 20));
        add(lblConfrim);
        lblUsername.setBounds(30, 80, 100, 20);
        add(lblUsername);
        txtUsername.setBounds(150, 80, 200, 20);
        add(txtUsername);
        lblPassword.setBounds(30, 120, 100, 20);
        add(lblPassword);
        txtPassword.setBounds(150, 120, 200, 20);
        add(txtPassword);
        lblConfirm_Pass.setBounds(30 ,160 , 110 , 20);
        add(lblConfirm_Pass);
        txtConfirm_Pass.setBounds(150, 160, 200, 20);
        add(txtConfirm_Pass);
        btnBack2.setBounds(30, 205, 70, 20);
        add(btnBack2);
        btnRegister1.setBounds(130, 205, 70, 20);
        add(btnRegister1);
        btnExit.setBounds(280, 205, 70, 20);
        add(btnExit);

        btnRegister1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(i == 2) {
                    JOptionPane.showConfirmDialog(null, "Register Successfully  ",
                            "Confirmation Form",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.PLAIN_MESSAGE);
//                    JOptionPane.showMessageDialog(null , "Your are successfully register your new account");
                    First_Form();
                    i-=2;
                }
            }
        });
        btnBack2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(i == 2) {
                    register_form();
                    i--;
                }
            }
        });

    }

    public void profile(){
//        String name = "Visal 11";
        removeAlls();
        setSize(500 , 400);
        JLabel icon = new JLabel("Profile");
        JLabel line = new JLabel();
        icon.setBounds(10,10 , 100 , 125);
        icon.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        icon.setBackground(new Color(0, 0, 0 , 0));
        icon.setHorizontalAlignment(SwingConstants.CENTER);
        icon.setVerticalAlignment(SwingConstants.CENTER);
        add(icon);
        lblFirstName.setBounds(130 , 20 , 70 , 20);
        add(lblFirstName);
        lblShowF_Name.setBounds(220 , 20 , 70 , 20);
        lblShowF_Name.setText("Chan Visal");
        add(lblShowF_Name);
        lblLastName.setBounds(130 , 50 , 70 ,20);
        add(lblLastName);
        lblShowL_Name.setBounds(220 , 50 , 70 , 20);
        lblShowL_Name.setText("Yang");
        add(lblShowL_Name);
        lblGender.setBounds(130 , 80 , 70 , 20);
        add(lblGender);
        lblShowGender.setBounds(220 , 80  , 70 ,20 );
        lblShowGender.setText("Male");
        add(lblShowGender);
        lblPhone.setBounds(130,110 , 70 , 20);
        add(lblPhone);
        lblShowPhone.setBounds(220 , 110 , 70 , 20);
        lblShowPhone.setText("0123456789");
        add(lblShowPhone);
        lblSemester1.setBounds(90 , 160 , 70 , 20);
        add(lblSemester1);
        lblSemester2.setBounds(330 , 160  , 70 , 20);
        add(lblSemester2);


        line.setBounds(249 , 150 , 2 , 200);
        line.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        add(line);
    }
}
