package com.google.android.exoplayer2.ui;

import android.view.ViewGroup;
import java.util.List;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface AdViewProvider {
    ViewGroup getAdViewGroup();

    default List<AdOverlayInfo> getAdOverlayInfos() {
        return initExtraTracks.AudioAttributesImplApi26Parcelizer();
    }
}
