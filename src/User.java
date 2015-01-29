import java.util.List;

/**
 * Created by reneNote on 27-01-2015.
 */
public class User {
    private String _name;
    private int _id;
    private String _password;
    private List<Account> _accounts;

    public int getId()
    {
        return _id;
    }

    public void setId(int id)
    {
        _id = id;
    }

    public String getName()
    {
        return _name;
    }

    public void setName(String name)
    {
        _name = name;
    }

    public List<Account> getAccounts()
    {
        return _accounts;
    }

    public String getPassword()
    {
        return _password;
    }

    public void setPassword(String password)
    {
        _password = password;
    }

    public void addToAccounts(Account account)
    {
        _accounts.add(account);
    }

}
