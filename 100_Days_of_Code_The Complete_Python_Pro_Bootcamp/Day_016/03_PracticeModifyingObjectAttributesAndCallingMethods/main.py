from prettytable import PrettyTable

# TODO: Create a PrettyTable object and save it to a variable called Table
table = PrettyTable()
#print(table)

# TODO add two columns with "pokemon name" and "type" using de documentation
# https://code.google.com/archive/p/prettytable/wikis/Tutorial.wiki

table.add_column("Pokemon Name",["Pikachu", "Squirtle", "Charmander"])
table.add_column("Type",["Electric", "Water", "Fire"])

# TODO: Change center align(default) to left align
#print(table.align)
table.align = "l"

print(table)
