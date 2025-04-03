from JuegoAdivinaNumero import JuegoAdivinaNumero
from JuegoAdivinaPar import JuegoAdivinaPar
from JuegoAdivinaImpar import JuegoAdivinaImpar

if __name__ == "__main__":
    '''
    juego = JuegoAdivinaNumero(3)
    juego.juega()
    '''
    juego_numero = JuegoAdivinaNumero(3)
    juego_par = JuegoAdivinaPar(3)
    juego_impar = JuegoAdivinaImpar(3)
    print("NUMEROS ENTRE 0-10")
    juego_numero.juega()
    print("NUMEROS PARES ENTRE 0-10")
    juego_par.juega()
    print("NUMEROS IMPARES ENTRE 0-10")
    juego_impar.juega()