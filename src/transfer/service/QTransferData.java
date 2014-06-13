
package transfer.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for QTransferData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QTransferData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.org/}QClientData">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="servFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servFileSize" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="servIndexDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="servIndexUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servIndexingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="servIndexingUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servLastComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servMD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="servModifiedUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servReceivedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="servRejectComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servRejectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="servRejectUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servRelativePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servTransferStatus" type="{http://service.org/}QStatus" minOccurs="0"/>
 *         &lt;element name="sysInQueue" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sysLock" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sysQueueTimeOut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QTransferData", namespace = "www.google.com", propOrder = {
    "id",
    "servFileName",
    "servFilePath",
    "servFileSize",
    "servIndexDate",
    "servIndexUser",
    "servIndexingDate",
    "servIndexingUser",
    "servLastComment",
    "servMD5",
    "servModifiedDate",
    "servModifiedUser",
    "servReceivedDate",
    "servRejectComment",
    "servRejectDate",
    "servRejectUser",
    "servRelativePath",
    "servTransferStatus",
    "sysInQueue",
    "sysLock",
    "sysQueueTimeOut"
})
public class QTransferData
    extends QClientData
{

    protected int id;
    protected String servFileName;
    protected String servFilePath;
    protected double servFileSize;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar servIndexDate;
    protected String servIndexUser;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar servIndexingDate;
    protected String servIndexingUser;
    protected String servLastComment;
    protected String servMD5;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar servModifiedDate;
    protected String servModifiedUser;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar servReceivedDate;
    protected String servRejectComment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar servRejectDate;
    protected String servRejectUser;
    protected String servRelativePath;
    protected QStatus servTransferStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sysInQueue;
    protected boolean sysLock;
    protected int sysQueueTimeOut;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the servFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServFileName() {
        return servFileName;
    }

    /**
     * Sets the value of the servFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServFileName(String value) {
        this.servFileName = value;
    }

    /**
     * Gets the value of the servFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServFilePath() {
        return servFilePath;
    }

    /**
     * Sets the value of the servFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServFilePath(String value) {
        this.servFilePath = value;
    }

    /**
     * Gets the value of the servFileSize property.
     * 
     */
    public double getServFileSize() {
        return servFileSize;
    }

    /**
     * Sets the value of the servFileSize property.
     * 
     */
    public void setServFileSize(double value) {
        this.servFileSize = value;
    }

    /**
     * Gets the value of the servIndexDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServIndexDate() {
        return servIndexDate;
    }

    /**
     * Sets the value of the servIndexDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServIndexDate(XMLGregorianCalendar value) {
        this.servIndexDate = value;
    }

    /**
     * Gets the value of the servIndexUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServIndexUser() {
        return servIndexUser;
    }

    /**
     * Sets the value of the servIndexUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServIndexUser(String value) {
        this.servIndexUser = value;
    }

    /**
     * Gets the value of the servIndexingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServIndexingDate() {
        return servIndexingDate;
    }

    /**
     * Sets the value of the servIndexingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServIndexingDate(XMLGregorianCalendar value) {
        this.servIndexingDate = value;
    }

    /**
     * Gets the value of the servIndexingUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServIndexingUser() {
        return servIndexingUser;
    }

    /**
     * Sets the value of the servIndexingUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServIndexingUser(String value) {
        this.servIndexingUser = value;
    }

    /**
     * Gets the value of the servLastComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServLastComment() {
        return servLastComment;
    }

    /**
     * Sets the value of the servLastComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServLastComment(String value) {
        this.servLastComment = value;
    }

    /**
     * Gets the value of the servMD5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServMD5() {
        return servMD5;
    }

    /**
     * Sets the value of the servMD5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServMD5(String value) {
        this.servMD5 = value;
    }

    /**
     * Gets the value of the servModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServModifiedDate() {
        return servModifiedDate;
    }

    /**
     * Sets the value of the servModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServModifiedDate(XMLGregorianCalendar value) {
        this.servModifiedDate = value;
    }

    /**
     * Gets the value of the servModifiedUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServModifiedUser() {
        return servModifiedUser;
    }

    /**
     * Sets the value of the servModifiedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServModifiedUser(String value) {
        this.servModifiedUser = value;
    }

    /**
     * Gets the value of the servReceivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServReceivedDate() {
        return servReceivedDate;
    }

    /**
     * Sets the value of the servReceivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServReceivedDate(XMLGregorianCalendar value) {
        this.servReceivedDate = value;
    }

    /**
     * Gets the value of the servRejectComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServRejectComment() {
        return servRejectComment;
    }

    /**
     * Sets the value of the servRejectComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServRejectComment(String value) {
        this.servRejectComment = value;
    }

    /**
     * Gets the value of the servRejectDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServRejectDate() {
        return servRejectDate;
    }

    /**
     * Sets the value of the servRejectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServRejectDate(XMLGregorianCalendar value) {
        this.servRejectDate = value;
    }

    /**
     * Gets the value of the servRejectUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServRejectUser() {
        return servRejectUser;
    }

    /**
     * Sets the value of the servRejectUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServRejectUser(String value) {
        this.servRejectUser = value;
    }

    /**
     * Gets the value of the servRelativePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServRelativePath() {
        return servRelativePath;
    }

    /**
     * Sets the value of the servRelativePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServRelativePath(String value) {
        this.servRelativePath = value;
    }

    /**
     * Gets the value of the servTransferStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QStatus }
     *     
     */
    public QStatus getServTransferStatus() {
        return servTransferStatus;
    }

    /**
     * Sets the value of the servTransferStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QStatus }
     *     
     */
    public void setServTransferStatus(QStatus value) {
        this.servTransferStatus = value;
    }

    /**
     * Gets the value of the sysInQueue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSysInQueue() {
        return sysInQueue;
    }

    /**
     * Sets the value of the sysInQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSysInQueue(XMLGregorianCalendar value) {
        this.sysInQueue = value;
    }

    /**
     * Gets the value of the sysLock property.
     * 
     */
    public boolean isSysLock() {
        return sysLock;
    }

    /**
     * Sets the value of the sysLock property.
     * 
     */
    public void setSysLock(boolean value) {
        this.sysLock = value;
    }

    /**
     * Gets the value of the sysQueueTimeOut property.
     * 
     */
    public int getSysQueueTimeOut() {
        return sysQueueTimeOut;
    }

    /**
     * Sets the value of the sysQueueTimeOut property.
     * 
     */
    public void setSysQueueTimeOut(int value) {
        this.sysQueueTimeOut = value;
    }

}
