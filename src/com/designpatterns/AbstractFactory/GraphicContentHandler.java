package com.designpatterns.AbstractFactory;

/**
 * Created by Ken.J.Zheng on 9/11/2018.
 */
public class GraphicContentHandler extends ContentHandler {
    public Response process(Request request){
        return new Response(createGraphic());
    }

    private String createGraphic(){
        return "";
    }
}
