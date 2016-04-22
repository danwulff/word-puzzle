import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {

  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/result", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/result.vtl");

      //create WordPuzzle Object
      WordPuzzle myWordPuzzle = new WordPuzzle();
      //get puzzled sentece
      String sentence = request.queryParams("inputSentence");
      String puzzledSentence = myWordPuzzle.createPuzzle(sentence);
      //place puzzled sentence in result.vtl
      model.put("result", puzzledSentence);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

}
