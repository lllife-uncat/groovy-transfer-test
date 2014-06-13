
package transfer.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Transfer"/>
 *     &lt;enumeration value="Indexing"/>
 *     &lt;enumeration value="IndexSuccess"/>
 *     &lt;enumeration value="IndexFailed"/>
 *     &lt;enumeration value="Reject"/>
 *     &lt;enumeration value="WrongBusiness"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QStatus")
@XmlEnum
public enum QStatus {

    @XmlEnumValue("Transfer")
    TRANSFER("Transfer"),
    @XmlEnumValue("Indexing")
    INDEXING("Indexing"),
    @XmlEnumValue("IndexSuccess")
    INDEX_SUCCESS("IndexSuccess"),
    @XmlEnumValue("IndexFailed")
    INDEX_FAILED("IndexFailed"),
    @XmlEnumValue("Reject")
    REJECT("Reject"),
    @XmlEnumValue("WrongBusiness")
    WRONG_BUSINESS("WrongBusiness");
    private final String value;

    QStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QStatus fromValue(String v) {
        for (QStatus c: QStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
