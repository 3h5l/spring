package com.cn.hl.service.impl;

import com.cn.hl.dao.BookDao;
import com.cn.hl.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {


    private BookDao bookDao;

    @Autowired
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save(){
        System.out.println("bookService ...");
        bookDao.save();
    }
}
