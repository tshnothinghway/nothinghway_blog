package com.noth.system;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by thway on 2017/4/20.
 */
@Component
public class BlogProperties {

    @Value("${com.noth.blog.name}")
    private String name;

    @Value("${com.noth.blog.title}")
    private String title;

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
