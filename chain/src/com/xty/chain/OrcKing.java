package com.xty.chain;

/**
 * Created by Administrator on 2018/1/6 0006.
 */
public class OrcKing{

    RequestHandler chain;

    public OrcKing() {
        buildChain();
    }

    private void buildChain(){
        chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }

    public void makeRequest(Request req){
        chain.handleRequest(req);
    }
}
