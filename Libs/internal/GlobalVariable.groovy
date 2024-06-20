package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object userManager
     
    /**
     * <p></p>
     */
    public static Object userColaborador
     
    /**
     * <p></p>
     */
    public static Object userAmaral
     
    /**
     * <p></p>
     */
    public static Object pwd
     
    /**
     * <p></p>
     */
    public static Object passwordAmaral
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            userManager = selectedVariables['userManager']
            userColaborador = selectedVariables['userColaborador']
            userAmaral = selectedVariables['userAmaral']
            pwd = selectedVariables['pwd']
            passwordAmaral = selectedVariables['passwordAmaral']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
