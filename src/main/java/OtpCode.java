
//19. Extract the OTP from the SMS. "Your one time password is 246148. Don't share this code with anyone \r\nBvwt3f8js2S"


public class OtpCode {
    public static void main(String[] args) {

        String msg = "Your one time password is 246148. Don't share this code with anyone \r\nBvwt3f8js2S";

        String[] m = msg.split("\\.");
        String m1 = m[0];
        String m2 = m[1];
        String opt = m1.split(" ")[5];

        System.out.println("OPT: "+opt); 
    }
}
