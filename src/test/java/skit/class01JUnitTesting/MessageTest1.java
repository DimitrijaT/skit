package skit.class01JUnitTesting;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;


public class MessageTest1 {

    String message = "Tom";
    Message messageObject = new Message(message);

    @Test
    public void testPrintMessageTrue() {
        assertEquals(message, messageObject.printMessage());
    }

    @Test
    public void testPrintMessageFalse() {
        assertNotEquals("Mark", messageObject.printMessage());
    }

    @Test
    public void testPrintMessageWithDuration() {
        assertTimeout(Duration.ofMillis(5000), () ->
        {
            messageObject.printMessage();

            // Thread.sleep(1000)
        });
    }

}
