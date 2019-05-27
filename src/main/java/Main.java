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

        Movie movie1 = (Movie) ctx.getBean("movie1");
        System.out.println(movie1==movie);

        Movie movie2 = (Movie) ctx.getBean("movie2");
        System.out.println(movie2);
        System.out.println(movie==movie2);

        Movie movie3 = (Movie) ctx.getBean("movie3");
        System.out.println(movie3);
        System.out.println(movie3==movie2);


    }

}

