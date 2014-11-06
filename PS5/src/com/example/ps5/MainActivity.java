package com.example.ps5;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

//import 
public class MainActivity extends ActionBarActivity {

	Spinner yearpassed;
	EditText IntialAmount, AnnualRate, FutureValue;
	String[] number_of_years = { "1", "2", "3", "4", "5", "10", "15", "20",
			"25" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button calculate = (Button) findViewById(R.id.button1);
		calculate.setEnabled(false);
		Spinner spinr = (Spinner) findViewById(R.id.spinner1);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, number_of_years);
		spinr.setAdapter(adapter);
		spinr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {

				// TODO Auto-generated method stub
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
			}
			
		});
	
		calculate.setOnClickListener(new View.OnClickListener() {
		
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				IntialAmount = (EditText) findViewById(R.id.editText1);
				AnnualRate = (EditText) findViewById(R.id.editText2);
				FutureValue = (EditText) findViewById(R.id.editText3);
				yearpassed = (Spinner) findViewById(R.id.spinner1);
				double interest = Double.parseDouble((AnnualRate.getText()
						.toString()));
				double Intial_amount = Double.parseDouble(IntialAmount
						.getText().toString());
				int year = Integer.parseInt(yearpassed.getSelectedItem()
						.toString());
				String futurevalue = CalcEngine.getFuturevalue(year,
						Intial_amount, interest);
				FutureValue.setText(futurevalue);
			}
		});}	
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
};