/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temperature.converter.temperature.converter.different.method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import temperature.converter.temperature.converter.different.method.classProcessTC;
import java.util.Scanner;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;

/**
 *
 * @author andri
 */
@Controller
public class projectController {
  
    @RequestMapping("/temperatureconverter")
    
    public String temperature(HttpServletRequest data, Model temperatureprocess){
        
        classProcessTC process = new classProcessTC();
        
        String inputC = process.getCelcius(data);
        Double input_celcius = process.dataCelcius(inputC);
        
        Double CtoF = process.GetTemperatureConverterCtoF(input_celcius);
        
        Double CtoR = process.GetTemperatureConverterCtoR(input_celcius);
        
        Double CtoK = process.GetTemperatureConverterCtoK(input_celcius);
        
        temperatureprocess.addAttribute("c", input_celcius);
        temperatureprocess.addAttribute("f", CtoF);
        temperatureprocess.addAttribute("r", CtoR);
        temperatureprocess.addAttribute("k", CtoK);
    
        return "viewConverter";
    }
    
}
  


