/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teachersection;

import studentSection.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Arafat Hossain Ar
 */
public class deleteTeacherController implements Initializable {

    /**
     * Initializes the controller class.
     */
    //Mouse position
    private double xMouse = 0;
    private double yMouse = 0;

    private void handleButtonAction(ActionEvent event) {

        Stage stage = new Stage(StageStyle.UNDECORATED);
        stage.centerOnScreen();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void closeWindow(MouseEvent event) {
        Node node = (Node) event.getSource();

        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void hideWindow(MouseEvent event) {
        Node node = (Node) event.getSource();

        Stage stage = (Stage) node.getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    private void moveMouseDragged(MouseEvent event) {
        Node node = (Node) event.getSource();

        Stage stage = (Stage) node.getScene().getWindow();

        stage.setX(event.getScreenX() - xMouse);
        stage.setY(event.getScreenY() - yMouse);

    }

    @FXML
    private void moveMousePressed(MouseEvent event) {
        xMouse = event.getSceneX();
        yMouse = event.getSceneY();
    }

    @FXML
    private void onMouseClickAdd(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/teachersection/mainMenuTeacher.fxml"));

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    private void onMouseClickUpdate(MouseEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/teachersection/updateTeacher.fxml"));

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(root));

    }

    @FXML
    private void onMouseClickDelete(MouseEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("/teachersection/deleteTeacher.fxml"));
//
//        Node node = (Node) event.getSource();
//        Stage stage = (Stage) node.getScene().getWindow();
//        stage.setScene(new Scene(root));

    }

    @FXML
    private void onMouseClickView(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/teachersection/viewTeacher.fxml"));

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

}
