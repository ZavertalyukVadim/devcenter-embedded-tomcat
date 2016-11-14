//import org.junit.Before;
//import org.junit.Test;
//import servlet.HelloServlet;
//
//import javax.servlet.ServletException;
//import java.io.IOException;
//
///**
// * Created by employee on 11/14/16.
// */
//public class MainTest {
//    @Test
//    public void main() throws Exception {
//
//    }
//    private MyServlet servlet;
//    private MockHttpServletRequest request;
//    private MockHttpServletResponse response;
//
//    @Before
//    public void setUp() {
//        servlet = new MyServlet();
//        request = new MockHttpServletRequest();
//        response = new MockHttpServletResponse();
//    }
//
//    @Test
//    public void correctUsernameInRequest() throws ServletException, IOException {
//        request.addParameter("username", "scott");
//        request.addParameter("password", "tiger");
//
//        servlet.doPost(request, response);
//
//        assertEquals("text/html", response.getContentType());
//
//
//    }
//}