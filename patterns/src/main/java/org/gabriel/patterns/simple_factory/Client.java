package org.gabriel.patterns.simple_factory;

/**
 * @author daohn on 10/12/2020
 * @project design-pattern-course
 * <p>
 * <h1>Simply Factory</h1>
 * <p>
 * We simply move our instantiation logic away from client code. Typically in a static method
 * <p>
 * Simple factory knows about all classes whose objects it can create.
 *
 * <h1>Pitfalls</h1>
 * The criteria used by simple factory to decide which object to instantiate can get more
 * convoluted/complex over time. If you find yourself in such situation then use factory method
 * design pattern.
 */
public class Client {

    public static void main(String[] args) {
        Post post = PostFactory.createPost("blog");
        System.out.println(post instanceof BlogPost);
    }
}
