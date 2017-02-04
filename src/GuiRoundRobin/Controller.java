package GuiRoundRobin;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    Button button1;
    @FXML
    Button button2;
    @FXML
    Label label1;

    public void handleButton1(){
        TechList.initTechList();
    }
    public void handleButton2(){
        label1.setText(TechList.displayTechs());
    }

}
