package com.example.cgpaucc;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import data.Sem;
import data.SemAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class L300 extends Fragment implements SemAdapter.onSemListener{

    ArrayList<Sem> sem = new ArrayList<>();

    public L300() {
        // Required empty public constructor
    }


    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sem_list, container, false);

        sem.add(new Sem("First Semester",R.drawable.l300s1));
        sem.add(new Sem("Second Semester",R.drawable.l300s2));

      /**  SemAdapter StAd = new SemAdapter((AppCompatActivity) getActivity(), sem, R.color.category_colors);

        ListView root = (ListView) rootView.findViewById(R.id.rootview);

        root.setAdapter(StAd);

        root.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Sem selectedSem = sem.get(position);
                if(position == 0){
                    Intent Intent = new Intent(getActivity(),SemesterPreview.class);
                    Intent.putExtra("SEM_KEY", 5);
                    startActivity(Intent);
                }
                else {

                    Intent Intent = new Intent(getActivity(),SemesterPreview.class);
                    Intent.putExtra("SEM_KEY", 6);
                    startActivity(Intent);
                }
            }
        });

*/
        SemAdapter StAd = new SemAdapter(sem,this);

        RecyclerView root = (RecyclerView) rootView.findViewById(R.id.rootview);

        root.setAdapter(StAd);

        root.setLayoutManager(new LinearLayoutManager(getContext()));

        return rootView;
    }

    @Override
    public void onSemClick(int position) {

        if(position == 0){
            Intent Intent = new Intent(getActivity(),SemesterPreview.class);
            Intent.putExtra("SEM_KEY", 5);
            startActivity(Intent);
        }
        else {

            Intent Intent = new Intent(getActivity(),SemesterPreview.class);
            Intent.putExtra("SEM_KEY", 6);
            startActivity(Intent);
        }

    }
}
