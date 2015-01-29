

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
        User newUser = new User();
        newUser.setName(name);
        newUser.setPassword(password);
        newUser.setId(id);
        _bank.addUser(newUser);
        return _user;
    }

}
