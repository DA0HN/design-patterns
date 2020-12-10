package org.gabriel.patterns.simple_factory;

import java.time.LocalDate;

/**
 * @author daohn on 10/12/2020
 * @project design-pattern-course
 * <p>
 * Represents a news post.
 */
public class NewsPost extends Post {


    private String    headline;
    private LocalDate newsTime;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public LocalDate getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(LocalDate newsTime) {
        this.newsTime = newsTime;
    }
}
