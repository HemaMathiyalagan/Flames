package com.example.santhanu.flames;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class Second extends Activity{
Button b1,b2;
    int e;
    RelativeLayout r1;
    TextView t1;
    String s1,s2;
    int n3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        t1 = (TextView) findViewById(R.id.t1);
        b1 = (Button) findViewById(R.id.b1);
        r1=(RelativeLayout)findViewById(R.id.r1);
        b2 = (Button) findViewById(R.id.b2);
        Bundle b=getIntent().getExtras();
        s1=b.getString("s1");
        s2=b.getString("s2");
        n3=b.getInt("n3");
        Toast.makeText(getApplicationContext(),"flames number is "+n3,Toast.LENGTH_LONG).show();
       // Toast.makeText(getApplicationContext(),s1.charAt(1),Toast.LENGTH_LONG).show();
        if (n3 == -1)
            t1.setText("Invalid Data");
        else if (n3 == 2 || n3 == 4 || n3 == 7 || n3 == 9||n3==20) {
                r1.setBackgroundResource(R.drawable.enemy);
                t1.setText(s1 + " and " + s2 + " are enemies");
            } else if (n3 == 3 || n3 == 5 || n3 == 14 || n3 == 16 || n3 == 18||n3==0||n3>20)
        {
            r1.setBackgroundResource(R.drawable.fnd);
                t1.setText(s1 + " and " + s2 + " are Friends");
            } else if (n3 == 8 || n3 == 12 || n3 == 17) {
            r1.setBackgroundResource(R.drawable.affection);
            t1.setText(s1 + " and " + s2 + " in Affection");
        }
            else if (n3 == 19||n3==10) {
            r1.setBackgroundResource(R.drawable.love);
            t1.setText(s1 + " and " + s2 + " in Love");
        }
            else if (n3 == 11 || n3 == 15||n3==6||n3==13){
            r1.setBackgroundResource(R.drawable.marriage);
            t1.setText(s1 + " and " + s2 + " will marriage");
        }        else if(n3==1)
        {
            r1.setBackgroundResource(R.drawable.sweetheart);
                t1.setText(s1 + " and " + s2 + " are SweetHearts");
        }


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), First.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("exit", true);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);


                //android.os.Process.killProcess(android.os.Process.myPid());


            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
