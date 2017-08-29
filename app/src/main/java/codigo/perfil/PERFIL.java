package codigo.perfil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PERFIL extends AppCompatActivity {
    private Button btnEnvioDatos;
    private TextView etUsuario;
    private TextView etClave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);


        etClave = (TextView) findViewById(R.id.etClave);
        etUsuario = (TextView) findViewById(R.id.etUsuario);

        btnEnvioDatos = (Button) findViewById(R.id.btnEnvioDatos);
        btnEnvioDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Datos", "Usuario" + etUsuario.getText());
                Log.i("Datos", "Clave" + etClave.getText());

            }
        });

    }
}
