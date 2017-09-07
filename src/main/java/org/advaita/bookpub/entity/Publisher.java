package org.advaita.bookpub.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by advaita on 6/17/17.
 */
@Entity
public class Publisher {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    @OneToMany(mappedBy = "publisher")
    private List<Book> books;

    protected Publisher(List<Book> books) {
        this.books = books;
    }

    public Publisher(String name) {
        this.name = name;
    }

}
