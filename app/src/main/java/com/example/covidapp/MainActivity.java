package com.example.covidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

import static android.widget.AdapterView.*;

public class MainActivity extends AppCompatActivity  {
    ArrayList<Cases> country = new ArrayList<Cases>();


    public void fillData(){
        country.add(new Cases("North America","Canada",40190,2005,24230,13789));
        country.add(new Cases("North America","USA",848779,47230,717456,84723));
        country.add(new Cases("North America","Mexico",10592,970,6947,2627));
        country.add(new Cases("South America","Brazil",40190,2005,24230,13789));
        country.add(new Cases("South America","Peru",40190,2005,24230,13789));
        country.add(new Cases("Europe","UK",133456,18100,115051,22567));
        country.add(new Cases("Europe","France",159315,21340,79880,40657));
        country.add(new Cases("Europe","Germany",150234,5315,99400,45560));
        country.add(new Cases("Europe","Spain",208455,21717,107345,85912));
        country.add(new Cases("Europe","Italy",187652,25085,107668,545376));
        country.add(new Cases("Asia","China",82345,4632,959,77207));
        country.add(new Cases("Asia","Japan",11950,299,10227,1424));
        country.add(new Cases("Asia","India",21370,681,16319,4370));
        country.add(new Cases("Asia","South Korea",10702,240,2051,8233));

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }




}
