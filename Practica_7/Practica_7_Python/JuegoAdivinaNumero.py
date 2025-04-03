import random
#Importa la clase JUEGO desde Juego.py
from Juego import Juego

class JuegoAdivinaNumero(Juego): #Se hereda la clase juego
    def __init__(self, numero_de_vidas):
        super().__init__(numero_de_vidas) #Constructor de la clase Padre
    ''''
    def juega(self):
        self.reinicia_partida()
        numero_a_adivinar = random.randint(0, 10)
        print("Adivina un numero entre 0 y 10:")

        while True:
            intento = int(input())

            if intento == numero_a_adivinar:
                print("¡Acertaste!")
                self.actualiza_record()
                break
            else:
                if self.quita_vida():
                    print(f"Incorrecto. {'Es mayor.' if intento < numero_a_adivinar else 'Es menor.'} Intenta de nuevo.")
                else:
                    print(f"Te has quedado sin vidas. El numero era {numero_a_adivinar}")
                    break
    '''
    def valida_numero(self, numero):
        return 0 <= numero <= 10

    def juega(self):
        self.reinicia_partida()
        self.numero_a_adivinar = random.randint(0, 10)
        print("Adivina un número entre 0 y 10:")
        
        while True:
            intento = int(input())
            if not self.valida_numero(intento):
                print("Número fuera de rango. Intente nuevamente.")
                continue
            if intento == self.numero_a_adivinar:
                print("¡Acertaste!")
                self.actualiza_record()
                break
            else:
                if self.quita_vida():
                    print(f"Incorrecto. {'Es mayor' if intento < self.numero_a_adivinar else 'Es menor'}. Intenta de nuevo.")
                else:
                    print(f"Te has quedado sin vidas. El número era {self.numero_a_adivinar}")
                    break

    