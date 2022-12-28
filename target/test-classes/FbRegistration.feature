@Feature2
Feature: To validate the account creation of fb application

@Sanity
Scenario: To create new account
Given To launch the browser and maximize window
When To launch url of fb application
And To click the create new account button

# One dimensional map data
And To pass firstname in firstname text box
# Key        value
|firstname1|Samuel|
|firstname2|Janani|
|firstname3|Sangeetha|
|firstname4|Peneal|

And To pass secondname in secondname text box

#Two dimensinal map data
And To pass mobile or email in email text box
|password1|password2|password3|
|8765432567|hjfhhj|jyygogv#$|
|9864897898|vyfgff!@|trahfc|
|rghjdj|ughfgijf|tftyfyt|
|gjhh|tnsghgfv|jygxh|

And To create new password in new password text box
Then To close the chrome browser



