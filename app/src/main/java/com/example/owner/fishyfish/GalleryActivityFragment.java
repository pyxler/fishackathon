package com.example.owner.fishyfish;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class GalleryActivityFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public static GalleryActivityFragment newInstance(int sectionNumber) {
        GalleryActivityFragment fragment = new GalleryActivityFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        System.out.println("gallery fragment started");
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gallery, container, false);
    }
}
