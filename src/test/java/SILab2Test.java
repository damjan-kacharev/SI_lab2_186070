import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private SILab2 test = new SILab2();
    //String username = null;
   // String password = null;

    @Test
    void Every_statement() {
        System.out.println("Testing");

        User user = new User("damjan","D-1234567","dame.kacharev@gmail.com");
        assertEquals(true,test.function(user,null));

        user=new User("damjan","D1234567","dame.kacharev@gmail.com");
        assertEquals(false,test.function(user,null));
    }


    @Test
    void Every_branch() {

        User user = new User("damjan","D-1234567","dame.kacharev@gmail.com");
        assertEquals(true,test.function(user,null));


        user=new User(null,null,null);
        assertEquals(false,test.function(user,null));

        user=new User(null,"D-1234567","dame.kacharev@gmail.com");
        assertEquals(false,test.function(user,null));

        user=new User("damjan","1234","dame.kacharev@gmail.com");
        assertEquals(false,test.function(user,null));

        user=new User("damjan","12345678","dame.kacharev@gmail.com");
        assertEquals(false,test.function(user,null));

        user=new User("damjan","abcdefkasdkj","dame.kacharev@gmail.com");
        assertEquals(false,test.function(user,null));

    }


}