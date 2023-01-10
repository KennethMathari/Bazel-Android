package com.example.bazel;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import com.example.bazel.GreeterViewModel;

/**
 * Main class for the Bazel Android "Hello, World" app.
 */
public class MainActivity extends AppCompatActivity {

    private GreeterViewModel greeterViewModel;
    Button clickMeButton = findViewById(R.id.clickMeButton);
    TextView helloBazelTextView = findViewById(R.id.helloBazelTextView);


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greeterViewModel = new ViewModelProvider(this).get(GreeterViewModel.class);
        greeterViewModel.getGreeting();

        greeterViewModel.greeting.observe(this, greeting -> {
            helloBazelTextView.setText(greeting);
        });


//    Greeter greeter = new Greeter();

        // Bazel supports Java 8 language features like lambdas!
//    clickMeButton.setOnClickListener(v ->
//            helloBazelTextView.setText(greeter.sayHello())
//    );
    }

}
