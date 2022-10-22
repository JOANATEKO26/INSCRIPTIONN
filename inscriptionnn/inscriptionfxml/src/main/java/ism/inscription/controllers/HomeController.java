package ism.inscription.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import ism.inscription.App;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class HomeController implements Initializable {

    @FXML
    AnchorPane anchorcontains;

    public void handleDeconnexion() throws IOException {

        App.setRoot("connexion");
    }

    public void handleloadViewClasse() throws IOException {
        this.loadview("classe");

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        try {
            this.loadview("classe");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    private void loadview(String fxml) throws IOException{
        AnchorPane root = (AnchorPane) App.loadFXML("fxml");
        anchorcontains.getChildren().clear();
        anchorcontains.getChildren().add(root);
    }

}
