package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.checkNonNegative;
import kotlin.parseSmta;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new Parcelable.Creator<SlowMotionData>() { // from class: com.google.android.exoplayer2.metadata.mp4.SlowMotionData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SlowMotionData[] newArray(int i) {
            return new SlowMotionData[i];
        }
    };
    public final List<Segment> segments;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static final class Segment implements Parcelable {
        public static final Comparator<Segment> BY_START_THEN_END_THEN_DIVISOR = new Comparator() { // from class: com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                SlowMotionData.Segment segment = (SlowMotionData.Segment) obj;
                SlowMotionData.Segment segment2 = (SlowMotionData.Segment) obj2;
                return checkNonNegative.write().IconCompatParcelizer(segment.startTimeMs, segment2.startTimeMs).IconCompatParcelizer(segment.endTimeMs, segment2.endTimeMs).AudioAttributesCompatParcelizer(segment.speedDivisor, segment2.speedDivisor).read();
            }
        };
        public static final Parcelable.Creator<Segment> CREATOR = new Parcelable.Creator<Segment>() { // from class: com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Segment[] newArray(int i) {
                return new Segment[i];
            }
        };
        public final long endTimeMs;
        public final int speedDivisor;
        public final long startTimeMs;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public Segment(long j, long j2, int i) {
            Assertions.checkArgument(j < j2);
            this.startTimeMs = j;
            this.endTimeMs = j2;
            this.speedDivisor = i;
        }

        public final String toString() {
            return Util.formatInvariant("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.startTimeMs), Long.valueOf(this.endTimeMs), Integer.valueOf(this.speedDivisor));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            return this.startTimeMs == segment.startTimeMs && this.endTimeMs == segment.endTimeMs && this.speedDivisor == segment.speedDivisor;
        }

        public final int hashCode() {
            return parseSmta.read(Long.valueOf(this.startTimeMs), Long.valueOf(this.endTimeMs), Integer.valueOf(this.speedDivisor));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.startTimeMs);
            parcel.writeLong(this.endTimeMs);
            parcel.writeInt(this.speedDivisor);
        }
    }

    public SlowMotionData(List<Segment> list) {
        this.segments = list;
        Assertions.checkArgument(!doSegmentsOverlap(list));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlowMotion: segments=");
        sb.append(this.segments);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.segments.equals(((SlowMotionData) obj).segments);
    }

    public final int hashCode() {
        return this.segments.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.segments);
    }

    private static boolean doSegmentsOverlap(List<Segment> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).endTimeMs;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).startTimeMs < j) {
                return true;
            }
            j = list.get(i).endTimeMs;
        }
        return false;
    }
}
