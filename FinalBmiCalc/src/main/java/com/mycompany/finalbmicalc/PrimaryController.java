package com.mycompany.finalbmicalc;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import java.lang.Math;
public class PrimaryController {
    @FXML private TextField we;
    @FXML private TextField he;
    @FXML private Label lb;
    @FXML private CheckBox cb;
    @FXML
    public void bmiButtonPushed()
    {
        String weight = we.getText();
        String height = he.getText();
        double w = Double.parseDouble(weight);
        double h = Double.parseDouble(height);
        double res;
        if (cb.isSelected())
        {
            res = Math.round(w/(h * h));
        }
        else
        {
            res = Math.round((703 * w)/(h * h));
        }
        String r = Double.toString(res);
        if (res >= 35){
            lb.setText("BMI: " + r + "-Obese");
        }
        else if ((res >= 29) && (res < 35)){
            lb.setText("BMI: " + r + "-Overweight");
        }
        else if ((res >= 24) && (res < 29)){
            lb.setText("BMI: " + r + "-Normal");
            }
        else if (res >= 18 && res < 24){
            lb.setText("BMI: " + r + "Underweight");
            }
        else if (res >= 16 && res < 18){
            lb.setText("BMI: " + r + "Underweight");
            }
        else if (res < 16){
            lb.setText("BMI: " + r + "Seriously Underweight");
            }
    }
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }


}
