package com.spring.pack07;

/**
 * Created by zhangjinye on 2017/3/17.
 */
public class ClientService {

    private static ClientService clientService = new ClientService();

    private ClientService() {
    }

    public static ClientService createInstance() {
        return clientService;
    }

    public void sysClientService(){
        System.out.println("ClientService-->sysClientService");
    }
}



