package model.module.common.serviceinterface;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;

import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import model.uiview.common.SqlinjectionSDO;

import oracle.jbo.service.errors.ServiceException;

import oracle.webservices.annotations.PortableWebService;
import oracle.webservices.annotations.SDODatabinding;
import oracle.webservices.annotations.async.AsyncWebService;
import oracle.webservices.annotations.async.CallbackMethod;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jan 27 12:27:47 IST 2016
// ---------------------------------------------------------------------
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.WRAPPED, style = SOAPBinding.Style.DOCUMENT)
@PortableWebService(targetNamespace = "/model/module/common/", name = "AppModuleService",
                    wsdlLocation = "model/module/common/serviceinterface/AppModuleService.wsdl")
@SDODatabinding(schemaLocation = "model/module/common/serviceinterface/AppModuleService.xsd")
@AsyncWebService
public interface AppModuleService {
    public static final String NAME = "{/model/module/common/}AppModuleService";

    @WebMethod(action = "/model/module/common/createSqlinjection1", operationName = "createSqlinjection1")
    @RequestWrapper(targetNamespace = "/model/module/common/types/", localName = "createSqlinjection1")
    @ResponseWrapper(targetNamespace = "/model/module/common/types/", localName = "createSqlinjection1Response")
    @WebResult(name = "result")
    @CallbackMethod(exclude = true)
    SqlinjectionSDO createSqlinjection1(@WebParam(mode = WebParam.Mode.IN, name = "sqlinjection1")
                                        SqlinjectionSDO sqlinjection1) throws ServiceException;

    @WebMethod(action = "/model/module/common/updateSqlinjection1", operationName = "updateSqlinjection1")
    @RequestWrapper(targetNamespace = "/model/module/common/types/", localName = "updateSqlinjection1")
    @ResponseWrapper(targetNamespace = "/model/module/common/types/", localName = "updateSqlinjection1Response")
    @WebResult(name = "result")
    @CallbackMethod(exclude = true)
    SqlinjectionSDO updateSqlinjection1(@WebParam(mode = WebParam.Mode.IN, name = "sqlinjection1")
                                        SqlinjectionSDO sqlinjection1) throws ServiceException;

    @WebMethod(action = "/model/module/common/deleteSqlinjection1", operationName = "deleteSqlinjection1")
    @RequestWrapper(targetNamespace = "/model/module/common/types/", localName = "deleteSqlinjection1")
    @ResponseWrapper(targetNamespace = "/model/module/common/types/", localName = "deleteSqlinjection1Response")
    @CallbackMethod(exclude = true)
    void deleteSqlinjection1(@WebParam(mode = WebParam.Mode.IN, name = "sqlinjection1")
                             SqlinjectionSDO sqlinjection1) throws ServiceException;

    @WebMethod(action = "/model/module/common/createSqlinjection1Async", operationName = "createSqlinjection1Async")
    @RequestWrapper(targetNamespace = "/model/module/common/types/", localName = "createSqlinjection1Async")
    @ResponseWrapper(targetNamespace = "/model/module/common/types/", localName = "createSqlinjection1AsyncResponse")
    @WebResult(name = "result")
    @Action(input = "/model/module/common/createSqlinjection1Async",
            output = "/model/module/common/createSqlinjection1AsyncResponse")
    SqlinjectionSDO createSqlinjection1Async(@WebParam(mode = WebParam.Mode.IN, name = "sqlinjection1")
                                             SqlinjectionSDO sqlinjection1) throws ServiceException;

    @WebMethod(action = "/model/module/common/deleteSqlinjection1Async", operationName = "deleteSqlinjection1Async")
    @RequestWrapper(targetNamespace = "/model/module/common/types/", localName = "deleteSqlinjection1Async")
    @ResponseWrapper(targetNamespace = "/model/module/common/types/", localName = "deleteSqlinjection1AsyncResponse")
    @Action(input = "/model/module/common/deleteSqlinjection1Async",
            output = "/model/module/common/deleteSqlinjection1AsyncResponse")
    void deleteSqlinjection1Async(@WebParam(mode = WebParam.Mode.IN, name = "sqlinjection1")
                                  SqlinjectionSDO sqlinjection1) throws ServiceException;

    @WebMethod(action = "/model/module/common/updateSqlinjection1Async", operationName = "updateSqlinjection1Async")
    @RequestWrapper(targetNamespace = "/model/module/common/types/", localName = "updateSqlinjection1Async")
    @ResponseWrapper(targetNamespace = "/model/module/common/types/", localName = "updateSqlinjection1AsyncResponse")
    @WebResult(name = "result")
    @Action(input = "/model/module/common/updateSqlinjection1Async",
            output = "/model/module/common/updateSqlinjection1AsyncResponse")
    SqlinjectionSDO updateSqlinjection1Async(@WebParam(mode = WebParam.Mode.IN, name = "sqlinjection1")
                                             SqlinjectionSDO sqlinjection1) throws ServiceException;
}

