package com.spring.web.controller;

import com.spring.web.entity.Course;
import com.spring.web.entity.CourseVO;
import com.spring.web.service.CourseService;
import com.spring.web.util.RandomCode;
import com.spring.web.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "course")
public class CourseController {
    @Resource
    private CourseService courseService;


    /**
     * 处理获取所有进行中的班课的请求
     *
     * @return List<CourseVO>
     */
    @RequestMapping(value = "/list/current", method = RequestMethod.GET)
    public List<CourseVO> selectCurrentCourses() {
        return courseService.selectCurrentCourses();
    }

    /**
     * 处理获取所有已结束的班课的请求
     *
     * @return List<CourseVO>
     */
    @RequestMapping(value = "/list/finished", method = RequestMethod.GET)
    public List<CourseVO> selectFinishedCourses() {
        return courseService.selectFinishedCourses();
    }

    /**
     * 处理根据id获取班课的请求
     *
     * @param id
     * @return Course
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Course getCourse(@PathVariable("id") long id) {
        System.out.println("come");
        System.out.println(id);
        return courseService.getCourse(id);
    }

    /**
     * 处理新增班课请求
     *
     * @param course
     */
    @RequestMapping(method = RequestMethod.POST)
    public void addCourse(@RequestBody Course course) {
        System.out.println(course);
        //补充班课的班课码属性
        course.setCourseCode(RandomCode.getRandomCode());
        courseService.insertCourse(course);
    }

    /**
     * 处理修改班课信息请求
     *
     * @param course
     */
    @RequestMapping(method = RequestMethod.PUT)
    public void modifyCourse(@RequestBody Course course) {
        courseService.updateCourse(course);
    }

    /**
     * 处理删除班课请求
     * @param id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable("id") long id) {
        courseService.deleteCourse(id);
    }
}
