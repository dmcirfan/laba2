package ru.mirea.lab2;

public class main {
    public static void main(String[] args)
    {
        Author author1 = new Author("Danila", "danila@domain.url", 'M');
        Author author2 = new Author("Andrey", "andrey@domain.url", 'M');

        System.out.println(author1);
        System.out.println();
        System.out.println(author2);
    }
}
