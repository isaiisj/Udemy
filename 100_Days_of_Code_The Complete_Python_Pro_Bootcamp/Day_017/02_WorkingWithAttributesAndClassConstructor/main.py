class User:
    # Constructor
    def __init__(self, user_id, username):
        self.id = user_id
        self.username = username
        self.followers = 0

user_1 = User("001","isaiisj")

# Setting an attribute without constructor
# user_1.id = "001"
# user_1.username = "isai"

print(user_1.id)
print(user_1.username)
print(user_1.followers)
