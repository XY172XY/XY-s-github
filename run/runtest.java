package run;
import Beans.bean1;
import com.beust.ah.A;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class runtest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext a=new AnnotationConfigApplicationContext(AppConfig.class);
        bean1 A=new bean1();
        A.jieshao();
    }
}
