/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package io.apimatic.examples.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.example.sdk.APIMATICCalculatorClient;
import com.example.sdk.controllers.SimpleCalculatorController;
import com.example.sdk.exceptions.ApiException;
import com.example.sdk.models.GetCalculateInput;
import com.example.sdk.models.OperationTypeEnum;

public class SimpleCalculatorControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static APIMATICCalculatorClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static SimpleCalculatorController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getSimpleCalculatorController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Check if multiplication works.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testMultiply() throws Exception {
        // Parameters for the API call
        GetCalculateInput input = new GetCalculateInput();
        input.setOperation(OperationTypeEnum.fromString(
                "MULTIPLY"));
        input.setX(4d);
        input.setY(5d);

        // Set callback and perform API call
        double result = 0;
        try {
            result = controller.getCalculate(input);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertEquals("Response does not match expected value", 
            20, result, ASSERT_PRECISION);
    }
    
    /**
     * Check if sum works.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSum() throws Exception {
        // Parameters for the API call
        GetCalculateInput input = new GetCalculateInput();
        input.setOperation(OperationTypeEnum.fromString(
                "SUM"));
        input.setX(4d);
        input.setY(5d);

        // Set callback and perform API call
        double result = 0;
        try {
            result = controller.getCalculate(input);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertEquals("Response does not match expected value", 
            9, result, ASSERT_PRECISION);
    }
    
    /**
     * Check if subtraction works.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSubtraction() throws Exception {
        // Parameters for the API call
        GetCalculateInput input = new GetCalculateInput();
        input.setOperation(OperationTypeEnum.fromString(
                "SUBTRACT"));
        input.setX(8d);
        input.setY(3d);

        // Set callback and perform API call
        double result = 0;
        try {
            result = controller.getCalculate(input);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertEquals("Response does not match expected value", 
            5, result, ASSERT_PRECISION);
    }
    
    /**
     * Check if division works.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testDivision() throws Exception {
        // Parameters for the API call
        GetCalculateInput input = new GetCalculateInput();
        input.setOperation(OperationTypeEnum.fromString(
                "DIVIDE"));
        input.setX(8d);
        input.setY(2d);

        // Set callback and perform API call
        double result = 0;
        try {
            result = controller.getCalculate(input);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertEquals("Response does not match expected value", 
            4, result, ASSERT_PRECISION);
    }

}
