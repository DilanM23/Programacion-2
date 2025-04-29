import tkinter as tk
from tkinter import messagebox
import random

from cuadrado import Cuadrado
from circulo import Circulo
from coloreado import Coloreado

class App:
    def __init__(self, root):
        self.root = root
        self.root.title("Figuras Coloreadas")
        
        self.figuras = []
        self.crear_figuras()

        self.btn_mostrar = tk.Button(root, text="Mostrar Figuras", command=self.mostrar_figuras)
        self.btn_mostrar.pack(pady=10)

        self.text_area = tk.Text(root, width=60, height=20)
        self.text_area.pack()

    def crear_figuras(self):
        colores = ["Rojo", "Verde", "Azul", "Amarillo"]

        for _ in range(5):
            tipo = random.randint(1, 2)
            color = random.choice(colores)

            if tipo == 1:
                lado = random.randint(1, 10)
                figura = Cuadrado(lado, color)
            else:
                radio = random.randint(1, 10)
                figura = Circulo(radio, color)

            self.figuras.append(figura)

    def mostrar_figuras(self):
        self.text_area.delete(1.0, tk.END)

        for figura in self.figuras:
            self.text_area.insert(tk.END, f"\n{str(figura)}\n")
            self.text_area.insert(tk.END, f"Area: {figura.area():.2f}\n")
            self.text_area.insert(tk.END, f"Perimetro: {figura.perimetro():.2f}\n")

            if isinstance(figura, Coloreado):
                self.text_area.insert(tk.END, f"Como colorear: {figura.comoColorear()}\n")
            self.text_area.insert(tk.END, "------------------------\n")

if __name__ == "__main__":
    root = tk.Tk()
    app = App(root)
    root.mainloop()