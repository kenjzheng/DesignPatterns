package com.designpatterns.AbstractFactory;

/**
 * Created by Ken.J.Zheng on 9/11/2018.
 */
public abstract class ContentHandler implements IContentHandler {
    public abstract Response process(Request request);
}
