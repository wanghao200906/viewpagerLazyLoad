package com.xiangxue.derry.lazyload.vp2;

import android.os.Bundle;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xiangxue.derry.lazyload.FragmentDelegater;
import com.xiangxue.derry.lazyload.R;
import com.xiangxue.derry.lazyload.base.LazyFragment5;

public class Fragment2_vp_2 extends LazyFragment5 {

    public static Fragment newIntance() {
        Fragment2_vp_2 fragment = new Fragment2_vp_2();
        fragment.setFragmentDelegater(new FragmentDelegater(fragment));
        return fragment;
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_vp_2;
    }

    @Override
    protected void initView(View view) { }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
