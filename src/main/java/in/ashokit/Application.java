package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Book;
import in.ashokit.repo.Bookrepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		
		Bookrepository bookrepo = context.getBean(Bookrepository.class);
		
		System.out.println(bookrepo.getClass().getName());
		
		Book b = new Book();
		
		b.setBookId(103);
		
		b.setBookName("devops");

		b.setBookPrice(5200.50);
		
		bookrepo.save(b);
	}

}
