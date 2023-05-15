package pruebaconexcel;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FXMLController implements Initializable {

    @FXML
    private TableView<Excelcsv> tablaPersonas;

    @FXML
    private TableColumn<Excelcsv, Integer> columnaId;

    @FXML
    private TableColumn<Excelcsv, String> columnaNombre;

    @FXML
    private TableColumn<Excelcsv, Integer> columnaEdad;

    @FXML
    private TextField textInput;

    @FXML
    private Spinner<Integer> numberInput, numberInput2;

    @FXML
    public void mostrarDatosButtonClicked() {
        List<Excelcsv> personas = obtenerDatosDeLaBaseDeDatos();
        for (Excelcsv pers : personas) {
            System.out.println(pers.getNombre());
        }
        tablaPersonas.getItems().setAll(personas);
    }

    private List<Excelcsv> obtenerDatosDeLaBaseDeDatos() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PUA");
        EntityManager em = emf.createEntityManager();
        List<Excelcsv> personas = em.createQuery("SELECT p FROM Excelcsv p").getResultList();
        return personas;
    }

    @FXML
    public void agregarDatos() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PUA");
        EntityManager em = emf.createEntityManager();
        int id = numberInput.getValue();
        String nombre = textInput.getText();
        int edad = numberInput2.getValue();
        Excelcsv newPers = new Excelcsv();
        newPers.setId(id);
        newPers.setNombre(nombre);
        newPers.setEdad(edad);
        em.getTransaction().begin();
        em.persist(newPers);
        em.getTransaction().commit();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        columnaId.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnaNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        columnaEdad.setCellValueFactory(new PropertyValueFactory<>("edad"));
    }
}
