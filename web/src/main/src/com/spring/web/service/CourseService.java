package com.spring.web.service;

import com.spring.web.entity.CourseVO;

import java.util.List;

public interface CourseService {
    List<CourseVO> selectCurrentCourses();
}
