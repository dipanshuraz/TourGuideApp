package com.example.android.tourappfinal1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopsFragment extends Fragment {
    public ShopsFragment() {
        // Constructor required
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.listitem_list, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem(getString(R.string.shop1), getContext().getString(R.string.zsquare), getString(R.string.add5), R.drawable.zsqaure));
        listItems.add(new ListItem(getString(R.string.shop2), getContext().getString(R.string.ravemoti), getString(R.string.add6), R.drawable.rave));
        listItems.add(new ListItem(getString(R.string.shop3), getContext().getString(R.string.sisamau), getString(R.string.add7), R.drawable.sisamau));
        listItems.add(new ListItem(getString(R.string.shop4), getContext().getString(R.string.mallroad), getString(R.string.add8), R.drawable.mall));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(), R.layout.list_item, listItems);

        ListView listView = (ListView) rootView.findViewById(R.id.listitem_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}

