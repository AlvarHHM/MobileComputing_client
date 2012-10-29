package edu.mb.activity;

import java.io.IOException;

import com.appspot.api.services.account.Account;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.json.gson.GsonFactory;
import android.os.Bundle; 
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class LoginActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		Account.Builder builder = new Account.Builder(
				AndroidHttp.newCompatibleTransport(), new GsonFactory(), null);
		Account acc = builder.build();
		try {
			com.appspot.api.services.account.model.Account ac = acc.account().login("mahoihei", "mahoihei").execute();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_login, menu);
		return true;
	}
	
	public void doLogin(View v){
		
	}
}
