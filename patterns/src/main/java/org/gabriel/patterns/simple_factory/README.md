<h1>Simply Factory</h1>
<p>
We simply move our instantiation logic away from client code. Typically in a
 static method.
<p>
Simple factory knows about all classes whose objects it can create.
<p>
Although simple factory typically uses static methods and hence won't benefit
 from inheritance, having a separate class means we can import only that 
 particular class to use simple factory.
</p> 
<h1>Pitfalls</h1>
The criteria used by simple factory to decide which object to instantiate can get more
convoluted/complex over time. If you find yourself in such situation then use factory method
design pattern.

<h1>In-A-Hurry Summary</h1>

* Simple factory encapsulates away the object instantiation in a separate
 method.
 
* We can pass an argument to this method to indicate product type and/or
 additional arguments to help create objects.