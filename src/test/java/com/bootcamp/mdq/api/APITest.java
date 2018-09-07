package com.bootcamp.mdq.api;

import org.junit.Test;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

public class APITest {

    @Test
    public void getPostsTest() throws IOException {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build();

        JSONPlaceholderService service = retrofit.create(JSONPlaceholderService.class);

        service.getPost(0).execute().body();
    }

}
