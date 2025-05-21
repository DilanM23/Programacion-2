from Obra import Obra
class Pintura(Obra):
    def __init__(self, titulo, material, a1, a2, anuncio, genero):
        super().__init__(titulo, material, a1, a2, anuncio)
        self.genero = genero

    def mostrar(self):
        super().mostrar()
        print("PINTURA")
        print("Genero:", self.genero)

    def calcular_promedio_anios_experiencia(self):
        print("PROMEDIO DE AÑOS DE EXPERIENCIA DE LOS ARTISTAS")
        a = self.a1
        b = self.a2
        promedio = (a.get_anios_experiencia() + b.get_anios_experiencia()) / 2
        print("Promedio:", promedio)

    def incrementar_precio_por_artista(self, incremento, nombre_artista):
        print("INCREMENTAMOS EL PRECIO EN X A LA PINTURA DEL ARTISTA CON NOMBRE X")

        if (self.a1.get_nombre().lower() == nombre_artista.lower() or
                self.a2.get_nombre().lower() == nombre_artista.lower()):
            nuevo_precio = self.anuncio.get_precio() + incremento
            self.anuncio.set_precio(nuevo_precio)
            print("Precio Incrementado:", self.anuncio.get_precio())
        else:
            print("No se encontro al artista con nombre:", nombre_artista)