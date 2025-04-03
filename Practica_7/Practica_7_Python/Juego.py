class Juego:
    def __init__(self, numero_de_vidas):
        self.numero_de_vidas = numero_de_vidas
        self.record = 0

    def reinicia_partida(self):
        self.numero_de_vidas = 3

    def actualiza_record(self):
        self.record += 1

    def quita_vida(self):
        self.numero_de_vidas -= 1
        return self.numero_de_vidas > 0
