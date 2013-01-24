package zioyero.tvshows;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
	}
		

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main_menu, menu);
		return true;
	}
	
	/**
	 * Method is called when the button "My Shows" is pressed. Changes the view to
	 * the My Shows Activity.
	 * @param view
	 */
	public void myShowsGo(View view)
	{
		Intent intent = new Intent(this, MyShowsActivity.class);
		startActivity(intent);
	}
	
	/**
	 * Called when the button "New Show" is pressed. Changes the view to the New Show
	 * Activity in order to add a new show.
	 * @param view
	 */
	public void newShowGo(View view)
	{
		Intent intent = new Intent(this, NewShowActivity.class);
		startActivity(intent);
	}

}
