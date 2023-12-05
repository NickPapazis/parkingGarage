public class ParkingSpot {
    
    //instance variables
    private int spotNumber;
    private int levelNumber;
    private boolean occupied;
    

    //args constructor
    public ParkingSpot(int spotNumber, int levelNumber)
    {
        this.spotNumber = spotNumber;
        this.levelNumber = levelNumber;
        this.occupied = false;
    }

    //getters
    public int getSpotNumber()
    {
        return spotNumber;
    }

    public int getLevelNumber()
    {
        return spotNumber;
    }

    public boolean isOccupied()
    {
        return occupied;
    }
    
    public void occupySpot()
    {
        occupied = true;
    }

    public void vacateSpot()
    {
        occupied = false;
    }

    //toString method
    @Override
    public String toString()
    {
        return "Level " + (levelNumber+1) + ", Spot " + spotNumber;
    }

}
