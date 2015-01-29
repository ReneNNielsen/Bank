import java.util.Date;
import java.util.List;

/**
 * Created by reneNote on 27-01-2015.
 */
public class Bank {
    private String _name;
    private List<Account> _accounts;
    private List<User> _users;

    public void setName(String name)
    {
        this._name = name;
    }

    public String getName()
    {
        return _name;
    }

    public User getUser(String password, int id)
    {
        for (int i = 0; i < _users.size(); i++)
        {
            User user = _users.get(i);
            if (user.getPassword().equals(password) && user.getId() == id)
            {
                return user;
            }
        }
        return null;
    }

    public void addUser(User user)
    {
        _users.add(user);
    }

    public Account addSalaryAccount(String name, double percent, User user)
    {
        SalaryAccount newSalaryAcc = new SalaryAccount();
        newSalaryAcc.setName(name);
        newSalaryAcc.setPercent(percent);
        int maxId = 0;
        for (int i = 0; i < _accounts.size(); i++) {
            Account nextAcc = _accounts.get(i);
            if (nextAcc.getId() > maxId)
            {
                maxId = nextAcc.getId();
            }
        }
        maxId++;
        newSalaryAcc.setId(maxId);
        user.addToAccounts(newSalaryAcc);
        _accounts.add(newSalaryAcc);
        return newSalaryAcc;
    }

    public Account addSavingAccount(String name, double percent, User user, Date lockedTime)
    {
        SavingsAccount newSavingAcc = new SavingsAccount();
        newSavingAcc.setName(name);
        newSavingAcc.setPercent(percent);
        newSavingAcc.setLockedTime(lockedTime);
        int maxId = 0;
        for (int i = 0; i < _accounts.size(); i++) {
            Account nextAcc = _accounts.get(i);
            if (nextAcc.getId() > maxId)
            {
                maxId = nextAcc.getId();
            }
        }
        maxId++;
        newSavingAcc.setId(maxId);
        user.addToAccounts(newSavingAcc);
        _accounts.add(newSavingAcc);
        return newSavingAcc;
    }

    public Account getAccount(int id)
    {
        for (int i = 0; i < _accounts.size(); i++) {
            if (_accounts.get(i).getId() == id)
            {
                return _accounts.get(i);
            }
        }
        return null;
    }
}
