import java.time.LocalDate;

public class FitnessTracker {
    String activity;
    int minutes;
    LocalDate date;

    public FitnessTracker(){
        activity = "running";
        minutes = 1;
        date = LocalDate.of(2016, 1, 1);
    }

    public FitnessTracker(String a, int m, LocalDate d){
        activity = a;
        minutes = m;
        date = d;
    }

    public String getActivity(){
        return activity;
    }

    public int getMinutes(){
        return minutes;
    }

    public LocalDate getDate(){
        return date;
    }
}
