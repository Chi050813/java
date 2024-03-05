import time
shipName = "Sunrise"
captain = "Mr.Chen"
location = "Earth"
password = "beijingcorn"

pAttempt = input("Enter the password: ")
while pAttempt != password:
    print("Password incorrect")
    pAttempt = input("Enter the password: ")
print("Password correct. Welcome to the" + shipName)

print("")
print("The spaceship " + shipName + " is currently visiting " + location + ".")

choice = ""
while choice != "/exit":
    print("What would you like to do, " + captain + "?")
    print("")
    print("a. Radar detection.")
    print("b. launch missiles")
    print("c. Urgent report")
    print("d. Auto cruise")
    print("/exit to exit")
    print("")
    choice = input("Enter your choice: ")
    if choice == "a":
        time.sleep(2)
        print("Radar start detection.")
    elif choice == "b":
        print("3")
        time.sleep(1)
        print("2")
        time.sleep(1)
        print("1")
        time.sleep(1)
        print("Successful hit！")
    elif choice == "c":
        print("Notice！！！\n" + "our will be break after 30 seconds , please evacuate in order.")
        time.sleep(3)
        print("Notice！！！\n" + "our will be break after 30 seconds , please evacuate in order.")
        time.sleep(3)
        print("Notice！！！\n" + "our will be break after 30 seconds , please evacuate in order.")
        time.sleep(1)
    elif choice == "d":
        time.sleep(2)
        print("Auto cruise now successful effect.")
    elif choice == "/exit":
        print("Goodbye")