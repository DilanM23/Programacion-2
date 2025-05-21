from Anuncio import Anuncio
from Artista import Artista
from Pintura import Pintura

if __name__ == "__main__":
    # Crear artistas y anuncios
    a1 = Artista("Franco", 2468, 4)
    a2 = Artista("Jael", 1357, 6)
    a3 = Artista("Jesika", 7531, 3)
    a4 = Artista("Emanuel", 8642, 8)
    an1 = Anuncio(1, 2400)
    an2 = Anuncio(1, 1500)
    # Crear pinturas
    p1 = Pintura("Monalisa", "Oleo", a1, a2, an1, "Contemporaneo")
    p2 = Pintura("Titanic", "Tela", a3, a4, an2, "Paisaje")
    # Mostrar información
    p1.mostrar()
    p2.mostrar()
    # Inciso B
    print("\tINCISO B")
    p1.calcular_promedio_anios_experiencia()
    # Inciso C
    print("\tINCISO C")
    p2.incrementar_precio_por_artista(10, "Jesika")