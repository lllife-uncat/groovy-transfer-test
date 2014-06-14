package test

import client.Tester
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import transfer.service.QTransferData
import transfer.service.QTransferWS

import javax.activation.DataHandler
import javax.activation.FileDataSource

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
        def i = 0;
        (1..100).each {
            def bus = client.getBusinessFunctions()
            Assert.assertTrue(bus != null);
            Assert.assertTrue(bus.size() > 0);
            i++;
        }

        Assert.assertTrue(i == 100);
    }

    @Test
    def void testUploadFile() {
        def file = "/home/recovery/projects/transfer.test.groovy/sample/worldcup2014.gif";
        def fileInfo = new File(file);
        def data = new QTransferData(
                clientFileExtension: ".gif",
                clientFileName: fileInfo.name,
                clientFilePath: fileInfo.absolutePath,
                clientMD5: "TestMD5",
                clientFileSize: fileInfo.getTotalSpace(),
                clientIP: "TestIPAddress",
                clientBranch: "TestBranch",
                clientDepartment: "TestDepartment"
        )
        def source = new FileDataSource(file) ;
        def rs = client.upload(data, new DataHandler(source));
        def ok = rs.isSuccess()
        Assert.assertEquals(ok, true);
    }
}
