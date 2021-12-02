package com.javatechie.spring.rest.api.resource;


import com.javatechie.spring.rest.api.utils.Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import static org.junit.Assert.assertThat;
import static org.valid4j.matchers.http.HttpResponseMatchers.hasStatus;

@RunWith(MockitoJUnitRunner.class)
public class CafetoTestResourceTest {

    @Mock
    Util util;

    @InjectMocks
    CafetoTestResource cafetoTestResource;

    @Test
    public void PropertyExist(){
        Client client = ClientBuilder.newClient();
        Response response = client.target("http://localhost:8080/cafetoTestResource/getProperty/os.version").request().get();
        assertThat(response, hasStatus(Response.Status.OK));
    }

    @Test
    public void PropertyDoesNotExist(){
        Client client = ClientBuilder.newClient();
        Response response = client.target("http://localhost:8080/cafetoTestResource/getProperty/noExiste").request().get();
        assertThat(response, hasStatus(Response.Status.NOT_FOUND));
    }

}
