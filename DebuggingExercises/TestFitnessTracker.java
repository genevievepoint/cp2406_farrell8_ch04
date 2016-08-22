import java.time.LocalDate;

/**
 * Created by Genevieve on 22-Aug-16.
 */
public class TestFitnessTracker {

    public static void main(String[] args){
        FitnessTracker exercise = new FitnessTracker();
        System.out.println(exercise.getActivity() + " " + exercise.getMinutes() + " minutes on "
                + exercise.getDate());

        LocalDate date = LocalDate.of(2015, 8, 20);
        FitnessTracker exercise2 = new FitnessTracker("bicycling", 35, date);

        System.out.println(exercise2.getActivity() + " " + exercise2.getMinutes() + " minutes on "
                + exercise2.getDate());
    }
}
