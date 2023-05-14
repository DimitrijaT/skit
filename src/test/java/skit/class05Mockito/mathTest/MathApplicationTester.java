package skit.class05Mockito.mathTest;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import skit.class05Mockito.math.CalculatorService;
import skit.class05Mockito.math.MathApplication;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {
    //@InjectMocks anotacijata se koristi za kreiranje I injektiranje na mock objektot
    @InjectMocks
    MathApplication mathApplication = new MathApplication();
    //@Mock anotacijata se koristi za da se kreira mock objektot koj treba da bide injektiran
    @Mock
    CalculatorService calcService;

    @Test
    public void testAdd() {
// dodadi go odnesuvanjeto na calc servisot za da se soberat ovie dva broevi
        when(calcService.add(10.0, 20.0)).thenReturn(30.00);
//testiraj ja ADD funkcionalnosta
        Assert.assertEquals(mathApplication.add(10.0, 20.0), 30.0, 0);
    }

    @Test
    public void testDivide() {
        when(calcService.divide(10.0, 2.0)).thenReturn(5.00);
        Assert.assertEquals(mathApplication.divide(10.0, 2.0), 5.0, 0);
    }

    @Test
    public void testSubtract() {
        when(calcService.subtract(10.0, 7.0)).thenReturn(3.00);
        Assert.assertEquals(mathApplication.subtract(10.0, 7.0), 3.0, 0);
    }

    @Test
    public void testMultiply() {
        when(calcService.multiply(10.0, 7.0)).thenReturn(70.00);
        Assert.assertEquals(mathApplication.multiply(10.0, 7.0), 70.0, 0);
    }
}