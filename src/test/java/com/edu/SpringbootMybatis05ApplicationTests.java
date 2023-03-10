package com.edu;

import com.edu.dao.BookDao;
import com.edu.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatis05ApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    public void getByIdTest(){
        Book book = bookDao.getById(1);
        System.out.println(book);
    }
}
