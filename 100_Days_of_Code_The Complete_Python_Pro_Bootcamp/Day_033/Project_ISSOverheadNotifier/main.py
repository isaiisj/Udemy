import time
import requests
from datetime import datetime
from config import my_email,my_password
import smtplib

MY_LAT = 19.646078 # Your latitude
MY_LONG = -99.211523 # Your longitude


#Your position is within +5 or -5 degrees of the ISS position.
def is_iss_overhead():
    """
    Checks if the iss position is +5 and -5 degrees from your latitude and longitude
    :return boolean:
    """
    response = requests.get(url="http://api.open-notify.org/iss-now.json")
    response.raise_for_status()
    data = response.json()

    iss_latitude = float(data["iss_position"]["latitude"])
    iss_longitude = float(data["iss_position"]["longitude"])

    return MY_LAT-5 <= iss_latitude <= MY_LAT+5 and MY_LONG-5 <= iss_longitude <= MY_LONG+5


parameters = {
    "lat": MY_LAT,
    "lng": MY_LONG,
    "formatted": 0,
    "tzid": "America/Mexico_City"
}

def is_night():
    """
    Checks if time at your zone is before sunrise or after sunset as
    iss is visible at night and much better exactly at sunrise or sunset
    :return boolean:
    """
    response = requests.get("https://api.sunrise-sunset.org/json", params=parameters)
    response.raise_for_status()
    data = response.json()
    sunrise = int(data["results"]["sunrise"].split("T")[1].split(":")[0])
    sunset = int(data["results"]["sunset"].split("T")[1].split(":")[0])

    time_now = int(str(datetime.now()).split(":")[0].split(" ")[1])

    return time_now >= sunset or time_now <= sunrise

#If the ISS is close to my current position
# and it is currently dark
# Then send me an email to tell me to look up.
# BONUS: run the code every 60 seconds.

#print(sunrise, sunset, time_now)
#print(MY_LAT,MY_LONG,iss_latitude,iss_longitude)
#print(MY_LAT+5,MY_LAT,MY_LAT-5)
#print(MY_LONG+5,MY_LONG,MY_LONG-5)


while True:

    if is_night() and is_iss_overhead():
        with smtplib.SMTP("smtp.gmail.com",port=587) as connection:
            connection.starttls()
            connection.login(my_email,my_password)
            connection.sendmail(
                from_addr=my_email,
                to_addrs=my_email,
                msg="Subject:ISS Over your house\n\nThe ISS is passing over your house :D"
            )
        print("Mail sent sent.")
    else:
        print("Waiting...")

    time.sleep(60)
