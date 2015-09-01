package com.veinhorn.scrollgalleryview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by veinhorn on 29.8.15.
 */
public class ImageFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.image_fragment, container, false);
        ImageView backgroundImage = (ImageView)rootView.findViewById(R.id.backgroundImage);
        backgroundImage.setImageDrawable(getResources().getDrawable(getArguments().getInt("image")));
        return rootView;
    }
}
