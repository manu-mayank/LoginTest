package mayank.manu.logintest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText inputEmail; //creating reference/shortcut for email box
    private EditText inputPassword; //creating reference/shortcut for password box

    private Button btnLogin;  // creating reference/ shortcut for login button

    /**
     * always use this method to display the screen and get proper references for the widgets used in the screen
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//it calls the parent method to set up the various attributes like theme, sizeof screen etc
        /**
         * this is used to set the screen(xml) to be displayed
         * use this method and pass the name of the screen in-place of 'activity_login' for other screens
         */
        setContentView(R.layout.activity_login);

        /********************************************/
        inputEmail = (EditText) findViewById(R.id.editText);// assigning the inputEmail variable to the actual edittext
        inputPassword = (EditText) findViewById(R.id.editText2); //assigning the inputPassword variable to the actual edittext

        btnLogin = (Button) findViewById(R.id.button);//assigning the btnLogin variable to the actual button

        /**
         * this is called when btnLogin is clicked
         */
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = inputEmail.getText().toString(); //getting the value from the edittext and storing it in a variable
                String password = inputPassword.getText().toString(); //getting the value from the edittext and storing it in a variable
                /**
                 * checking the condition
                 * equalsIgnoreCase: will match the two without considering if the letter case(Upper Lower)
                 *
                 */
                if (email.equalsIgnoreCase("android@android.com") &&
                        password.equalsIgnoreCase("android")) {
                    Toast.makeText(LoginActivity.this, "Success", Toast.LENGTH_LONG).show();//this is used to show a short temporary message to user
                } else {
                    Toast.makeText(LoginActivity.this, "Failure", Toast.LENGTH_LONG).show();

                }

            }
        });

    }
}
