import java.util.ListResourceBundle;

/**
 * Created by SeASolovev on 22.01.2015.
 */
public class Bundle extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"testKey","testField"}
        };
    }
}
