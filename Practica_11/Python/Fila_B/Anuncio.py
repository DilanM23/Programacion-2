class Anuncio:
    def __init__(self, numero, precio):
        self.numero = numero
        self.precio = precio

    def mostrar(self):
        print("ANUNCIO")
        print("Nro.:", self.numero)
        print("Precio:", self.precio)

    def get_numero(self):
        return self.numero

    def set_numero(self, numero):
        self.numero = numero

    def get_precio(self):
        return self.precio

    def set_precio(self, precio):
        self.precio = precio