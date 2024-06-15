import com.example.config.JavaConfig;
import com.example.service.impl.CalculatorPureImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(value = JavaConfig.class)
public class SpringAopTest {
    // aop - 代理 - jdk - 接口 - 代理类  - 代理对象和目标对象 拜把子 兄弟关系 - 接口接值
    // 有aop - 在ioc中存储的是代理对象
    @Autowired
    private CalculatorPureImpl calculator;

    @Test
    public void test(){
        System.out.println("add = " + calculator.div(1, 1));
    }

}
