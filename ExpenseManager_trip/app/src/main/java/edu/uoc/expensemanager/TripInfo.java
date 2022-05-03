package edu.uoc.expensemanager;

public class TripInfo {
    public String imageB64;
    public String date;
    public String description;
    public int tripID;

    TripInfo(String image, String date, String description, int tripID){
        this.imageB64=image;
        this.date=date;
        this.description=description;
        this.tripID=tripID;

    }
}
