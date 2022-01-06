inputlist=input("Enter the elements in the list seperated by comma")
list=inputlist.split(",")
sum=0
for num in list:
    sum=sum+int(num)
print("Sum of list elements are",sum)
