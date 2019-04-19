package com.destinyapp.skripsijuki.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.destinyapp.skripsijuki.MainActivity;
import com.destinyapp.skripsijuki.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Dashboard extends Fragment {

    LinearLayout layoutPersegi;
    public Dashboard() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        layoutPersegi=(LinearLayout)view.findViewById(R.id.layoutPersegi);
        layoutPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(getActivity(), MainActivity.class);
                goInput.putExtra("Persegi","persegi");
                getActivity().startActivities(new Intent[]{goInput});
            }
        });
    }
}
