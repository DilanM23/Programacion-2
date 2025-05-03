package Fila_A;

public class LineaTeleferico {
	private String color;
	private String tramo;
	private int nroCabinas;
	private int nroEmpleados;
	private String [][]empleados= new String[100][3];
	private int []edades =new int [100];
	private double []sueldos= new double[100];
	//Constructor
	public LineaTeleferico(String color, String tramo, int nroCabinas) {
        this.color = color;
        this.tramo = tramo;
        this.nroCabinas = nroCabinas;
        this.nroEmpleados = 0;
    }
    public void agregarEmpleado(String nombre, String paterno, String materno, int edad, double sueldo) {
        empleados[nroEmpleados][0] = nombre;
        empleados[nroEmpleados][1] = paterno;
        empleados[nroEmpleados][2] = materno;
        edades[nroEmpleados] = edad;
        sueldos[nroEmpleados] = sueldo;
        nroEmpleados++;
    }
	public void mostrar() {
		System.out.println("<TELEFERICO>");
        System.out.println("Color: " + color);
        System.out.println("Tramo: " + tramo);
        System.out.println("Nro de Cabinas: " + nroCabinas);
        System.out.println("Empleados: " + nroEmpleados);
        for (int i = 0; i < nroEmpleados; i++) {
            System.out.println("  " + empleados[i][0] + " " + empleados[i][1] + " " + empleados[i][2]
                               + ", Edad: " + edades[i] + ", Sueldo: " + sueldos[i]);
        }
        System.out.println();
    }
	// (b) Eliminar empleados con apellido X
    public void eliminarEmpleadoPorApellido(String apellido) {
        for (int i = 0; i < nroEmpleados; i++) {
            if (empleados[i][1].equals(apellido) || empleados[i][2].equals(apellido)) {
                for (int j = i; j < nroEmpleados - 1; j++) {
                    empleados[j] = empleados[j + 1];
                    edades[j] = edades[j + 1];
                    sueldos[j] = sueldos[j + 1];
                }
                nroEmpleados--;
                i--;
            }
        }
    }
    // (c) Transfiere empleado
    public void transferirEmpleado(int posicion, LineaTeleferico destino) {
        destino.agregarEmpleado(
            empleados[posicion][0],
            empleados[posicion][1],
            empleados[posicion][2],
            edades[posicion],
            sueldos[posicion]
        );
        eliminarEmpleado(posicion);
    }
    public void eliminarEmpleado(int index) {
        for (int j = index; j < nroEmpleados - 1; j++) {
            empleados[j] = empleados[j + 1];
            edades[j] = edades[j + 1];
            sueldos[j] = sueldos[j + 1];
        }
        nroEmpleados--;
    }
    // (d1) Mostrar empleado con mayor edad
    public void mostrarMayorEdad() {
        if (nroEmpleados == 0) {
            System.out.println("No hay empleados.");
            return;
        }
        int max = edades[0];
        int idx = 0;
        for (int i = 1; i < nroEmpleados; i++) {
            if (edades[i] > max) {
                max = edades[i];
                idx = i;
            }
        }
        System.out.println("Mayor edad: " + empleados[idx][0] + " " + empleados[idx][1] + " " + empleados[idx][2] +" - Edad: " + edades[idx]);
    }
    // (d2) Mostrar empleado con mayor sueldo
    public void mostrarMayorSueldo() {
        if (nroEmpleados == 0) {
            System.out.println("No hay empleados.");
            return;
        }
        double max = sueldos[0];
        int idx = 0;
        for (int i = 1; i < nroEmpleados; i++) {
            if (sueldos[i] > max) {
                max = sueldos[i];
                idx = i;
            }
        }
        System.out.println("Mayor sueldo: " + empleados[idx][0] + " " + empleados[idx][1] + " " + empleados[idx][2] + " - Sueldo: " + sueldos[idx]);
    }
}