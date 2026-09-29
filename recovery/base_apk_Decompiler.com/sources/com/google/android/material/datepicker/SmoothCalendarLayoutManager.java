package com.google.android.material.datepicker;

import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.deserializeKeylj4SQcc;

/* JADX INFO: loaded from: classes5.dex */
class SmoothCalendarLayoutManager extends LinearLayoutManager {
    SmoothCalendarLayoutManager(int i, boolean z) {
        super(i, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void AudioAttributesCompatParcelizer(RecyclerView recyclerView, int i) {
        deserializeKeylj4SQcc deserializekeylj4sqcc = new deserializeKeylj4SQcc(recyclerView.getContext()) { // from class: com.google.android.material.datepicker.SmoothCalendarLayoutManager.1
            @Override // kotlin.deserializeKeylj4SQcc
            public final float AudioAttributesCompatParcelizer(DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }
        };
        deserializekeylj4sqcc.RemoteActionCompatParcelizer(i);
        RemoteActionCompatParcelizer(deserializekeylj4sqcc);
    }
}
