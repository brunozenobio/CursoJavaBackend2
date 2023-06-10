package extrahoteles.serices;

import extrahoteles.entidades.AlojExtra;
import extrahoteles.entidades.Alojamiento;
import extrahoteles.entidades.Camping;
import extrahoteles.entidades.Gerente;
import extrahoteles.entidades.Hotel;
import extrahoteles.entidades.Hotel4;
import extrahoteles.entidades.Hotel5;
import extrahoteles.entidades.Residencias;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class ServicioAlojamintos {
    private  List<Alojamiento> alojamientos = new ArrayList<>();
    private TreeSet<Hotel> hoteles = new TreeSet<>(Hotel::compareTo);

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Alojamiento crearAlojamiento() {
        Alojamiento aloj;
        System.out.println("Creando alojamiento");
        System.out.print("Nombre: ");
        String nombre = read.next();
        System.out.print("Direccion: ");
        String direc = read.next();
        System.out.print("Localidad: ");
        String localidad = read.next();
        System.out.print("Gerente: ");
        System.out.println("Que tipo de alojamiento es?");
        System.out.println("1. Hotel");
        System.out.println("2. Alojamiento extra hotelero");
        int op = read.nextInt();
        if (op == 1) {
            System.out.print("Cantidad de habitacioens: ");
            String cantHab = read.next();
            System.out.print("Cantidad de camas: ");
            int cantCam = read.nextInt(); 
            System.out.print("Cantidad de pisos: ");
            String cantPiso = read.next();
            System.out.print("Precio por habitacion: ");
            double precio = read.nextDouble();
            System.out.print("Tipo de gimasio (A,B):");
            String gimanasio = read.next();
            System.out.print("Nombre del restaurante:");
            String nombreResto = read.next();
            System.out.print("Capacidad del restaurante:");
            int capResto = read.nextInt();
            aloj = crearHotel(nombre, direc, localidad, cantCam, cantCam, precio, gimanasio, nombreResto, capResto, cantCam);
        } else if (op == 2) {
            System.out.print("El alojamiento es privado? true/false: ");
            boolean priv = read.nextBoolean();
            System.out.print("Cuanta area tiene?: ");
            double area = read.nextDouble();
            aloj = crearAlojExtra(nombre, direc, localidad, priv, area);
            
        } else {
            System.out.println("Opcion incorrecta");
            return null;
        }
        alojamientos.add(aloj);
        return aloj;
    }

    public Hotel crearHotel(String nombre,String direc,
        String localidad,int cantHab,int cantPiso,double precio,String gimanasio,String nombreResto,int capResto,int cantCam) {
        System.out.println("Que tipo de hotel es");
        System.out.println("1. de 4 estrellas");
        System.out.println("2. de 5 estrellas");
        Hotel hotel;
        int op2 = read.nextInt();
        if (op2 == 1) {
            System.out.println("Creando hotel de 4 estrellas");
            hotel = new Hotel4(gimanasio, nombreResto, capResto, cantHab, cantCam, cantPiso, precio, nombre, direc, localidad, null);
            System.out.println("Hotel creado");
            return hotel;
        } else if (op2 == 2) {
            System.out.println("Creando hotel de 5 estrllas");
            System.out.print("Cantidad de salos de conferencia: ");
            int cantSalC = read.nextInt();
            System.out.print("Cantidad de suites: ");
            int cantS = read.nextInt();
            System.out.print("Cantidad de limusinas: ");
            int cantL = read.nextInt();
            hotel = new Hotel5(cantSalC, cantS, cantL, gimanasio, nombreResto, capResto, cantHab, cantCam, cantPiso, precio, nombre, direc, localidad, null);
        } else {
            System.out.println("Opcion incorrecta");
            return null;
        }
        return hotel;
    }

    public AlojExtra crearAlojExtra(String nombre,String direccion,String localidad,boolean priv,double area){
        System.out.println("Que tipo de alojamiento extra es?");
        System.out.println("1. Camping");
        System.out.println("2. Residencia");
        AlojExtra alojextra;
        int op = read.nextInt();
        if(op == 1){
            System.out.println("Creando camping");
            System.out.print("Cantidad maxima de carpas: ");
            int cantMax = read.nextInt();
            System.out.print("Cantidad de baños: ");
            int cantBanio = read.nextInt();
            System.out.print("Tiene restaurante (true/false): ");
            boolean resto = read.nextBoolean();
            alojextra = new Camping(cantMax, cantBanio, resto, priv, area, nombre, direccion, localidad, null);
            System.out.println("Camping creado");
            return alojextra;
        }else if(op == 2){
            System.out.println("Creando residencia");
            System.out.print("Cantidad de habitaciones: ");
            int cantHab = read.nextInt();
            System.out.print("Hay descuento para gremios?:(true/false) ");
            boolean descGrem = read.nextBoolean();
            System.out.print("Tiene campo deportivo:(true/false) ");
            boolean campoDep = read.nextBoolean();
            alojextra = new Residencias(cantHab, descGrem, campoDep, priv, area, nombre, direccion, localidad, null);
            System.out.println("Resiedncia creada");
            return alojextra;
        }else{
            System.out.println("Opcion incorrecta");
            return null;
        }
        

        
        
        
    }
   
    
    public void mostrarAlojamientos(){
        System.out.println("================================================================");
        System.out.println("Alojamientos");
        for(Alojamiento var:alojamientos){
            if (var instanceof Hotel5) {
                System.out.println("Hotel de 5 estrellas: ");
                System.out.println("Nombre: " + var.getNombre());
                System.out.println("Direccion: " + var.getDireccion());
                System.out.println("Localidad: " + var.getLocalidad());
                System.out.println("Cantidad habitaciones: " + ((Hotel5) var).getCantHabitacions());
                System.out.println("Cantidad camas: " + ((Hotel5) var).getCantCamas());
                System.out.println("Nombre restaurante: " + ((Hotel5) var).getNombreRestaurante());
                System.out.println("Capacidad Restaurante: " + ((Hotel5) var).getCapacidadRestaurante());
                System.out.println("Cantidad salones de conferencia: " + ((Hotel5) var).getCantSalonesConferencia());
                System.out.println("Cantidad de suites: " + ((Hotel5) var).getCantSuits());
                System.out.println("Cantida de limosinas: " + ((Hotel5) var).getCantLimosinas());
                System.out.println("Gimasio tipo: " + ((Hotel5) var).isGimnasio());
                System.out.println("Precio por habitacione: " + ((Hotel5) var).getPrecioDeHabitacion());
                Hotel hotel5 = (Hotel) var;
                hoteles.add(hotel5);
                continue;
            }else if(var instanceof Hotel4){
                System.out.println("Hotel de 4 estrellas: ");
                System.out.println("=======================================");
                System.out.println("Nombre: " + var.getNombre());
                System.out.println("Direccion: " + var.getDireccion());
                System.out.println("Localidad: " + var.getLocalidad());
                System.out.println("Cantidad habitaciones: " + ((Hotel4) var).getCantHabitacions());
                System.out.println("Cantidad camas: " + ((Hotel4) var).getCantCamas());
                System.out.println("Nombre restaurante: " + ((Hotel4) var).getNombreRestaurante());
                System.out.println("Capacidad Restaurante: " + ((Hotel4) var).getCapacidadRestaurante());
                System.out.println("Gimasio tipo: " + ((Hotel4) var).isGimnasio());
                System.out.println("Precio por habitacione: " + ((Hotel4) var).getPrecioDeHabitacion());
                System.out.println("=======================================");
                Hotel hotel4 = (Hotel) var;
                hoteles.add(hotel4);
                continue;
            }else if(var instanceof Residencias){
                System.out.println("Residencia: ");
                System.out.println("=======================================");
                System.out.println("Nombre: " + var.getNombre());
                System.out.println("Direccion: " + var.getDireccion());
                System.out.println("Localidad: " + var.getLocalidad());
                System.out.println("Area todal: " + ((Residencias) var).getArea());
                System.out.println("Es privado: " + ((Residencias) var).isPrivado());
                System.out.println("Cantida de habitaciones: " + ((Residencias) var).getCantHabitacions());
                System.out.println("Descuento para gremios: " + ((Residencias) var).isDescGremios());
                System.out.println("Tiene campo deportivo: " + ((Residencias) var).isCampoDeportivo());
                continue;
        }else if(var instanceof Camping){
            System.out.println("Camping: ");
                System.out.println("=======================================");
                System.out.println("Nombre: " + var.getNombre());
                System.out.println("Direccion: " + var.getDireccion());
                System.out.println("Localidad: " + var.getLocalidad());
                System.out.println("Area todal: " + ((Camping) var).getArea());
                System.out.println("Es privado: " + ((Camping) var).isPrivado());
                System.out.println("Capacidad maxima de carpas: " + ((Camping) var).getCapaMaxCarpas());
                System.out.println("Cantidad de baños: " + ((Camping) var).getCantBanios());
                System.out.println("Restaurante: " + ((Camping) var).isRestaurante());
        }
        }
        System.out.println("================================================================");
        
    }

    public void mostrarHotelPorPrecio(){
        System.out.println("================================================================");
        System.out.println("Los hoteles del mas caro al mas barato son: ");
        for (Hotel var:hoteles){
            System.out.println("Hotel: " + var.getNombre() + "precio: " + var.getPrecioDeHabitacion());
        }
        System.out.println("================================================================");
    }

    public void campingsConRestaurante(){
        System.out.println("================================================================");
        System.out.println("Los campings con restaurante son: ");
        for(Alojamiento var: alojamientos){
            if(var instanceof Camping){
                if(((Camping) var).isRestaurante()){
                    System.out.println("Camping: " + var.getNombre());
                }

            }
        }
        System.out.println("================================================================");
    }

    public void residenciasConDescuento(){
        System.out.println("================================================================");
        System.out.println("Las residencias con descuento son: ");
        for(Alojamiento var: alojamientos){
            if(var instanceof Residencias){
                if(((Residencias) var).isDescGremios()){
                    System.out.println("Residencia: " + var.getNombre());
                }
            }
        }
        System.out.println("================================================================");
    }

    public void menu(){
        System.out.println("Bienvenido al sistema de guia de turismo, que desea ver?");
        int opcion = 0;
        do{
            System.out.println("1. Todos los alojamientos");
            System.out.println("2. Hoteles del mas caro al mas barato");
            System.out.println("3. Todos los campings con restaurante");
            System.out.println("4. Todas las residencias con descuento");
            System.out.println("5. Salir");
            opcion = read.nextInt();
            switch (opcion){
                case 1:
                    mostrarAlojamientos();
                    break;
                case 2:
                    mostrarHotelPorPrecio();
                    break;
                case 3:
                    campingsConRestaurante();
                    break;
                case 4:
                    residenciasConDescuento();
                    break;
                case 5:
                    break;

            }


        }while(opcion!=0);
    }


}
