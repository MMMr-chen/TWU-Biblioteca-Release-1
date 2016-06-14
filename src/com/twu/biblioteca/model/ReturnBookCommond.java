package com.twu.biblioteca.model;

import com.twu.biblioteca.controller.Router;
import com.twu.biblioteca.core.ReturnBook;

public class ReturnBookCommond implements MyCommand {
    @Override
    public String run(String command, Router router) {
        return new ReturnBook().returnBook(command);
    }

    @Override
    public String getDescription() {
        return "Try to return book by enter 'rt bookid'";
    }
}
