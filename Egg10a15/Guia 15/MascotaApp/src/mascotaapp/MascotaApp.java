package mascotaapp;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import mascotaapp.dominio.mascota.MascotaSercice;
import mascotaapp.dominio.usuario.UsuarioService;
import mascotaapp.persistencia.UsuarioDAO;

public class MascotaApp extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws Exception {

        
        launch(args);
        

    }

}
