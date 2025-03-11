from typing import overload
import math
class FiguraGeometrica:
    @overload
    def area(self, radio: float) -> float: ...
    
    @overload
    def area(self, base: float, altura: float) -> float: ...
    
    @overload
    def area(self, base1: float, base2: float, altura: float) -> float: ...
    
    @overload
    def area(self, lado: float, apotema: float) -> float: ...
    
    def area(self, *args) -> float:
        if len(args) == 1:  # Círculo
            return math.pi * args[0] ** 2
        elif len(args) == 2:  # Rectángulo o Triángulo Rectángulo
            return args[0] * args[1] if args[0] != args[1] else (args[0] * args[1]) / 2
        elif len(args) == 3:  # Trapecio
            return ((args[0] + args[1]) * args[2]) / 2
        elif len(args) == 2:  # Pentágono
            return (5 * args[0] * args[1]) / 2
        else:
            raise ValueError("Numero de argumento Incorrecto!")

class Main:
    figura = FiguraGeometrica()
    print("Área del círculo:", figura.area(5))
    print("Área del rectángulo:", figura.area(4, 6))
    print("Área del triángulo rectángulo:", figura.area(4, 4))
    print("Área del trapecio:", figura.area(3, 5, 4))
    print("Área del pentágono:", figura.area(6, 4))
