a, b, c = eval(input("Enter three integers: a, b, c "))
max = max(a, b, c)
min = min(a, b, c)
if max != a and min != a:
    mid = a
elif max != b and min != b:
    mid = b
elif max != c and min != c:
    mid = c
print(f"{min}, {mid}, {max}")
