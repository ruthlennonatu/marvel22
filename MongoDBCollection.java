package com.mechanitis.mongodb.gettingstarted;

import com.mongodb.MongoClient;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class Collection{
    @Test
    public void MongoClientConnectedToLocalhost() throws Exception {
        // When
        // TODO: get/create the MongoClient
        MongoClient mongoClient = null;

        // Then
        assertThat(mongoClient, is(notNullValue()));
    }
}