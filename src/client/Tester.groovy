package client

import transfer.service.TransferWS

/**
 * Created by recovery on 6/13/14.
 */
class Tester {
    def createClient(String endpoint) {
        def url = new URL(endpoint);
        def service = new TransferWS(url);
        def client = service.getQTransferWSImplPort();
        return client;
    }
}
