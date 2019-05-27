import com.stackroute.config.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        Movie movie = (Movie) ctx.getBean("movie1");
        System.out.println(movie);
        ctx.close();
    }

}

