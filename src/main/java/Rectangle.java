import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.Random;


public class Rectangle {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";
    staticFileLocation("/public");

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/rectangle", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      int length = Integer.parseInt(request.queryParams("length"));
      int width = Integer.parseInt(request.queryParams("width"));

      Rectangle myRectangle = new Rectangle(length, width);
      model.put("myRectangle", myRectangle);

      model.put("template", "templates/rectangle.vtl");
      return new ModelAndView(model,layout);
    }, new VelocityTemplateEngine());


    }


    private Integer mLength;
    private Integer mWidth;
    public Rectangle(Integer length, Integer width) {
      mLength = length;
      mWidth = width;
     }
     public int getLength() {
       return mLength;
     }
     public int getWidth() {
      return mWidth;
     }

     public boolean isSquare() {
       return mLength == mWidth;

     }
}
