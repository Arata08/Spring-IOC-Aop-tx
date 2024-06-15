import com.example.config.JavaConfig;
import com.example.service.StudentService;
import com.example.service.TopService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.io.FileNotFoundException;

/**
 * description:
 */
@SpringJUnitConfig(JavaConfig.class)
public class TxTest {
    @Autowired
    private TopService topService;
    @Autowired
    private StudentService studentService;
    @Test
    public void  testTx() throws FileNotFoundException {
        topService.topService();
    }
}
