package com.chen.test;


import com.chen.mapper.UserMapper;
import com.chen.util.JavaMailUtils;
import freemarker.template.Template;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.MediaType;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;


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
    @Resource
    private JavaMailSenderImpl sender;
    @Resource
    private FreeMarkerConfig freeMarkerConfigurer ;
    @Test
    public void sendEmail() throws  Exception{
        Map model = new HashMap();
        model.put("userName","chen");
        model.put("emailAddress","1047810633@qq.com");
        model.put("imgUrl","https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png");
        Template template = freeMarkerConfigurer.getConfiguration().getTemplate("index.ftl");
        String text = FreeMarkerTemplateUtils.processTemplateIntoString(template,model);
        MimeMessage mimeMessage = sender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
        mimeMessage.setFrom("18819423824@163.com");
        mimeMessageHelper.setTo("18819423824@163.com");
        mimeMessageHelper.setSubject("Recommendations for you");
        mimeMessageHelper.setText(text, true);
        sender.send(mimeMessage);

    }
    @Resource
    UserMapper userDao;
    @Test
    public void userDaoTest(){
        System.out.println(userDao.selectByPrimaryKey(1));
    }
}
