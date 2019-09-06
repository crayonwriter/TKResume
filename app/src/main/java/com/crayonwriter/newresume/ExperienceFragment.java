package com.crayonwriter.newresume;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ExperienceFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView experienceRecycler = (RecyclerView)inflater.inflate(R.layout.fragment_experience, container, false);

        String[] experienceNames = new String[Experience.experiences.length];
        for (int i=0; i < experienceNames.length; i++) {
            experienceNames[i] = Experience.experiences[i].getName();
        }

        String[] experienceDescription = new String[Experience.experiences.length];
        for (int i = 0; i < experienceDescription.length; i++) {
            experienceDescription[i] = Experience.experiences[i].getDescription();
        }

        String[] experienceDescription2 = new String[Experience.experiences.length];
        for (int i = 0; i < experienceDescription2.length; i++) {
            experienceDescription2[i] = Experience.experiences[i].getDescription2();
        }

        String[] experienceDescription3 = new String[Experience.experiences.length];
        for (int i = 0; i < experienceDescription3.length; i++) {
            experienceDescription3[i] = Experience.experiences[i].getDescription3();
        }

        ListItemAdapter adapter = new ListItemAdapter(experienceNames, experienceDescription, experienceDescription2, experienceDescription3);
        experienceRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        experienceRecycler.setLayoutManager(layoutManager);
        return experienceRecycler;
    }

}
