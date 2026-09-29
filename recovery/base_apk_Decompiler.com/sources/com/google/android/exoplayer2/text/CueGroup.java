package com.google.android.exoplayer2.text;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.List;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class CueGroup implements Bundleable {
    public final initExtraTracks<Cue> cues;
    public final long presentationTimeUs;
    public static final CueGroup EMPTY_TIME_ZERO = new CueGroup(initExtraTracks.AudioAttributesImplApi26Parcelizer(), 0);
    private static final String FIELD_CUES = Util.intToStringMaxRadix(0);
    private static final String FIELD_PRESENTATION_TIME_US = Util.intToStringMaxRadix(1);
    public static final Bundleable.Creator<CueGroup> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.text.CueGroup$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return CueGroup.fromBundle(bundle);
        }
    };

    public CueGroup(List<Cue> list, long j) {
        this.cues = initExtraTracks.write(list);
        this.presentationTimeUs = j;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(FIELD_CUES, BundleableUtil.toBundleArrayList(filterOutBitmapCues(this.cues)));
        bundle.putLong(FIELD_PRESENTATION_TIME_US, this.presentationTimeUs);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CueGroup fromBundle(Bundle bundle) {
        initExtraTracks initextratracksFromBundleList;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_CUES);
        if (parcelableArrayList == null) {
            initextratracksFromBundleList = initExtraTracks.AudioAttributesImplApi26Parcelizer();
        } else {
            initextratracksFromBundleList = BundleableUtil.fromBundleList(Cue.CREATOR, parcelableArrayList);
        }
        return new CueGroup(initextratracksFromBundleList, bundle.getLong(FIELD_PRESENTATION_TIME_US));
    }

    private static initExtraTracks<Cue> filterOutBitmapCues(List<Cue> list) {
        initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).bitmap == null) {
                iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(list.get(i));
            }
        }
        return iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
    }
}
