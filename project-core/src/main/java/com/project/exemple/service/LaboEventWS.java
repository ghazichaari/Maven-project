 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.exemple.service;

import com.project.exemple.dao.LaboDao;
import com.project.exemple.model.gclinique.Labo;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author PC
 */
@WebService(serviceName = "LaboEventWS", targetNamespace="http://service.project.exemple.com/")

public class LaboEventWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "GetListLabo")
    public List<Labo> GetListlabo() {
        return new LaboDao().GetListlabo () ;
    }
}
