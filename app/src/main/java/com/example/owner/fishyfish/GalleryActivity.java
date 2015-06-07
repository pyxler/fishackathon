package com.example.owner.fishyfish;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class GalleryActivity extends Fragment {
    ImageView im;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_SECTION_NUMBER = "1";


    // TODO: Rename and change types of parameters
    private int mNumber;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param mNumber Parameter 1.
     * @return A new instance of fragment CameraFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GalleryActivity newInstance(int mNumber) {
        GalleryActivity fragment = new GalleryActivity();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, mNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public GalleryActivity(){
        System.out.println("Constructor reached.");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.activity_gallery, container, false);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }

    public void biggerView(View v)

    {

        im=(ImageView)v.findViewById(R.id.selected);


        switch (v.getId())

        {

            case R.id.image1: im.setImageResource(R.drawable.im1);

                break;

            case R.id.image2: im.setImageResource(R.drawable.im2);

                break;

            case R.id.image3: im.setImageResource(R.drawable.im3);

                break;

            case R.id.image4: im.setImageResource(R.drawable.im4);

                break;

            case R.id.image5: im.setImageResource(R.drawable.im5);

                break;

            case R.id.image6: im.setImageResource(R.drawable.im6);

                break;

            case R.id.image7: im.setImageResource(R.drawable.im7);

                break;

        }

    }
}
