import math

class RegularPolygon:
    def __init__(self, n = 3, side = 1, x = 0, y = 0):
        self.__n = n
        self.__side = side
        self.__x = x
        self.__y = y

    def getN(self):
        return self.__n

    def getSide(self):
        return self.__side
    
    def getX(self):
        return self.__x
    
    def geyY(self):
        return self.__y
    
    def setN(self, n):
        self.__n = n
    
    def setSide(self, side):
        self.__side = side
    
    def setX(self, x):
        self.__x = x
    
    def setY(self, y):
        self.__y = y
    
    def getPerimeter(self):
        return self.getN() * self.getSide()
    
    def getArea(self):
        return (self.getN() * pow(self.getSide(), 2)) / (4 * math.tan(math.pi / self.getN()))
        