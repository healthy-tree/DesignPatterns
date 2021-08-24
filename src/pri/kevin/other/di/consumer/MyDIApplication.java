package pri.kevin.other.di.consumer;

import pri.kevin.other.di.services.MessageService;

public class MyDIApplication implements Consumer{
    private MessageService service;

    public MyDIApplication(MessageService svc){
        this.service=svc;
    }

    @Override
    public void processMessages(String msg, String rec) {
        this.service.sendMessage(msg, rec);
    }
}
