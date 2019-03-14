package servlet;

import dao.CourseDao;
import dao.impl.CourseDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by David on 2019 / 02 / 23.
 */
@WebServlet("/db_test")
public class dbtestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        doPost(request, response);
//        request.setAttribute("test", "321");
//        System.out.println(">>>>>>>" );
//        request.getRequestDispatcher("/WEB-INF/jsp/db_test.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();

        String test = request.getParameter("test");
        String checknumber = request.getParameter("checknumber");

        CourseDao cousedao = new CourseDaoImpl();


        try {
            request.setAttribute("test", cousedao.getCourseList().get(0).getCourseDetail());

            System.out.println("asdasd = " + cousedao.getCourseList().get(0).getCoursePrice());
            System.out.println("asdasd = " + cousedao.getCourseList().get(0).getCourseDetail().toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }





//        response.sendRedirect("db_test");
        request.getRequestDispatcher("/WEB-INF/jsp/db_test.jsp").forward(request, response);
    }

}
