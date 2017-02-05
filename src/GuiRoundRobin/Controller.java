package GuiRoundRobin;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.ArrayList;

public class Controller {
    @FXML
    Button button1;
    @FXML
    Label topTextLabel;
    @FXML
    Label label21;
    @FXML
    Label label22;
    @FXML
    Label label23;
    @FXML
    Label label24;
    @FXML
    Label label25;
    @FXML
    Label label26;
    @FXML
    Label label27;
    @FXML
    Label label28;
    @FXML
    Label label29;
    @FXML
    Label label30;
    @FXML
    Label label31;
    @FXML
    Label label32;
    @FXML
    Label label33;
    @FXML
    Label label34;
    @FXML
    Label label35;
    @FXML
    Label label36;
    @FXML
    Label label37;
    @FXML
    Label label38;
    @FXML
    Label label39;
    @FXML
    Label label40;
    @FXML
    Label label1;
    @FXML
    Label label2;
    @FXML
    Label label3;
    @FXML
    Label label4;
    @FXML
    Label label5;
    @FXML
    Label label6;
    @FXML
    Label label7;
    @FXML
    Label label8;
    @FXML
    Label label9;
    @FXML
    Label label10;
    @FXML
    Label label11;
    @FXML
    Label label12;
    @FXML
    Label label13;
    @FXML
    Label label14;
    @FXML
    Label label15;
    @FXML
    Label label16;
    @FXML
    Label label17;
    @FXML
    Label label18;
    @FXML
    Label label19;
    @FXML
    Label label20;
    static int count = 0;
    static Integer taskCount = 1;

    public void handleButton1(){

        //i know I should loop for this but i need to be able to move people around and account for empty seats
        ArrayList<Label> labelArrayCount = new ArrayList<>();
//     empty seats   labelArrayCount.add(label21);labelArrayCount.add(label22);labelArrayCount.add(label29);labelArrayCount.add(label32);labelArrayCount.add(label40);
        labelArrayCount.add(label23);labelArrayCount.add(label24);labelArrayCount.add(label25);
        labelArrayCount.add(label26);labelArrayCount.add(label27);labelArrayCount.add(label28);labelArrayCount.add(label30);
        labelArrayCount.add(label31);labelArrayCount.add(label33);labelArrayCount.add(label34);labelArrayCount.add(label35);
        labelArrayCount.add(label36);labelArrayCount.add(label37);labelArrayCount.add(label38);labelArrayCount.add(label39);

        ArrayList<Label> labelArrayName = new ArrayList<>();
        labelArrayName.add(label3);labelArrayName.add(label4);labelArrayName.add(label5);
        labelArrayName.add(label6);labelArrayName.add(label7);labelArrayName.add(label8);labelArrayName.add(label10);
        labelArrayName.add(label11);labelArrayName.add(label13);labelArrayName.add(label14);labelArrayName.add(label15);
        labelArrayName.add(label16);labelArrayName.add(label17);labelArrayName.add(label18);labelArrayName.add(label19);

        labelArrayCount.get(count).setText(taskCount.toString());
        topTextLabel.setText("You just gave a task to " + labelArrayName.get(count).getText());

        count++;
        if (count >= labelArrayName.size()){
            taskCount++;
            count = 0;
        }
    }


}
