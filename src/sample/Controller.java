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

    private int countClicks = 0;

    private double value1Double;

    private double value2Double;

    private double answer;

    private String answer1String;

    private String firstValue = "first";

    private String equalClicked = "";

    private String calc = "";


    @Override
    public void initialize(URL location, ResourceBundle resources) { }

    public void numberClick(String value){

        if(firstValue.equals("first")) {
            value1String += value;
            numLabel.setText(value1String);
        }
        if( calc.equals("+")|| calc.equals("-") || calc.equals("x") || calc.equals("%")){
            value2String += value;
            numLabel.setText(value2String);
        }


    }

    @Override
    public void one(){
        String one = "1";
        numberClick(one);
    }

    @Override
    public void two() {
        String two = "2";
        numberClick(two);
    }

    @Override
    public void three() {

        String three = "3";
        numberClick(three);

    }

    @Override
    public void four() {

        String four = "4";
        numberClick(four);

    }

    @Override
    public void five() {

        String five = "5";
        numberClick(five);

    }

    @Override
    public void six() {

        String six = "6";
        numberClick(six);

    }

    @Override
    public void seven() {

        String seven = "7";
        numberClick(seven);

    }

    @Override
    public void eight() {

        String eight = "8";
        numberClick(eight);

    }

    @Override
    public void nine() {
        //still experimenting with nine so changes will not take place
        String nine = "9";
        if (firstValue.equals("first")) {
            value1String += nine;
            numLabel.setText("F " + value1String);
        }
        if (calc.equals("+") || calc.equals("-") || calc.equals("x") || calc.equals("%")) {

            if(countClicks % 2 != 0) {
                value2String += nine;
            }
            numLabel.setText("S " + value2String);
        }

        if(countClicks % 2 == 0 && calc.equals("+")){

            value1String = answer1String;
            //value2String ="";
            value2String += nine;
            numLabel.setText(value2String);
            System.out.println("one = " + value1String + "two =" + value2String);
        }
    }

    @Override
    public void add() {
        calc = "+";
        firstValue = "second";
        numLabel.setText("");
        //numLabel.setText("value 1 =" + value1String+"Value 2 ="+value2String);
        countClicks += 1;
        value2String = "";
        System.out.println(countClicks+"and one: "+value2String);


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
    public void decimal(){
        String dec = ".";
        if(firstValue.equals("first")) {
            // add the decimal only if there isn't already ones
            if (  !value1String.contains(".") ) {
                value1String += dec;
            }else{

            }
        }

        if( calc.equals("+") || calc.equals("-") || calc.equals("x") || calc.equals("%") ){
            if (  !value2String.contains(".") ) {
                value2String += dec;
            }else{

            }
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
                System.out.println("Math Exception = "+e);
            }
        }

        if(countClicks == 2 && calc.equals("+")){
            value2String = "";
           /* value2String = "";
            value1String ="";*/
            System.out.println(value2String +"\n"+value1String);

            //answer = answer + 9;
        }
        //value2String=Double.toString(answer);
        //value1String = "";
        answer1String = Double.toString(answer);
        numLabel.setText("Equals = " + answer1String);

       // numLabel.setText(value2String);

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
        //numLabel.setText("testing");
    }

}
