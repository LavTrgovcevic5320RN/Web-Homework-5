package com.example;

import com.example.repository.comment.CommentRepository;
import com.example.repository.comment.InMemoryCommentRepository;
import com.example.repository.post.InMemoryPostRepository;
import com.example.repository.post.PostRepository;
import com.example.services.CommentService;
import com.example.services.PostService;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import javax.inject.Singleton;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("/api")
public class HelloApplication extends ResourceConfig {

    public HelloApplication() {
        // Ukljucujemo validaciju
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);

        // Definisemo implementacije u dependency container-u
        AbstractBinder binder = new AbstractBinder() {
            @Override
            protected void configure() {
                this.bind(InMemoryCommentRepository.class).to(CommentRepository.class).in(Singleton.class);

                this.bindAsContract(CommentService.class);

                this.bind(InMemoryPostRepository.class).to(PostRepository.class).in(Singleton.class);

                this.bindAsContract(PostService.class);
            }
        };
        register(binder);

        // Ucitavamo resurse
        packages("com.example.resources");
    }
}