public class Attendant {
    
    //instance variables
    private String attendantId;
    private String name;
    
    //args constructor
    public Attendant(String attendantId, String name)
    {
        this.attendantId = attendantId;
        this.name = name;
    }

    //getters
    public String getAttendantId()
    {
        return attendantId;
    }

    public String getName()
    {
        return name;
    }
}
