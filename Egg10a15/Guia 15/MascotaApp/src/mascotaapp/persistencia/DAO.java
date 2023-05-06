package mascotaapp.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {

    /*SI no se peuden importar debo agregar la libreria de mysql
    TOMAN LA DATA DE LA BASE DE DATO
    
     */
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;

    private final String USER = "root";
    private final String PASSWORD = "Bruno1231";
    private final String DATABASE = "ejemploEgg";
    private final String DRIVER = "com.mysql.jdbc.Driver";

    /*METODOS*/
    protected void conectarBase() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }/*CONECTO LA BASE*/

    protected void desconectarBase() throws Exception {
        try {
            if (resultado != null) {/*SI HAY COSAS  EN La CONSULTA*/
                resultado.close();/*SI TIENE ALGO LO CIERRO*/
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }

        } catch (Exception e) {
            throw e;
        }
    }/*DESCONECTO LA BASE*/

    protected void insertarModificarEliminar(String sql) throws Exception {/* en sql recibo la consulta a ejecutar isertarmodificareliminar*/
        try {
            conectarBase();/*SI CADA VEZ QUE ME CONECTO ME DESCONECTO DEBO VOLVER A CONECTARME*/
            sentencia = conexion.createStatement();/*ME PREPARA PARA UNA SENTENCIA en conexion*/
            sentencia.executeUpdate(sql);/*COMO YA SE PEREPARA A UNA SENTENCIA LA EJECUTA*/


        } catch (SQLException | ClassNotFoundException ex) {
            // conexion.rollback();
            /*  Descomentar la linea anterior si desean tener en cuenta el rollback.
                Correr el siguiente script en Workbench
            
                SET autocommit=1;
                COMMIT;
            
                **Sin rollback igual anda */
            throw ex;

        } finally {
            desconectarBase();
        }

    }/*CONECTO,EJECUTO UNA SENTENCIA Y ME DESCONECTO*/

    protected void consultarBase(String sql) throws Exception {
        try {
            conectarBase();
            sentencia = conexion.createStatement();/*PREpARO LA SENTENCIA*/
            resultado = sentencia.executeQuery(sql);/* EN RESULTADO GUARDO EL PRODUCTO DE LA CONSULTA*/
        } catch (Exception ex) {
            throw ex;
        }
    }/*SE CONECTA; EJECUTA LA SENTENCIA Y GUARDO LOS RESULTADOS EN LA CONSULTA*/

}
