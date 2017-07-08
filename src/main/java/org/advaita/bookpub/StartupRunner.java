package org.advaita.bookpub;


import org.advaita.bookpub.repository.BookRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.logging.Logger;

/**
 * Created by advaita on 6/15/17.
 */
public class StartupRunner implements  CommandLineRunner {

    protected final Log logger  = LogFactory.getLog(getClass());

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        logger.info("Number of books :  "  + bookRepository.count());
    }
}
