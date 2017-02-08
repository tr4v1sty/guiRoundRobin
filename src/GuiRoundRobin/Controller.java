package GuiRoundRobin;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.ArrayList;

public class Controller {
    @FXML
    Button button0;
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
    @FXML
    Label labelron;
    @FXML
    Label labelchris;
    @FXML
    Label labelnext2chrisandjoey;
    @FXML
    Label labeljoey;
    @FXML
    Label label41;
    @FXML
    Label label42;
    @FXML
    Label label43;
    @FXML
    Label label44;

    static int count = 0;
    static int deathCounter = 0;
    static Integer taskCount = 1;



    public void handleButton0(){

        if (deathCounter <= 0){
            init();
            deathCounter++;
        }

        labelArrayCount.get(count).setText(taskCount.toString());
        topTextLabel.setText("You just gave a task to " + labelArrayName.get(count).getText());

        count++;
        if (count >= labelArrayCount.size()){
            taskCount++;
            count = 0;
        }
    }

    //i know I should loop for this but i need to be able to move people around and account for empty seats
    public static ArrayList<Label> labelArrayCount = new ArrayList<>();

    public static ArrayList<Label> labelArrayName = new ArrayList<>();

    public void init(){
//     empty seats   labelArrayCount.add(label21);labelArrayCount.add(label22);labelArrayCount.add(label29);labelArrayCount.add(label32);
//                  labelArrayCount.add(label40);labelArrayCount.add(label43);
        labelArrayCount.add(label23);labelArrayCount.add(label24);
        labelArrayCount.add(label41);labelArrayCount.add(label42);labelArrayCount.add(label44);
        labelArrayCount.add(label25);
        labelArrayCount.add(label26);labelArrayCount.add(label27);labelArrayCount.add(label28);labelArrayCount.add(label30);
        labelArrayCount.add(label31);labelArrayCount.add(label33);labelArrayCount.add(label34);labelArrayCount.add(label35);
        labelArrayCount.add(label36);labelArrayCount.add(label37);labelArrayCount.add(label38);labelArrayCount.add(label39);


        labelArrayName.add(label3);labelArrayName.add(label4);
        labelArrayName.add(labelron);labelArrayName.add(labelchris);labelArrayName.add(labeljoey);
        labelArrayName.add(label5);
        labelArrayName.add(label6);labelArrayName.add(label7);labelArrayName.add(label8);labelArrayName.add(label10);
        labelArrayName.add(label11);labelArrayName.add(label13);labelArrayName.add(label14);labelArrayName.add(label15);
        labelArrayName.add(label16);labelArrayName.add(label17);labelArrayName.add(label18);labelArrayName.add(label19);
    }



    public void handleMichael(){
        if (deathCounter <= 0){
            init();
            deathCounter++;
        }
        label19.setText("XXXXX");
        labelArrayCount.remove(label39);
    }
    public void handleDominic(){
        if (deathCounter <= 0){
            init();
            deathCounter++;
        }
        label18.setText("XXXXX");
        labelArrayCount.remove(label38);
    }
    public void handleRick(){
        if (deathCounter <= 0){
            init();
            deathCounter++;
        }
        label17.setText("XXXXX");
        labelArrayCount.remove(label37);
    }
    public void handleHughes(){
        if (deathCounter <= 0){
            init();
            deathCounter++;
        }
        label16.setText("XXXXX");
        labelArrayCount.remove(label36);
    }
    public void handleRobert(){
        if (deathCounter <= 0){
            init();
            deathCounter++;
        }
        label15.setText("XXXXX");
        labelArrayCount.remove(label35);
    }
    public void handleMatthew(){
        if (deathCounter <= 0){
            init();
            deathCounter++;
        }
        label14.setText("XXXXX");
        labelArrayCount.remove(label34);
    }
    public void handleBlue(){
        if (deathCounter <= 0){
            init();
            deathCounter++;
        }
        label13.setText("XXXXX");
        labelArrayCount.remove(label33);
    }
    public void handleThomas(){
        if (deathCounter <= 0){
            init();
            deathCounter++;
        }
        label11.setText("XXXXX");
        labelArrayCount.remove(label31);
    }
    public void handleAryn(){
        if (deathCounter <= 0){
            init();
            deathCounter++;
        }
        label10.setText("XXXXX");
        labelArrayCount.remove(label30);
    }
    public void handleChace(){
        if (deathCounter <= 0){
            init();
            deathCounter++;
        }
        label8.setText("XXXXX");
        labelArrayCount.remove(label28);
    }
    public void handleSpencer(){
        if (deathCounter <= 0){
            init();
            deathCounter++;
        }
        label7.setText("XXXXX");
        labelArrayCount.remove(label27);
    }
    public void handleTravis(){
        if (deathCounter <= 0){
            init();
            deathCounter++;
        }
        label6.setText("XXXXX");
        labelArrayCount.remove(label26);
    }
    public void handleBrandon(){
        if (deathCounter <= 0){
            init();
            deathCounter++;
        }
        label5.setText("XXXXX");
        labelArrayCount.remove(label25);
    }

    public void handleJoey(){
        if (deathCounter <= 0){
            init();
            deathCounter++;
        }
        labeljoey.setText("XXXXX");
        labelArrayCount.remove(label44);
    }

    public void handleChris(){
        if (deathCounter <= 0){
            init();
            deathCounter++;
        }
        labelchris.setText("XXXXX");
        labelArrayCount.remove(label42);
    }

    public void handleRon(){
        if (deathCounter <= 0){
            init();
            deathCounter++;
        }
        labelron.setText("XXXXX");
        labelArrayCount.remove(label41);
    }

    public void handleJosh(){
        if (deathCounter <= 0){
            init();
            deathCounter++;
        }
        label4.setText("XXXXX");
        labelArrayCount.remove(label24);
    }

    public void handleGeorge(){
        if (deathCounter <= 0){
            init();
            deathCounter++;
        }
        label3.setText("XXXXX");
        labelArrayCount.remove(label23);
    }





}
