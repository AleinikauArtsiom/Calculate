import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.LinkedHashMap;

@WebServlet("/history")
public class HistoryServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Получаем историю из LinkedHashMap (предположим, что у вас есть такой атрибут)
        LinkedHashMap<String, String> history = Calculator.history;

        // Устанавливаем атрибут истории для доступа из JSP
        request.setAttribute("history", history);

        // Перенаправляем на страницу history.jsp
        RequestDispatcher dispatcher = request.getRequestDispatcher("/history.jsp");
        dispatcher.forward(request, response);
    }
}
