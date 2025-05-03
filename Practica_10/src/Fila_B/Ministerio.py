class Ministerio:
    def __init__(self, nombre="SinNombre", direccion="SinDireccion"):
        self.nombre = nombre
        self.direccion = direccion
        self.nroEmpleados = 0
        self.empleados = [["" for _ in range(100)] for _ in range(3)] 
        self.edades = [0] * 100
        self.sueldos = [0.0] * 100

    # Agrega empleado
    def agregar_empleado(self, nombre, edad, sueldo):
        self.empleados[0][self.nroEmpleados] = nombre
        self.empleados[1][self.nroEmpleados] = str(edad)
        self.empleados[2][self.nroEmpleados] = str(sueldo)
        self.edades[self.nroEmpleados] = edad
        self.sueldos[self.nroEmpleados] = sueldo
        self.nroEmpleados += 1

    # (b) Eliminar empleados con edad X
    def eliminar_empleado_edad(self, edadX):
        i = 0
        while i < self.nroEmpleados:
            if self.edades[i] == edadX:
                for j in range(i, self.nroEmpleados - 1):
                    self.empleados[0][j] = self.empleados[0][j + 1]
                    self.empleados[1][j] = self.empleados[1][j + 1]
                    self.empleados[2][j] = self.empleados[2][j + 1]
                    self.edades[j] = self.edades[j + 1]
                    self.sueldos[j] = self.sueldos[j + 1]
                self.nroEmpleados -= 1
            else:
                i += 1

    # Metodo auxiliar para eliminar por índice
    def eliminar_por_indice(self, indice):
        for j in range(indice, self.nroEmpleados - 1):
            self.empleados[0][j] = self.empleados[0][j + 1]
            self.empleados[1][j] = self.empleados[1][j + 1]
            self.empleados[2][j] = self.empleados[2][j + 1]
            self.edades[j] = self.edades[j + 1]
            self.sueldos[j] = self.sueldos[j + 1]
        self.nroEmpleados -= 1

    # (c) Transferir empleado desde otro ministerio
    def transferir_empleado_desde(self, otro, nombre_empleado):
        for i in range(otro.nroEmpleados):
            if otro.empleados[0][i] == nombre_empleado:
                edad = otro.edades[i]
                sueldo = otro.sueldos[i]
                self.agregar_empleado(nombre_empleado, edad, sueldo)
                otro.eliminar_por_indice(i)
                break

    # (d.1) Mostrar empleados con menor edad
    def mostrar_menor_edad(self):
        if self.nroEmpleados == 0:
            return
        menor_edad = min(self.edades[:self.nroEmpleados])
        print(f"Empleados con menor edad ({menor_edad} años):")
        for i in range(self.nroEmpleados):
            if self.edades[i] == menor_edad:
                print(f"- {self.empleados[0][i]}")

    # (d.2) Mostrar empleados con menor sueldo
    def mostrar_menor_sueldo(self):
        if self.nroEmpleados == 0:
            return
        menor_sueldo = min(self.sueldos[:self.nroEmpleados])
        print(f"Empleados con menor sueldo ({menor_sueldo} Bs):")
        for i in range(self.nroEmpleados):
            if self.sueldos[i] == menor_sueldo:
                print(f"- {self.empleados[0][i]}")

    # Metodo para mostrar toda la informacion
    def mostrar(self):
        print("<MINISTERIO>")
        print(f"Ministerio: {self.nombre} | Direccion: {self.direccion}")
        print("Empleados:")
        for i in range(self.nroEmpleados):
            print(f" {self.empleados[0][i]} | Edad: {self.edades[i]} | Sueldo: {self.sueldos[i]}")
        print()

