import requests

response = requests.get(url="http://api.open-notify.org/iss-now.json")

# just the response code
print(response)

# status code
print(response.status_code)


# The following does not tell us too much

# if response.status_code != 200:
#     print("Error")



# This does but it is not the better approach

# if response.status_code == 404:
#     raise Exception("that resource does not exist.")
# elif response.status_code == 401:
#     raise Exception("You are not authorised to access this data.")


# Instead of doing an if for each code
# we can use response module
response.raise_for_status()

# All the json response
data = response.json()
print(data)

# specific data
# iss_position = data["iss_position"]
# print(iss_position)

longitude = data["iss_position"]["longitude"]
# print(longitude)

latitude =  data["iss_position"]["latitude"]

iss_position = (longitude, latitude)
print(iss_position)


# web to type the values and find in the map the location:
# https://www.latlong.net/Show-Latitude-Longitude.html
