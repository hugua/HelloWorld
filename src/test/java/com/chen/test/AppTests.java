package com.chen.test;


import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:mybatis/*.xml","classpath:spring/*.xml"})
@WebAppConfiguration
public class AppTests {

    private Logger logger = Logger.getLogger(AppTests.class);
    private MockMvc mockMvc;

    @Resource
    private WebApplicationContext webApplicationContext;
    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
    @Test
    public void testTransaction() throws Exception{
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/1").accept(MediaType.parseMediaType("application/json;charset=UTF-8"))).andReturn();
        System.out.println(mvcResult.getResponse().getContentAsString());
    }
}
