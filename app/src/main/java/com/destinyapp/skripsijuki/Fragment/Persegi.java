package com.destinyapp.skripsijuki.Fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.destinyapp.skripsijuki.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Persegi extends Fragment {

    EditText Sisi;
    TextView maka,sehingga;
    Button menghitung;

    public Persegi() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_persegi, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Sisi = (EditText)view.findViewById(R.id.etSisi);
        maka = (TextView)view.findViewById(R.id.rumusMaka);
        sehingga = (TextView)view.findViewById(R.id.rumusSehingga);
        menghitung = (Button)view.findViewById(R.id.btnHitung);

        menghitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Menghitung();
            }
        });
    }
    private void Menghitung(){
        int sisi = Integer.parseInt(Sisi.getText().toString());
        int total = sisi * sisi * sisi;
        maka.setText(sisi+" X "+sisi+" X"+sisi);
        sehingga.setText(String.valueOf(total));
    }
}
