package com.zhang.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {

    public static void main(String[] args) {

        SpringApplication.run(GitApplication.class, args);
        System.out.println("第一次提交");
        System.out.println("第二次提交");
        System.out.println("第三次提交");
        System.out.println("hot-fix的第一次修改");
        System.out.println("第四次提交");
        System.out.println("hot-fix的第二次修改");
    }

}
