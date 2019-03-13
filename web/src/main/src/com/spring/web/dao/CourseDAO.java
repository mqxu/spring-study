package com.spring.web.dao;

import com.spring.web.entity.Course;
import com.spring.web.entity.CourseVO;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CourseDAO extends BaseDAO<Course> {

    //自定义的多表关联查询
    @Results({@Result(column = "course_id", property = "courseId"),
            @Result(column = "course_name", property = "courseName"),
            @Result(column = "user_id", property = "userId"),
            @Result(column = "course_class", property = "courseClass"),
            @Result(column = "cover", property = "cover"),
            @Result(column = "course_code", property = "courseCode"),
            @Result(column = "finished", property = "finished"),
            @Result(column = "username", property = "username"),
            @Result(column = "avatar", property = "avatar")
    })
    @Select("SELECT a.*,b.username,b.avatar FROM t_course a Left JOIN t_sys_user b ON a.user_id=b.user_id WHERE a.finished = 0 LIMIT 0,4 ")
    List<CourseVO> selectCurrentCourses();
}
