
package com.example.smevsid0003817.wsdl.ru.gosuslugi.smev.rev120315;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EpguPrivateEntrepreneurRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EpguPrivateEntrepreneurRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://smev.gosuslugi.ru/rev120315}BaseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}Message"/&gt;
 *         &lt;element name="MessageData"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://smev.gosuslugi.ru/rev120315}MessageDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AppData" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://smev.gosuslugi.ru/rev120315}AppDataType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://epgu.skmv.rstyle.com}PrivateEntrepreneurData"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;anyAttribute processContents='lax'/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element ref="{http://smev.gosuslugi.ru/rev120315}AppDocument" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EpguPrivateEntrepreneurRequestType")
public class EpguPrivateEntrepreneurRequestType
    extends BaseMessageType
{


}
