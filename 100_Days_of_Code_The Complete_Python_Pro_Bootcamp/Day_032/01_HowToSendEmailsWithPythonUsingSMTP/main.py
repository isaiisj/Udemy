import smtplib

# Your email here
my_email = "xxxx@gmail.com"

#Your app password created in gmail
password = "xxxx xxxx xxxx xxxx"

# establish connection with the smtp server
#connection = smtplib.SMTP("smtp.gmail.com", port=587)

# enable encryption to make the connection secure
#connection.starttls()

# login to the email using app password
#connection.login(user=my_email,password=password)

# sender and recipient
#connection.sendmail(
#    from_addr=my_email,
#    to_addrs=my_email,
#    msg="Subject:Hello\n\nThis is the body of my email"
#)

# it is necessary if we don't use with ... as ...
#connection.close()


# with ... as ...
with smtplib.SMTP("smtp.gmail.com", port=587) as connection:

    # enable encryption to make the connection secure
    connection.starttls()

    # login to the email using app password
    connection.login(user=my_email,password=password)

    # sender and recipient
    connection.sendmail(
        from_addr=my_email,
        to_addrs=my_email,
        msg="Subject:Hello\n\nThis is the body of my email"
    )
  
