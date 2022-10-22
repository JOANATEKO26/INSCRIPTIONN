package ism.inscription.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import ism.inscription.App;
import ism.inscription.Core.Fabrique;
import ism.inscription.entities.User;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ConnexionController implements Initializable {

    @FXML
    Text lblerror;
    @FXML
    Text txtlogin;
    TextField txtpssd;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        lblerror.setVisible(false);

    }

    public void handleConnexion() throws IOException {
        String login = txtlogin.getText().trim();
        String password = txtpssd.getText().trim();
        User user = Fabrique.getService().seConnecter(login, password);
        if (user == null) {
            lblerror.setVisible(true);

        } else {
            lblerror.setVisible(true);
            App.setRoot("home");
        }
    }

}