package com.project.exemple.generic;

import java.net.MalformedURLException;
import java.net.URL;
import service.AnalyseEventWS;
import service.AnalyseEventWS_Service;
import service.MedecinEventWS;
import service.MedecinEventWS_Service;
import service.LaboEventWS;
import service.LaboEventWS_Service;
public class WS {


 public static MedecinEventWS portWebServiceMedecinEvents;
  public static AnalyseEventWS portWebServiceAnalyseEvents;
 public static LaboEventWS portWebServiceLaboEvents;
 
public MedecinEventWS WebServiceMedecinEventsWS() throws MalformedURLException {
   
     MedecinEventWS_Service service = new MedecinEventWS_Service(new URL("http://localhost:8084/project-core/MedecinEventWS?wsdl"));
        portWebServiceMedecinEvents = service.getMedecinEventWSPort();

        return portWebServiceMedecinEvents;
    
}

public AnalyseEventWS WebServiceAnalyseEventsWS() throws MalformedURLException {
   
     AnalyseEventWS_Service service = new AnalyseEventWS_Service(new URL("http://localhost:8084/project-core/AnalyseEventWS?wsdl"));
        portWebServiceAnalyseEvents = service.getAnalyseEventWSPort();

        return portWebServiceAnalyseEvents;
    
}
public LaboEventWS WebServiceLaboEventsWS() throws MalformedURLException {
   
    LaboEventWS_Service service = new LaboEventWS_Service(new URL("http://localhost:8084/project-core/LaboEventWS?wsdl"));
        portWebServiceLaboEvents = service.getLaboEventWSPort();

        return portWebServiceLaboEvents;
    
}
}
