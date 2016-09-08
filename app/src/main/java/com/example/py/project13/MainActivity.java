package com.example.py.project13;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;

import com.example.py.project12.R;
import com.example.py.project13.dummy.WordsContent;

public class MainActivity extends Activity implements
        ItemFragment.OnListFragmentInteractionListener ,DetailFragment.OnFragmentInteractionListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onListFragmentInteraction(WordsContent.WordItem item){
        Bundle arguments = new Bundle();
        arguments.putString("id", item.id);
        arguments.putString("content", item.content);
        DetailFragment fragment = new DetailFragment();
        fragment.setArguments(arguments);
        getFragmentManager().beginTransaction().replace(R.id.worddetail, fragment).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

}
