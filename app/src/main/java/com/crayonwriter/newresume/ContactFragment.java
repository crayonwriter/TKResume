package com.crayonwriter.newresume;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactFragment extends Fragment implements View.OnClickListener {

    public ContactFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_contact, container, false);
        TextView emailView = (TextView)layout.findViewById(R.id.email);
        emailView.setOnClickListener(this);
        return layout;
    }

    @Override
    public void onClick(View v) {
        sendEmail();
    }

    private void sendEmail() {

        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setType("text/plain");
        emailIntent.setData(Uri.parse("mailto:" + "crayonwriter@gmail.com"));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "TKResume in Play Store");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "I installed your resume from the Play Store.");
//        startActivity(emailIntent);

        try {
            startActivity(Intent.createChooser(emailIntent, "Send email using..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getActivity(), "No email clients installed.", Toast.LENGTH_SHORT).show();
        }

    }

    }


