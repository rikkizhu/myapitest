package com.test.api.rikky;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;


/**
 * @program: com.test.api.rikky.TestA
 * @description:
 * @author: zhuruiqi
 * @create: 2022-07-05 20:48
 **/
public class TestA {

    @Test
    public void test1(){
        given().get("https://weather.cma.cn/api/now/58367")
            .then()
            .body("data.location.name",equalTo("上海"));
    }

    @Test
    public void test2(){
        given().get("https://weather.cma.cn/api/now/54511")
            .then()
            .body("data.location.name",equalTo("深圳"));
    }

    @Test
    public void test3(){
        given().get("https://weather.cma.cn/api/now/54511")
            .then()
            .body("data.location.name",equalTo("北京"));
    }


}
