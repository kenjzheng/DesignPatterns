package com.designpatterns.AbstractFactory;

/**
 * Created by Ken.J.Zheng on 9/11/2018.
 */
public class Gateway {
    private Request request;
    public Gateway(Request request){
        this.request = request;
    }

    public Response getRequestResponse(){
        IContentHandler handler = getRequestHandler();
        return handler.process(request);
    }

    private IContentHandler getRequestHandler(){
        IContentHandlerFactory factory = null;

        switch (request.getRequest()){
            case SQL:
                factory = new SqlContentHandlerFactory();
                break;
            case GRAPHIC:
                factory = new GraphicContentHandlerFactory();
                break;
            case TEXT:
                factory = new TextContentHandlerFactory();
                break;
            //throw exception in default
        }

        IContentHandler handler = factory.createContentHandler();
        return handler;
    }
}
