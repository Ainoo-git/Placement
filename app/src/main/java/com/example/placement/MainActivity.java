// Tu archivo es MainActivity.java, por lo tanto, usa sintaxis de Java.
package com.example.placement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button botonLogin = findViewById(R.id.buttonLogin);

        botonLogin.setOnClickListener({
                var intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
     );
    }
}
