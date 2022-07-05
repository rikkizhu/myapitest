package com.test.api.rikky;

import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * @program: com.test.api.rikky.TestB
 * @description:
 * @author: zhuruiqi
 * @create: 2022-07-05 20:49
 **/
public class TestB {
    @Test
    public void test(){
        given().get("https://weather.cma.cn/api/now/58367")
            .path("data.location.name")
            .equals("上海");
    }

}
