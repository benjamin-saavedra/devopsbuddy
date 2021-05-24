package com.devopsbuddy;

import com.devopsbuddy.web.i18n.I18NService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DevopsbuddyApplication.class)
@WebAppConfiguration
class DevopsbuddyApplicationTests {

    @Autowired
    private I18NService i18NService;

    @Test
    public void test() {
        String expectedResult = "Bootstrap starter template";
        String messageId = "index.main.callout";
        String actual = i18NService.getMessage(messageId);
        Assert.assertEquals("dont match", expectedResult, actual);
    }

}
