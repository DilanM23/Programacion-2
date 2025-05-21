from Anuncio import Anuncio
from Artista import Artista
from Pintura import Pintura
class Main:
    @staticmethod
    def main():
        # a) Crear un objeto pintura que tenga un anuncio y otro sin anuncio
        a1 = Artista("Franco", 2468, 4)
        a2 = Artista("Jael", 1357, 6)
        a3 = Artista("Jesika", 7531, 3)
        a4 = Artista("Emanuel", 8642, 8)
        an1 = Anuncio(1, 2400)
        p1 = Pintura("Monalisa", "Oleo", a1, a2, an1, "Contemporaneo")
        p2 = Pintura("Titanic", "Tela", a3, a4, None, "Paisaje")
        # Mostramos los objetos
        p1.mostrar()
        # b) Mostrar el nombre del artista con más años de experiencia
        print("\tINCISO B")
        p1.mostrar_nombre_artista_mas_experiencia()
        p2.mostrar_nombre_artista_mas_experiencia()
        # c) Agregar un anuncio de venta a la pintura sin anuncio
        print("\tINCISO C")
        an2 = Anuncio(2, 1500)
        p2.b = an2
        p2.mostrar()
        # Calcular el monto total de venta
        print("MONTO TOTAL DE VENTA DE LA PINTURA 1 Y PINTURA 2")
        precio_total = 0
        if p1.b is not None:
            precio_total += p1.b.getPrecio()
        if p2.b is not None:
            precio_total += p2.b.getPrecio()
        print("El Precio es:", precio_total)
# Ejecutamos
if __name__ == "__main__":
    Main.main()
