package com.example.shaloin.sixthassignmenta;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class SimpleAddition extends Fragment {
    private EditText editText;
    private Button button;
    Context context;
    MyClickListener listener;

    public interface MyClickListener{
        public void getText(String text);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MyClickListener){
            this.context=context;
            this.listener=(MyClickListener)context;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple_addition, container, false);
        editText=(EditText)view.findViewById(R.id.editID);
        button=(Button)view.findViewById(R.id.buttonID);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=editText.getText().toString();
                listener.getText(text);
            }
        });
        return view;
    }


}
