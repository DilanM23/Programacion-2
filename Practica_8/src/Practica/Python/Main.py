from D import D

def main():
    d = D(1, 2, 3)

    d.incrementaXYZ()
    d.incrementaXZ()
    d.incrementaYZ()
    #Mostramos
    print(f"x: {d.x}, y: {d.y}, z: {d.z}")

#Ejecucion del Programa
if __name__ == "__main__":
    main()