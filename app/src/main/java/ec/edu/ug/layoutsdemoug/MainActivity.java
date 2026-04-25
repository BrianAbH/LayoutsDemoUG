package ec.edu.ug.layoutsdemoug;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btnFrame = findViewById(R.id.btnFrame);
        Button btnTable = findViewById(R.id.btnTable);
        Button btnRelative = findViewById(R.id.btnRelative);
        Button btnConstraint = findViewById(R.id.btnConstraint);
        Button btnGrid = findViewById(R.id.btnGrid);

        btnFrame.setOnClickListener(v->{
            Intent intentF = new Intent(this, FrameLayout.class);
            startActivity(intentF);
        });

        btnTable.setOnClickListener(v->{
            Intent intentT = new Intent(this, TableLayout.class);
            startActivity(intentT);
        });

        btnRelative.setOnClickListener(v->{
            Intent intentR = new Intent(this, RelativeLayout.class);
            startActivity(intentR);
        });

        btnConstraint.setOnClickListener(v->{
            Intent intentC = new Intent(this, ConstraintLayout.class);
            startActivity(intentC);
        });

        btnGrid.setOnClickListener(v->{
            Intent intentG = new Intent(this, GridLayout.class);
            startActivity(intentG);
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}