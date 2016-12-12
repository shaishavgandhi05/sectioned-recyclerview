package com.example.shaishavgandhi.samplesectionedrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import com.example.sectionedrecyclerview.SectionedRecyclerAdapter;
import com.example.shaishavgandhi.samplesectionedrecyclerview.models.Book;
import com.example.shaishavgandhi.samplesectionedrecyclerview.models.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shaishav.gandhi on 11/19/16.
 */

public class Adapter extends SectionedRecyclerAdapter<RecyclerView.ViewHolder> {

    private Context mContext;

    public Adapter(Context context, final List<Movie> mData, List<Book> mData2) {
        super(context);

        final MoviesSection moviesSection = new MoviesSection(context, mData);
        List<String> mHeader = new ArrayList<>();
        mHeader.add("misc");
        HeaderSection headerSection = new HeaderSection(mHeader);

        final BooksSection booksSection = new BooksSection(context, mData2);
        addSection(headerSection);
        addSection(moviesSection);
        addSection(new BooksHeader());
        addSection(booksSection);
//        addSection(new Section2(context, mData2));
////        List<String> misc = new ArrayList<>();
////        misc.add("asd");
////        addSectionAt(5, new Section3(misc));
//
//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                mData.add("Dimple");
//                section1.replaceData(mData);
//                notifySectionChanged(0);
//            }
//        }, 5000);
    }

}
