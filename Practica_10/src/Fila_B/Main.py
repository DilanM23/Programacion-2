from Ministerio import Ministerio

if __name__ == "__main__":
    m1 = Ministerio("Min. De Educacion", "Av. Arce")
    m1.agregar_empleado("Pedro", 35, 2500)
    m1.agregar_empleado("Lucy", 26, 2700)
    m1.agregar_empleado("Ana", 29, 2500)

    m2 = Ministerio("Min. Defensa", "Av. Camacho")
    m2.agregar_empleado("Luis", 26, 2300)

    m1.mostrar()
    m2.mostrar()

    print("<ELIMINAMOS EMPLEADOS CON EDAD X>")
    m1.eliminar_empleado_edad(26)
    m1.mostrar()

    print("<TRANSFERIR EMPLEADO X>")
    m1.transferir_empleado_desde(m2, "Luis")
    m1.mostrar()

    print("<EMPLEADOS MENOR EDAD>")
    m1.mostrar_menor_edad()

    print("<EMPLEADOS MENOS SUELDO>")
    m1.mostrar_menor_sueldo()