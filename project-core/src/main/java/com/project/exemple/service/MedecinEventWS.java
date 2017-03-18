 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projecr.exemple.service;

import com.project.exemple.dao.MedecinDao;
import com.project.exemple.model.gclinique.Medecin;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author PC
 */
@WebService(serviceName = "MedecinEventWS", targetNamespace="http://service.project.exemple.com/")

public class MedecinEventWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "GetListmedecin")
    public List<Medecin> GetListmedecin() {
        return new MedecinDao().GetListmedecin () ;
    }
}
