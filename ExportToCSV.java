import java.util.Date;

public class ExportToCSV {

    private Date date;
    private String incidentNumber;
    private int Duration;
    private list<Ticket> Outages = new ArrayList<Ticket>();

    public ExportToCSV(){

    }

    public ExportToCSV(Date date, String incidentNumber, int duration )
    {
        this.date = date;
        this.incidentNumber = incidentNumber;
        this.duration = duration;
    }




}
