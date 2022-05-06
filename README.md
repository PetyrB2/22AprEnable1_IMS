Coverage: 34%
# IMS Project

An INVENTORY MANAGEMENT SYSTEM

To Create, Read, Update and Delete Customers, Items & Orders from the system

## Getting Started

Click here to download a copy of the fatjar file (Our pre-packaged release version

### Prerequisites

What things you need to install the software and how to install them
You will need Java installed.
Get it from here.
You will need to have mySQL database
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

==========================================================
	Welcome to the Inventory Management System!
==========================================================
Which entity would you like to use?
----------------------------------
CUSTOMER: Information about Customers
ITEM:  Browse Individual Items
ORDER: The Orders & Purchases of items
STOP: To Close the application

_We make a choice by typing. Firstly we will type CUSTOMER so that 
we can interact with the Customers Table in the database_

CUSTOMER

_Then we are asked ...._

What would you like to do with customer:
CREATE: To save a new entity into the database
READ: To read an entity from the database
UPDATE: To change an entity already in the database
DELETE: To remove an entity from the database
RETURN: To return to domain selection

_We make a choice again by typing. Firstly we will want to CREATE a Customer so we type_

  CREATE

_and press ENTER_

_You will be prompted with a question._

"Please enter a First Name:"

_we enter our first name_:
  Jack

_We are prompted with a second question_

"Please enter a Surname:"

_we enter our surname_:

  Bourne
  
_We are prompted with a third question_

"Please enter an Email address:"

_a moment later we are told that the Customer has been created and our menu pops up again with choices for us to make.

Customer created with Email
==================
What would you like to do with customer:
CREATE: To save a new entity into the database
READ: To read an entity from the database
UPDATE: To change an entity already in the database
DELETE: To remove an entity from the database
RETURN: To return to domain selection

_Good job. We have created our Customer with a First name, Surname and an Email field.


==================================================================

# 2. An exmaple of using the application to READ all Customers:

OUR MENU Pops up:

CREATE
READ
UPDATE
DELETE

_We make a choice to READ the data by typing:_

  READ

_and press ENTER_

_You will be shown a list of all users as shown below_

id:7

First name: Bruce

Surname: Dickinson

Email: bruce@ironmaiden.com
---------------------------------------------
id:8

First name: Larzzz

Surname: Ulriches

Email: larzzz.ulriches@gmail.com
---------------------------------------------
id:10

First name: Georgie

Surname: Porgie

Email: G.Porgie@gmail.com
---------------------------------------------
id:11

First name: Java

Surname: Isphun

Email: jav@isphun.com
---------------------------------------------
id:12

First name: Jack

Surname: Kruse

Email: jack.kruse@gmail.com
---------------------------------------------




==================================================================

# 3. An exmaple of using the application to READ the ITEMS:

OUR MENU Pops up:

==========================================================
	Welcome to the Inventory Management System!
==========================================================
Which entity would you like to use?
----------------------------------
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

# 4. An exmaple of using the application to DELETE an Order:

OUR MENU Pops up:

CREATE
READ
UPDATE
DELETE

_We make a choice by typing:_

  DELETEby

_and press ENTER_

_You will be prompted with a question._

"Enter the Customer ID to DELETE:"

_we enter the ID of the Customer to DELETE_:
  3
_we press ENTER_

_a moment later we are told that the Customer has been deleted_

"Customer Deleted..."

_And once again we are prompted with our Menu_

What would you like to do with customer:
CREATE: To save a new entity into the database
READ: To read an entity from the database
UPDATE: To change an entity already in the database
DELETE: To remove an entity from the database
RETURN: To return to domain selection


_Once we are done with using the application we can RETURN to the first Menu by typing_

RETURN

Which entity would you like to use?
----------------------------------
CUSTOMER: Information about Customers
ITEM:  Browse Individual Items
ORDER: The Orders & Purchases of items
STOP: To Close the application

_And we EXIT the application by typing STOP_

STOP
===========================================
SO LONG! Farewell! Auf Weidersehen, Au revoir.

#################################################################################
###################### Running the tests ########################################

Explain how to run the automated tests for this system. Break down into which tests and what they do
I have been testing the application as I have been coding it.
I have had a few issues with the test suite but it is up and operational.
Before any Release of the application it has to pass the tests created for it.
This makes it robust and hopefully will make sure it doesn't crash or fail to run optimally.
All testing was done in Eclipse using Maven, Mockito and jUnit.

If you right click the package folder within Eclipse (it is named 22AprilEnable1_IMS)

Within 


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
