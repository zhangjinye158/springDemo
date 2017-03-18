package com.spring.pack07;


/**
 * Created by zhangjinye on 2017/3/17.
 */
public class DI {


    private ClientService clientService;

    public DI(ClientService clientService) {
        this.clientService = clientService;
    }

    public void testDI() {
        System.out.println("DI<---->DI");
        clientService.sysClientService();
    }
}
