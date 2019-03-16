package com.spring.web.service.impl;

import com.spring.web.dao.CourseDAO;
import com.spring.web.entity.Course;
import com.spring.web.entity.CourseVO;
import com.spring.web.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseDAO courseDAO;

    @Override
    public List<CourseVO> selectCurrentCourses() {
        return courseDAO.selectCurrentCourses();
    }

    @Override
    public List<CourseVO> selectFinishedCourses() {
        return courseDAO.selectFinishedCourses();
    }

    @Override
    public Course getCourse(Long courseId) {
        return courseDAO.selectByPrimaryKey(courseId);
    }

    @Override
    public int insertCourse(Course course) {
        return courseDAO.insert(course);
    }

    @Override
    public int updateCourse(Course course) {
        return courseDAO.updateByPrimaryKey(course);
    }

    @Override
    public int deleteCourse(Long courseId) {
        return courseDAO.deleteByPrimaryKey(courseId);
    }
}
