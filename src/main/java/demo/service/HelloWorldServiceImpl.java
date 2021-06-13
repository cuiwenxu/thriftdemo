package demo.service;

import demo.idl.HelloWorldService;
import org.apache.thrift.TException;

public class HelloWorldServiceImpl implements HelloWorldService.Iface {
    @Override
    public String helloString(String username) throws TException {
        return "Hello ------------" + username;
    }
}
