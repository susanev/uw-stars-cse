1. Consider the task of representing types of tickets to campus events. Each ticket has a unique number and price. There are three types of tickets: walk-up tickets, advance tickets, and student advance tickets.

	* Walk-up tickets are purchased the day of the event and cost $50
	* Advanced tickets purchased 10 or more days before the event cost $30, and advance tickets purchased fewer than 10 days before the event cost $40
	* Student advance tickets are sold at half-the-price of normal advance tickets (when they are purchased 10 or more days early they cost $15, and when they are purchased fewer than 10 days early they cost $20)

	1. Consider the classes you will need to create and draw a diagram demonstrating how they are connected.

	1. Implement a Ticket class that will serve as the superclass for all three types of tickets. Define all operations shown below, and specify the operations in such a way that every subclass can implement them.
		* The ability to construct a ticket by number
		* The ability to ask for a ticket's price
		* The ability to print a ticket object as a String (e.g., `Number: 17, Price: 50.0`)

	1. Implement a class called WalkupTicket to represent a walk-up event ticket. Walk-up tickets are constructed by number.

	1. Implement a class called AdvanceTicket to represent tickets purchased in advance. Advance tickets are constructed with a ticket number, and with the number of days in advance that the ticket was purchased.

	1. Implement a class called StudentAdvanceTicket to represent tickets purchased in advance by students. When a student advance ticket is printed, the String should mention that the student mush show their ID.

	1. Write an inheritance hierarchy of three-dimensional shapes. Make a top-level shape interface that has methods for getting information such as the volume and surface area of a three-dimensional shape. Then make classes and sub-classes that implement various shapes such as cubes, rectangular prisms, spheres, triangular prisms, cones, and cylinders. Place common behaviour in superclasses whenever possible, and use abstract classes as appropriate. Add methods to the subclasses to represent the unique behaviour of each three-dimensional shape, such as a method to get a sphere's radius.