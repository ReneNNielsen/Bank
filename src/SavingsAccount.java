import java.util.Date;
/**
 * Created by reneNote on 27-01-2015.
 */
public class SavingsAccount extends Account {
    private Date _lockedTime;

    public void setLockedTime(Date lockedTime)
    {
        _lockedTime = lockedTime;
    }

    public Date getLockedTime()
    {
        return _lockedTime;
    }
}
