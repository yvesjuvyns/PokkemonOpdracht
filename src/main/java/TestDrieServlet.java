import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet("/testdrie")
public class TestDrieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        if(session.getAttribute("SomeName")== null){

            req.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(req,resp);
        }
        else{
            req.getRequestDispatcher("/WEB-INF/pages/welcome.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String warning = ", gelieve een geldige naam in te voeren!";

        HttpSession session = req.getSession();

        String nameAttribute = req.getParameter("SomeName");

        // checkt niet voor een string met allemaal lege tekens "    " bijvoorbeeld
        //
        if(nameAttribute.isEmpty()){
            //je stelt de warning in, maar wanneer je 10 keer de pagina bezoekt zonder een geldige input
            // 10 x http://localhost:8080/yves/testdrie intypen en enter duwen bijvoorbeeld
            // dan zal je 10 x gelieve een geldige naam in te voeren! zien, zonder dat de client op push here heeft gedrukt
            session.setAttribute("warning", warning);
            req.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(req,resp);
        }
        else {
            session.setAttribute("SomeName", nameAttribute);

            session.setAttribute("warning", "");
            req.getRequestDispatcher("/WEB-INF/pages/welcome.jsp").forward(req, resp);
        }
    }
}
