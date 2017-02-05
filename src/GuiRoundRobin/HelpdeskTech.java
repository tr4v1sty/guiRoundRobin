package GuiRoundRobin;

/**
 * Created by travist on 2/2/2017.
 */
public class HelpdeskTech {

    private String techName;
    private int tasksGiven;

    HelpdeskTech(String techName){
        this.techName = techName;
    }

    public void increaseTasksGiven(){
        tasksGiven ++;
    }

    public String getTechName() {
        return techName;
    }

    public int getTasksGiven() {
        return tasksGiven;
    }
}


