package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {


    @FXML
    private TextField textField;
    @FXML
    private Label winLabel;
    @FXML
    private Label lossLabel;
    @FXML
    private Label countLabel;

    private int count = 0;

    public void buttonPush(ActionEvent event) {

        try {
            count++;
            Random random = new Random();
            int randomNumber = random.nextInt(10) + 1;
            int guess = Integer.parseInt(textField.getText());
            if (guess == randomNumber) {
                winLabel.setText("Atspejote is " +count+ "karto");
                lossLabel.setText("");
                count=0;
            } else {
                lossLabel.setText("Neatspejote " + randomNumber);
                countLabel.setText("Spejimas " + count);

            }



        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Jusu ivestas skaicius neatitinka formato");
            alert.show();
        }
        textField.setText("");
    }

    public void endGame(ActionEvent event) {
        System.exit(0);
    }
}
