inputtuple=input("Enter the elements in the tuple seperated by comma")
split_input=inputtuple.split(",")
user_tuple=tuple(int(x) for x in split_input)
print("Elements are divisible by 5")
for item in user_tuple:
    if item%5==0:
        print(item)
   