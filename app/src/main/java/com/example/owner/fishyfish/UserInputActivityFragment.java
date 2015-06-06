package com.example.owner.fishyfish;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class UserInputActivityFragment extends Fragment {

    public UserInputActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        System.out.println("started");
        return inflater.inflate(R.layout.fragment_user_input, container, false);
    }


}
