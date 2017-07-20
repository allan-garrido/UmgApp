package curso.umg.gt.umgapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText etce;
    private Button btrnd;
    private TextView tvrnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etce = (EditText) findViewById(R.id.etce);
        btrnd = (Button) findViewById(R.id.btrnd);
        tvrnd = (TextView) findViewById(R.id.tvrnd);
    }

    public void calcRnd(View v){
        if (!etce.getText().toString().trim().equals("")) {
            Random rnd = new Random();
            int r = rnd.nextInt(Integer.valueOf(etce.getText().toString()));

            etce.setText("");
            tvrnd.setText(String.valueOf(r));
        } else {
            Toast.makeText(this, "Numero requerido", Toast.LENGTH_SHORT).show();
        }
    }
}
