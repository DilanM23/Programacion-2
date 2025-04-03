from JuegoAdivinaNumero import JuegoAdivinaNumero

class JuegoAdivinaPar(JuegoAdivinaNumero):
    def valida_numero(self, numero):
        if 0 <= numero <= 10 and numero % 2 == 0:
            return True
        else:
            print("Numero invalido, debe ser un numero PAR entre 0 y 10.")
            return False