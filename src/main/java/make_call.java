// Install the Java helper library from twilio.com/docs/java/install

import com.twilio.type.Twiml;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;

public class Example {
    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Call call = Call.creator(new com.twilio.type.PhoneNumber("+14158675309"),
                            new com.twilio.type.PhoneNumber("+14158675308"),
                            new com.twilio.type.Twiml("<Response><Say>Ahoy, World</Say></Response>"))
                        .create();

        System.out.println(call.getSid());
    }
}