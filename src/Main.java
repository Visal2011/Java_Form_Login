import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends login_signUp{
    Main(){
        new login_signUp();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });

    }
    public static void main(String[] args) {
        new Main();
    }
}