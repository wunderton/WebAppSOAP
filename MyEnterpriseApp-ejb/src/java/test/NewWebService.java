/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Wunderton <your.name at your.org>
 */
@WebService(serviceName = "NewWebService")
@Stateless()
public class NewWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "playTheGame")
    public String playTheGame(@WebParam(name = "clientChoice") String clientChoice) {
        String result = "failure";
        String serverChoice = "rock";
        try {
            if (clientChoice.equalsIgnoreCase("scissors")) {
                result = "loss";
            }
            if (clientChoice.equalsIgnoreCase("paper")) {
                result = "win";
            }
            if (clientChoice.equalsIgnoreCase("rock")) {
                result = "draw";
            }
        } catch (RuntimeException e) {
            System.out.println("Excetion");
        }
        return result;
    }
}
