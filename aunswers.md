Questions:
1. Пояснити що таке Comparator i Comparable. В чому їхня відмінність?
2. Чому в PriorityQueue MAX capacity - MAX_INTEGER- 8? І чому initial capacity 11?

Answer for question 1.

Interface Comparable
In the Comparable interface, only one method is used to compareTo (Object obj), which is intended to arrange class objects. This method is useful for sorting lists or arrays of objects.
The comparTo (Object obj) method compares the called object with obj.

Comparator Comparator: Compare, CompareTo
The Comparator interface declares the method compar (Object obj1, Object obj2), which allows you to compare two objects.

Difference between Comparator and Comparable
The Comparable interface is used only to compare class objects in which this interface is implemented. That. The interface comparable defines the comparison logic of a particular reference type object within its implementation (according to the developer's rules).
The comparator represents a separate implementation and can be used multiple times and with different classes. That. The interface comparator allows you to create objects that will control the comparison process (for example, when sorting).

Answer for question 2.
PriorityQueue based on Arrays, that is why it's MAX capacity is MAX_INTEGER- 8, MAX_INTEGER its max value of int type, wich is an array's size, and -8 its a header of array size.
Initial capacity 11 it's because array min size iz 10, ten elements without 0 (0 not used on quees) is 11.
