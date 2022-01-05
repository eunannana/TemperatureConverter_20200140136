/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temperature.converter.temperature.converter.different.method;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author andri
 */
public class classProcessTC{

    public String getCelcius(HttpServletRequest data)
    {
        String itsCelcius = data.getParameter("celcius");
        return itsCelcius;
    }
    public Double dataCelcius(String itsCelcius){
        Double thisisCelcius = Double.valueOf(itsCelcius);
        return thisisCelcius;
    }

   public Double GetTemperatureConverterCtoF(Double thisisCelcius){        
       Double ctof = (1.8 * thisisCelcius) + 32;
       return ctof;}
    public Double GetTemperatureConverterCtoR(Double thisisCelcius){ 
       Double ctor = 0.8 * thisisCelcius;
       return ctor;}
    public Double GetTemperatureConverterCtoK(Double thisisCelcius){      
       Double ctok = thisisCelcius + 273;
       return ctok;}
    }
        
        




