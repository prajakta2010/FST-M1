def fibbonacci(number):
    a=0
    b=1
    c=1
    i=1
    while i<=number:
        a=b
        b=c
        c=a+b
        print(a)
        i=i+1
number=int(input("Enter how many Fibonnaci numbers should be generate"))
fibbonacci(number)




    