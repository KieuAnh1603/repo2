package Vexemphim;

import java.time.LocalDateTime;

public class ShowTime{
    private String id;
    private LocalDateTime time;
    private int totalSeats; // tong so cho ngoi
    private int bookedSeats; // ghe da dat

    
    // public ShowTime( LocalDateTime time, int totalSeats){
        
    //     this.time=time;
    //     this.totalSeats=totalSeats;
    // }
    public ShowTime(String id, LocalDateTime time, int totalSeats){
        this.id = id;
        this.time = time;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
    }
    public boolean bookSeat() {
        if(bookedSeats<totalSeats){
            System.out.println("Con ghe");
            return true;
        }
        return false;
    }
    
}
