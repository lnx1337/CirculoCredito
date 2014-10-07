
package com.maxcom.mpm.paypal.client.paypal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoAuthorizationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoAuthorizationRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionEntity" type="{urn:ebay:apis:eBLBaseComponents}TransactionEntityType" minOccurs="0"/>
 *         &lt;element name="Amount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}ShipToAddress" minOccurs="0"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}PaymentDetailsItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ItemTotal" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="ShippingTotal" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="HandlingTotal" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="TaxTotal" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="InsuranceTotal" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="ShippingDiscount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="OrderDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Custom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MsgSubID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToStore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoAuthorizationRequestType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "transactionID",
    "transactionEntity",
    "amount",
    "shipToAddress",
    "paymentDetailsItem",
    "itemTotal",
    "shippingTotal",
    "handlingTotal",
    "taxTotal",
    "insuranceTotal",
    "shippingDiscount",
    "orderDescription",
    "custom",
    "msgSubID",
    "ipAddress",
    "shipToStore"
})
public class DoAuthorizationRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "TransactionID", required = true)
    protected String transactionID;
    @XmlElement(name = "TransactionEntity")
    protected TransactionEntityType transactionEntity;
    @XmlElement(name = "Amount", required = true)
    protected BasicAmountType amount;
    @XmlElement(name = "ShipToAddress", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AddressType shipToAddress;
    @XmlElement(name = "PaymentDetailsItem", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<PaymentDetailsItemType> paymentDetailsItem;
    @XmlElement(name = "ItemTotal")
    protected BasicAmountType itemTotal;
    @XmlElement(name = "ShippingTotal")
    protected BasicAmountType shippingTotal;
    @XmlElement(name = "HandlingTotal")
    protected BasicAmountType handlingTotal;
    @XmlElement(name = "TaxTotal")
    protected BasicAmountType taxTotal;
    @XmlElement(name = "InsuranceTotal")
    protected BasicAmountType insuranceTotal;
    @XmlElement(name = "ShippingDiscount")
    protected BasicAmountType shippingDiscount;
    @XmlElement(name = "OrderDescription")
    protected String orderDescription;
    @XmlElement(name = "Custom")
    protected String custom;
    @XmlElement(name = "MsgSubID")
    protected String msgSubID;
    @XmlElement(name = "IPAddress")
    protected String ipAddress;
    @XmlElement(name = "ShipToStore")
    protected String shipToStore;

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the transactionEntity property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionEntityType }
     *     
     */
    public TransactionEntityType getTransactionEntity() {
        return transactionEntity;
    }

    /**
     * Sets the value of the transactionEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionEntityType }
     *     
     */
    public void setTransactionEntity(TransactionEntityType value) {
        this.transactionEntity = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setAmount(BasicAmountType value) {
        this.amount = value;
    }

    /**
     * 
     * 										Address the order will be shipped to.
     * 										
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns="http://www.w3.org/2001/XMLSchema" xmlns:SOAP-ENC="http://schemas.xmlsoap.org/soap/encoding/" xmlns:cc="urn:ebay:apis:CoreComponentTypes" xmlns:ebl="urn:ebay:apis:eBLBaseComponents" xmlns:ed="urn:ebay:apis:EnhancedDataTypes" xmlns:ns="urn:ebay:api:PayPalAPI" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsdlsoap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns="http://www.w3.org/2001/XMLSchema" xmlns:SOAP-ENC="http://schemas.xmlsoap.org/soap/encoding/" xmlns:cc="urn:ebay:apis:CoreComponentTypes" xmlns:ebl="urn:ebay:apis:eBLBaseComponents" xmlns:ed="urn:ebay:apis:EnhancedDataTypes" xmlns:ns="urn:ebay:api:PayPalAPI" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsdlsoap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     * 										Optional
     * 										
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns="http://www.w3.org/2001/XMLSchema" xmlns:SOAP-ENC="http://schemas.xmlsoap.org/soap/encoding/" xmlns:cc="urn:ebay:apis:CoreComponentTypes" xmlns:ebl="urn:ebay:apis:eBLBaseComponents" xmlns:ed="urn:ebay:apis:EnhancedDataTypes" xmlns:ns="urn:ebay:api:PayPalAPI" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsdlsoap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns="http://www.w3.org/2001/XMLSchema" xmlns:SOAP-ENC="http://schemas.xmlsoap.org/soap/encoding/" xmlns:cc="urn:ebay:apis:CoreComponentTypes" xmlns:ebl="urn:ebay:apis:eBLBaseComponents" xmlns:ed="urn:ebay:apis:EnhancedDataTypes" xmlns:ns="urn:ebay:api:PayPalAPI" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsdlsoap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getShipToAddress() {
        return shipToAddress;
    }

    /**
     * Sets the value of the shipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setShipToAddress(AddressType value) {
        this.shipToAddress = value;
    }

    /**
     * 
     * 										Information about the individual purchased items
     * 									Gets the value of the paymentDetailsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDetailsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentDetailsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDetailsItemType }
     * 
     * 
     */
    public List<PaymentDetailsItemType> getPaymentDetailsItem() {
        if (paymentDetailsItem == null) {
            paymentDetailsItem = new ArrayList<PaymentDetailsItemType>();
        }
        return this.paymentDetailsItem;
    }

    /**
     * Gets the value of the itemTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getItemTotal() {
        return itemTotal;
    }

    /**
     * Sets the value of the itemTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setItemTotal(BasicAmountType value) {
        this.itemTotal = value;
    }

    /**
     * Gets the value of the shippingTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getShippingTotal() {
        return shippingTotal;
    }

    /**
     * Sets the value of the shippingTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setShippingTotal(BasicAmountType value) {
        this.shippingTotal = value;
    }

    /**
     * Gets the value of the handlingTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getHandlingTotal() {
        return handlingTotal;
    }

    /**
     * Sets the value of the handlingTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setHandlingTotal(BasicAmountType value) {
        this.handlingTotal = value;
    }

    /**
     * Gets the value of the taxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getTaxTotal() {
        return taxTotal;
    }

    /**
     * Sets the value of the taxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setTaxTotal(BasicAmountType value) {
        this.taxTotal = value;
    }

    /**
     * Gets the value of the insuranceTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getInsuranceTotal() {
        return insuranceTotal;
    }

    /**
     * Sets the value of the insuranceTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setInsuranceTotal(BasicAmountType value) {
        this.insuranceTotal = value;
    }

    /**
     * Gets the value of the shippingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getShippingDiscount() {
        return shippingDiscount;
    }

    /**
     * Sets the value of the shippingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setShippingDiscount(BasicAmountType value) {
        this.shippingDiscount = value;
    }

    /**
     * Gets the value of the orderDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDescription() {
        return orderDescription;
    }

    /**
     * Sets the value of the orderDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDescription(String value) {
        this.orderDescription = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom(String value) {
        this.custom = value;
    }

    /**
     * Gets the value of the msgSubID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgSubID() {
        return msgSubID;
    }

    /**
     * Sets the value of the msgSubID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgSubID(String value) {
        this.msgSubID = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the shipToStore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToStore() {
        return shipToStore;
    }

    /**
     * Sets the value of the shipToStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToStore(String value) {
        this.shipToStore = value;
    }

}
