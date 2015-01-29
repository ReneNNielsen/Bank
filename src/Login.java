

/**
 * Created by reneNote on 27-01-2015.
 */
public class Login
{
    private User _user;
    private Bank _bank;

    public Login(Bank bank)
    {
        _bank = bank;
    }

    public User login(String password, int id)
    {
        _user = _bank.getUser(password,id);
        return _user;
    }

    public User addNewUser(String name, String password, int id)
    {
        _user = new User();
        _user.setName(name);
        _user.setPassword(password);
        _user.setId(id);
        _bank.addUser(_user);
        return _user;
    }

    public Bank getBank()
    {
        return _bank;
    }

    public User getUser()
    {
        return _user;
    }
}
