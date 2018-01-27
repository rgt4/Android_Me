package com.example.android.android_me;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.android_me.data.AndroidImageAssets;
import com.example.android.android_me.ui.MasterListAdapter;

/**
 * Created by RRogowski on 2018-01-26.
 */
// COMPLETED (2) Create a new class called MasterListFragment which will display the GridView list of ALL AndroidMe images
// In the fragment class, you'll need to implement an empty constructor, and onCreateView

// TODO (3) In the MasterListFragment class, create a new MasterListAdapter and set it on the GridView
// The MasterListAdapter code is provided; it creates the ImageViews that are contained in the GridView
// The adapter takes as parameters (Context context, List<Integer> imageIds)

public class MasterListFragment extends Fragment{

    public MasterListFragment() {

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        MasterListAdapter mla = new MasterListAdapter(getActivity(), AndroidImageAssets.getAll());

        //Context c = getActivity().getApplicationContext();

        View rootView = inflater.inflate(R.layout.fragment_master_list,container, false);
        GridView gv = (GridView) rootView.findViewById(R.id.images_gridView);
        gv.setAdapter(mla);

        //return super.onCreateView(inflater, container, savedInstanceState);
        return rootView;
    }



}
