Fruit_Shop={"apple":20,
            "banana":10,
            "mango":50,
            "watermelon":15}
check=input("Enter the fruit name want to check avaibility").lower()
if check in Fruit_Shop:
    print(check,"is available")
else:
    print(check,"is not available")
