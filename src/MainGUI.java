import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by reneNote on 28-01-2015.
 */
public class MainGUI {
    private JTabbedPane tabControl;
    private JTextField txtBankName;
    private JButton btnAddBank;
    private JComboBox cbSelectBank;
    private JTextField txtId;
    private JTextField txtPassword;
    private JButton btnLogin;
    private JPanel loginPanel;
    private JTextField txtUserName;
    private JButton btnCreateUser;
    private JPanel TopPanel;

    private List<Bank> banks = new ArrayList<Bank>();
    Login login;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainGUI");
        frame.setContentPane(new MainGUI().TopPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public MainGUI()
    {

        //BUTTON ADD BANK CLICK
        btnAddBank.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtBankName.getText() != "")
                {
                    Bank newBank = new Bank();
                    newBank.setName(txtBankName.getText());
                    banks.add(newBank);
                    cbSelectBank.addItem(txtBankName.getText());
                    txtBankName.setText("");
                }
            }
        });
        // BUTTON LOGIN CLICK
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        // BUTTON ADD USER
        btnCreateUser.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtId.getText() != "" && txtPassword.getText() != "" && txtUserName.getText() != "")
                {
                    setLogin();
                    try
                    {
                        login.addNewUser(txtUserName.getText(), txtPassword.getText(), Integer.parseInt(txtId.getText()));
                    }
                    catch (Exception ex)
                    {

                    }
                }
            }
        }));
    }

    private void setLogin()
    {
        for (int i = 0; i < banks.size(); i++) {
            if (banks.get(i).getName().equals(cbSelectBank.getSelectedItem().toString()))
            {
                login = new Login(banks.get(i));
            }
        }
    }
}
