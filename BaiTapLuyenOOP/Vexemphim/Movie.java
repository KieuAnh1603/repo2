package Vexemphim;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title; // ten phim
    private int duration; // khoang thoi gian
    private List<ShowTime> Cacsuatchuieucuaphim;

    public Movie(String title, int duration){
        this.title=title;
        this.duration=duration;
        this.Cacsuatchuieucuaphim = new ArrayList<>();
    }


    public void addShowTime(ShowTime s) {
        Cacsuatchuieucuaphim.add(s);
    }


    public String getTitle() {
        return title;
    }
    public int getDuration() {
        return duration;
    }
    
}
