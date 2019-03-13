package com.spring.web.entity;

import lombok.Data;

@Data
public class CourseVO {
    private Long courseId;
    private String courseName;
    private Long userId;
    private String courseClass;
    private String cover;
    private String courseCode;
    private Short finished;
    private String username;
    private String avatar;
}
