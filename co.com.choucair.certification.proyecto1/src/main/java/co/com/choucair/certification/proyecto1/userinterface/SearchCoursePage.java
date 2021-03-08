package co.com.choucair.certification.proyecto1.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_CC = Target.the("selecciona Cursos y Certificaciones").located(By.xpath("//*[@id=\"certificaciones\"]/div[1]/a/h4/strong"));

    public static final Target BUTTON_CURSO = Target.the("selecciona el curso").located(By.xpath("//*[@id=\"category-course-list\"]/div/div[3]/div/div[1]/div/div/a/div[2]/h4"));

    public static final Target NAME_COURSE = Target.the("extrae el nombre del curso").located(By.xpath("//*[@id=\"page-header\"]/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));
}
