package com.spring.web.service.impl;

import com.spring.web.entity.Course;
import com.spring.web.entity.CourseVO;
import com.spring.web.service.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring_mybatis.xml"})
public class CourseServiceImplTest {
    @Autowired
    private CourseService courseService;

    @Test
    public void selectCurrentCourses() {
        List<CourseVO> courseVOList = courseService.selectCurrentCourses();
        courseVOList.forEach(courseVO -> System.out.println(courseVO));
    }

    @Test
    public void selectFinishedCourses() {
        List<CourseVO> courseVOList = courseService.selectFinishedCourses();
        courseVOList.forEach(courseVO -> System.out.println(courseVO));
    }

    @Test
    public void getCourse(){
        Course course = courseService.getCourse(1L);
        System.out.println(course);
    }

    @Test
    public void insertCourse(){
        Course course = new Course();
        course.setCourseName("微信小程序开发");
        course.setCourseClass("软件1721");
        course.setUserId(1L);
        course.setCourseCode("888999");
        course.setCover("https://static-cdn-oss.mosoteach.cn/mssvc/icons/icon_cc_cover1@2x.png");
        course.setFinished((short) 0);
        int n = courseService.insertCourse(course);
        assertEquals(1,n);
    }

    @Test
    public void updateCourse(){
        //先查询出某个班课
        Course course = courseService.getCourse(8L);
        //修改其结束状态
        course.setFinished((short) 1);
        int n = courseService.updateCourse(course);
        assertEquals(1,n);
    }

    @Test
    public void deleteCourse(){
        int n = courseService.deleteCourse(8L);
        assertEquals(1,n);
    }
}