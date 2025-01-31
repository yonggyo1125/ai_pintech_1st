package org.koreait.tests;

import lombok.Data;

@Data
public class Post {
    private long userId;
    private long id;
    private String title;
    private String body;
}
