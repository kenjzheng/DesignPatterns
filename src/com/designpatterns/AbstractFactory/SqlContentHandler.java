package com.designpatterns.AbstractFactory;

/**
 * Created by Ken.J.Zheng on 9/11/2018.
 */
public class SqlContentHandler extends ContentHandler {
    public Response process(Request request){
        return new Response(getDataFromDatabase());
    }

    private String getDataFromDatabase(){
        return "";
    }
}
