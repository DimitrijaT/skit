package class01Test;

import skit.class01.Message;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MessageTest2 {
    String message = "Tom";
    Message messageObject = new Message(message);

    @Test
    public void testSalutationMessage() {
        assertEquals("Hi " + message, messageObject.salutationMessage());
    }

}
