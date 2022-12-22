package Tests;


import org.testng.Assert;


public class CustomAssertions extends Assert {

        public static void isTextEqual(String expectedText, String actualText) {
            String errorMsg = "Text" + actualText + " is not as expected was: " + expectedText;
            Assert.assertEquals(actualText, expectedText, errorMsg);
        }

        public static void isElementDisplayed(Boolean isElementDisplayed) {
            String errorMsg = "The element is not displayed";
            Assert.assertTrue(isElementDisplayed, errorMsg);
        }



}
