import com.stackroute.domain.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie1 = context.getBean(Movie.class);
        Movie movie2= context.getBean(Movie.class);
        if(movie1==movie2)
            System.out.println(true);
        else
            System.out.println(false);

    }
}
