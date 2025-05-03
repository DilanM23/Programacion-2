package Fila_B;

public class Main {

	public static void main(String[] args) {
		Ministerio m1 = new Ministerio("Min. De Educacion", "Av. Arce");
        m1.agregarEmpleado("Pedro", 35, 2500);
        m1.agregarEmpleado("Lucy", 26, 2700);
        m1.agregarEmpleado("Ana", 29, 2500);        
        Ministerio m2 = new Ministerio("Min. Defensa", "Av. Camacho");
        m2.agregarEmpleado("Luis", 26, 2300);
        m1.mostrar(); 
        m2.mostrar();
        //Eliminamos Empleados con edad X
        System.out.println("<ELIMINAMOS EMPLEADOS CON EDAD X>");
        m1.eliminarEmpleadoEdad(26);
        m1.mostrar();
        //Transferir empleado X
        System.out.println("<TRANSFERIR EMPLEADO X>");
        m1.transferirEmpleadoDesde(m2, "Luis");
        m1.mostrar();
        //Empleado Menor Edad
        System.out.println("<EMPLEADOS MENOR EDAD>");
        m1.mostrarMenorEdad();
        //Empleado Menor Sueldo
        System.out.println("<EMPLEADOS MENOS SUELDO>");
        m1.mostrarMenorSueldo();
     }
}
