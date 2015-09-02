
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author eugen
 */
@WebService(serviceName = "CalculatorWebService")
@Stateless()
public class CalculatorWebService {

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
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        int result = a + b;
        return result;
    }
    
    
}
