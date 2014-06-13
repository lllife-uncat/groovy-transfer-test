
package transfer.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ok"/>
 *     &lt;enumeration value="ConnectDbFailed"/>
 *     &lt;enumeration value="ConnectWebServiceFailed"/>
 *     &lt;enumeration value="WriteFileFailed"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusCode")
@XmlEnum
public enum StatusCode {

    @XmlEnumValue("Ok")
    OK("Ok"),
    @XmlEnumValue("ConnectDbFailed")
    CONNECT_DB_FAILED("ConnectDbFailed"),
    @XmlEnumValue("ConnectWebServiceFailed")
    CONNECT_WEB_SERVICE_FAILED("ConnectWebServiceFailed"),
    @XmlEnumValue("WriteFileFailed")
    WRITE_FILE_FAILED("WriteFileFailed"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    StatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusCode fromValue(String v) {
        for (StatusCode c: StatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
