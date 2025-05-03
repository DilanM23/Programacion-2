from LineaTeleferico import LineaTeleferico

# Instanciar 2 objetos
rojo = LineaTeleferico("Rojo", "Estación Central - 16 de Julio", 20)
verde = LineaTeleferico("Verde", "Estación Irpavi", 15)

# Agregar empleados
rojo.agregar_empleado("Pedro", "Rojas", "Luna", 35, 2500)
rojo.agregar_empleado("Lucy", "Sosa", "Rios", 43, 3250)
rojo.agregar_empleado("Ana", "Perez", "Flores", 26, 2700)
rojo.agregar_empleado("Saul", "Arce", "Calle", 29, 2500)

# Mostrar objetos
rojo.mostrar()
verde.mostrar()

# Eliminar por el apellido
print("<ELIMINAMOS EMPLEADOS DE APELLIDO X>")
rojo.eliminar_empleado_por_apellido("Rojas")
rojo.mostrar()

# Transferir empleado índice X al teleférico X
print("<TRANSFERIMOS EMPLEADO X A OTRO TELEFERICO>")
rojo.transferir_empleado(0, verde)
rojo.mostrar()
verde.mostrar()

# Mostrar mayor edad y sueldo
print("<EMPLEADOS MAYOR DE EDAD Y SUELDO>")
rojo.mostrar_mayor_edad()
rojo.mostrar_mayor_sueldo()
