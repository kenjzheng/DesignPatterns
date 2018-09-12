package com.designpatterns.AbstractFactory;

/**
 * Created by Ken.J.Zheng on 9/11/2018.
 */
public class TextContentHandler extends ContentHandler {
    public  Response process(Request request){
        String data = readTextFile();
        return new Response(data);
    }

    private String readTextFile(){
        return "";
    }
}
