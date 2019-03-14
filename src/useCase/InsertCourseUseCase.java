package useCase;

import dao.CourseDao;
import dao.impl.CourseDaoImpl;
import model.Course;

import java.sql.SQLException;

public class InsertCourseUseCase {
    private CourseDao courseDao;

    public InsertCourseUseCase(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public void insertCourseUseCase(CourseInput courseInput, Output output){
        int courseId = 0 ;
        try {
            courseId = courseDao.getMaxCourseId();
            courseId+=1;
            System.out.println(courseId);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        Course course = new Course(
                courseId,
                courseInput.getCourseName(),
                courseInput.getCourseDetail(),
                courseInput.getCourseSuitPeople(),
                courseInput.getCoursePrice(),
                courseInput.getCourseNotes(),
                courseInput.getCourseRemark());

        try {
            courseDao.insertCourseToDB(course);
            output.setCourseId(courseId);
        } catch (SQLException e) {
            e.printStackTrace();
            output.reportError(e.getMessage());
        }
    }
}
