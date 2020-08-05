package com.zula.zulahaber.ui.karakterler;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zula.zulahaber.R;

public class KarakterlerFragment extends Fragment {

    private KarakterlerViewModel mViewModel;

    public static KarakterlerFragment newInstance() {
        return new KarakterlerFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.karakterler_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(KarakterlerViewModel.class);
        // TODO: Use the ViewModel
    }

}