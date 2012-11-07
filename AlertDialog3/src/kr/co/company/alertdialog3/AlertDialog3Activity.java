package kr.co.company.alertdialog3;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class AlertDialog3Activity extends Activity {
	private static final int DIALOG_YES_NO_MESSAGE = 1;

	@Override
	protected Dialog onCreateDialog(int id) {
		switch (id) {
		case DIALOG_YES_NO_MESSAGE:
			final CharSequence[] items ={ "Red", "Green", "Blue" };

			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder.setTitle("색상을 선택하시오");
			builder.setItems(items, new 
				DialogInterface.OnClickListener(){ 
			  public void onClick(DialogInterface dialog, int item) {
			    Toast.makeText(getApplicationContext(), items[item], 
				Toast.LENGTH_SHORT).show();}}
			  
			);
			AlertDialog alert = builder.create();
			return alert;
		}
		return null;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button b = (Button) findViewById(R.id.Button01);
		b.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				showDialog(DIALOG_YES_NO_MESSAGE);
			}
		});
	}
}