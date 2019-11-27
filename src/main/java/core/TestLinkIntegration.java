package core;


import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException;

import java.net.URL;

public class TestLinkIntegration {

    public static final String TESTLINK_KEY =".....";
    public static final String TESTLINK_URL = "http://localhost/testlink/lib/api/xmlrpc/v1/xmlrpc.php";
    public static final String TEST_PROJECT_NAME ="....";
    public static final String TEST_CASE_NAME ="....";
    public static final String BUILD_NAME ="...";

    public static void updateResults(String testCaseName, String exception, String results) throws TestLinkAPIException {
        TestLinkAPIClient testlink = new TestLinkAPIClient(TESTLINK_KEY, TESTLINK_URL);
    }

}
