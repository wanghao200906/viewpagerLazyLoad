package com.example.vp2;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

public class MyFragment extends Fragment {

    private static final String TAG = MyFragment.class.getSimpleName();

    public static final String INTENT_INT_INDEX = "index";

    ImageView imageView;
    TextView textView;
    int tabIndex;
    FrameLayout bg;


    public static MyFragment newInstance(int tabIndex) {
        Bundle bundle = new Bundle();
        bundle.putInt(INTENT_INT_INDEX, tabIndex);
        MyFragment fragment = new MyFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        tabIndex = getArguments().getInt(INTENT_INT_INDEX);
        Log.d(TAG, tabIndex + " fragment " + "onAttach: ");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, tabIndex + " fragment " + "onCreate: ");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lazy_loading, container, false);
        imageView = view.findViewById(R.id.iv_content);
        textView = view.findViewById(R.id.tv_loading);
        bg = view.findViewById(R.id.bg);
        textView.setText("page " + tabIndex);
        bg.setBackgroundColor(tabIndex % 2 == 0 ?
                ContextCompat.getColor(requireContext(), android.R.color.holo_green_dark)
                : ContextCompat.getColor(requireContext(), android.R.color.holo_red_light)
        );
        Log.d(TAG, tabIndex + " fragment " + "onCreateView: ");
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, tabIndex + " fragment " + "onResume: ");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, tabIndex + " fragment " + "onPause: ");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, tabIndex + " fragment " + "onDetach: ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, tabIndex + " fragment " + "onDestroyView: ");


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, tabIndex + " fragment " + "onDestroy: ");
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        tabIndex = getArguments().getInt(INTENT_INT_INDEX);
        Log.i(TAG, tabIndex + " fragment " + "setUserVisibleHint: " + isVisibleToUser);
    }


}
