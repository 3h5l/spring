package com.cn.hl.dao.impl;

import com.cn.hl.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("bookDao ...");
    }
}
