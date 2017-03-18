 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.exemple.service;

import com.project.exemple.dao.AnalyseDao;
import com.project.exemple.model.gclinique.Analyse;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author PC
 */
@WebService(serviceName = "AnalyseEventWS", targetNamespace="http://service.project.exemple.com/")

public class AnalyseEventWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "GetListanalyse")
    public List<Analyse> GetListanalyse() {
        return new AnalyseDao().GetListanalyse () ;
    }
}
