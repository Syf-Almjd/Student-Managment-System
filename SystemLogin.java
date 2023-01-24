import javax.swing.*;

public class System {

    public static void main(String[] args) {
        SystemLogin obLog = new SystemLogin(); //making an object to call the login
                String[] options = {"Instructions & Manual", "Login"}; //interface options
        int WelcomeMsg = JOptionPane.showOptionDialog(null, "Welcome to AIU Grading System",
                "AIU System by SaifAlmajd",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE , null, options, options[0]);//interface page and options initializing values
        if (WelcomeMsg == 0 ){
            JOptionPane.showMessageDialog(null,"Hello, This System is to calculate and  your input numbers using arrays. \nRead The Following Instructions:\n1. This program is licenced by SaifAlmajd Almassri \n2.You can't type anything other than an integer Number \n3.You can't inpur more than 150 Number ");
            obLog.login();
        } // for instuctions
        else
        {
            obLog.login();
        }// option to skip instuctions
    }

    public void login() {
        JTextField username = new JTextField(); 
        JTextField password = new JPasswordField(); // JTextField new objects
        Object[] message = {
        "AIU Admin Username:", username,
        "Password:", password
    };

    int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
    if (option == JOptionPane.OK_OPTION) {
        if (username.getText().equals("SaifAlmajd") && password.getText().equals("Admin2022")) {// check login detials
            JOptionPane.showMessageDialog(null, "Login Successful, Welcome " + username.getText()); // print login Successful and name
            AIUSystem.registration();//calling the registation to start system
        } else {
            JOptionPane.showMessageDialog(null, "Your login failed"); //error handeling - login falied case
        }
    } else {
        JOptionPane.showMessageDialog(null, "You Canceled");//error handeling - login cancelation case
    }
    }
}
