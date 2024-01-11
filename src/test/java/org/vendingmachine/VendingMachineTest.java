package org.vendingmachine;

import org.example.oop.vendingmachine.Snack;
import org.example.oop.vendingmachine.VendingMachine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class VendingMachineTest {
    @Test
    public void testVendingMachineNegatove1() {
        VendingMachine vendingMachine = new VendingMachine(10, "Timisoara", 5, 5);
      /*  Exception exception = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            Snack snack = vendingMachine.getSnack(5, 5);
        });

       */
        Exception exception = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,  new Executable() {
            @Override
            public void execute() throws Throwable {
                Snack snack = vendingMachine.getSnack(5, 5);
            }

        });

        String expectedMessage = "";
        String actualMessage = exception.getMessage();
        Assertions.assertEquals(expectedMessage, actualMessage);

    }


    @Test
    public void testVendingMachinePozitiv1(){
        VendingMachine vendingMachine = new VendingMachine(10, "Timisoara", 5, 5);
        vendingMachine.setSnacksInVendingMachine(new Snack(5,"apa", 1), 1,1  ); // snack pe pozitia 1,1

        Snack snack = vendingMachine.getSnack(1,1);
   //     int initialSnackQuantity = snack.getCantitate();

        vendingMachine.getSnack(1,1);
        Assertions.assertEquals("apa", snack.getNume());
    }
    @Test

    public void testVendingMAchpoz2(){
        VendingMachine vendingMachine = new VendingMachine(10, "Timisoara", 5, 5);

        Assertions.assertEquals("Timisoara", vendingMachine.getLocatie());
    }

    @Test
    public void testVendingMachine4(){
        VendingMachine vendingMachine = new VendingMachine(10, "Timisoara", 5, 5);

        Assertions.assertEquals("apa", vendingMachine.getSnack(1,2));

    }
}
