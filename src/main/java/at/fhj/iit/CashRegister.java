package at.fhj.iit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
/**
 *   <h1>Konf_B20_Lehner_Menzinger - CashRegister.java</h1>
 *   Cash register with report functionalities
 *   @author Robert LEHNER <a href="mailto:robert.lehner@edu.campus02.at">robert.lehner@edu.campus02.at</a>
 *   @version 2021-06-01
 */



public class CashRegister
{
    /**
     * Alcohol Type
     * non for non alcoholic
     * weak for <= 16% alcohol
     * strong for > 16% alcohol
     */
    enum alcoholType
    {
        non,
        weak,
        strong
    }
    //sales List (static because it belongs to the class and not the instance)
    private static ArrayList<HashMap<String,String>> sales = new ArrayList<>();
    //Logged in employee
    private String employee;

    /**
     * Login to the CashRegister
     * @param employee first name of the employee
     */
    public CashRegister(String employee)
    {
        this.employee=employee;
    }

    /**
     * Sell a product
     * @param price Price of the product
     * @param val enum Alcohol Type Value
     * @return true if sale was done
     */
    public boolean sell(double price,alcoholType val)
    {
        SimpleDateFormat formatter = new SimpleDateFormat(
                "yyyy-MM-dd");
        Date currentTime = new Date();
        HashMap<String,String> sale = new HashMap<>();
        sale.put("employee",this.employee);
        sale.put("price",String.valueOf(price));
        sale.put("day",formatter.format(currentTime));
        sale.put("alcoholType",val.toString());
        return sales.add(sale);
    }

    /**
     * Get the total revenue with handed conditions
     * @param val enum Alcohol Type Value
     * @return sum of total revenue with given criteria
     */
    public double totalRevenue(alcoholType val)
    {
        double ret_val = 0;
        for (HashMap<String,String> sale:sales)
        {
            if(sale.get("alcoholType").equals(val.toString()))
                ret_val+=Double.parseDouble(sale.get("price"));
        }
        return ret_val;
    }

    /**
     * Get the total revenue with handed conditions
     * @param day optional - leave empty if you want to get only revenue from person
     * @param person optional - leave empty if you want to get only revenue from day
     * @return sum of total revenue with given criteria
     * @throws Exception if both parameters are empty
     */
    public double totalRevenue(String day,String person) throws Exception
    {
        double ret_val = 0;
        for (HashMap<String,String> sale:sales)
        {
            if(!day.isEmpty()&&!person.isEmpty())
            {
                if(sale.get("day").equals(day)&&sale.get("employee").equals(person))
                    ret_val+=Double.parseDouble(sale.get("price"));
            }
            else if(day.isEmpty()&&!person.isEmpty())
            {
                if(sale.get("employee").equals(person))
                    ret_val+=Double.parseDouble(sale.get("price"));
            }
            else if(!day.isEmpty())
            {
                if(sale.get("day").equals(day))
                    ret_val+=Double.parseDouble(sale.get("price"));
            }
            else
            {
                throw new Exception("Both parameters are empty");
            }
        }
        return ret_val;
    }

    /**
     * Getter for logged in employee
     * @return first name of the employee
     */
    public String getEmployee()
    {
        return employee;
    }

    /**
     * Log in new employee (setter method)
     * @param employee first name
     */
    public void setEmployee(String employee)
    {
        this.employee = employee;
    }



}
