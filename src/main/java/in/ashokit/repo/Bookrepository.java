package in.ashokit.repo;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Book;

public interface Bookrepository extends CrudRepository<Book,Integer>{

}
