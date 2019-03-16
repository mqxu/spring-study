package com.spring.web.service;

import com.spring.web.entity.Course;
import com.spring.web.entity.CourseVO;

import java.util.List;

public interface CourseService {
    /**
     * 获取进行中的班课
     *
     * @return
     */
    List<CourseVO> selectCurrentCourses();

    /**
     * 获取结束的班课
     *
     * @return
     */
    List<CourseVO> selectFinishedCourses();

    /**
     * 根据id获取班课信息
     *
     * @param courseId
     * @return
     */
    Course getCourse(Long courseId);

    /**
     * 新增班课
     *
     * @param course
     * @return
     */
    int insertCourse(Course course);

    /**
     * 修改班课信息
     *
     * @param course
     * @return
     */
    int updateCourse(Course course);

    /**
     * 根据id删除班课
     *
     * @param courseId
     * @return
     */
    int deleteCourse(Long courseId);
}
