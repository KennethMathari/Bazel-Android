package com.example.bazel;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * Main class for the Bazel Android "Hello, World" app.
 */
public class MainActivity extends Activity {

    private GreeterViewModel greeterViewModel;
    Button clickMeButton = findViewById(R.id.clickMeButton);
    TextView helloBazelTextView = findViewById(R.id.helloBazelTextView);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greeterViewModel = ViewModelProviders.of(this).get(GreeterViewModel.class);

        initObservers();

//    Greeter greeter = new Greeter();

        // Bazel supports Java 8 language features like lambdas!
//    clickMeButton.setOnClickListener(v ->
//            helloBazelTextView.setText(greeter.sayHello()));
    }

    private void initObservers() {
        final Observer<String> greetingObserver = new Observer<String>() {
            @Override
            public void onChanged(@Nullable final String newGreeting) {
                // Update the UI, in this case, a TextView.
                helloBazelTextView.setText(newGreeting);
            }
        };

        greeterViewModel.getGreeting().observe(this, greetingObserver);
    }


}
