inputlist=input("Enter the elements in the list seperated by comma")
list=inputlist.split(",")
lenght=len(list)
firstitem=list[0]
lastitem=list[lenght-1]
if firstitem==lastitem:
    print("True")
else:
    print("False")
