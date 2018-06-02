package com.example.dhrumilshah.tinello;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TextView setListner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.tinello_gallery);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);

        setListner = findViewById(R.id.tinello_zomato);
        setListner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri websiteUri = Uri.parse("https://www.zomato.com/ahmedabad/tinello-hyatt-regency-ashram-road");
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, websiteUri);
                startActivity(websiteIntent);
            }
        });

        setListner = findViewById(R.id.tinello_easydinner);
        setListner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri websiteUri = Uri.parse("https://www.eazydiner.com/ahmedabad/tinello-hyatt-regency-ashram-road-641222");
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, websiteUri);
                startActivity(websiteIntent);
            }
        });

        setListner = findViewById(R.id.tinello_dineout);
        setListner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri websiteUri = Uri.parse("https://www.dineout.co.in/ahmedabad/tinello-usmanpura-central-ahmedabad-21227");
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, websiteUri);
                startActivity(websiteIntent);
            }
        });

        setListner = findViewById(R.id.tinello_address);
        setListner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri addressUri = Uri.parse("https://www.google.com/maps/place/Tinello/@23.043539,72.5704392,15z/data=!4m5!3m4!1s0x0:0x210c024b48af31dd!8m2!3d23.043539!4d72.5704392");
                Intent addressIntent = new Intent(Intent.ACTION_VIEW, addressUri);
                startActivity(addressIntent);
            }
        });

        setListner = findViewById(R.id.tinello_contact);
        setListner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri numberUri = Uri.parse("tel:079 4017 1133");
                Intent numberIntent = new Intent(Intent.ACTION_DIAL, numberUri);
                startActivity(numberIntent);
            }
        });

        setListner = findViewById(R.id.tinello_website);
        setListner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri websiteUri = Uri.parse("http://www.hyattrestaurants.com/india/ahmedabad/restaurants-ahmedabad/italian-in-ashram-road-tinello/");
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, websiteUri);
                startActivity(websiteIntent);
            }
        });
    }
}
