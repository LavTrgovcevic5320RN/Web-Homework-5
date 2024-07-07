package com.example.resources;

import com.example.models.Post;
import com.example.services.PostService;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/posts")
public class PostResource {

    @Inject
    private PostService postService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response all() {
        return Response.ok(this.postService.allPosts()).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void create(@Valid Post post) {
        this.postService.addPost(post);
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Post find(@PathParam("id") Integer id) {
        return this.postService.findPost(id);
    }

}
