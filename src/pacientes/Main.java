package pacientes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaPacientes lista = new ListaPacientes();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("Por favor seleccione una de las opciones");
            System.out.println("");
            System.out.println("1. mostrar paciente");
            System.out.println("2. agregar paciente");
            System.out.println("3. Buscar al paciente registrado por numero ID");
            System.out.println("4. Eliminar paciente ");
            System.out.println("5. Salir del programa");

            int opcion;
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Usted selecciono una opcion invaida intente nuevamente");
                continue;
            }

            if (opcion == 1) {
                lista.mostrarPacientes();
            } else if (opcion == 2) {
                System.out.println("Ingrese el nombre del paciente: ");
                String nombre = sc.nextLine();

                System.out.println("Ingrese la ID del paciente");
                int id;
                try {
                    id = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Por favor ingrese solo caracteres numericos");
                    continue;
                }

                System.out.println("Por favor ingrese la edad del paciente");
                int edad;
                try {
                    edad = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Por favor ingrese solo caracteres numericos");
                    continue;

                }


                System.out.println("Por favor ingrese la clinica del paciente");
                String clinica =  sc.nextLine();

                lista.agregarPaciente(new Paciente(nombre, id, edad, clinica));
                System.out.println("El paciente se agrego de manera exitosa");

            } else if (opcion == 3 ) {
                System.out.println("Por favor ingrese la ID del paciente que desea buscar");
                int id;
                try {
                    id = Integer.parseInt(sc.nextLine());

                } catch (NumberFormatException e) {
                    System.out.println("Por favor ingrese una ID valida");
                    continue;
                }

                Paciente p = lista.buscarPaciente(id);
                if (p != null) {
                    System.out.println("El paciente es:");
                    System.out.println("ID: " + p.getId());
                    System.out.println("Nombre: " + p.getNombre());
                    System.out.println("Edad: " + p.getEdad());
                    System.out.println("Clincia: " + p.getClinicaDondeRecibeAtencion());
                }else {
                    System.out.println("El paciente no fue encontrado verifique los datos ingresados");

                }

            } else if (opcion == 4)  {
                System.out.println("Por favor ingrese la ID del paciente que desea eliminar");
                int id;
                try {
                    id = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Ingrese un ID valido ");
                    continue;

                }
                if (lista.eliminarPaciente(id)) {
                    System.out.println("EL paciente fue eliminado correctamente de la base de datos");

                }else {
                    System.out.println("La ID ingresada no pertenece a ningun paciente registrado");
                    System.out.println("Intente nuevamente");

                }

            }else if (opcion == 5) {
                System.out.println("usted ha finalizado el programa ");
                break;

            }else {
                System.out.println("Opcion invalida ingrese una opcion valida");
                continue;
            }




        }





    }

}


