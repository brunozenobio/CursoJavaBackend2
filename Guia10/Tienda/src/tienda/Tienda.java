
package tienda;

import java.util.HashMap;
import tienda.Service.ProductoService;


public class Tienda {

    public static void main(String[] args) {
        HashMap<String,Integer> productos = new HashMap();
        ProductoService ps = new ProductoService();
        ps.menu(productos);
        
        
       
    }
    
}
