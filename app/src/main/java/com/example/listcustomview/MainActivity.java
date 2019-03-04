package com.example.listcustomview;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int Images[]={R.drawable.aamirkhan,R.drawable.akshaykumar,R.drawable.edwardnorton,R.drawable.julieandrews,R.drawable.eraanhashmi,R.drawable.merylstreep,R.drawable.salmankhan,R.drawable.shahrukh,R.drawable.tomhanks};

    String Names[]={"Aamir Khan","Akshay Kumar","Big B","Edward Norton","Julie andrews","Emraan Hashmi","Mery Streep","Salman Khan","Shah Rukh Khan","Tom Hands"};

    String Description[]={"ACTOR","ACTOR","ACTOR","ACTOR","ACTOR","ACTOR","ACTOR","ACTOR","ACTOR","ACTOR"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView) findViewById(R.id.ListCustomView);

        CustomAdapter customAdapter=new CustomAdapter();

        listView.setAdapter(customAdapter);
    }

    class CustomAdapter extends BaseAdapter{



        @Override
        public int getCount() {
            return Images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }


        @Override
        public View getView(int i, View view, ViewGroup viewgroup) {
            view = getLayoutInflater().inflate(R.layout.customlayout,null);

            ImageView imageView=(ImageView) findViewById(R.id.imageView);
            TextView textview_name=(TextView) findViewById(R.id.textView_name);
            TextView textView_description=(TextView) findViewById(R.id.textView_description);

            imageView.setImageResource(Images[i]);
            textview_name.setText(Names[i]);
            textView_description.setText(Description[i]);
            return view;
        }
    }
}
