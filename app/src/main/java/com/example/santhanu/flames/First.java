package com.example.santhanu.flames;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class First extends ActionBarActivity {
    EditText et1,et2;
    Button b1;
    String a,s1;
    String b,s2;
    int n1,n2;
    int n3;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_first);
            et1 = (EditText) findViewById(R.id.et1);
            et2 = (EditText) findViewById(R.id.et2);
        b1 = (Button) findViewById(R.id.b1);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    a = et1.getText().toString();
                    b = et2.getText().toString();
                   s1 = a.toLowerCase();
                    s2 = b.toLowerCase();
                    n1 = a.length();
                    n2 = b.length();
                    if ((n1 == 0) || (n2 == 0))
                        n3 = -1;
                    else {
                        for (int i = 0; i < n1; i++) {
                            for (int j = 0; j < n2; j++) {
                                if (s1.charAt(i) == s2.charAt(j)) {
                                    s1 = s1.replace("a[i]", "");
                                    s2 = s2.replace("b[j]", "");
                                    n1 = n1-1;
                                    n2 = n2-1;
                                    j=0;
                                    break;
                                }}}
                        n3 = n1+n2;
                    }

                        Intent i1 = new Intent(getApplicationContext(), Second.class);
                        i1.putExtra("n3", n3);
                        i1.putExtra("s1", s1);
                        i1.putExtra("s2", s2);
                        startActivity(i1);
                    }});



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_first, menu);
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
