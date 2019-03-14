package useCase;

public class CourseInput {
    public CourseInput(String courseName, String courseDetail, String courseSuitPeople, int coursePrice, String courseNotes, String courseRemark) {
        if (courseName.isEmpty()) {
            throw new IllegalArgumentException("課程名稱不能為空");
        }
        this.courseName = courseName;
        this.courseDetail = courseDetail;
        this.courseSuitPeople = courseSuitPeople;
        this.coursePrice = coursePrice;
        this.courseNotes = courseNotes;
        this.courseRemark = courseRemark;
    }
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDetail() {
        return courseDetail;
    }

    public void setCourseDetail(String courseDetail) {
        this.courseDetail = courseDetail;
    }

    public String getCourseSuitPeople() {
        return courseSuitPeople;
    }

    public void setCourseSuitPeople(String courseSuitPeople) {
        this.courseSuitPeople = courseSuitPeople;
    }

    public int getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(int coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseNotes() {
        return courseNotes;
    }

    public void setCourseNotes(String courseNotes) {
        this.courseNotes = courseNotes;
    }

    public String getCourseRemark() {
        return courseRemark;
    }

    public void setCourseRemark(String courseRemark) {
        this.courseRemark = courseRemark;
    }

    private String courseName;
    private String courseDetail;
    private String courseSuitPeople;
    private int coursePrice;
    private String courseNotes;
    private String courseRemark;
}
