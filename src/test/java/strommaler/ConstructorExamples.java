package strommaler;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConstructorExamples {

    public class Hallo{
        {
            System.out.println("empty constructor");
        }

        Hallo(){
            System.out.println("constructor");
        }

        Hallo(String arg){
            System.out.println(String.format("%s %s","constructor arg",arg));
        }
    }

    @Test
    public void testConstHallo(){
        new Hallo();
        assertThat(true).isEqualTo(true);
    }

    @Test
    public void testWithConstrArgHallo(){
        new Hallo("argg 1");
        assertThat(true).isEqualTo(true);
    }


}
