# Multiton
### Description
Mulition is a design pattern closely related to the [Singleton design pattern](https://en.wikipedia.org/wiki/Singleton_pattern). Like Singleton, Multiton serves to limit the number of instances of a class. However, while Singleton only allows a single instance of a class, Multiton allows multiple, with each instance corresponding to a unique key.

A class modified to adhere to the Mulition pattern will have the following characteristics:
- A private constructor, to ensure that no other class can access it.
- A static dictionary field that maps keys to their corresponding instances.
- A public static method get____, which takes in a key and outputs the corresponding instance.


When an instance of the class is desired, get____ is called, with the parameter of the key. If an instance of the class correspondng to the key already exists, it is retutrned. Otherwise, a new instance corresponding to the new key is created, added to the dictionary, then returned. This ensures only one instance can correspond to each key.




### My Example 
(All the code described here is in Student.java)

I chose to showcase the Multiton design pattern on a class respreseting students. I did this because each student has a unique ID number, so it makes sense that no two instances of the student class would have the same ID.

You can see my class contains:
- A private Student() constructor.
- A dictionary studentMappings to map ID numbers to Student instances.
- A method getStudent that takes an ID number as a parameter. If that number doesn't exist in the existing keys of studentMappings, it is added. The method then returns the value that the ID number maps to in studentMappings.


### Results
### Notes
