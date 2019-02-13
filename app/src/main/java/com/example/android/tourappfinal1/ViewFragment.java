package com.example.android.tourappfinal1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ViewFragment extends Fragment {
    public ViewFragment() {
        //Required Empty constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.listitem_list, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem(getString(R.string.View1), getContext().getString(R.string.blueworld), getString(R.string.add14), R.drawable.blueworld));
        listItems.add(new ListItem(getString(R.string.View2), getContext().getString(R.string.nanarao), getString(R.string.add15),  R.drawable.nanarao));
        listItems.add(new ListItem(getString(R.string.View3), getContext().getString(R.string.greenpark), getString(R.string.add16), R.drawable.greenpark));
        listItems.add(new ListItem(getString(R.string.View4), getContext().getString(R.string.motijheel), getString(R.string.add17), R.drawable.motijheel));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(), R.layout.list_item, listItems);

        ListView listView = (ListView) rootView.findViewById(R.id.listitem_list);

        listView.setAdapter(adapter);

        return rootView;

    }
}
