package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable, Actions {

    @FXML private Label numLabel;

    private String value1String = "";

    private String value2String = "";

    private double value1Double;

    private double value2Double;

    private double answer;

    private String firstValue = "first";

    private String equalClicked = "";

    private String calc = "";


    @Override
    public void initialize(URL location, ResourceBundle resources) {



    }

    @Override
    public void one(){
        String one = "1";
        if(firstValue.equals("first")) {
            value1String += one;
            numLabel.setText(value1String);
        }
        if( calc.equals("+")|| calc.equals("-") || calc.equals("x") || calc.equals("%")){
            value2String +=one;
            numLabel.setText(value2String);
        }

    }

    @Override
    public void two() {
        String two = "2";
        if(firstValue.equals("first")) {
            value1String += two;
            numLabel.setText(value1String);
        }
        if( calc.equals("+") || calc.equals("-") || calc.equals("x") || calc.equals("%") ){
            value2String +=two;
            numLabel.setText(value2String);
        }

    }

    @Override
    public void three() {

        String three = "3";
        if(firstValue.equals("first")) {
            value1String += three;
            numLabel.setText(value1String);
        }
        if( calc.equals("+") || calc.equals("-") || calc.equals("x")|| calc.equals("%") ){
            value2String +=three;
            numLabel.setText(value2String);
        }

    }

    @Override
    public void four() {

        String four = "4";
        if(firstValue.equals("first")) {
            value1String += four;
            numLabel.setText(value1String);
        }
        if( calc.equals("+") || calc.equals("-") || calc.equals("x") || calc.equals("%")){
            value2String +=four;
            numLabel.setText(value2String);
        }

    }

    @Override
    public void five() {

        String five = "5";
        if(firstValue.equals("first")) {
            value1String += five;
            numLabel.setText(value1String);
        }
        if( calc.equals("+") || calc.equals("-") || calc.equals("x") || calc.equals("%")){
            value2String +=five;
            numLabel.setText(value2String);
        }

    }

    @Override
    public void six() {

        String six = "6";
        if(firstValue.equals("first")) {
            value1String += six;
            numLabel.setText(value1String);
        }
        if( calc.equals("+") || calc.equals("-") || calc.equals("x") || calc.equals("%")){
            value2String +=six;
            numLabel.setText(value2String);
        }

    }

    @Override
    public void seven() {

        String seven = "7";
        if(firstValue.equals("first")) {
            value1String += seven;
            numLabel.setText(value1String);
        }
        if( calc.equals("+") || calc.equals("-") || calc.equals("x") || calc.equals("%") ){
            value2String +=seven;
            numLabel.setText(value2String);
        }

    }

    @Override
    public void eight() {

        String eight = "8";
        if(firstValue.equals("first")) {
            value1String += eight;
            numLabel.setText(value1String);
        }
        if( calc.equals("+") || calc.equals("-") || calc.equals("x") || calc.equals("%")){
            value2String +=eight;
            numLabel.setText(value2String);
        }

    }

    @Override
    public void nine() {

        String nine = "9";
        if(firstValue.equals("first")) {
            value1String += nine;
            numLabel.setText(value1String);
        }
        if( calc.equals("+") || calc.equals("-") || calc.equals("x") || calc.equals("%") ){
            value2String +=nine;
            numLabel.setText(value2String);
        }


    }

    @Override
    public void add() {
        calc = "+";
        firstValue = "second";
        numLabel.setText("");
        //numLabel.setText("value 1 =" + value1String+"Value 2 ="+value2String);
    }

    @Override
    public void subtract() {
        calc = "-";
        firstValue = "second";
        numLabel.setText("");
        //numLabel.setText("subtract clicked");
    }

    @Override
    public void divide() {
        calc = "%";
        firstValue = "second";
        numLabel.setText("");
       // numLabel.setText("divide clicked");
    }

    @Override
    public void multiple() {
        calc = "x";
        firstValue = "second";
        numLabel.setText("");
        //numLabel.setText("multiply clicked");
    }

    @Override
    public void zero() {
        String zero = "0";
        if(firstValue.equals("first")) {
            value1String += zero;
            numLabel.setText(value1String);
        }
        if( calc.equals("+") || calc.equals("-") || calc.equals("x") || calc.equals("%") ){
            value2String +=zero;
            numLabel.setText(value2String);
        }
    }

    @Override
    public void back() {

        if(firstValue.equals("first")) {
            value1String = value1String.substring(0,  value1String.length() -1 );
            numLabel.setText(value1String);
        }
        if( calc.equals("+") || calc.equals("-") || calc.equals("x") || calc.equals("%") ){

            value2String = value2String.substring(0,  value2String.length() -1 );
            numLabel.setText(value2String);
        }
    }

    @Override
    public void equal(){
        equalClicked = "equal";

        value1Double = Double.parseDouble(value1String);

        value2Double = Double.parseDouble(value2String);

        if(calc.equals("+")){
            answer = value1Double + value2Double;
        }

        if( calc.equals("-") ){
            answer = value1Double - value2Double;
        }

        if(calc.equals("x") ){
            answer = value1Double * value2Double;
        }
        if(calc.equals("%") ){
            try {
                answer = value1Double / value2Double;
            }catch(ArithmeticException e){
                System.out.println("Math Exception"+e);
            }
        }

        numLabel.setText("Equals = "+answer);


    }

    @Override
    public void clear() {
        value1String = "";

        value2String = "";

        value1Double = 0.0;

        value2Double = 0.0;

        calc = "";

        firstValue = "first";

        numLabel.setText(value1String +""+value2String);

    }

}
