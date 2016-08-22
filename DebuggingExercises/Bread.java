/**
 * Created by Genevieve on 22-Aug-16.
 */
public class Bread {
    private String breadType;
    private int caloriesPerSlice;
    public final static String MOTTO = "The staff of life";

    public Bread(String bread, int cal){
        breadType = bread;
        caloriesPerSlice = cal;
    }

    public String getBreadType(){
        return breadType;
    }

    public int getCaloriesPerSlice(){
        return caloriesPerSlice;
    }
}
