package rob.myappcompany.com;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view)
    {
        EditText userEditText = (EditText) findViewById(R.id.usernameEditText);
        EditText passEditText = (EditText) findViewById(R.id.passwordEditText);

        Log.i("Info", "Button pressed!");

        Log.i("Username", userEditText.getText().toString());
        Log.i("Password", passEditText.getText().toString());

        Toast.makeText(this, "Hi, there!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
