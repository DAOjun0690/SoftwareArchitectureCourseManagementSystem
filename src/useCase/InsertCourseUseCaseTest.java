package useCase;

import dao.CourseDao;
import dao.impl.InMemoryCourseDao;
import model.Course;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class InsertCourseUseCaseTest {
    private InsertCourseUseCase useCase;
    private CourseDao dao;

    @org.junit.Before
    public void setUp() throws Exception {
        dao = new InMemoryCourseDao();
        useCase = new InsertCourseUseCase(dao);
    }

    @org.junit.Test
    public void insertCourseUseCase() throws SQLException {
        CourseInput courseInput = new CourseInput(
                "clean architecture",
                "detail",
                "people",
                81000,
                "note",
                "remark"
                );
        Output output = new Output();

        useCase.insertCourseUseCase(courseInput, output);
        Course actual = dao.findTheCourse(output.getCourseId());
        assertEquals(courseInput.getCourseName(), actual.getCourseName());
        assertEquals(1, dao.getCourseList().size());
    }
}