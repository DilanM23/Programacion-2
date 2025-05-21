from Anuncio import Anuncio
from Artista import Artista

class Obra:
    def __init__(self, titulox, materialx, a1x, a2x, bx):
        self.titulo = titulox
        self.material = materialx
        self.a1 = Artista("Pablo Picasso", 12345, 20)
        self.a2 = Artista("Claude Monet", 67890, 24)
        self.b = Anuncio(1, 3500)
        self.a1 = a1x
        self.a2 = a2x
        self.b = bx

    def mostrar(self):
        print("OBRA")
        print("Título:", self.titulo)
        print("Material:", self.material)
        self.a1.mostrar()
        self.a2.mostrar()
        if self.b is not None:
            self.b.mostrar()
        else:
            print("Sin anuncio.")
