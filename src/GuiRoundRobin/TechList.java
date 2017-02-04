package GuiRoundRobin;
import java.util.ArrayList;

public class TechList {

    private static ArrayList<HelpdeskTech> listOfTechs = new ArrayList<>();
    public static String [] listOfNames = {"Travis","Spencer","Chace","Ron","Chris","George",
            "Joey","Walters","Aryn","Thomas","Blue","Matt","Robert","Hughes","Rick","Dominic","Michael","Brandon"};

    public static void initTechList(){
        for(String s : listOfNames){
            listOfTechs.add(new HelpdeskTech(s));
            System.out.println("added " + s + " to the list of techs");
        }
    }

    public static String displayTechs(){
        StringBuilder sb = new StringBuilder();
        for(HelpdeskTech h : listOfTechs) {
            sb.append(h.getTechName() + " ");
        }
        return sb.toString();
    }


}
