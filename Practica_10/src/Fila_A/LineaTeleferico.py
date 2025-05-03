class LineaTeleferico:
    def __init__(self, color, tramo, nro_cabinas):
        self.color = color
        self.tramo = tramo
        self.nro_cabinas = nro_cabinas
        self.nro_empleados = 0
        self.empleados = []

    def agregar_empleado(self, nombre, paterno, materno, edad, sueldo):
        self.empleados.append({
            "nombre": nombre,
            "paterno": paterno,
            "materno": materno,
            "edad": edad,
            "sueldo": sueldo
        })
        self.nro_empleados += 1

    def mostrar(self):
        print("<TELEFERICO>")
        print("Color:", self.color)
        print("Tramo:", self.tramo)
        print("Nro de Cabinas:", self.nro_cabinas)
        print("Empleados:", self.nro_empleados)
        for i, emp in enumerate(self.empleados):
            print(f"  {i+1}. {emp['nombre']} {emp['paterno']} {emp['materno']}, Edad: {emp['edad']}, Sueldo: {emp['sueldo']}")
        print()

    def eliminar_empleado_por_apellido(self, apellido):
        nuevos = []
        for emp in self.empleados:
            if emp["paterno"] != apellido and emp["materno"] != apellido:
                nuevos.append(emp)
        self.empleados = nuevos
        self.nro_empleados = len(self.empleados)

    def transferir_empleado(self, posicion, destino):
        if 0 <= posicion < self.nro_empleados:
            destino.agregar_empleado(**self.empleados[posicion])
            self.eliminar_empleado(posicion)

    def eliminar_empleado(self, index):
        if 0 <= index < self.nro_empleados:
            self.empleados.pop(index)
            self.nro_empleados -= 1

    def mostrar_mayor_edad(self):
        if self.nro_empleados == 0:
            print("No hay empleados.")
            return
        mayor = max(self.empleados, key=lambda emp: emp["edad"])
        print(f"Mayor edad: {mayor['nombre']} {mayor['paterno']} {mayor['materno']} - Edad: {mayor['edad']}")

    def mostrar_mayor_sueldo(self):
        if self.nro_empleados == 0:
            print("No hay empleados.")
            return
        mayor = max(self.empleados, key=lambda emp: emp["sueldo"])
        print(f"Mayor sueldo: {mayor['nombre']} {mayor['paterno']} {mayor['materno']} - Sueldo: {mayor['sueldo']}")
