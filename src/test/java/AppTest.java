import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test //basic index test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Enter a sentence");
  }
  @Test //basic result page test
  public void resultTest() {
    goTo("http://localhost:4567/result?inputSentence=");
    assertThat(pageSource()).contains("Can you guess");
  }
  @Test //test a Sentence
  public void sentenceTest() {
    goTo("http://localhost:4567/result?inputSentence=Ain%27t+no+rest+for+the+wicked");
    assertThat(pageSource()).contains("--n't n- r-st f-r th- w-ck-d");
  }
}
