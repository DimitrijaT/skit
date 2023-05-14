package class01JUnitTestingTest;

import skit.class01JUnitTesting.Message;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MessageTest3 {

    Message message = new Message("test message");

    @Test
    public void testGoodbyeMessageTrue() {
        Assertions.assertEquals(message.goodbyeMessage(), "Goodbye");

    }

    @Test
    public void testGoodbyeMessageFalse() {
        Assertions.assertNotEquals(message.goodbyeMessage(), message);
    }
}
