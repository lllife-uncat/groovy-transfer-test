package test

import client.Tester
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import transfer.service.QTransferWS

/**
 * Created by recovery on 6/13/14.
 */
class TesterTest {

    def url = "http://localhost:8080/TransferService/QTransferWSImpl"
    def QTransferWS client = null

    @Before
    def void testCreateClient() {
        def tester = new Tester()
        client = tester.createClient(url)
    }

    @Test
    def void testBusinessFunction() {
        def bus = client.getBusinessFunctions()
        Assert.assertTrue(bus != null);
        Assert.assertTrue(bus.size() > 0);
    }

    @Test
    def void testEqual() {
        Assert.assertTrue(0 ==0)
    }
}
