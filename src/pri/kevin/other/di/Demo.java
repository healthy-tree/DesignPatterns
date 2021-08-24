package pri.kevin.other.di;

import pri.kevin.other.di.consumer.Consumer;
import pri.kevin.other.di.injector.EmailServiceInjector;
import pri.kevin.other.di.injector.MessageServiceInjector;
import pri.kevin.other.di.injector.SMSServiceInjector;

public class Demo {
    public static void main(String[] args) {
        String msg = "Hi Pankaj";
        String email = "pankaj@abc.com";
        String phone = "4088888888";
        MessageServiceInjector injector = null;
        Consumer app = null;

        //Send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        //Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }
}
