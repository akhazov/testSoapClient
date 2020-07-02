
package com.example.smevsid0003817.wsdl.epgu;

import com.example.smevsid0003817.wsdl.rev120315.EpguCancelRequestType;
import com.example.smevsid0003817.wsdl.rev120315.EpguForeignCitizenRequestType;
import com.example.smevsid0003817.wsdl.rev120315.EpguJuridicalPersonRequestType;
import com.example.smevsid0003817.wsdl.rev120315.EpguPrivateEntrepreneurRequestType;
import com.example.smevsid0003817.wsdl.rev120315.EpguPrivatePersonRequestType;
import com.example.smevsid0003817.wsdl.rev120315.EpguResponseType;
import com.example.smevsid0003817.wsdl.rev120315.HeaderType;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EpguPortType", targetNamespace = "http://epgu.skmv.rstyle.com")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
        com.example.smevsid0003817.wsdl.epgu.ObjectFactory.class,
        com.example.smevsid0003817.wsdl.pfr.ObjectFactory.class,
        com.example.smevsid0003817.wsdl.include.ObjectFactory.class,
        com.example.smevsid0003817.wsdl.rev120315.ObjectFactory.class
})
public interface EpguPortType {


    /**
     * 
     * @param smevHeader
     * @param parameters
     * @return
     *     returns ru.gosuslugi.smev.rev120315.EpguResponseType
     */
    @WebMethod(operationName = "EpguPrivatePersonRequest", action = "EpguPrivatePerson")
    @WebResult(name = "EpguResponse", targetNamespace = "http://epgu.skmv.rstyle.com", partName = "parameters")
    public EpguResponseType epguPrivatePersonRequest(
        @WebParam(name = "Header", targetNamespace = "http://smev.gosuslugi.ru/rev120315", header = true, partName = "SmevHeader")
        HeaderType smevHeader,
        @WebParam(name = "EpguPrivatePersonRequest", targetNamespace = "http://epgu.skmv.rstyle.com", partName = "parameters")
        EpguPrivatePersonRequestType parameters);

    /**
     * 
     * @param smevHeader
     * @param parameters
     * @return
     *     returns ru.gosuslugi.smev.rev120315.EpguResponseType
     */
    @WebMethod(operationName = "EpguPrivateEntrepreneurRequest", action = "EpguPrivateEntrepreneur")
    @WebResult(name = "EpguResponse", targetNamespace = "http://epgu.skmv.rstyle.com", partName = "parameters")
    public EpguResponseType epguPrivateEntrepreneurRequest(
        @WebParam(name = "Header", targetNamespace = "http://smev.gosuslugi.ru/rev120315", header = true, partName = "SmevHeader")
        HeaderType smevHeader,
        @WebParam(name = "EpguPrivateEntrepreneurRequest", targetNamespace = "http://epgu.skmv.rstyle.com", partName = "parameters")
        EpguPrivateEntrepreneurRequestType parameters);

    /**
     * 
     * @param smevHeader
     * @param parameters
     * @return
     *     returns ru.gosuslugi.smev.rev120315.EpguResponseType
     */
    @WebMethod(operationName = "EpguJuridicalPersonRequest", action = "EpguJuridicalPerson")
    @WebResult(name = "EpguResponse", targetNamespace = "http://epgu.skmv.rstyle.com", partName = "parameters")
    public EpguResponseType epguJuridicalPersonRequest(
        @WebParam(name = "Header", targetNamespace = "http://smev.gosuslugi.ru/rev120315", header = true, partName = "SmevHeader")
        HeaderType smevHeader,
        @WebParam(name = "EpguJuridicalPersonRequest", targetNamespace = "http://epgu.skmv.rstyle.com", partName = "parameters")
        EpguJuridicalPersonRequestType parameters);

    /**
     * 
     * @param smevHeader
     * @param parameters
     * @return
     *     returns ru.gosuslugi.smev.rev120315.EpguResponseType
     */
    @WebMethod(operationName = "EpguForeignCitizenRequest", action = "EpguForeignCitizen")
    @WebResult(name = "EpguResponse", targetNamespace = "http://epgu.skmv.rstyle.com", partName = "parameters")
    public EpguResponseType epguForeignCitizenRequest(
        @WebParam(name = "Header", targetNamespace = "http://smev.gosuslugi.ru/rev120315", header = true, partName = "SmevHeader")
        HeaderType smevHeader,
        @WebParam(name = "EpguForeignCitizenRequest", targetNamespace = "http://epgu.skmv.rstyle.com", partName = "parameters")
        EpguForeignCitizenRequestType parameters);

    /**
     * 
     * @param smevHeader
     * @param parameters
     * @return
     *     returns ru.gosuslugi.smev.rev120315.EpguResponseType
     */
    @WebMethod(operationName = "EpguCancelRequest", action = "EpguCancel")
    @WebResult(name = "EpguResponse", targetNamespace = "http://epgu.skmv.rstyle.com", partName = "parameters")
    public EpguResponseType epguCancelRequest(
        @WebParam(name = "Header", targetNamespace = "http://smev.gosuslugi.ru/rev120315", header = true, partName = "SmevHeader")
        HeaderType smevHeader,
        @WebParam(name = "EpguCancelRequest", targetNamespace = "http://epgu.skmv.rstyle.com", partName = "parameters")
        EpguCancelRequestType parameters);

}