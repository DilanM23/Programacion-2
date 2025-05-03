package Fila_A;

public class Main {

	public static void main(String[] args) {
		//Instanciamos 2 LineaTeleferico
		LineaTeleferico rojo = new LineaTeleferico("Rojo", "Estación Central - 16 de Julio", 20);
        LineaTeleferico verde = new LineaTeleferico("Verde", "Estación Irpavi", 15);

        rojo.agregarEmpleado("Pedro", "Rojas", "Luna", 35, 2500);
        rojo.agregarEmpleado("Lucy", "Sosa", "Rios", 43, 3250);
        rojo.agregarEmpleado("Ana", "Perez", "Flores", 26, 2700);
        rojo.agregarEmpleado("Saul", "Arce", "Calle", 29, 2500);
		
        rojo.mostrar();
		verde.mostrar();
		
		// (b) Eliminar empleados por apellido
		System.out.println("<ELIMINAMOS EMPLEADOS DE APELLIDO X>");
        rojo.eliminarEmpleadoPorApellido("Rojas");
        rojo.mostrar();

        // (c) Transferir empleado índice 0 a otro objeto
        System.out.println("<TRANSFERIMOS EMPLEADO X A OTRO TELEFERICO>");
        rojo.transferirEmpleado(0, verde);
        rojo.mostrar();
        verde.mostrar();
        
        // (d) Mostrar mayor edad y sueldo
        System.out.println("<EMPLEADOS MAYOR DE EDAD Y SUELDO>");
        rojo.mostrarMayorEdad();
        rojo.mostrarMayorSueldo();
	}
}
