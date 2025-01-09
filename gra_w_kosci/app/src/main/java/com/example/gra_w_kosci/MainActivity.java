package com.example.gra_w_kosci;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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
    private ImageView Imagev,Imagev2,Imagev3,Imagev4,Imagev5;

    private TextView wynik_los;
    private TextView wynik_gry;
    private TextView l_rzut;
    private int liczba_rzut=0;
    private int sum=0;
    private int sum_gry=0;
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

        Imagev=findViewById(R.id.imageView);
        Imagev2=findViewById(R.id.imageView2);
        Imagev3=findViewById(R.id.imageView3);
        Imagev4=findViewById(R.id.imageView4);
        Imagev5=findViewById(R.id.imageView5);

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

                //pirewsza kosc
                if(random_k1==1) {
                    Imagev.setImageResource(R.drawable.dice_1);
                } else if (random_k1==2) {
                    Imagev.setImageResource(R.drawable.dice_2);
                }   else if (random_k1==3) {
                    Imagev.setImageResource(R.drawable.dice_3);
                }    else if (random_k1==4) {
                    Imagev.setImageResource(R.drawable.dice_4);
                }    else if (random_k1==5) {
                    Imagev.setImageResource(R.drawable.dice_5);
                }    else if (random_k1==6) {
                    Imagev.setImageResource(R.drawable.dice_6);
                }

                //druga kosc
                if(random_k2==1) {
                    Imagev2.setImageResource(R.drawable.dice_1);
                } else if (random_k2==2) {
                    Imagev2.setImageResource(R.drawable.dice_2);
                }   else if (random_k2==3) {
                    Imagev2.setImageResource(R.drawable.dice_3);
                }    else if (random_k2==4) {
                    Imagev2.setImageResource(R.drawable.dice_4);
                }    else if (random_k2==5) {
                    Imagev2.setImageResource(R.drawable.dice_5);
                }    else if (random_k2==6) {
                    Imagev2.setImageResource(R.drawable.dice_6);
                }

                //trzecia kosc
                if(random_k3==1) {
                    Imagev3.setImageResource(R.drawable.dice_1);
                } else if (random_k3==2) {
                    Imagev3.setImageResource(R.drawable.dice_2);
                }   else if (random_k3==3) {
                    Imagev3.setImageResource(R.drawable.dice_3);
                }    else if (random_k3==4) {
                    Imagev3.setImageResource(R.drawable.dice_4);
                }    else if (random_k3==5) {
                    Imagev3.setImageResource(R.drawable.dice_5);
                }    else if (random_k3==6) {
                    Imagev3.setImageResource(R.drawable.dice_6);
                }

                //czwarta kosc
                if(random_k4==1) {
                    Imagev4.setImageResource(R.drawable.dice_1);
                } else if (random_k4==2) {
                    Imagev4.setImageResource(R.drawable.dice_2);
                }   else if (random_k4==3) {
                    Imagev4.setImageResource(R.drawable.dice_3);
                }    else if (random_k4==4) {
                    Imagev4.setImageResource(R.drawable.dice_4);
                }    else if (random_k4==5) {
                    Imagev4.setImageResource(R.drawable.dice_5);
                }    else if (random_k4==6) {
                    Imagev4.setImageResource(R.drawable.dice_6);
                }

                //piata kosc
                if(random_k5==1) {
                    Imagev5.setImageResource(R.drawable.dice_1);
                } else if (random_k5==2) {
                    Imagev5.setImageResource(R.drawable.dice_2);
                }   else if (random_k5==3) {
                    Imagev5.setImageResource(R.drawable.dice_3);
                }    else if (random_k5==4) {
                    Imagev5.setImageResource(R.drawable.dice_4);
                }    else if (random_k5==5) {
                    Imagev5.setImageResource(R.drawable.dice_5);
                }    else if (random_k5==6) {
                    Imagev5.setImageResource(R.drawable.dice_6);
                }

                Log.d("wynik los",String.valueOf(wyn_los));

                int ilosc;

                for(int i=0;i<wyn_los.size();i++){
                    ilosc=0;
                    for (int j = 0; j < wyn_los.size(); j++) {
                        if (wyn_los.get(i)==wyn_los.get(j) && i != j) {
                            ilosc++;
                        }
                    }

                    if (ilosc > 0) {
                        Log.d("Powtórzenie:", String.valueOf(wyn_los.get(i)));
                        sum += wyn_los.get(i);
                    }

                }
                Log.d("suma:",String.valueOf(sum));

                wynik_los.setText("Wynik tego losowania: "+String.valueOf(sum));

                sum_gry+=sum;
                Log.d("suma gry:",String.valueOf(sum_gry));

                wynik_gry.setText("Wynik gry: "+sum_gry);
                sum=0;


                kostk1.setText(String.valueOf(random_k1));
                kostk2.setText(String.valueOf(random_k2));
                kostk3.setText(String.valueOf(random_k3));
                kostk4.setText(String.valueOf(random_k4));
                kostk5.setText(String.valueOf(random_k5));


                wyn_los=new ArrayList<>();
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
                sum=0;
                wynik_los.setText("Wynik tego losowania: "+sum);
                sum_gry=0;
                wynik_gry.setText("Wynik gry: "+sum_gry);
            }
        });
    }
}
