package com.example.nikhil.collapsingtoolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView bankCard,ideasCard,addCard,linksCard,wifiCard,add2Card,add3Card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bankCard =(CardView) findViewById(R.id.bankcardId);
        ideasCard = findViewById(R.id.ideas_card);
        linksCard = findViewById(R.id.links_card);
        wifiCard= findViewById(R.id.wifi_card);
        addCard = findViewById(R.id.add_Card);
        add2Card = findViewById(R.id.add2_card);
        add3Card = findViewById(R.id.add3_card);

        //Add onClick Listeners to the card.

        bankCard.setOnClickListener(this);
        ideasCard.setOnClickListener(this);
        linksCard.setOnClickListener(this);
        wifiCard.setOnClickListener(this);
        addCard.setOnClickListener(this);
        add2Card.setOnClickListener(this);
        add3Card.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId())
        {
            case R.id.bankcardId : i = new Intent(this,Bank.class); startActivity(i); break;
            case R.id.add_Card : i = new Intent(this,Add.class); startActivity(i); break;
            case R.id.ideas_card : i = new Intent(this,Ideas.class); startActivity(i); break;
            case R.id.links_card : i = new Intent(this,Links.class); startActivity(i); break;
            case R.id.wifi_card : i = new Intent(this,Wifi.class); startActivity(i); break;
            default: break;

        }

    }
}
