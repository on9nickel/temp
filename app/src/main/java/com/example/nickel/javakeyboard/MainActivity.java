package com.example.nickel.javakeyboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class  MainActivity extends AppCompatActivity {

    //public AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.autocomplete_country);
    //String[] countries = getResources().getStringArray(R.array.countries_array);
    //ArrayAdapter<String> adapter =
      //      new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);
        //textView.setAdapter(adapter);

    private AutoCompleteTextView autoComplete;
    private MultiAutoCompleteTextView multiAutoComplete;
    private ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] list = getResources().getStringArray(R.array.suggestions);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        autoComplete = (AutoCompleteTextView) findViewById(R.id.autoComplete);
        //multiAutoComplete = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoComplete);
        autoComplete.setAdapter(adapter);
        //multiAutoComplete.setAdapter(adapter);
        autoComplete.setThreshold(1);
        //multiAutoComplete.setThreshold(1);
        //multiAutoComplete.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer() );
        //multiAutoComplete.setTokenizer(new SpaceTokenizer());

    }
}
