Prisms and cylinders are geometrical objects which are obtained by parallel shifting of their floor space.

A prism is determined by its height together with the shape of its floor space. As floor spaces, we consideroccur (e.g.):

regular n-corner, determined by the number of corners and the edge length
circle, determined by its radius
rectangle, determined by breadth and width
The operations provided by a floor space should calculate circumference and area, respectively. A prism then provides operations for computing surface and volume, respectively. All this is summarized in the following UML diagram (for simplicity, getters and setters have been omitted):



Thereby, the method toSquare() should return a Square object, if the shape is in fact a square, and null, if this is not the case.

This assignment is going to realize a class hierarchy for these geometrical objects.

Proceed as follows.

Implement all mentioned classes and methods upto the class Prism. Overwrite the methods of BaseArea in the respective sub-classes. Do not forget to provide appropriate getters and setters!
Qualify the class BaseArea as abstract and argue why this might be sensible. Decide which methods of BaseArea should be abstract as well! Adapt your implementation appropriately.
Finally implement the class Prism.
Hint 1: the area of a regular n-corner with edge length a is given by n∗a24∗tan⁡(πn)\frac{n * a^2}{4 * \tan (\frac{\pi}{n})} 
4∗tan( 
n
π
​
 )
n∗a 
2
 
​
 . Hint 2: the constrant Math.PI and the method Math.tan (sie Math) could be useful.
