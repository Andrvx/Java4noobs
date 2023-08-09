package servicio;
import entidades.Habitacion;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class servicioHabitacion {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    ArrayList<Habitacion> listaHabitaciones=new ArrayList<>();

    servicioPersona servicioPersona=new servicioPersona();
    servicioReserva servicioReserva=new servicioReserva();

    servicioAlojamiento servicioAlojamiento=new servicioAlojamiento();

    public void setListaHabitaciones() {
        Date fechaNula=new Date();
        Habitacion habitacion1=new Habitacion(1,fechaNula);
        Habitacion habitacion2=new Habitacion(2,fechaNula);
        Habitacion habitacion3=new Habitacion(3,fechaNula);
        Habitacion habitacion4=new Habitacion(4,fechaNula);
        Habitacion habitacion5=new Habitacion(5,fechaNula);
        Habitacion habitacion6=new Habitacion(6,fechaNula);
        Habitacion habitacion7=new Habitacion(7,fechaNula);
        Habitacion habitacion8=new Habitacion(8,fechaNula);
        Habitacion habitacion9=new Habitacion(9,fechaNula);
        Habitacion habitacion10=new Habitacion(10,fechaNula);
        this.listaHabitaciones.add(habitacion1);
        this.listaHabitaciones.add(habitacion2);
        this.listaHabitaciones.add(habitacion3);
        this.listaHabitaciones.add(habitacion4);
        this.listaHabitaciones.add(habitacion5);
        this.listaHabitaciones.add(habitacion6);
        this.listaHabitaciones.add(habitacion7);
        this.listaHabitaciones.add(habitacion8);
        this.listaHabitaciones.add(habitacion9);
        this.listaHabitaciones.add(habitacion10);
    }
    public void asignarHabitacion(){
        System.out.println("--- Asignar Habitación ---");
        System.out.println("Cuántas personas se alojan?");
        int auxCant= leer.nextInt();
        Date fechaNula=new Date();

        switch (auxCant){
            case 2:
                Iterator<Habitacion> buscadorIt= listaHabitaciones.iterator();

                while (buscadorIt.hasNext()){
                    if ((buscadorIt.next().getNumeroHabitacion()==1||buscadorIt.next().getNumeroHabitacion()==2||buscadorIt.next().getNumeroHabitacion()==3||
                            buscadorIt.next().getNumeroHabitacion()==4||buscadorIt.next().getNumeroHabitacion()==5)){ if (buscadorIt.next().getFechaDeOcupacion().compareTo(fechaNula)==0){

                        servicioPersona.crearPersona();
                        servicioPersona.crearPersona();
                        System.out.println("La habitación asignada es la "+buscadorIt.next().getNumeroHabitacion());
                        ocuparHabitacion();
                        servicioAlojamiento.altaAlojamiento(buscadorIt.next().getNumeroHabitacion());
                    }
                    }
                }
                break;
            case 1:
                Iterator<Habitacion> buscadorIt2= listaHabitaciones.iterator();

                while (buscadorIt2.hasNext()){
                    if ((buscadorIt2.next().getNumeroHabitacion()==9||buscadorIt2.next().getNumeroHabitacion()==10)){ if (buscadorIt2.next().getFechaDeOcupacion().compareTo(fechaNula)==0){

                        servicioPersona.crearPersona();
                        System.out.println("La habitación asignada es la "+buscadorIt2.next().getNumeroHabitacion());
                        ocuparHabitacion();
                        servicioAlojamiento.altaAlojamiento(buscadorIt2.next().getNumeroHabitacion());
                    }
                    }
                }
                break;
            case 3:
                Iterator<Habitacion> buscadorIt3= listaHabitaciones.iterator();

                while (buscadorIt3.hasNext()){
                    if ((buscadorIt3.next().getNumeroHabitacion()==6||buscadorIt3.next().getNumeroHabitacion()==7||buscadorIt3.next().getNumeroHabitacion()==8
                    )){ if (buscadorIt3.next().getFechaDeOcupacion().compareTo(fechaNula)==0){

                        servicioPersona.crearPersona();
                        servicioPersona.crearPersona();
                        servicioPersona.crearPersona();
                        System.out.println("La habitación asignada es la "+buscadorIt3.next().getNumeroHabitacion());
                        ocuparHabitacion();
                        servicioAlojamiento.altaAlojamiento(buscadorIt3.next().getNumeroHabitacion());
                    }
                    }
                }
                break;
            default:
                System.out.println("No hay avitaciones disponibles, pero en la plaza están lindos los bancos.");
        }
    }
    public void ocuparHabitacion(){
        System.out.println("*** Ocupar Habitación ***");
        System.out.println("Ingrese el número de habitación");
        int auxNum= leer.nextInt();
        System.out.println("Ingrese el días de ocupación");
        int auxDia= leer.nextInt();
        System.out.println("Ingrese el mes");
        int auxMes=leer.nextInt();
        System.out.println("Ingrese el año");
        int auxanio= leer.nextInt();

        Date auxFecha=new Date(auxMes,auxDia,auxanio);

        Iterator<Habitacion> buscadorIt= listaHabitaciones.iterator();

        while (buscadorIt.hasNext()){
            if (buscadorIt.next().getNumeroHabitacion()==auxNum){
                buscadorIt.next().setFechaDeOcupacion(auxFecha);
            }
        }
        System.out.println("*** Habitación Ocupada ***");
    }

    public void desocuparHabitacion(){
        System.out.println("*** Desocupar Habitación ***");
        System.out.println("Ingrese el número de habitación");
        int auxNum= leer.nextInt();

        Date fechaNula=new Date();

        Iterator<Habitacion> buscadorIt= listaHabitaciones.iterator();

        while (buscadorIt.hasNext()){
            if (buscadorIt.next().getNumeroHabitacion()==auxNum){
                buscadorIt.next().setFechaDeOcupacion(fechaNula);
            }
        }
        System.out.println("*** Habitación Desocupada ***");
    }

    public void mostrarHabitaciones(){
        System.out.println("*** Lista de habitaciones ***");
        for (Habitacion habitacion: listaHabitaciones){
            habitacion.toString();
        }
    }
}
