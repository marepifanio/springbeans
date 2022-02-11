package com.springbeans.utilizandoBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext factory2 = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        livro.setNome("Harry Potter");
        livro.setCodigo("DSD65FG8");

        Autor autor = factory.getBean(Autor.class);
        autor.setNome("J.K. Rowling");

        livro.exibir();

        System.out.println("----------------------------------------");

        Autor autor2 = factory.getBean(Autor.class);

        Livro livro2 = factory.getBean(Livro.class);


        livro2.exibir();

    }
}
