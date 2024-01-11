package org.example;

import org.example.oop.annalyns.Annalyns;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Annalynstest {
    Annalyns annalyns = new Annalyns();

    @Test
    public void canPrisonerCanBeFreedPositive(){
        boolean actual = annalyns.canFreePrisoner(
                false, false,
                true, false);

        Assertions.assertTrue(actual);
    }
    @Test
    public void canPrisonerCanBeFreeNegative1(){
        boolean actual = annalyns.canFreePrisoner(false, false,
                false, false);

        Assertions.assertFalse(actual);
    }
    @Test
    public void canPrisonerCanBeFreeNegative2(){
        boolean actual = annalyns.canFreePrisoner(false, false,
                false, false);

        Assertions.assertFalse(actual);
    }



@Test
public void canPrisonerCanBeFreedNegative3(){
    boolean actual = annalyns.canFreePrisoner(false, false,
            true, true);

    Assertions.assertFalse(actual); // verificam ca actual e false
}
@Test
public void canPrisonerCanBeFreed5(){
    boolean actual = annalyns.canFreePrisoner(false, false,
            true, false);

    Assertions.assertFalse(actual);
}


@Test
public void canPrisonerCanBeFreeNegative6(){
    boolean actual = annalyns.canFreePrisoner(
            false, false,
            false, true);

    Assertions.assertFalse(actual);
}
}
