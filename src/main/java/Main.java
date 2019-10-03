import com.stackroute.demo.BeanLifeCycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import com.stackroute.domain.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.stackroute.demo.BeanLifeCycleDemoBean;
import org.springframework.context.support.AbstractApplicationContext;


public class Main {
    public static void main(String[] args) {


        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie1 = context.getBean(Movie.class);
        //BeanLifeCycleDemoBean beanLifeCycleDemoBean=(BeanLifeCycleDemoBean) context.getBean(BeanLifeCycleDemoBean.class);

        movie1.print();
        context.close();
    }
}
