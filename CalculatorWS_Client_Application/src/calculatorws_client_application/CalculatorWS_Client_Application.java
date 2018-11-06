/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorws_client_application;

/**
 *
 * @author Shagayegh
 */
public class CalculatorWS_Client_Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        int i = 3;
    int j = 4;
    int result = add(i, j);
    int minus_result = minus(i,j);
    System.out.println("Result = " + result);
        System.out.println("Result = " + minus_result);
        }catch(Exception ex){System.out.println("Exception: " + ex);}
        
    }

    private static int add(int i, int j) {
        com.shagha.calculator.CalculatorWs_Service service = new com.shagha.calculator.CalculatorWs_Service();
        com.shagha.calculator.CalculatorWs port = service.getCalculatorWsPort();
        return port.add(i, j);
    }

    private static int minus(int i, int j) {
        com.shagha.calculator.CalculatorWs_Service service = new com.shagha.calculator.CalculatorWs_Service();
        com.shagha.calculator.CalculatorWs port = service.getCalculatorWsPort();
        return port.minus(i, j);
    }
    
}
