package com.shaishavgandhi.shaishavgandhi.samplesectionedrecyclerview.sections;

import android.view.View;

import com.shaishavgandhi.sectionedrecyclerview.Section;
import com.shaishavgandhi.shaishavgandhi.samplesectionedrecyclerview.R;
import com.shaishavgandhi.shaishavgandhi.samplesectionedrecyclerview.ViewHolders;

/**
 * Created by shaishav.gandhi on 12/21/16.
 */

public class NativeAd extends Section<ViewHolders.AdViewHolder> {

    @Override
    public void onBind(ViewHolders.AdViewHolder holder, int position) {

    }

    @Override
    public int getLayout() {
        return R.layout.native_ad;
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    @Override
    public ViewHolders.AdViewHolder getViewHolder(View view) {
        return new ViewHolders.AdViewHolder(view);
    }
}
