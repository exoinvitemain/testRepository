////*/*//
package helloworld;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetingController implements Controller
{

   @Override
   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
   {
      String userName = request.getParameter("user");
      NewClass newClass = new NewClass();
      String result = "";
      if (userName != null)
      {
         double bigValuenewMTd = newClass.bigValuenewMTd();
         result = "Hello, " + userName + "!";
      }

      ModelAndView view = new ModelAndView("hello_view");
      view.addObject("greeting", result);
      return view;
   }

   public String hjk(HttpServletRequest request, HttpServletResponse response) throws Exception
   {
      ModelAndView view2 = new ModelAndView("hello_view2");
      return view2.getViewName();
   }
}