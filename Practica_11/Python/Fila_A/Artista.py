class Artista:
    def __init__(self, nombrex, cix, añosExperienciax):
        self.nombre = nombrex
        self.ci = cix
        self.añosExperiencia = añosExperienciax

    def mostrar(self):
        print("ARTISTA")
        print("Nombre:", self.nombre)
        print("C.I.:", self.ci)
        print("Años Experiencia:", self.añosExperiencia)

    def getNombre(self):
        return self.nombre

    def setNombre(self, nombre):
        self.nombre = nombre

    def getCi(self):
        return self.ci

    def setCi(self, ci):
        self.ci = ci

    def getAñosExperiencia(self):
        return self.añosExperiencia

    def setAñosExperiencia(self, añosExperiencia):
        self.añosExperiencia = añosExperiencia
