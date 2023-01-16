package javaExampleJPAandHibernate.ex_003_hibernate_get_and_insert;

import javaExampleJPAandHibernate.ex_003_hibernate_get_and_insert.entity.Author;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AuthorHelper ah = new AuthorHelper();
        String[] names = {"Pushkin", "Lermontov", "Shevchenko"};

        for (String name : names) {
            Author author = new Author();
            author.setName(name);
            ah.addAuthor(author);
        }

        List<Author> authorList = ah.getAuthorList();

        for (Author author : authorList) {
            System.out.println(author.getId() + " " + author.getName());
        }

        Author author = ah.getAuthorById(5);
        System.out.println(author.getName());
    }

}
