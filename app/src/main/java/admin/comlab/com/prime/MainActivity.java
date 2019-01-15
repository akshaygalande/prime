package admin.comlab.com.prime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText=findViewById(R.id.num);
        final TextView answer=findViewById(R.id.answer);
        Button calc=findViewById(R.id.btn);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num=Integer.parseInt(editText.getText().toString());
                boolean flag = false;
                for(int i = 2; i <= num/2; ++i)
                {
                    if(num % i == 0)
                    {
                        flag = true;
                        break;
                    }
                }

                if (!flag) {
                    answer.setText(num+" is Prime number");
                }

                else
                    answer.setText(num + " is not a prime number.");
            }
        });
    
    }
}
