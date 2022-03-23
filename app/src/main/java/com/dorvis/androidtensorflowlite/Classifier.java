package com.dorvis.androidtensorflowlite;

import android.graphics.Bitmap;

import java.util.List;
public interface Classifier {

    class Recognition {
        /**
         * A unique identifier for what has been recognized. Specific to the class, not the instance of
         * the object.
         */
        private final String id;

        /**
         * Display name for the recognition.
   