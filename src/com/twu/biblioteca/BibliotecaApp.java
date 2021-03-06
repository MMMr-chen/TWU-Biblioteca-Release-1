package com.twu.biblioteca;

import com.twu.biblioteca.controller.LibraryController;
import com.twu.biblioteca.controller.Router;
import com.twu.biblioteca.model.*;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.OriginRouter;
import com.twu.biblioteca.view.Printer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Printer printer = new Printer();
        BookRepository bookRepository =new BookRepository();
        OriginRouter originRouter = new OriginRouter(bookRepository);
        Router router = new Router(originRouter.getOriginRouter());
        LibraryController libraryController = new LibraryController(printer,scanner,router);
        libraryController.start();
    }
}
