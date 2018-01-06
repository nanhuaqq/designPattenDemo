package com.xty.chain;

/**
 * Created by Administrator on 2018/1/6 0006.
 */
public class OrcOfficer extends RequestHandler {
    public OrcOfficer(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.TORTURE_PRISONER)){
            printHandling(req);
            req.markHandled();
        }else{
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "officer commander";
    }
}
