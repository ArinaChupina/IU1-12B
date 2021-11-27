print("Стороны треугольника")
a=float(input("a="))
b=float(input("b="))
c=float(input("c="))
if a+b>c and a+c>b and b+c>a and (a>0) and (b>0) and (c>0):
    print("Треугольник существует")
    if (a**2+b**2==c**2) or (a**2+c**2==b**2) or (b**2+c**2==a**2):
        print ("Треугольник прямоугольный")
    elif a**2+b**2>c**2 or a**2+c**2>b**2 or b**2+c**2>a**2:
        print("Треугольник остроугольный")
    elif a**2+b**2<c**2 or a**2+c**2<b*2 or b**2+c**2<a**2:
        print("Треугольник тупоугольный")  
    if (a!=b and a!=c) or (b!=a and b!=c)or(c!=a and c!=b):
        print("Треугольник разносторонний")
    elif a==b and a==c and b==c:
        print("Треугольник равносторонний")    
    else:
        print("Треугольник равнобедренный")
else:
    print("Треугольник не существует")