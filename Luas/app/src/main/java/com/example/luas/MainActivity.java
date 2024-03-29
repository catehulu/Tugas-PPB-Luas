package com.example.luas;

import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private EditText edtPanjang, edtLebar;
    private Button btnHitung;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPanjang = (EditText)findViewById((R.id.edt_panjang));
        edtLebar = (EditText)findViewById((R.id.edt_lebar));
        btnHitung = (Button) findViewById((R.id.btn_hitung));
        txtLuas = (TextView) findViewById((R.id.txt_luas));

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = edtPanjang.getText().toString().trim();
                String lebar = edtLebar.getText().toString().trim();

                if (panjang.matches("")){
                    panjang = "0";
                }

                if (lebar.matches("")) {
                    lebar = "0";
                }

                double p = 0;
                p = Double.parseDouble(panjang);
                double l = 0;
                l = Double.parseDouble(lebar);

                double luas = p * l;

                txtLuas.setText("Luas :"+luas);
            }
        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
