package pri.kevin.other.di.injector;

import pri.kevin.other.di.consumer.Consumer;
import pri.kevin.other.di.consumer.MyDIApplication;
import pri.kevin.other.di.services.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector{
    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImpl());
    }
}
