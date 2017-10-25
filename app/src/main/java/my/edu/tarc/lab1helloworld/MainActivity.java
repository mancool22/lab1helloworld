package my.edu.tarc.lab1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Global Var
    private EditText editTextName, editTextAge;
    private TextView textViewMessage;

    //onCreate = main() func
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView method displays the UI
        //R = resource class

        setContentView(R.layout.activity_main);


        //Linking program with UI
        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextAge=(EditText)findViewById(R.id.editTextAge);
        textViewMessage=(TextView)findViewById(R.id.TextViewMessage);
    }
   // A method to handle view click event
    public void displaymessage(View view){
        String name;
        int age;
        name = editTextName.getText().toString();
        age = Integer.parseInt(editTextAge.getText().toString());
        age++;
        textViewMessage.setText("Hi " + name + ".You will be "+ age + " years old in 2018.");

    }
    public void resetmessage(View view)
    {
        textViewMessage.setText("");
        editTextAge.setText("");
        editTextName.setText("");
    }
}
