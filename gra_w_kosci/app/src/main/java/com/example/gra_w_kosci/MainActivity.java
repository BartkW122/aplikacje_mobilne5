package com.example.gra_w_kosci;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
import java.util.ArrayList;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button rzut;
    private Button reset_wynik;

    private TextView kostk1;
    private TextView kostk2;
    private TextView kostk3;
    private TextView kostk4;
    private TextView kostk5;

    private TextView wynik_los;
    private TextView wynik_gry;
    private TextView l_rzut;
    private int liczba_rzut=0;
    private ArrayList<Integer> wyn_los;
    private ArrayList<Integer> wyn_gry;

    private Random random1;
    private Random random2;
    private Random random3;
    private Random random4;
    private Random random5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rzut = findViewById(R.id.rzut);
        reset_wynik=findViewById(R.id.reset_wynik);

        kostk1=findViewById(R.id.kostk1);
        kostk2=findViewById(R.id.kostk2);
        kostk3=findViewById(R.id.kostk3);
        kostk4=findViewById(R.id.kostk4);
        kostk5=findViewById(R.id.kostk5);

        wynik_los=findViewById(R.id.wynik_los);
        wynik_gry=findViewById(R.id.wynik_gry);
        l_rzut=findViewById(R.id.l_rzut);
        wyn_los=new ArrayList<>();
        wyn_gry= new ArrayList<>();

        random1=new Random();
        random2=new Random();
        random3=new Random();
        random4=new Random();
        random5=new Random();

        rzut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                liczba_rzut++;
                l_rzut.setText("Liczba rzutów: "+liczba_rzut);

                int random_k1=random1.nextInt(6-1+1)+1;
                int random_k2=random2.nextInt(6-1+1)+1;
                int random_k3=random3.nextInt(6-1+1)+1;
                int random_k4=random4.nextInt(6-1+1)+1;
                int random_k5=random5.nextInt(6-1+1)+1;

                wyn_los.add(random_k1);
                wyn_los.add(random_k2);
                wyn_los.add(random_k3);
                wyn_los.add(random_k4);
                wyn_los.add(random_k5);

                Log.d("wynik los",String.valueOf(wyn_los));

                kostk1.setText(String.valueOf(random_k1));
                kostk2.setText(String.valueOf(random_k2));
                kostk3.setText(String.valueOf(random_k3));
                kostk4.setText(String.valueOf(random_k4));
                kostk5.setText(String.valueOf(random_k5));

                Log.d("rand 1:", String.valueOf(random_k1));
                Log.d("rand 2:", String.valueOf(random_k2));
                Log.d("rand 3:", String.valueOf(random_k3));
                Log.d("rand 4:", String.valueOf(random_k4));
                Log.d("rand 5:", String.valueOf(random_k5));

                wyn_los= new ArrayList<>();
            }
        });
        reset_wynik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                kostk1.setText("?");
                kostk2.setText("?");
                kostk3.setText("?");
                kostk4.setText("?");
                kostk5.setText("?");

                liczba_rzut=0;
                l_rzut.setText("Liczba rzutów: "+liczba_rzut);
            }
        });
    }
}
