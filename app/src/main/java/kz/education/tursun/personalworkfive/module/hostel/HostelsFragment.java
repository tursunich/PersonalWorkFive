package kz.education.tursun.personalworkfive.module.hostel;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kz.education.tursun.personalworkfive.R;

public class HostelsFragment extends Fragment {

    public static HostelsFragment getInstance(){
        return new HostelsFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        RecyclerView mList = view.findViewById(R.id.list);
        mList.setLayoutManager(new LinearLayoutManager(getContext()));
        HostelAdapter mAdapter = new HostelAdapter(getContext());
        mList.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
        return view;
    }
}
