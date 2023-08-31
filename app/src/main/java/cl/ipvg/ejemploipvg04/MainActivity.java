package cl.ipvg.ejemploipvg04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btAceptar;
    EditText etNombre,etApellidos;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btAceptar = (Button) findViewById(R.id.btAceptar);
        etNombre = (EditText) findViewById(R.id.etNombre);
        etApellidos = (EditText) findViewById(R.id.etApellidos);
        Intent intent = new Intent(this, MainActivity2.class);

        Context context= getApplicationContext();
        btAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("nombre",etNombre.getText().toString());
                intent.putExtra("apellidos",etApellidos.getText().toString());
                Toast.makeText(context,"su Nombre es: "+etNombre.getText()+" "+etApellidos.getText() ,Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });






    }
}