package com.example.avjindersinghsekhon.minimaltodo.Main;

import android.support.v7.widget.RecyclerView;
import android.util.Log;

public abstract class CustomRecyclerScrollViewListener extends RecyclerView.OnScrollListener {
    int dyBefore = 0;
    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);
//        Log.d("OskarSchindler", "Scroll Distance "+ scrollDist + " " + dx + " " + dy);
        if(dy - dyBefore >= 0){
            show();
        }
        else{
            hide();
        }
        dyBefore = dy;
    }

    public abstract void show();

    public abstract void hide();
}
