def my_function(numbers):
    sum=0
    for i in numbers:
        sum=sum+i
    return sum
 
list=[1,2,3,6,4]
print("Sum of array is ",my_function(list))