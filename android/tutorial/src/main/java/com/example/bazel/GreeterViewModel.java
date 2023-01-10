package com.example.bazel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;

public class GreeterViewModel extends ViewModel{
    public MutableLiveData<String> greeting;

    //get Greeting string from Greeter class
    public void getGreeting() {
        Greeter greeter = new Greeter();

        greeting = new MutableLiveData<>();
        greeting.postValue(greeter.sayHello());
    }
}