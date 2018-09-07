package com.bootcamp.mdq.api;

import org.junit.Test;
import retrofit2.Retrofit;

public class APITest {

    @Test
    public void getPostsTest() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build();

        JSONPlaceholderService service = retrofit.create(JSONPlaceholderService.class);

        service.getPost(0);
    }

}
