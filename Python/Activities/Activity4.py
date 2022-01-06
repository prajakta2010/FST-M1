user1=input("Enter the first player name ")
user2=input("Enter the second player name")
play="yes"
while play=="yes":
    user1_choice=input(user1+""+"Do you want rock or paper or scissor?").lower()
    user2_choice=input(user2+""+"Do you want rock or paper or scissor?").lower()
    print(user1_choice)
    print(user2_choice)
    if user1_choice==user2_choice:
        print("Match Tie")
    elif user1_choice=="rock":
        if user2_choice=="scissor":
            print("rock wins")
        else:
            print("paper wins")
    elif user1_choice=="scissor":
        if user2_choice=="rock":
            print("rock wins")
        else:
            print("scissor wins")
    elif user1_choice=="paper":
        if user2_choice=="scissor":
            print("scissor win")
        else:
            print("paper wins")
    else:
        print("Invalid option")
    play=input("Do you want to play another around? YES or NO").lower()
    if play=="yes":
        continue
    else:
        print("Game is finish")

    
