
package Servicio;

import Entidad.Auto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ServicioAuto {
    private Scanner leer = new Scanner(System.in);
    private Auto auto = new Auto();

    // Método para mostrar un menú de opciones y gestionar la interacción con el usuario
    public void ejecutarMenu() {
        int opcion;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Cargar ficha del auto");
            System.out.println("2. Modificar titularidad del vehículo");
            System.out.println("3. Indicar trayecto recorrido");
            System.out.println("4. Verificar si es necesario realizar un service");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1 -> cargarFichaAuto();
                case 2 -> modificarTitularidad();
                case 3 -> indicarTrayectoRecorrido();
                case 4 -> verificarService();
                case 5 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida. Por favor, elija una opción válida."); // El bucle se repite hasta que se elija la opción 5 (Salir).
            }
        } while (opcion != 5);
    }

    public void cargarFichaAuto() {
        System.out.print("Ingrese el nombre del dueño: ");
        String nombreDueño = leer.nextLine();
        System.out.print("Ingrese la fecha de vencimiento del carnet (dd/MM/yyyy): ");
        String fechaStr = leer.nextLine();
        System.out.print("Ingrese el color del vehículo: ");
        String colorVehiculo = leer.nextLine();
        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo = leer.nextLine();
        System.out.print("Ingrese los kilómetros en el motor: ");
        int kmMotor = leer.nextInt();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Se crea un objeto SimpleDateFormat llamado 'sdf' con el formato "dd/MM/yyyy"
        try {
            Date fechaVencimientoCarnet = sdf.parse(fechaStr); // Analiza la cadena de fecha ingresada por el usuario
            auto.setNombreDueño(nombreDueño);
            auto.setFechaVencimientoCarnet(fechaVencimientoCarnet);
            auto.setColorVehiculo(colorVehiculo);
            auto.setModelo(modelo);
            auto.setKmMotor(kmMotor);
            System.out.println("Ficha del auto cargada con éxito.");
        } catch (ParseException e) {
            // Captura una excepción si la fecha no cumple con el formato esperado
            System.out.println("Error al ingresar la fecha. Formato dd/MM/yyyy requerido.");
        }
    }

    // Método para modificar la titularidad del vehículo
    public void modificarTitularidad() {
        System.out.print("Ingrese el nuevo titular del vehículo: ");
        String nuevoTitular = leer.nextLine();
        auto.setNombreDueño(nuevoTitular);
        System.out.println("Titularidad modificada con éxito.");
    }

    // Método para registrar el trayecto recorrido
    public void indicarTrayectoRecorrido() {
        System.out.print("Ingrese la distancia recorrida en kilómetros: ");
        int distancia = leer.nextInt();
        auto.setKmMotor(auto.getKmMotor() + distancia);
        System.out.println("Trayecto recorrido registrado con éxito.");
    }

    // Método para verificar si es necesario realizar un service
    public void verificarService() {
        if (auto.getKmMotor() >= 10000) {
            System.out.println("Es necesario realizar un service al vehículo.");
        } else {
            System.out.println("No es necesario realizar un service al vehículo.");
        }
    }
}
