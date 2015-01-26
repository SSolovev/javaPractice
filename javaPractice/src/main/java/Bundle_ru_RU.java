import java.util.Enumeration;
import java.util.ListResourceBundle;
import java.util.ResourceBundle;

/**
 * Created by SeASolovev on 22.01.2015.
 */
public class Bundle_ru_RU extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
            {"testKey","ru_RU_testField"}
        };
    }
}
