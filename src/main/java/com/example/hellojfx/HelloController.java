package com.example.hellojfx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application! Перевірка!!");
    }
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;


    @FXML
    private Button ButtonDelete;

    @FXML
    private Button ButtonEdit;

    @FXML
    private Button ButtonNew;

    @FXML
    private TableColumn<User, String> last_name;

    @FXML
    private TableColumn<User, String> name;

    @FXML
    private TableView<User> table;

    ObservableList<User> list = FXCollections.observableArrayList(
            new User("Branden", "Jones"),
            new User("Richard", "Paul"),
            new User("Michael", "Gordon")
    );
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        name.setCellValueFactory(new PropertyValueFactory<User, String>("First_Name"));
        last_name.setCellValueFactory(new PropertyValueFactory<User, String>("last_name"));

        table.setItems(list);
    }
}