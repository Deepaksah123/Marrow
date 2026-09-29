package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.initExtraTracks;
import kotlin.parseCommentAttribute;
import kotlin.parseStbl;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class Tracks implements Bundleable {
    private final initExtraTracks<Group> groups;
    public static final Tracks EMPTY = new Tracks(initExtraTracks.AudioAttributesImplApi26Parcelizer());
    private static final String FIELD_TRACK_GROUPS = Util.intToStringMaxRadix(0);
    public static final Bundleable.Creator<Tracks> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.Tracks$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return Tracks.lambda$static$0(bundle);
        }
    };

    public static final class Group implements Bundleable {
        private final boolean adaptiveSupported;
        public final int length;
        private final TrackGroup mediaTrackGroup;
        private final boolean[] trackSelected;
        private final int[] trackSupport;
        private static final String FIELD_TRACK_GROUP = Util.intToStringMaxRadix(0);
        private static final String FIELD_TRACK_SUPPORT = Util.intToStringMaxRadix(1);
        private static final String FIELD_TRACK_SELECTED = Util.intToStringMaxRadix(3);
        private static final String FIELD_ADAPTIVE_SUPPORTED = Util.intToStringMaxRadix(4);
        public static final Bundleable.Creator<Group> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.Tracks$Group$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return Tracks.Group.lambda$static$0(bundle);
            }
        };

        public Group(TrackGroup trackGroup, boolean z, int[] iArr, boolean[] zArr) {
            int i = trackGroup.length;
            this.length = i;
            Assertions.checkArgument(i == iArr.length && i == zArr.length);
            this.mediaTrackGroup = trackGroup;
            this.adaptiveSupported = z && i > 1;
            this.trackSupport = (int[]) iArr.clone();
            this.trackSelected = (boolean[]) zArr.clone();
        }

        public final TrackGroup getMediaTrackGroup() {
            return this.mediaTrackGroup;
        }

        public final Format getTrackFormat(int i) {
            return this.mediaTrackGroup.getFormat(i);
        }

        public final int getTrackSupport(int i) {
            return this.trackSupport[i];
        }

        public final boolean isTrackSupported(int i) {
            return isTrackSupported(i, false);
        }

        public final boolean isTrackSupported(int i, boolean z) {
            int i2 = this.trackSupport[i];
            if (i2 != 4) {
                return z && i2 == 3;
            }
            return true;
        }

        public final boolean isSelected() {
            return parseCommentAttribute.RemoteActionCompatParcelizer(this.trackSelected);
        }

        public final boolean isAdaptiveSupported() {
            return this.adaptiveSupported;
        }

        public final boolean isSupported() {
            return isSupported(false);
        }

        public final boolean isSupported(boolean z) {
            for (int i = 0; i < this.trackSupport.length; i++) {
                if (isTrackSupported(i, z)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isTrackSelected(int i) {
            return this.trackSelected[i];
        }

        public final int getType() {
            return this.mediaTrackGroup.type;
        }

        public final Group copyWithId(String str) {
            return new Group(this.mediaTrackGroup.copyWithId(str), this.adaptiveSupported, this.trackSupport, this.trackSelected);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Group group = (Group) obj;
            return this.adaptiveSupported == group.adaptiveSupported && this.mediaTrackGroup.equals(group.mediaTrackGroup) && Arrays.equals(this.trackSupport, group.trackSupport) && Arrays.equals(this.trackSelected, group.trackSelected);
        }

        public final int hashCode() {
            int iHashCode = this.mediaTrackGroup.hashCode();
            boolean z = this.adaptiveSupported;
            return (((((iHashCode * 31) + (z ? 1 : 0)) * 31) + Arrays.hashCode(this.trackSupport)) * 31) + Arrays.hashCode(this.trackSelected);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(FIELD_TRACK_GROUP, this.mediaTrackGroup.toBundle());
            bundle.putIntArray(FIELD_TRACK_SUPPORT, this.trackSupport);
            bundle.putBooleanArray(FIELD_TRACK_SELECTED, this.trackSelected);
            bundle.putBoolean(FIELD_ADAPTIVE_SUPPORTED, this.adaptiveSupported);
            return bundle;
        }

        static /* synthetic */ Group lambda$static$0(Bundle bundle) {
            TrackGroup trackGroup = (TrackGroup) TrackGroup.CREATOR.fromBundle((Bundle) Assertions.checkNotNull(bundle.getBundle(FIELD_TRACK_GROUP)));
            return new Group(trackGroup, bundle.getBoolean(FIELD_ADAPTIVE_SUPPORTED, false), (int[]) parseStbl.RemoteActionCompatParcelizer(bundle.getIntArray(FIELD_TRACK_SUPPORT), new int[trackGroup.length]), (boolean[]) parseStbl.RemoteActionCompatParcelizer(bundle.getBooleanArray(FIELD_TRACK_SELECTED), new boolean[trackGroup.length]));
        }
    }

    public Tracks(List<Group> list) {
        this.groups = initExtraTracks.write(list);
    }

    public final initExtraTracks<Group> getGroups() {
        return this.groups;
    }

    public final boolean isEmpty() {
        return this.groups.isEmpty();
    }

    public final boolean containsType(int i) {
        for (int i2 = 0; i2 < this.groups.size(); i2++) {
            if (this.groups.get(i2).getType() == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean isTypeSupported(int i) {
        return isTypeSupported(i, false);
    }

    public final boolean isTypeSupported(int i, boolean z) {
        for (int i2 = 0; i2 < this.groups.size(); i2++) {
            if (this.groups.get(i2).getType() == i && this.groups.get(i2).isSupported(z)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public final boolean isTypeSupportedOrEmpty(int i) {
        return isTypeSupportedOrEmpty(i, false);
    }

    @Deprecated
    public final boolean isTypeSupportedOrEmpty(int i, boolean z) {
        return !containsType(i) || isTypeSupported(i, z);
    }

    public final boolean isTypeSelected(int i) {
        for (int i2 = 0; i2 < this.groups.size(); i2++) {
            Group group = this.groups.get(i2);
            if (group.isSelected() && group.getType() == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.groups.equals(((Tracks) obj).groups);
    }

    public final int hashCode() {
        return this.groups.hashCode();
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(FIELD_TRACK_GROUPS, BundleableUtil.toBundleArrayList(this.groups));
        return bundle;
    }

    static /* synthetic */ Tracks lambda$static$0(Bundle bundle) {
        initExtraTracks initextratracksFromBundleList;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_TRACK_GROUPS);
        if (parcelableArrayList == null) {
            initextratracksFromBundleList = initExtraTracks.AudioAttributesImplApi26Parcelizer();
        } else {
            initextratracksFromBundleList = BundleableUtil.fromBundleList(Group.CREATOR, parcelableArrayList);
        }
        return new Tracks(initextratracksFromBundleList);
    }
}
