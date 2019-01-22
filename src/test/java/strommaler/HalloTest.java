package strommaler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import strommaaler.StrommaalerApplication;
import strommaaler.controller.StrommaalerKontroller;


import javax.inject.Inject;

import static org.assertj.core.api.Java6Assertions.assertThat;

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = {StrommaalerApplication.class},webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@WebMvcTest(StrommaalerKontroller.class)
public class HalloTest {
//    private static String FOO_RESOURCE_URL="/maalinger";
//
//    @Inject
//    private StrommaalerKontroller controller;
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    @Test
//    public void contexLoads() throws Exception {
//        assertThat(controller).isNotNull();
//    }

//    @Test
//    public void test(){
//        assertThat(true).isEqualTo(true);
//        assertThat(restTemplate).isNotNull();
////        TestRestTemplate testRestTemplate = new TestRestTemplate();
////        ResponseEntity<String> response = testRestTemplate.
////                getForEntity(FOO_RESOURCE_URL + "/ping", String.class);
////        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
//    }
}
