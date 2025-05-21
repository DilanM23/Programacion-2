class Anuncio:
    def __init__(self, numerox, preciox):
        self.numero = numerox
        self.precio = preciox

    def mostrar(self):
        print("ANUNCIO")
        print("Nro.:", self.numero)
        print("Precio:", self.precio)

    def getNumero(self):
        return self.numero

    def setNumero(self, numero):
        self.numero = numero

    def getPrecio(self):
        return self.precio

    def setPrecio(self, precio):
        self.precio = precio
