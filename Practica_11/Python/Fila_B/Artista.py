class Artista:
    def __init__(self, nombre, ci, anios_experiencia):
        self.nombre = nombre
        self.ci = ci
        self.anios_experiencia = anios_experiencia

    def mostrar(self):
        print("ARTISTA")
        print("Nombre:", self.nombre)
        print("C.I.:", self.ci)
        print("Años Experiencia:", self.anios_experiencia)

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_ci(self):
        return self.ci

    def set_ci(self, ci):
        self.ci = ci

    def get_anios_experiencia(self):
        return self.anios_experiencia

    def set_anios_experiencia(self, anios):
        self.anios_experiencia = anios