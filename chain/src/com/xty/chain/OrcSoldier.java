package com.xty.chain;

/**
 * Created by Administrator on 2018/1/6 0006.
 */
public class OrcSoldier extends RequestHandler {
    public OrcSoldier(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.COLLECT_TAX)){
            printHandling(req);
            req.markHandled();
        }else{
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Soldier commander";
    }
}
