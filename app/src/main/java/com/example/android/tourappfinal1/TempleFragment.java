package com.example.android.tourappfinal1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class TempleFragment extends Fragment {
    public TempleFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.listitem_list, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem(getString(R.string.temple1), getContext().getString(R.string.pankihanuman), getString(R.string.add9), R.drawable.panki));
        listItems.add(new ListItem(getString(R.string.temple2), getContext().getString(R.string.Iskcon), getString(R.string.add10), R.drawable.iskcon));
        listItems.add(new ListItem(getString(R.string.temple3), getContext().getString(R.string.jktemple), getString(R.string.add11), R.drawable.jktemple));
        listItems.add(new ListItem(getString(R.string.temple4), getContext().getString(R.string.ravanatemple), getString(R.string.add12), R.drawable.ravana));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(), R.layout.list_item, listItems);

        ListView listView = (ListView) rootView.findViewById(R.id.listitem_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}