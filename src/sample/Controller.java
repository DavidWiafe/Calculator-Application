package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable, Actions {

    @FXML private Label numLabel;
    private String value1 = "blank";

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void one(){
        String one = "1";
        value1 += one;
    }


    @Override
    public void add() {
        numLabel.setText("add clicked "+value1);
    }

    @Override
    public void subtract() {
        numLabel.setText("subtract clicked");
    }

    @Override
    public void divide() {
        numLabel.setText("divide clicked");
    }

    @Override
    public void multiple() {
        numLabel.setText("multiply clicked");
    }
}
