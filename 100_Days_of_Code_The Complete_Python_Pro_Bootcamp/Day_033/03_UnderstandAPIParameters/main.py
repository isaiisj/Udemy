import requests
from datetime import datetime

MY_LAT = 19.646078
MY_LONG = -99.211523

# For this API we need required parameters to make it work
# parameters names must match the names in the documentation
parameters = {
    "lat": MY_LAT,
    "lng": MY_LONG,
    "formatted": 0,
    "tzid": "America/Mexico_City"
}

# we can pass parameters in dictionary form
response = requests.get("https://api.sunrise-sunset.org/json",params=parameters)
response.raise_for_status()

data = response.json()
sunrise = data["results"]["sunrise"].split("T")[1].split(":")[0]
sunset = data["results"]["sunset"].split("T")[1].split(":")[0]

print(sunrise)
print(sunset)

time_now = datetime.now()

print(time_now.hour)


# sunrise and sunset API: https://sunrise-sunset.org/api
# Challenge 1: Modify the API call to turn off the formatting time
