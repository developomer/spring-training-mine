package org.cydeo;

import org.cydeo.model.Comment;
import org.cydeo.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CydeoApplication {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Jhonsan");
        comment.setText("Spring Framework");


        ApplicationContext container = SpringApplication.run(CydeoApplication.class, args);

        CommentService commentService = container.getBean(CommentService.class);
        commentService.publishComment(comment);

        commentService.printConfigData();
        commentService.printDbConfigData();

    }


}
