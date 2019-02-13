package com.example.android.tourappfinal1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class CollegeFragment extends Fragment {
    public CollegeFragment()
    {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.listitem_list, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem(getString(R.string.college1), getContext().getString(R.string.iitk), getString(R.string.add1), R.drawable.iitk));
        listItems.add(new ListItem(getString(R.string.college2), getContext().getString(R.string.csjm), getString(R.string.add2), R.drawable.csjm));
        listItems.add(new ListItem(getString(R.string.college3), getContext().getString(R.string.hbti), getString(R.string.add3),  R.drawable.hbti));
        listItems.add(new ListItem(getString(R.string.college4), getContext().getString(R.string.gsvm), getString(R.string.add4), R.drawable.gsvm));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(), R.layout.list_item, listItems);

        ListView listView = (ListView) rootView.findViewById(R.id.listitem_list);

        listView.setAdapter(adapter);

        return rootView;

    }
}
