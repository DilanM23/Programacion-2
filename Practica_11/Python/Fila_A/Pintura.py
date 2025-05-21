from Obra import Obra

class Pintura(Obra):
    def __init__(self, titulox, materialx, a1x, a2x, bx, generox):
        super().__init__(titulox, materialx, a1x, a2x, bx)
        self.genero = generox

    def mostrar(self):
        super().mostrar()
        print("PINTURA")
        print("Genero:", self.genero)

    # b) Mostrar el nombre del artista con más años de experiencia
    def mostrar_nombre_artista_mas_experiencia(self):
        print("<ARTISTA CON MÁS EXPERIENCIA>")
        a = self.a1
        b = self.a2
        if a.añosExperiencia > b.añosExperiencia:
            print("Artista con más experiencia:", a.nombre)
        else:
            print("Artista con más experiencia:", b.nombre)
        print()
    
    