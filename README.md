Coverage: 34%
# IMS Project

An INVENTORY MANAGEMENT SYSTEM

To Create, Read, Update and Delete Customers, Items & Orders from the system

## Getting Started

Click here to download a copy of the fatjar file (Our pre-packaged release final version

### Prerequisites

What things you need to install the software and how to install them
You will need Java installed.
Get it from here.

everything else is prebuilt with the release.


```
Command to run from the terminal:

Java -jar ./build-fat-java-baby-1.0.0.java

```

### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
Give the example
```

And repeat

```
until finished
```
==================================================================

# 1. An exmaple of using the application to CREATE a new Customer:

OUR MENU Pops up:

CREATE
READ
UPDATE
DELETE

_We make a choice by typing:_

  CREATE

_and press ENTER_

_You will be prompted with a question._

"Enter First Name:"

_we enter our first name_:
  Jack

_We are prompted with a second question_

"Enter Your Last Name:"

_we enter our surname_:
  Bourne

_a moment later we are told that the Customer has been created_

  Customer created...

==================================================================

# 1. An exmaple of using the application to CREATE a new Customer:

OUR MENU Pops up:

CREATE
READ
UPDATE
DELETE

_We make a choice by typing:_

  CREATE

_and press ENTER_

_You will be prompted with a question._

"Enter your First Name:"

_we enter our first name_:
  Jason
_and press ENTER_

_We are prompted with a second question_

"Enter Your Last Name:"

_we enter our surname_:
  Bourne
_and press ENTER_

_We are prompted with a third question_

"Enter Your Email address:"

_we enter our surname_:
jason.bourne@gmail.com
_and press ENTER_

_a moment later we are told that the Customer has been created with email address_

  Customer created with Email...

==================================================================

# 2. An exmaple of using the application to READ the ITEMS:

OUR MENU Pops up:

Which entity would you like to use?
CUSTOMER: Information about Customers
ITEM:  Browse Individual Items
ORDER: The Orders & Purchases of items
STOP: To Close the application

_We make a choice by typing:_

Item

_We are prompted to make a choice again_

What would you like to do with item:
CREATE: To save a new entity into the database
READ: To read an entity from the database
UPDATE: To change an entity already in the database
DELETE: To remove an entity from the database
RETURN: To return to domain selection

_we choose Read_

Read 
_and press ENTER_

_You will be shown a neat list of ITEMS in the database like below_

Product id:1
Item:Football
Cost:15.99
---------------------------------------------

Product id:2
Item:Rugby Ball
Cost:19.99
---------------------------------------------
==================================================================

# 3. An exmaple of using the application to DELETE a Customer:

OUR MENU Pops up:

CREATE
READ
UPDATE
DELETE

_We make a choice by typing:_

  DELETE

_and press ENTER_

_You will be prompted with a question._

"Enter the Customer ID to DELETE:"

_we enter the ID of the Customer to DELETE_:
  3
_we press ENTER_

_a moment later we are told that the Customer has been deleted_

"Customer Deleted..."



#################################################################################
###################### Running the tests ########################################

Explain how to run the automated tests for this system. Break down into which tests and what they do

### Unit Tests

Explain what these tests test, why and how to run them

```
Give an example
```

### Integration Tests
Explain what these tests test, why and how to run them

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With
