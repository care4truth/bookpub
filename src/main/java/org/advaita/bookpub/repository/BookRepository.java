package org.advaita.bookpub.repository;

import org.advaita.bookpub.entity.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by advaita on 6/17/17.
 */
public interface BookRepository extends CrudRepository<Book,Long> {
    public Book findBookByIsbn(String isbn);

}
