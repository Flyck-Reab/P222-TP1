package p222.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Display;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //partie 1
//        setContentView(R.layout.layout);
//        LinearLayout linLayout = (LinearLayout) findViewById(R.id.scrollLayoutId);
//
//        for(int i=0;i<50;i++)
//        {
//            TextView tv = new TextView(this.getApplicationContext());
//            tv.setText("Texte"+i);
//            tv.setTextColor(Color.BLACK);
//            linLayout.addView(tv);
//        }

        //partie 2
//        setContentView(R.layout.layoutbouton);

        //partie 3

//        setContentView(R.layout.tablelayout);
//        LinearLayout linLayout = (LinearLayout) findViewById(R.id.tableLayout);
//        Ecouteur ecouteur = new Ecouteur();
//        String[] noms=getResources().getStringArray(R.array.boutons);
//        for(int i=1;i<=8;i++){
//            int res = getResources().getIdentifier("button"+i,"id",getPackageName());
//            Button button =(Button) findViewById(res);
//            button.setText(noms[i-1]);
//            button.setOnClickListener(ecouteur);
//        }

        //partie 4
            setContentView(R.layout.terminal); //le layout terminal est divisé en deux : portrait et paysage





        Toast.makeText(getApplicationContext(), "onCreate!", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(getApplicationContext(), "onStart!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Affichage du toast
        Toast.makeText(getApplicationContext(), "onResume!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        // Affichage du toast
        Toast.makeText(getApplicationContext(), "onPause!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        // Affichage du toast
        Toast.makeText(getApplicationContext(), "onStop!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // Affichage du toast
        Toast.makeText(getApplicationContext(), "onDestroy!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        // Affichage du toast
        Toast.makeText(getApplicationContext(), "onRestart!", Toast.LENGTH_SHORT).show();
    }

    //classe interne
    class Ecouteur implements View.OnClickListener
    {
        @Override
        public void onClick(View v) {
            Button b = (Button) v;
            Toast.makeText(MainActivity.this,b.getText(),Toast.LENGTH_SHORT).show();
        }
    }
}
