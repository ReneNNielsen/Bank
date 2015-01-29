import java.util.Date;

/**
 * Created by reneNote on 27-01-2015.
 */
public class LogItem {
    private Date _time;
    private String _from;
    private String _note;
    private double _amount;

    public void setTime(Date time)
    {
        _time = time;
    }

    public Date getTime()
    {
        return _time;
    }

    public void setFrom(String from)
    {
        _from = from;
    }

    public String getFrom()
    {
        return _from;
    }

    public void setNote(String note)
    {
        _note = note;
    }

    public String getNote()
    {
        return  _note;
    }

    public void setAmount(double amount)
    {
        _amount = amount;
    }

    public double getAmount()
    {
        return  _amount;
    }
}
