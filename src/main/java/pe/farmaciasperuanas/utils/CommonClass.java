package pe.farmaciasperuanas.utils;

import groovy.util.logging.Slf4j;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;
import java.util.List;
import java.util.*;

@Slf4j
public class CommonClass {
    public static EnvironmentVariables ENVIRONMENT_VARIABLES = SystemEnvironmentVariables.createEnvironmentVariables();

    public static DataTable getCredentialsInDataTable(String brand, String loginType){

        String user = EnvironmentSpecificConfiguration.from(ENVIRONMENT_VARIABLES).getProperty(String.format("users.%s.%s.username", brand, loginType));
        String password = CryptDecrypt.encrypt(EnvironmentSpecificConfiguration.from(ENVIRONMENT_VARIABLES).getProperty(String.format("users.%s.%s.password", brand, loginType)));

        if (System.getProperty("user") != null || System.getProperty("password") != null) {
            user = System.getProperty("user");
            password = CryptDecrypt.encrypt(System.getProperty("password"));
        }
        List<List<String>> credentials = Arrays.asList(Arrays.asList("usuario", "contraseña"),
                Arrays.asList(user, password));
        return DataTable.create(credentials);
    }

}
