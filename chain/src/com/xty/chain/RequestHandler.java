package com.xty.chain;

/**
 * Created by Administrator on 2018/1/6 0006.
 */
public abstract class RequestHandler {
    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request req){
        if (next != null){
            next.handleRequest(req);
        }
    }

    protected void printHandling(Request req){
        System.out.println(this.toString() + " handling request " + req.toString());
    }

    @Override
    public abstract String toString();
}
