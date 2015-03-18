package com.example.calculatrice;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity
{
    private TextView resultat;
    private Button un,deux,trois,quatre,cinq,six,sept,huit,neuf,zero,diviser,multiplier,moins,plus,egale,point;
    private String operation = "";
    boolean flag = false;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialisation();
    }
    public void initialisation()
    {
        resultat = (TextView) findViewById(R.id.textView1);
        resultat.setText("");
        un = (Button) findViewById(R.id.un);
        deux = (Button) findViewById(R.id.deux);
        trois = (Button) findViewById(R.id.trois);
        quatre = (Button) findViewById(R.id.quatre);
        cinq = (Button) findViewById(R.id.cinq);
        six = (Button) findViewById(R.id.six);
        sept = (Button) findViewById(R.id.sept);
        huit = (Button) findViewById(R.id.huit);
        neuf = (Button) findViewById(R.id.neuf);
        zero = (Button) findViewById(R.id.zero);
        diviser = (Button) findViewById(R.id.divide);
        multiplier = (Button) findViewById(R.id.multiply);
        moins = (Button) findViewById(R.id.substract);
        plus = (Button) findViewById(R.id.adition);
        egale = (Button) findViewById(R.id.egale);
        point = (Button) findViewById(R.id.point);
        
        un.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                if (flag)
                {
                    resultat.setText("");
                    flag = false;
                }
                ChiffreAppuyer("1");
            }
        });
        deux.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                if (flag)
                {
                    resultat.setText("");
                    flag = false;
                }
                ChiffreAppuyer("2");
            }
        });
        trois.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                if (flag)
                {
                    resultat.setText("");
                    flag = false;
                }
                ChiffreAppuyer("3");
            }
        });
        quatre.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                if (flag)
                {
                    resultat.setText("");
                    flag = false;
                }
                ChiffreAppuyer("4");
            }
        });
        cinq.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                if (flag)
                {
                    resultat.setText("");
                    flag = false;
                }
                ChiffreAppuyer("5");
            }
        });
        six.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                if (flag)
                {
                    resultat.setText("");
                    flag = false;
                }
                ChiffreAppuyer("6");
            }
        });
        sept.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                if (flag)
                {
                    resultat.setText("");
                    flag = false;
                }
                ChiffreAppuyer("7");
            }
        });
        huit.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                if (flag)
                {
                    resultat.setText("");
                    flag = false;
                }
                ChiffreAppuyer("8");
            }
        });
        neuf.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                if (flag)
                {
                    resultat.setText("");
                    flag = false;
                }
                ChiffreAppuyer("9");
            }
        });
        zero.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                if (flag)
                {
                    resultat.setText("");
                    flag = false;
                }
                ChiffreAppuyer("0");
            }
        });
        egale.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                Calculer();
            }
        });
        diviser.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                if (flag)
                {
                    resultat.setText("");
                    flag = false;
                }
                operation = "/";
                ChiffreAppuyer("/");
            }
        });
        multiplier.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                if (flag)
                {
                    resultat.setText("");
                    flag = false;
                }
                operation = "x";
                ChiffreAppuyer("x");
            }
        });
        moins.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                if (flag)
                {
                    resultat.setText("");
                    flag = false;
                }
                operation = "-";
                ChiffreAppuyer("-");
            }
        });
        plus.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                if (flag)
                {
                    resultat.setText("");
                    flag = false;
                }
                operation = "+";
                ChiffreAppuyer("+");
            }
        });
    }
    public void ChiffreAppuyer(String valeur)
    {
        String base =(String) resultat.getText();
        base = base + valeur;
        resultat.setText(base);
    }
    public void Calculer()
    {
        flag = true;
        double total = 0;
        double chiffre1;
        double chiffre2;
        String[] tabresult;
        String result = (String) resultat.getText();
        switch (operation){
        case "/":
            tabresult = result.split("\\/");
            chiffre1 =Integer.parseInt(tabresult[0]);
            chiffre2 =Integer.parseInt(tabresult[1]);
            total = chiffre1 / chiffre2;
            break;
        case "+":
            tabresult = result.split("\\+");
            chiffre1 =Integer.parseInt(tabresult[0]);
            chiffre2 =Integer.parseInt(tabresult[1]);
            total = chiffre1 + chiffre2;
            break;
        case "-":
            tabresult = result.split("\\-");
            chiffre1 =Integer.parseInt(tabresult[0]);
            chiffre2 =Integer.parseInt(tabresult[1]);
            total = chiffre1 - chiffre2;
            break;
        case "x":
            tabresult = result.split("x");
            chiffre1 =Integer.parseInt(tabresult[0]);
            chiffre2 =Integer.parseInt(tabresult[1]);
            total = chiffre1 * chiffre2;
            break;
        }
        resultat.setText(String.valueOf(total));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
