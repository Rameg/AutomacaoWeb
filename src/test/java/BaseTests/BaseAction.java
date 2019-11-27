package BaseTests;

import core.Propriedades;
import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;

import java.io.File;
import java.io.IOException;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

public class BaseAction {

    @Rule
    public TestName testName = new TestName();

    @AfterTest
    public void finalizacao() throws IOException {
        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File arquivo = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(arquivo, new File("target/screenshot/"+testName.getMethodName() + ".jpg"));

        if (Propriedades.FECHAR_BROWSER)
            killDriver();
    }

}
