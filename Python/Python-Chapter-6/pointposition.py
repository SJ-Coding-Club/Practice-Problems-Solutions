# Return true if point (x2, y2) is on the left side of the
# directed line from (x0, y0) to (x1, y1)
def leftOfTheLine(x0, y0, x1, y1, x2, y2):
    return x2 < (min(x0, x1))

# Return true if point (x2, y2) is on the same
# line from (x0, y0) to (x1, y1)
def onTheSameLine(x0, y0, x1, y1, x2, y2):
    slope = (y1 - y0) / (x1 - x0)
    return y2 == slope * x2 - slope * x0 + y0


# Return true if point (x2, y2) is on the
# line segment from (x0, y0) to (x1, y1)
def onTheLineSegment(x0, y0, x1, y1, x2, y2):
    minx = min(x0, x1) 
    miny = min(y0, y1)
    maxx = max(x0, x1)
    maxy = max(y0, y1)
    return y2 > miny and y2 < maxy and x2 < maxx and x2 > minx
