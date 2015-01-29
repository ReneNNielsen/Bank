import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by reneNote on 27-01-2015.
 */
public class Account {
    private String _name;
    private int _id;
    private double _percent;
    private double _amounts;
    private List<LogItem> _log;

    public void setName(String name)
    {
        _name = name;
    }

    public String getName()
    {
        return _name;
    }

    public void setId(int id)
    {
        _id = id;
    }

    public int getId()
    {
        return _id;
    }

    public void setPercent(double percent)
    {
        _percent = percent;
    }

    public double gePercent()
    {
        return _percent;
    }

    public void addToLog(LogItem logItem)
    {
        _log.add(logItem);
    }

    public List<LogItem> getLogItems(Date timeFrom, Date timeTo)
    {
        List<LogItem> returnList = new ArrayList<LogItem>();
        for (int i = 0; i < _log.size(); i++)
        {
            LogItem item = _log.get(i);
            if (item.getTime().after(timeFrom) && item.getTime().before(timeTo))
            {
                returnList.add(item);
            }
        }
        return returnList;
    }

    public double getAmounts() {
        return _amounts;
    }

    public void addToAmounts(double amount, String from, String note)
    {
        _amounts += amount;
        LogItem item = new LogItem();
        item.setAmount(amount);
        item.setFrom(from);
        item.setNote(note);
        item.setTime(new Date());
        addToLog(item);
    }
}
