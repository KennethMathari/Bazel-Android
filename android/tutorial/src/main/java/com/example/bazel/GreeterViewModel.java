package com.example.bazel;

public class GreeterViewModel extends ViewModel{
    public MutableLiveData<String> greeting;

    //get Greeting string from Greeter class
    public MutableLiveData<String> getGreeting() {
        Greeter greeter = new Greeter();

        if(greeting == null){
            greeting = new MutableLiveData<>();
        }

        //return greeting.setValue(greeter.sayHello());
        return greeting.setValue("Kenneth Mathari!");
    }
}
