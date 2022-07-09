package utils;

import pojos.UserRequest;

public class UserGenerator {
    public static UserRequest getSimpleUser(){
        return UserRequest.builder()
                .name("goodName")
                .job("bestJob")
                .build();
    }
}
