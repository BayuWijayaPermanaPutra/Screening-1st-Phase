package suitmedia.com.testscreeningbayuwpp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    private Button buttonNext;
    private EditText editTextName;
    private String valueName = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueName = editTextName.getText().toString();
                if (valueName.isEmpty()) {
                    Toast.makeText(HomeActivity.this, "Mohon masukkan nama!", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(HomeActivity.this, MenuActivity.class);
                    intent.putExtra("name", valueName);
                    startActivity(intent);
                }
            }
        });
    }

    private void initView() {
        buttonNext = (Button) findViewById(R.id.main_button_next);
        editTextName = (EditText) findViewById(R.id.main_edittext_name);
    }
}
