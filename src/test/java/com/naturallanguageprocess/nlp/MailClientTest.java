//package com.naturallanguageprocess.nlp;
//
//import com.icegreen.greenmail.util.GreenMail;
//import com.icegreen.greenmail.util.ServerSetup;
////import com.naturallanguageprocess.nlp.service.MailClient;
////import com.naturallanguageprocess.nlp.service.mailClient;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import javax.mail.MessagingException;
//import javax.mail.internet.MimeMessage;
//
//import java.io.IOException;
//
//import static org.junit.Assert.*;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class MailClientTest {
//
//    @Autowired
//    private com.naturallanguageprocess.nlp.service.mailClient mailClient;
//
//    private GreenMail smtpServer;
//
//    @Before
//    public void setUp() throws Exception {
//        smtpServer = new GreenMail(new ServerSetup(25, null, "smtp"));
//        smtpServer.start();
//    }
//
//    @Test
//    public void shouldSendMail() throws Exception {
//        //given
//        String recipient = "menty44@gmail.com";
//        String message = "Test message content";
//        //when
//        mailClient.prepareAndSend(recipient, message);
//        //then
//        String content = "<span>" + message + "</span>";
//        assertReceivedMessageContains(content);
//    }
//
//    private void assertReceivedMessageContains(String expected) throws IOException, MessagingException {
//        MimeMessage[] receivedMessages = smtpServer.getReceivedMessages();
//        assertEquals(1, receivedMessages.length);
//        String content = (String) receivedMessages[0].getContent();
//        assertTrue(content.contains(expected));
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        smtpServer.stop();
//    }
//
//}
