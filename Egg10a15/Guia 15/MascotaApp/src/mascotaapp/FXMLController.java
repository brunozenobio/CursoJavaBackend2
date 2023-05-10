/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import mascotaapp.dominio.mascota.MascotaSercice;
import mascotaapp.dominio.usuario.Usuario;
import mascotaapp.dominio.usuario.UsuarioService;

/**
 * FXML Controller class
 *
 * @author brunopc
 */
public class FXMLController implements Initializable {
    
    @FXML
    private TableView<Usuario> tableView;
    @FXML
    private TableColumn<Usuario, String> column1;
    @FXML
    private TableColumn<Usuario, String> column2;

    private ObservableList<Usuario> data = FXCollections.observableArrayList();

    
    @FXML
    private void handleButtonAction(ActionEvent event) throws Exception {
        UsuarioService us = new UsuarioService();
        MascotaSercice ms = new MascotaSercice();
        String nombre = us.consultarUsuariPorCorreoElectronico("brunozenobio4@gmail.com").getNombre();

        ms.crearMascota();

    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}