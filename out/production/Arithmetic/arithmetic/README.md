Use this library to perform arithmetic functions on various data types.
For octals, prefix an integer with a "0".

To add a new arithmetic function to this library:
  - add a new interface for the new arithmetic type
  - create an implementation of the new interface with a new class
  - set the Arithmetic class to implemenent the new interface
  - use the new class to implement the required methods in the Arithmetic class
    
To add new datatypes to be used with the arithmetic functions, add them to the interfaces:
  - implement required methods in classes used to implement the arithmetic methods for the interfaces
  - implement the required methods in the Arithmetic class with the newly added methods
