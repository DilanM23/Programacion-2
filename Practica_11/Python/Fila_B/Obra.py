class Obra:
    def __init__(self, titulo, material, a1, a2, anuncio):
        self.titulo = titulo
        self.material = material
        self.a1 = a1
        self.a2 = a2
        self.anuncio = anuncio

    def mostrar(self):
        print("OBRA")
        print("Titulo:", self.titulo)
        print("Material:", self.material)
        self.a1.mostrar()
        self.a2.mostrar()
        self.anuncio.mostrar()