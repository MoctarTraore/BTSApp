package com.example.ratrapage;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField identifiantField;

    @FXML
    private Button consulterButton;

    @FXML
    public void initialize() {
        // Ajoutez ici les actions à effectuer lors de l'initialisation, si nécessaire
        consulterButton.setOnAction(event -> consulterResultat());
    }

    private void consulterResultat() {
        String identifiant = identifiantField.getText();
        // Logique de traitement du résultat basé sur l'identifiant saisi
        System.out.println("Identifiant saisi : " + identifiant);
        // Vous pouvez ajouter ici l'appel à une base de données ou toute autre logique
    }
}
