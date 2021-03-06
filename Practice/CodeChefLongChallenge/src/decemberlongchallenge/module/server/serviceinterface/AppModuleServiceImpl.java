package decemberlongchallenge.module.server.serviceinterface;

import decemberlongchallenge.module.AppModuleAMImpl;
import decemberlongchallenge.module.common.serviceinterface.AppModuleService;

import decemberlongchallenge.uiview.common.SqlinjectionSDO;

import java.lang.reflect.Method;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import javax.interceptor.Interceptors;

import oracle.adf.share.logging.ADFLogger;

import oracle.jbo.common.Diagnostic;
import oracle.jbo.common.sdo.SDOHelper;
import oracle.jbo.server.svc.ServiceContextInterceptor;
import oracle.jbo.server.svc.ServiceImpl;
import oracle.jbo.service.errors.ServiceException;

import oracle.webservices.annotations.PortableWebService;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jan 27 12:25:56 IST 2016
// ---------------------------------------------------------------------
@Stateless(name = "decemberlongchallenge.module.common.AppModuleServiceBean", mappedName = "AppModuleServiceBean")
@Remote(AppModuleService.class)
@PortableWebService(targetNamespace = "/decemberlongchallenge/module/common/", serviceName = "AppModuleService",
                    portName = "AppModuleServiceSoapHttpPort",
                    endpointInterface = "decemberlongchallenge.module.common.serviceinterface.AppModuleService")
@Interceptors({ ServiceContextInterceptor.class })
public class AppModuleServiceImpl extends ServiceImpl implements AppModuleService {
    private static boolean _isInited = false;

    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleServiceImpl() {
        init();
        setApplicationModuleDefName("decemberlongchallenge.module.AppModuleAM");
        setConfigurationName("AppModuleService");
    }

    /**
     * Generated method. Do not modify. Do initialization in the constructor
     */
    protected void init() {
        if (_isInited) {
            return;
        }
        synchronized (AppModuleServiceImpl.class) {
            if (_isInited) {
                return;
            }
            try {
                SDOHelper.INSTANCE.defineSchema("decemberlongchallenge/module/common/serviceinterface/",
                                                "AppModuleService.xsd");
                _isInited = true;
            } catch (Throwable t) {
                ADFLogger.createADFLogger(Diagnostic.SERVINT_RT_LOGGER).severe(t);
            }
        }
    }

    /**
     * createSqlinjection1: generated method. Do not modify.
     */
    public SqlinjectionSDO createSqlinjection1(SqlinjectionSDO sqlinjection1) throws ServiceException {
        return (SqlinjectionSDO) create(sqlinjection1, "Sqlinjection1");
    }

    /**
     * updateSqlinjection1: generated method. Do not modify.
     */
    public SqlinjectionSDO updateSqlinjection1(SqlinjectionSDO sqlinjection1) throws ServiceException {
        return (SqlinjectionSDO) update(sqlinjection1, "Sqlinjection1");
    }

    /**
     * deleteSqlinjection1: generated method. Do not modify.
     */
    public void deleteSqlinjection1(SqlinjectionSDO sqlinjection1) throws ServiceException {
        delete(sqlinjection1, "Sqlinjection1");
    }
}

