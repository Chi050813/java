import time
shipName = "After"
captain = "chi"
location = "Earth"
password = "password"

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
    print("a. Travel to another planet")
    print("b. Fire canons")
    print("c. Open the airlock")
    print("d. Self-destruct")
    print("/exit to exit")
    print("")
    choice = input("Enter your choice: ")