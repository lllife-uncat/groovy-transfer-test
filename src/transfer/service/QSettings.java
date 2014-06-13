
package transfer.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessFunctions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="connectionString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createTable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="queueSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="queueTimeOut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subBusinessFunctions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="value" type="{http://jaxb.dev.java.net/array}stringArray" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="taskSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="templateMaps" type="{http://service.org/}QTemplateMap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="uploadPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="webSocketServiceUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qSettings", propOrder = {
    "businessFunctions",
    "connectionString",
    "createTable",
    "queueSize",
    "queueTimeOut",
    "subBusinessFunctions",
    "taskSize",
    "templateMaps",
    "uploadPath",
    "webSocketServiceUri"
})
public class QSettings {

    @XmlElement(nillable = true)
    protected List<String> businessFunctions;
    protected String connectionString;
    protected boolean createTable;
    protected int queueSize;
    protected int queueTimeOut;
    @XmlElement(required = true)
    protected QSettings.SubBusinessFunctions subBusinessFunctions;
    protected int taskSize;
    @XmlElement(nillable = true)
    protected List<QTemplateMap> templateMaps;
    protected String uploadPath;
    protected String webSocketServiceUri;

    /**
     * Gets the value of the businessFunctions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessFunctions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessFunctions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBusinessFunctions() {
        if (businessFunctions == null) {
            businessFunctions = new ArrayList<String>();
        }
        return this.businessFunctions;
    }

    /**
     * Gets the value of the connectionString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionString() {
        return connectionString;
    }

    /**
     * Sets the value of the connectionString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionString(String value) {
        this.connectionString = value;
    }

    /**
     * Gets the value of the createTable property.
     * 
     */
    public boolean isCreateTable() {
        return createTable;
    }

    /**
     * Sets the value of the createTable property.
     * 
     */
    public void setCreateTable(boolean value) {
        this.createTable = value;
    }

    /**
     * Gets the value of the queueSize property.
     * 
     */
    public int getQueueSize() {
        return queueSize;
    }

    /**
     * Sets the value of the queueSize property.
     * 
     */
    public void setQueueSize(int value) {
        this.queueSize = value;
    }

    /**
     * Gets the value of the queueTimeOut property.
     * 
     */
    public int getQueueTimeOut() {
        return queueTimeOut;
    }

    /**
     * Sets the value of the queueTimeOut property.
     * 
     */
    public void setQueueTimeOut(int value) {
        this.queueTimeOut = value;
    }

    /**
     * Gets the value of the subBusinessFunctions property.
     * 
     * @return
     *     possible object is
     *     {@link QSettings.SubBusinessFunctions }
     *     
     */
    public QSettings.SubBusinessFunctions getSubBusinessFunctions() {
        return subBusinessFunctions;
    }

    /**
     * Sets the value of the subBusinessFunctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSettings.SubBusinessFunctions }
     *     
     */
    public void setSubBusinessFunctions(QSettings.SubBusinessFunctions value) {
        this.subBusinessFunctions = value;
    }

    /**
     * Gets the value of the taskSize property.
     * 
     */
    public int getTaskSize() {
        return taskSize;
    }

    /**
     * Sets the value of the taskSize property.
     * 
     */
    public void setTaskSize(int value) {
        this.taskSize = value;
    }

    /**
     * Gets the value of the templateMaps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateMaps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateMaps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QTemplateMap }
     * 
     * 
     */
    public List<QTemplateMap> getTemplateMaps() {
        if (templateMaps == null) {
            templateMaps = new ArrayList<QTemplateMap>();
        }
        return this.templateMaps;
    }

    /**
     * Gets the value of the uploadPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadPath() {
        return uploadPath;
    }

    /**
     * Sets the value of the uploadPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadPath(String value) {
        this.uploadPath = value;
    }

    /**
     * Gets the value of the webSocketServiceUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebSocketServiceUri() {
        return webSocketServiceUri;
    }

    /**
     * Sets the value of the webSocketServiceUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebSocketServiceUri(String value) {
        this.webSocketServiceUri = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="value" type="{http://jaxb.dev.java.net/array}stringArray" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class SubBusinessFunctions {

        protected List<QSettings.SubBusinessFunctions.Entry> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QSettings.SubBusinessFunctions.Entry }
         * 
         * 
         */
        public List<QSettings.SubBusinessFunctions.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<QSettings.SubBusinessFunctions.Entry>();
            }
            return this.entry;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="value" type="{http://jaxb.dev.java.net/array}stringArray" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "key",
            "value"
        })
        public static class Entry {

            protected String key;
            protected StringArray value;

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKey(String value) {
                this.key = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link StringArray }
             *     
             */
            public StringArray getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link StringArray }
             *     
             */
            public void setValue(StringArray value) {
                this.value = value;
            }

        }

    }

}
