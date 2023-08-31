package cl.ipvg.ejemploipvg04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button btaceptar;
    TextView tvnombre,tvapellidos;
    String stnombre;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle intentR=this.getIntent().getExtras();



        tvnombre=(TextView) findViewById(R.id.tvNombre);
        tvapellidos=(TextView) findViewById(R.id.tvApellidos);
        btaceptar= (Button) findViewById(R.id.btAceptar);

             stnombre = getIntent().getStringExtra("nombre");
             tvnombre.setText("Nombre: "+stnombre);
             tvapellidos.setText("Apellidos: "+ getIntent().getStringExtra("apellidos"));

          intent = new Intent(this,MainActivity.class);

        btaceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);


            }
        });

    }
}