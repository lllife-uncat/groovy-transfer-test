
package transfer.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the transfer.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetTransferData_QNAME = new QName("http://service.org/", "GetTransferData");
    private final static QName _GetBusinessFunctionsResponse_QNAME = new QName("http://service.org/", "GetBusinessFunctionsResponse");
    private final static QName _LockResponse_QNAME = new QName("http://service.org/", "LockResponse");
    private final static QName _InsertUploadInfoResponse_QNAME = new QName("http://service.org/", "InsertUploadInfoResponse");
    private final static QName _InsertUploadInfo_QNAME = new QName("http://service.org/", "InsertUploadInfo");
    private final static QName _GetTransferDataResponse_QNAME = new QName("http://service.org/", "GetTransferDataResponse");
    private final static QName _GetSettingsResponse_QNAME = new QName("http://service.org/", "GetSettingsResponse");
    private final static QName _UnlockResponse_QNAME = new QName("http://service.org/", "UnlockResponse");
    private final static QName _GetTemplateMaps_QNAME = new QName("http://service.org/", "GetTemplateMaps");
    private final static QName _GetSettings_QNAME = new QName("http://service.org/", "GetSettings");
    private final static QName _GetBusinessInfoResponse_QNAME = new QName("http://service.org/", "GetBusinessInfoResponse");
    private final static QName _GetTemplateMapsResponse_QNAME = new QName("http://service.org/", "GetTemplateMapsResponse");
    private final static QName _GetTransferDatasV2_QNAME = new QName("http://service.org/", "GetTransferDatasV2");
    private final static QName _GetTransferDatasV2Response_QNAME = new QName("http://service.org/", "GetTransferDatasV2Response");
    private final static QName _ExtractTypes_QNAME = new QName("http://service.org/", "ExtractTypes");
    private final static QName _GetBusinessFunctions_QNAME = new QName("http://service.org/", "GetBusinessFunctions");
    private final static QName _ExtractTypesResponse_QNAME = new QName("http://service.org/", "ExtractTypesResponse");
    private final static QName _Unlock_QNAME = new QName("http://service.org/", "Unlock");
    private final static QName _GetWebSocketUri_QNAME = new QName("http://service.org/", "GetWebSocketUri");
    private final static QName _UpdateResponse_QNAME = new QName("http://service.org/", "UpdateResponse");
    private final static QName _GetWebSocketUriResponse_QNAME = new QName("http://service.org/", "GetWebSocketUriResponse");
    private final static QName _GetBusinessInfo_QNAME = new QName("http://service.org/", "GetBusinessInfo");
    private final static QName _UploadResponse_QNAME = new QName("http://service.org/", "UploadResponse");
    private final static QName _Update_QNAME = new QName("http://service.org/", "Update");
    private final static QName _Lock_QNAME = new QName("http://service.org/", "Lock");
    private final static QName _Upload_QNAME = new QName("http://service.org/", "Upload");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: transfer.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QSettings }
     * 
     */
    public QSettings createQSettings() {
        return new QSettings();
    }

    /**
     * Create an instance of {@link QSettings.SubBusinessFunctions }
     * 
     */
    public QSettings.SubBusinessFunctions createQSettingsSubBusinessFunctions() {
        return new QSettings.SubBusinessFunctions();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link UploadResponse }
     * 
     */
    public UploadResponse createUploadResponse() {
        return new UploadResponse();
    }

    /**
     * Create an instance of {@link GetBusinessInfo }
     * 
     */
    public GetBusinessInfo createGetBusinessInfo() {
        return new GetBusinessInfo();
    }

    /**
     * Create an instance of {@link GetWebSocketUriResponse }
     * 
     */
    public GetWebSocketUriResponse createGetWebSocketUriResponse() {
        return new GetWebSocketUriResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link Lock }
     * 
     */
    public Lock createLock() {
        return new Lock();
    }

    /**
     * Create an instance of {@link Upload }
     * 
     */
    public Upload createUpload() {
        return new Upload();
    }

    /**
     * Create an instance of {@link GetTransferDatasV2Response }
     * 
     */
    public GetTransferDatasV2Response createGetTransferDatasV2Response() {
        return new GetTransferDatasV2Response();
    }

    /**
     * Create an instance of {@link ExtractTypes }
     * 
     */
    public ExtractTypes createExtractTypes() {
        return new ExtractTypes();
    }

    /**
     * Create an instance of {@link GetBusinessFunctions }
     * 
     */
    public GetBusinessFunctions createGetBusinessFunctions() {
        return new GetBusinessFunctions();
    }

    /**
     * Create an instance of {@link ExtractTypesResponse }
     * 
     */
    public ExtractTypesResponse createExtractTypesResponse() {
        return new ExtractTypesResponse();
    }

    /**
     * Create an instance of {@link Unlock }
     * 
     */
    public Unlock createUnlock() {
        return new Unlock();
    }

    /**
     * Create an instance of {@link GetWebSocketUri }
     * 
     */
    public GetWebSocketUri createGetWebSocketUri() {
        return new GetWebSocketUri();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link InsertUploadInfo }
     * 
     */
    public InsertUploadInfo createInsertUploadInfo() {
        return new InsertUploadInfo();
    }

    /**
     * Create an instance of {@link GetTransferDataResponse }
     * 
     */
    public GetTransferDataResponse createGetTransferDataResponse() {
        return new GetTransferDataResponse();
    }

    /**
     * Create an instance of {@link GetTemplateMaps }
     * 
     */
    public GetTemplateMaps createGetTemplateMaps() {
        return new GetTemplateMaps();
    }

    /**
     * Create an instance of {@link GetSettings }
     * 
     */
    public GetSettings createGetSettings() {
        return new GetSettings();
    }

    /**
     * Create an instance of {@link GetSettingsResponse }
     * 
     */
    public GetSettingsResponse createGetSettingsResponse() {
        return new GetSettingsResponse();
    }

    /**
     * Create an instance of {@link UnlockResponse }
     * 
     */
    public UnlockResponse createUnlockResponse() {
        return new UnlockResponse();
    }

    /**
     * Create an instance of {@link GetBusinessInfoResponse }
     * 
     */
    public GetBusinessInfoResponse createGetBusinessInfoResponse() {
        return new GetBusinessInfoResponse();
    }

    /**
     * Create an instance of {@link GetTemplateMapsResponse }
     * 
     */
    public GetTemplateMapsResponse createGetTemplateMapsResponse() {
        return new GetTemplateMapsResponse();
    }

    /**
     * Create an instance of {@link GetTransferDatasV2 }
     * 
     */
    public GetTransferDatasV2 createGetTransferDatasV2() {
        return new GetTransferDatasV2();
    }

    /**
     * Create an instance of {@link GetTransferData }
     * 
     */
    public GetTransferData createGetTransferData() {
        return new GetTransferData();
    }

    /**
     * Create an instance of {@link LockResponse }
     * 
     */
    public LockResponse createLockResponse() {
        return new LockResponse();
    }

    /**
     * Create an instance of {@link GetBusinessFunctionsResponse }
     * 
     */
    public GetBusinessFunctionsResponse createGetBusinessFunctionsResponse() {
        return new GetBusinessFunctionsResponse();
    }

    /**
     * Create an instance of {@link InsertUploadInfoResponse }
     * 
     */
    public InsertUploadInfoResponse createInsertUploadInfoResponse() {
        return new InsertUploadInfoResponse();
    }

    /**
     * Create an instance of {@link QClientData }
     * 
     */
    public QClientData createQClientData() {
        return new QClientData();
    }

    /**
     * Create an instance of {@link QStatusCode }
     * 
     */
    public QStatusCode createQStatusCode() {
        return new QStatusCode();
    }

    /**
     * Create an instance of {@link QResult }
     * 
     */
    public QResult createQResult() {
        return new QResult();
    }

    /**
     * Create an instance of {@link QBusinessInfo }
     * 
     */
    public QBusinessInfo createQBusinessInfo() {
        return new QBusinessInfo();
    }

    /**
     * Create an instance of {@link QUploadInfo }
     * 
     */
    public QUploadInfo createQUploadInfo() {
        return new QUploadInfo();
    }

    /**
     * Create an instance of {@link QTemplateMap }
     * 
     */
    public QTemplateMap createQTemplateMap() {
        return new QTemplateMap();
    }

    /**
     * Create an instance of {@link QTransferData }
     * 
     */
    public QTransferData createQTransferData() {
        return new QTransferData();
    }

    /**
     * Create an instance of {@link QSettings.SubBusinessFunctions.Entry }
     * 
     */
    public QSettings.SubBusinessFunctions.Entry createQSettingsSubBusinessFunctionsEntry() {
        return new QSettings.SubBusinessFunctions.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransferData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "GetTransferData")
    public JAXBElement<GetTransferData> createGetTransferData(GetTransferData value) {
        return new JAXBElement<GetTransferData>(_GetTransferData_QNAME, GetTransferData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBusinessFunctionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "GetBusinessFunctionsResponse")
    public JAXBElement<GetBusinessFunctionsResponse> createGetBusinessFunctionsResponse(GetBusinessFunctionsResponse value) {
        return new JAXBElement<GetBusinessFunctionsResponse>(_GetBusinessFunctionsResponse_QNAME, GetBusinessFunctionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "LockResponse")
    public JAXBElement<LockResponse> createLockResponse(LockResponse value) {
        return new JAXBElement<LockResponse>(_LockResponse_QNAME, LockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertUploadInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "InsertUploadInfoResponse")
    public JAXBElement<InsertUploadInfoResponse> createInsertUploadInfoResponse(InsertUploadInfoResponse value) {
        return new JAXBElement<InsertUploadInfoResponse>(_InsertUploadInfoResponse_QNAME, InsertUploadInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertUploadInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "InsertUploadInfo")
    public JAXBElement<InsertUploadInfo> createInsertUploadInfo(InsertUploadInfo value) {
        return new JAXBElement<InsertUploadInfo>(_InsertUploadInfo_QNAME, InsertUploadInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransferDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "GetTransferDataResponse")
    public JAXBElement<GetTransferDataResponse> createGetTransferDataResponse(GetTransferDataResponse value) {
        return new JAXBElement<GetTransferDataResponse>(_GetTransferDataResponse_QNAME, GetTransferDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSettingsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "GetSettingsResponse")
    public JAXBElement<GetSettingsResponse> createGetSettingsResponse(GetSettingsResponse value) {
        return new JAXBElement<GetSettingsResponse>(_GetSettingsResponse_QNAME, GetSettingsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnlockResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "UnlockResponse")
    public JAXBElement<UnlockResponse> createUnlockResponse(UnlockResponse value) {
        return new JAXBElement<UnlockResponse>(_UnlockResponse_QNAME, UnlockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemplateMaps }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "GetTemplateMaps")
    public JAXBElement<GetTemplateMaps> createGetTemplateMaps(GetTemplateMaps value) {
        return new JAXBElement<GetTemplateMaps>(_GetTemplateMaps_QNAME, GetTemplateMaps.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "GetSettings")
    public JAXBElement<GetSettings> createGetSettings(GetSettings value) {
        return new JAXBElement<GetSettings>(_GetSettings_QNAME, GetSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBusinessInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "GetBusinessInfoResponse")
    public JAXBElement<GetBusinessInfoResponse> createGetBusinessInfoResponse(GetBusinessInfoResponse value) {
        return new JAXBElement<GetBusinessInfoResponse>(_GetBusinessInfoResponse_QNAME, GetBusinessInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemplateMapsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "GetTemplateMapsResponse")
    public JAXBElement<GetTemplateMapsResponse> createGetTemplateMapsResponse(GetTemplateMapsResponse value) {
        return new JAXBElement<GetTemplateMapsResponse>(_GetTemplateMapsResponse_QNAME, GetTemplateMapsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransferDatasV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "GetTransferDatasV2")
    public JAXBElement<GetTransferDatasV2> createGetTransferDatasV2(GetTransferDatasV2 value) {
        return new JAXBElement<GetTransferDatasV2>(_GetTransferDatasV2_QNAME, GetTransferDatasV2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransferDatasV2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "GetTransferDatasV2Response")
    public JAXBElement<GetTransferDatasV2Response> createGetTransferDatasV2Response(GetTransferDatasV2Response value) {
        return new JAXBElement<GetTransferDatasV2Response>(_GetTransferDatasV2Response_QNAME, GetTransferDatasV2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtractTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "ExtractTypes")
    public JAXBElement<ExtractTypes> createExtractTypes(ExtractTypes value) {
        return new JAXBElement<ExtractTypes>(_ExtractTypes_QNAME, ExtractTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBusinessFunctions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "GetBusinessFunctions")
    public JAXBElement<GetBusinessFunctions> createGetBusinessFunctions(GetBusinessFunctions value) {
        return new JAXBElement<GetBusinessFunctions>(_GetBusinessFunctions_QNAME, GetBusinessFunctions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtractTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "ExtractTypesResponse")
    public JAXBElement<ExtractTypesResponse> createExtractTypesResponse(ExtractTypesResponse value) {
        return new JAXBElement<ExtractTypesResponse>(_ExtractTypesResponse_QNAME, ExtractTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Unlock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "Unlock")
    public JAXBElement<Unlock> createUnlock(Unlock value) {
        return new JAXBElement<Unlock>(_Unlock_QNAME, Unlock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWebSocketUri }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "GetWebSocketUri")
    public JAXBElement<GetWebSocketUri> createGetWebSocketUri(GetWebSocketUri value) {
        return new JAXBElement<GetWebSocketUri>(_GetWebSocketUri_QNAME, GetWebSocketUri.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "UpdateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWebSocketUriResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "GetWebSocketUriResponse")
    public JAXBElement<GetWebSocketUriResponse> createGetWebSocketUriResponse(GetWebSocketUriResponse value) {
        return new JAXBElement<GetWebSocketUriResponse>(_GetWebSocketUriResponse_QNAME, GetWebSocketUriResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBusinessInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "GetBusinessInfo")
    public JAXBElement<GetBusinessInfo> createGetBusinessInfo(GetBusinessInfo value) {
        return new JAXBElement<GetBusinessInfo>(_GetBusinessInfo_QNAME, GetBusinessInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "UploadResponse")
    public JAXBElement<UploadResponse> createUploadResponse(UploadResponse value) {
        return new JAXBElement<UploadResponse>(_UploadResponse_QNAME, UploadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "Update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "Lock")
    public JAXBElement<Lock> createLock(Lock value) {
        return new JAXBElement<Lock>(_Lock_QNAME, Lock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Upload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.org/", name = "Upload")
    public JAXBElement<Upload> createUpload(Upload value) {
        return new JAXBElement<Upload>(_Upload_QNAME, Upload.class, null, value);
    }

}
