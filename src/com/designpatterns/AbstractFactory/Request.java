package com.designpatterns.AbstractFactory;

/**
 * Created by U0068746 on 9/11/2018.
 */
public class Request {
    private HandlerRequest request;
    public Request(HandlerRequest request){
        this.request = request;
    }

    public HandlerRequest getRequest(){
        return request;
    }
}
