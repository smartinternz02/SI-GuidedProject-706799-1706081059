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
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object G_Timeout
     
    /**
     * <p></p>
     */
    public static Object CURA_url
     
    /**
     * <p></p>
     */
    public static Object FieldName
     
    /**
     * <p></p>
     */
    public static Object fieldName
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            url = selectedVariables['url']
            username = selectedVariables['username']
            password = selectedVariables['password']
            G_Timeout = selectedVariables['G_Timeout']
            CURA_url = selectedVariables['CURA_url']
            FieldName = selectedVariables['FieldName']
            fieldName = selectedVariables['fieldName']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
