package zioyero.tvshows;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class NewShowActivity extends Activity {

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_show);
		
		// Make sure we're running on honeycomb or higher to use ActionBar APIs
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB)
		{
			// Show the Up button in the action bar.
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_new_show, menu);
		return true;
	}
	
	public void addShow(View view)
	{
		EditText et = (EditText) findViewById(R.id.showToAdd);
		String showName = et.getText().toString();
		
		AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

		dlgAlert.setMessage(showName);
		dlgAlert.setTitle("Adding Show");
		dlgAlert.setPositiveButton("Ok",
			    new DialogInterface.OnClickListener() 
				{
			        public void onClick(DialogInterface dialog, int which) 
			        {}
			    });
		dlgAlert.setCancelable(true);
		dlgAlert.create().show();
	}

}
