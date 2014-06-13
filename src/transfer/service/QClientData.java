
package transfer.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for QClientData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QClientData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientFileExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientFileSize" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="clientIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientMD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientPriority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="clientSubDivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientTotalForms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="clientUploadDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="clientUploadForms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="clientVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QClientData", propOrder = {
    "clientBranch",
    "clientDepartment",
    "clientFileExtension",
    "clientFileName",
    "clientFilePath",
    "clientFileSize",
    "clientIP",
    "clientMD5",
    "clientPriority",
    "clientSubDivision",
    "clientTotalForms",
    "clientUploadDate",
    "clientUploadForms",
    "clientVersion"
})
@XmlSeeAlso({
    QTransferData.class
})
public class QClientData {

    protected String clientBranch;
    protected String clientDepartment;
    protected String clientFileExtension;
    protected String clientFileName;
    protected String clientFilePath;
    protected double clientFileSize;
    protected String clientIP;
    protected String clientMD5;
    protected int clientPriority;
    protected String clientSubDivision;
    protected int clientTotalForms;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clientUploadDate;
    protected int clientUploadForms;
    protected String clientVersion;

    /**
     * Gets the value of the clientBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientBranch() {
        return clientBranch;
    }

    /**
     * Sets the value of the clientBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientBranch(String value) {
        this.clientBranch = value;
    }

    /**
     * Gets the value of the clientDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientDepartment() {
        return clientDepartment;
    }

    /**
     * Sets the value of the clientDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientDepartment(String value) {
        this.clientDepartment = value;
    }

    /**
     * Gets the value of the clientFileExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientFileExtension() {
        return clientFileExtension;
    }

    /**
     * Sets the value of the clientFileExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientFileExtension(String value) {
        this.clientFileExtension = value;
    }

    /**
     * Gets the value of the clientFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientFileName() {
        return clientFileName;
    }

    /**
     * Sets the value of the clientFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientFileName(String value) {
        this.clientFileName = value;
    }

    /**
     * Gets the value of the clientFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientFilePath() {
        return clientFilePath;
    }

    /**
     * Sets the value of the clientFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientFilePath(String value) {
        this.clientFilePath = value;
    }

    /**
     * Gets the value of the clientFileSize property.
     * 
     */
    public double getClientFileSize() {
        return clientFileSize;
    }

    /**
     * Sets the value of the clientFileSize property.
     * 
     */
    public void setClientFileSize(double value) {
        this.clientFileSize = value;
    }

    /**
     * Gets the value of the clientIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientIP() {
        return clientIP;
    }

    /**
     * Sets the value of the clientIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientIP(String value) {
        this.clientIP = value;
    }

    /**
     * Gets the value of the clientMD5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientMD5() {
        return clientMD5;
    }

    /**
     * Sets the value of the clientMD5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientMD5(String value) {
        this.clientMD5 = value;
    }

    /**
     * Gets the value of the clientPriority property.
     * 
     */
    public int getClientPriority() {
        return clientPriority;
    }

    /**
     * Sets the value of the clientPriority property.
     * 
     */
    public void setClientPriority(int value) {
        this.clientPriority = value;
    }

    /**
     * Gets the value of the clientSubDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSubDivision() {
        return clientSubDivision;
    }

    /**
     * Sets the value of the clientSubDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSubDivision(String value) {
        this.clientSubDivision = value;
    }

    /**
     * Gets the value of the clientTotalForms property.
     * 
     */
    public int getClientTotalForms() {
        return clientTotalForms;
    }

    /**
     * Sets the value of the clientTotalForms property.
     * 
     */
    public void setClientTotalForms(int value) {
        this.clientTotalForms = value;
    }

    /**
     * Gets the value of the clientUploadDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClientUploadDate() {
        return clientUploadDate;
    }

    /**
     * Sets the value of the clientUploadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClientUploadDate(XMLGregorianCalendar value) {
        this.clientUploadDate = value;
    }

    /**
     * Gets the value of the clientUploadForms property.
     * 
     */
    public int getClientUploadForms() {
        return clientUploadForms;
    }

    /**
     * Sets the value of the clientUploadForms property.
     * 
     */
    public void setClientUploadForms(int value) {
        this.clientUploadForms = value;
    }

    /**
     * Gets the value of the clientVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientVersion() {
        return clientVersion;
    }

    /**
     * Sets the value of the clientVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientVersion(String value) {
        this.clientVersion = value;
    }

}
