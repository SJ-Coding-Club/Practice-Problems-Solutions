import math

class QuadraticEquation:
    def __init__(self, a, b, c):
        self.__a = a
        self.__b = b
        self.__c = c
    
    def getA(self):
        return self.__a
    
    def getB(self):
        return self.__b

    def getC(self):
        return self.__c

    def getDiscriminant(self):
        return math.pow(self.getB(), 2) - 4 * self.getA() * self.getC()

    def getRoot1(self):
        if self.getDiscriminant() < 0:
            return 0
        return (-1 * self.getB() + math.sqrt(self.getDiscriminant())) / (2 * self.getA())

    def getRoot2(self):
        if self.getDiscriminant() < 0:
            return 0
        return (-1 * self.getB() - math.sqrt(self.getDiscriminant())) / (2 * self.getA())
    