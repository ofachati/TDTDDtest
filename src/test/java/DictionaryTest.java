import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class DictionaryTest {

    @Test
    public void testDictionaryName() {
        Dictionary dict = new Dictionary("Example");
        assertThat(dict.getName(), equalTo("Example"));


    }

    @Test
    public void testIsEmpty() {
        Dictionary dict = new Dictionary("Example");
        assertThat(dict.isEmpty(), equalTo(true));
    }

}
