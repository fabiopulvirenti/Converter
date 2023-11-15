package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.App.converter;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void converterTest()
    {

        Assertions.assertEquals( "IV",converter(4));
        Assertions.assertEquals( "IX",converter(9));
        Assertions.assertEquals( "XXIX",converter(29));
        Assertions.assertEquals( "LXXX",converter(80));
        Assertions.assertEquals( "CCXCIV",converter(294));
        Assertions.assertEquals( "MMXIX",converter(2019));
        Assertions.assertEquals( "MDCCCXC",converter(1890));
        Assertions.assertEquals( "DLXVIII",converter(568));
        Assertions.assertEquals( "MCMXCIX",converter(1999));
        Assertions.assertEquals( "CDXLV",converter(445));

    }
}
