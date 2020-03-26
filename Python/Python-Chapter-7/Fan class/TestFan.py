from Fan import Fan

def main():
    fan1 = Fan(Fan.FAST, True, 10, "yellow")
    fan2 = Fan(Fan.MEDIUM, False, 5, "blue")
    print(f"For fan1: Speed = {fan1.getSpeed()}, Radius = {fan1.getRadius()}"\
        f", Color: {fan1.getColor()}, On = {fan1.getOn()}")
    print(f"For fan1: Speed = {fan2.getSpeed()}, Radius = {fan2.getRadius()}"\
        f", Color: {fan2.getColor()}, On = {fan2.getOn()}")
    
main()