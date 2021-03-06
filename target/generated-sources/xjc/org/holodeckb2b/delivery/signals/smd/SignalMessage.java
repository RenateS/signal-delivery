//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.08 at 01:04:32 PM CEST 
//


package org.holodeckb2b.delivery.signals.smd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:tns="http://holodeck-b2b.org/schemas/2015/08/smd" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;The structure of this notification resembles the ebMS message header structure. Because notification on Signals does not apply to the PullRequest the PullRequest element is removed as an option for the child of SignalMessage.&lt;br/&gt;
 * Also a choice is introduced to reflect that a notification will only be for on specific Signal, i.e. a Receipt or Error.&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>Java class for SignalMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignalMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageInfo" type="{http://holodeck-b2b.org/schemas/2015/08/smd}MessageInfo"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Receipt" type="{http://holodeck-b2b.org/schemas/2015/08/smd}Receipt"/&gt;
 *           &lt;element name="Error" type="{http://holodeck-b2b.org/schemas/2015/08/smd}Error" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignalMessage", propOrder = {
    "messageInfo",
    "receipt",
    "error"
})
public class SignalMessage {

    @XmlElement(name = "MessageInfo", required = true)
    protected MessageInfo messageInfo;
    @XmlElement(name = "Receipt")
    protected Receipt receipt;
    @XmlElement(name = "Error")
    protected List<Error> error;

    /**
     * Gets the value of the messageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MessageInfo }
     *     
     */
    public MessageInfo getMessageInfo() {
        return messageInfo;
    }

    /**
     * Sets the value of the messageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageInfo }
     *     
     */
    public void setMessageInfo(MessageInfo value) {
        this.messageInfo = value;
    }

    /**
     * Gets the value of the receipt property.
     * 
     * @return
     *     possible object is
     *     {@link Receipt }
     *     
     */
    public Receipt getReceipt() {
        return receipt;
    }

    /**
     * Sets the value of the receipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Receipt }
     *     
     */
    public void setReceipt(Receipt value) {
        this.receipt = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Error }
     * 
     * 
     */
    public List<Error> getError() {
        if (error == null) {
            error = new ArrayList<Error>();
        }
        return this.error;
    }

}
