package org.gabriel.patterns.simple_factory;

/**
 * @author daohn on 10/12/2020
 * @project design-pattern-course
 * <p>
 * Represents a blog spot.
 */
public class BlogPost extends Post {

    private String   author;
    private String[] tags;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
