from RegularPolygon import RegularPolygon

def main():
    triangle = RegularPolygon()
    print(f"Triangle: Area = {round(triangle.getArea(), 3)}," \
        f" Perimeter = {triangle.getPerimeter()}") 
    hexagon = RegularPolygon(6, 4)
    print(f"Hexagon: Area = {round(hexagon.getArea(), 3)}," \
        f" Perimeter = {hexagon.getPerimeter()}") 
    decagon = RegularPolygon(10, 4, 5.6, 7.8)
    print(f"Decagon: Area = {round(decagon.getArea(), 3)}," \
        f" Perimeter = {decagon.getPerimeter()}") 
    
main()