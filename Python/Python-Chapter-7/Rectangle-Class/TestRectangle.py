from Rectangle import Rectangle

def main():
    rectangle1 = Rectangle(4, 40)
    rectangle2 = Rectangle(3.5, 35.7)
    print(f"Rectangle 1: Width = {rectangle1.getWidth()},", \
        f"Height = {rectangle1.getHeight()}, Area = {rectangle1.getArea()}, " \
        f"Perimeter = {rectangle1.getPerimeter()}")
    print(f"Rectangle 2: Width = {rectangle2.getWidth()}, " \
        f"Height = {rectangle2.getHeight()}, Area = {round(rectangle2.getArea(), 2)}," \
        f"Perimeter = {rectangle2.getPerimeter()}")
    
main() 