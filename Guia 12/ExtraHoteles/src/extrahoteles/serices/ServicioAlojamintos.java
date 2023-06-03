package extrahoteles.serices;

import extrahoteles.entidades.Alojamiento;
import extrahoteles.entidades.Gerente;
import extrahoteles.entidades.Hotel;
import extrahoteles.entidades.Hotel4;

public class ServicioAlojamintos {
    
    public Alojamiento crearAlojamiento(String nombre,String direccion,String localidad,Gerente gerente){
 
        Alojamiento aloj = new Alojamiento(nombre, direccion, localidad, gerente);
        return aloj;
    }
    
    public Hotel crearHotel(int cantHabi,int cantPisos,int cantCamas,double precioHabitacion){
        Alojamiento aloj = crearAlojamiento(nombre, direccion, localidad, gerente);
        Hotel hotel = new Hotel
    
    }

    

}
