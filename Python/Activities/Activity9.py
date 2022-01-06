list1=[1,4,6,8]
list2=[2,3,5,6]
oddlist=[]
evenlist=[]
newlist=[]
print("First List=",list1)
print("Second List=",list2)
for i in list1:
    if i%2!=0:
        oddlist.append(i)
for i in list2:
    if i%2==0:
        evenlist.append(i)
newlist=oddlist+evenlist
print("Result List=",newlist)