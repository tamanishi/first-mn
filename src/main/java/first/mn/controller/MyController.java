package first.mn.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller
public class MyController {
    public String hoge = "hogehoge";
    public String fuga = "fugafuga";

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    public MyController hello() {
        return this;
    }
}
