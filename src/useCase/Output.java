package useCase;

import java.sql.SQLException;

public class Output {
    private String errorMessage = "";
    private int courseId;

    public void reportError(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean hasErrorOccur() {
        if (this.errorMessage.isEmpty())
            return false;
        return true;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
