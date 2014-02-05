package dhayu.epl;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
 
public class MainActivity extends Activity{
    private ListView listepl;
    private String items[]={"ManUtd","Arsenal","Chelsea","Liverpool","ManCity",
            "Everton","Tottenham","Newcastle","WestHam","Southampton","Blackburn"};
 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        listepl=(ListView) findViewById(R.id.listepl);
 
        ArrayAdapter<String> adapter=new ArrayAdapter <String>
        (MainActivity.this,android.R.layout.simple_list_item_1,items);
 
        listepl.setAdapter(adapter);
        
        
        listepl.setOnItemClickListener( new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int posisiData,
					long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "This Is : "+ items[posisiData]+"!", Toast.LENGTH_LONG).show();
			}
		});
    }
 
}
