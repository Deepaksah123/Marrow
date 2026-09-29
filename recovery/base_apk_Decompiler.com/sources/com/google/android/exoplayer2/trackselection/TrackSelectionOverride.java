package com.google.android.exoplayer2.trackselection;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;
import kotlin.initExtraTracks;
import kotlin.parseTextAttribute;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class TrackSelectionOverride implements Bundleable {
    public final TrackGroup mediaTrackGroup;
    public final initExtraTracks<Integer> trackIndices;
    private static final String FIELD_TRACK_GROUP = Util.intToStringMaxRadix(0);
    private static final String FIELD_TRACKS = Util.intToStringMaxRadix(1);
    public static final Bundleable.Creator<TrackSelectionOverride> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return TrackSelectionOverride.lambda$static$0(bundle);
        }
    };

    public TrackSelectionOverride(TrackGroup trackGroup, int i) {
        this(trackGroup, initExtraTracks.read(Integer.valueOf(i)));
    }

    public TrackSelectionOverride(TrackGroup trackGroup, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= trackGroup.length)) {
            throw new IndexOutOfBoundsException();
        }
        this.mediaTrackGroup = trackGroup;
        this.trackIndices = initExtraTracks.write(list);
    }

    public final int getType() {
        return this.mediaTrackGroup.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) obj;
        return this.mediaTrackGroup.equals(trackSelectionOverride.mediaTrackGroup) && this.trackIndices.equals(trackSelectionOverride.trackIndices);
    }

    public final int hashCode() {
        return this.mediaTrackGroup.hashCode() + (this.trackIndices.hashCode() * 31);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(FIELD_TRACK_GROUP, this.mediaTrackGroup.toBundle());
        bundle.putIntArray(FIELD_TRACKS, parseTextAttribute.write(this.trackIndices));
        return bundle;
    }

    static /* synthetic */ TrackSelectionOverride lambda$static$0(Bundle bundle) {
        return new TrackSelectionOverride((TrackGroup) TrackGroup.CREATOR.fromBundle((Bundle) Assertions.checkNotNull(bundle.getBundle(FIELD_TRACK_GROUP))), parseTextAttribute.write((int[]) Assertions.checkNotNull(bundle.getIntArray(FIELD_TRACKS))));
    }
}
