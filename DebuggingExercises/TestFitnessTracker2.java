import java.time.LocalDate;

/**
 * Created by Genevieve on 22-Aug-16.
 */
public class TestFitnessTracker2 {
    public static void main(String[] args){
        FitnessTracker2 exercise = new FitnessTracker2();

        System.out.println(exercise.getActivity() + " " + exercise.getMinutes() +  " minutes on " + exercise.getDate());

        LocalDate date = LocalDate.of(2015, 8, 20);
        FitnessTracker2 exercise2 = new FitnessTracker2("bicycling", 35, date);

        System.out.println(exercise2.getActivity() + " " + exercise2.getMinutes() + " minutes on " + exercise2.getDate());
    }

}
