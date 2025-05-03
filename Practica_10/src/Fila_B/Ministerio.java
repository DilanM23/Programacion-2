package Fila_B;

public class Ministerio {
    private String nombre;
    private String direccion;
    private int nroEmpleados;
    private String[][] empleados = new String[3][100];
    private int[] edades = new int[100];
    private double[] sueldos = new double[100];
    // Constructor 1
    public Ministerio(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nroEmpleados = 0;
    }
    //Constructor 2 (por defecto)
    public Ministerio() {
        this("SinNombre", "SinDireccion");
    }
    //Agrega empleado
    public void agregarEmpleado(String nombre, int edad, double sueldo) {
        empleados[0][nroEmpleados] = nombre;
        empleados[1][nroEmpleados] = Integer.toString(edad);
        empleados[2][nroEmpleados] = Double.toString(sueldo);
        edades[nroEmpleados] = edad;
        sueldos[nroEmpleados] = sueldo;
        nroEmpleados++;
    }

    //(b) Eliminar empleados con edad X
    public void eliminarEmpleadoEdad(int edadX) {
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] == edadX) {
                for (int j = i; j < nroEmpleados - 1; j++) {
                    empleados[0][j] = empleados[0][j + 1];
                    empleados[1][j] = empleados[1][j + 1];
                    empleados[2][j] = empleados[2][j + 1];
                    edades[j] = edades[j + 1];
                    sueldos[j] = sueldos[j + 1];
                }
                nroEmpleados--;
                i--;
            }
        }
    }
    //(c) Transferir empleado con nombre X desde otro ministerio
    public void transferirEmpleadoDesde(Ministerio min, String nombreEmpleado) {
        for (int i = 0; i < min.nroEmpleados; i++) {
            if (min.empleados[0][i].equals(nombreEmpleado)) {
                int edad = min.edades[i];
                double sueldo = min.sueldos[i];
                this.agregarEmpleado(nombreEmpleado, edad, sueldo);
                min.eliminarPorIndice(i);
                break;
            }
        }
    }

    //Metodo auxiliar para eliminar por indice
    private void eliminarPorIndice(int indice) {
        for (int j = indice; j < nroEmpleados - 1; j++) {
            empleados[0][j] = empleados[0][j + 1];
            empleados[1][j] = empleados[1][j + 1];
            empleados[2][j] = empleados[2][j + 1];
            edades[j] = edades[j + 1];
            sueldos[j] = sueldos[j + 1];
        }
        nroEmpleados--;
    }

    //(d): Mostrar empleados con la menor edad
    public void mostrarMenorEdad() {
        if (nroEmpleados == 0) return;
        int menorEdad = edades[0];
        for (int i = 1; i < nroEmpleados; i++) {
            if (edades[i] < menorEdad) menorEdad = edades[i];
        }

        System.out.println("Empleados con menor edad (" + menorEdad + " años):");
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] == menorEdad) {
                System.out.println("- " + empleados[0][i]);
            }
        }
    }

    //(d) Mostrar empleados con el menor sueldo
    public void mostrarMenorSueldo() {
        if (nroEmpleados == 0) return;
        double menorSueldo = sueldos[0];
        for (int i = 1; i < nroEmpleados; i++) {
            if (sueldos[i] < menorSueldo) menorSueldo = sueldos[i];
        }

        System.out.println("Empleados con menor sueldo (" + menorSueldo + " Bs):");
        for (int i = 0; i < nroEmpleados; i++) {
            if (sueldos[i] == menorSueldo) {
                System.out.println("- " + empleados[0][i]);
            }
        }
    }

    public void mostrar() {
    	System.out.println("<MINISTERIO>");
        System.out.println("Ministerio: " + nombre + " | Direccion: " + direccion);
        System.out.println("Empleados: ");
        for (int i = 0; i < nroEmpleados; i++) {
            System.out.println(" " + empleados[0][i] + " | Edad: " + edades[i] + " | Sueldo: " + sueldos[i]);
        }
        System.out.println();
    }
}