import DAO.Conecta;
import core.TestLinkIntegration;
import org.testng.annotations.Test;
import testlink.api.java.client.TestLinkAPIException;
import testlink.api.java.client.TestLinkAPIResults;

import java.sql.Connection;
import java.sql.SQLException;

public class Teste {

    public static void main(String[] args) {

        try {
            Connection con =  Conecta.criarConexao();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testLink() throws Exception {
        try {
            TestLinkIntegration.updateResults("Receita Tests", null, TestLinkAPIResults.TEST_PASSED);
        } catch (TestLinkAPIException e) {
            TestLinkIntegration.updateResults("Receita Tests", e.getMessage(), TestLinkAPIResults.TEST_FAILED);
        }
    }
}
