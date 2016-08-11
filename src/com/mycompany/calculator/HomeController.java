/**
* This HomeController class handles the models and views that
* the front controller is looking for and returns them
*
* @author  Brad Berkobien
* @version 1.0
* @since   08/11/2016
*/

package com.mycompany.calculator;

import java.text.DecimalFormat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


//this controller controls what model the dispatcher servlet should get
@Controller
public class HomeController
{
	/* Method: getCalculatorValues()
	 * Input: nothing
	 * Returns: The model and view for the Calculator home page
	 * Description: Creates the HomePage model and view 
	 *   and returns it.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	protected ModelAndView getCalculatorValues()
	{        
		ModelAndView model = new ModelAndView("HomePage");
		
		return model;
	}
	
	/* Method: setTotalValue()
	 * Input: String leftNumber which is the left
	 *   number that the user types; String rightNumber which
	 *   is the right number that the user types; String Option
	 *   which is the option that the user has chosen
	 * Returns: The model and view for the Calculator result page
	 * Description: Calculates what the total based
	 *   on the user input and returns the model and view
	 *   based on these results
	 */
	@RequestMapping(value="/result", method=RequestMethod.POST)
	public ModelAndView setTotalValue(@RequestParam("leftNum") String leftNumber, 
			@RequestParam("rightNum") String rightNumber, @RequestParam("options") String option ) 
	{
		double result = 0; //ending result to print out to user
		double parsedLeft = 0;
		double parsedRight = 0;
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		
		ModelAndView model = new ModelAndView("SuccessTotal");
		
		//try to parse the numbers and throw exceptions
		try
		{
		  parsedLeft = Double.parseDouble(leftNumber);  
	      parsedRight = Double.parseDouble(rightNumber);	
		}
        catch(NumberFormatException exception)
		{
        	model.addObject("result","The input you have entered is not a number... Try again" );
        	return model;
		}

        //hand each option user is allowed to choose
		if(option.equals("add"))
		{
			result = parsedLeft+parsedRight; 
			model.addObject("result","The sum of the two numbers is: " + df.format(result) );
		}
		else if(option.equals("subtract"))
		{
			result = parsedLeft-parsedRight;
			model.addObject("result","The difference of the two numbers is: " + df.format(result) );
		}
		else if(option.equals("divide"))
		{
			result = parsedLeft/parsedRight;
			model.addObject("result","The quotient of the two numbers is: " + df.format(result) );
		}
		else 
		{
			result = parsedLeft*parsedRight;
			model.addObject("result","The product of the two numbers is: " + df.format(result) );
		}
		
		return model;	
	}
	


}
