package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
 
public class Hooks {  // Cucumber Hooks for setup
    public static PrintStream logStream;
 
    static {
        try {
            File logFile = new File("target/api_logs.txt");
            logStream = new PrintStream(new FileOutputStream(logFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
 
    @Before
    public void setupLogging() {
        RestAssured.filters(new RequestLoggingFilter(logStream), new ResponseLoggingFilter(logStream));
    }
    
    @After
    public void attachLogsToReport(Scenario scenario) {
        try {
            String logs = new String(Files.readAllBytes(Paths.get("target/api_logs.txt")));
            scenario.attach(logs, "text/plain", "API Logs");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
