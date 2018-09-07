package com.bootcamp.mdq.api;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;

public interface JSONPlaceholderService {

    @GET("/posts")
    Call<List<Post>> getPosts();

    @GET("/posts/{id}")
    Call<Post> getPost(@Path("id") int id);

    @POST("/posts")
    Call<Post> addPost(@Body Post post);
}
