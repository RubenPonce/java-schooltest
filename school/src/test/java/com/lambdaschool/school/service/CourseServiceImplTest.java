
package com.lambdaschool.school.service;


import com.lambdaschool.school.SchoolApplicationTests;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityNotFoundException;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SchoolApplicationTests.class)
public class CourseServiceImplTest {
//    @Autowired
//    private CourseService courseService;
    @Autowired
    private CourseService courseService;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findAll() {
    }

    @Test
    public void getCountStudentsInCourse() {
    }

    @Test
    public void deleteFound()
    {
        courseService.delete(1);
        assertEquals(5,courseService.findAll().size());
    }
    @Test(expected =  EntityNotFoundException.class)
    public void deleteNotFound()
    {
        courseService.delete(20000);
        assertEquals(5,courseService.findAll().size());
    }

    @Test
    public void findAll1() {
    }

    @Test
    public void getCountStudentsInCourse1() {
    }

    @Test
    public void delete1() {
    }

    @Test
    public void findCourseById() {

            assertEquals("Data Science", courseService.findCourseById(1).getCoursename());
    }

}