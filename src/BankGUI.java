import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

/**
 * Created by reneNote on 29-01-2015.
 */
public class BankGUI {
    private JPanel mainPanel;
    private JTabbedPane tabControl;
    private JComboBox cbSelectAccount;
    private JTable tblAccount;
    private JTextField txtNameOfAccount;
    private JComboBox cbSelectAccountType;
    private JButton btnAddAccount;
    private JTextField txtAmount;
    private JButton btnSendButton;
    private JTextField txtAccountTo;
    private JComboBox cbAccountFrom;

    private Login login;

    public BankGUI(final Login logIn) {
        login = logIn;
        JFrame frame = new JFrame(login.getBank().getName());
        frame.setContentPane(this.mainPanel);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        cbSelectAccountType.addItem("SavingsAccount");
        cbSelectAccountType.addItem("SalaryAccount");

        btnAddAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbSelectAccountType.getSelectedItem().toString() != "SavingsAccount")
                {
                    Calendar cal = Calendar.getInstance();
                    cal.add(Calendar.YEAR, 3);
                    login.getBank().addSavingAccount(txtNameOfAccount.getText(), 3.0, login.getUser(), cal.getTime());
                    cbSelectAccount.addItem(txtNameOfAccount.getText());
                }
                else if (cbSelectAccountType.getSelectedItem().toString() != "SalaryAccount")
                {
                    login.getBank().addSalaryAccount(txtNameOfAccount.getText(),0.25,login.getUser());
                    cbSelectAccount.addItem(txtNameOfAccount.getText());
                }
            }
        });

    }
}
