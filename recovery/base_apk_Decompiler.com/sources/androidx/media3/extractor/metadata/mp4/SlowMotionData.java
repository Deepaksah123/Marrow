package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.LaissezFaireSubTypeValidator;
import kotlin.buildTypeSerializer;
import kotlin.parseSmta;

/* JADX INFO: loaded from: classes2.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new Parcelable.Creator<SlowMotionData>() { // from class: androidx.media3.extractor.metadata.mp4.SlowMotionData.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SlowMotionData createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SlowMotionData[] newArray(int i) {
            return write(i);
        }

        private static SlowMotionData IconCompatParcelizer(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        private static SlowMotionData[] write(int i) {
            return new SlowMotionData[i];
        }
    };
    public final List<Segment> RemoteActionCompatParcelizer;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR;
        public final long AudioAttributesCompatParcelizer;
        public final int RemoteActionCompatParcelizer;
        public final long write;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        static {
            new Comparator() { // from class: o.getEnumClass
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    SlowMotionData.Segment segment = (SlowMotionData.Segment) obj;
                    SlowMotionData.Segment segment2 = (SlowMotionData.Segment) obj2;
                    return checkNonNegative.write().IconCompatParcelizer(segment.AudioAttributesCompatParcelizer, segment2.AudioAttributesCompatParcelizer).IconCompatParcelizer(segment.write, segment2.write).AudioAttributesCompatParcelizer(segment.RemoteActionCompatParcelizer, segment2.RemoteActionCompatParcelizer).read();
                }
            };
            CREATOR = new Parcelable.Creator<Segment>() { // from class: androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment.3
                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Segment createFromParcel(Parcel parcel) {
                    return RemoteActionCompatParcelizer(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Segment[] newArray(int i) {
                    return AudioAttributesCompatParcelizer(i);
                }

                private static Segment RemoteActionCompatParcelizer(Parcel parcel) {
                    return new Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
                }

                private static Segment[] AudioAttributesCompatParcelizer(int i) {
                    return new Segment[i];
                }
            };
        }

        public Segment(long j, long j2, int i) {
            buildTypeSerializer.IconCompatParcelizer(j < j2);
            this.AudioAttributesCompatParcelizer = j;
            this.write = j2;
            this.RemoteActionCompatParcelizer = i;
        }

        public final String toString() {
            return LaissezFaireSubTypeValidator.read("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.AudioAttributesCompatParcelizer), Long.valueOf(this.write), Integer.valueOf(this.RemoteActionCompatParcelizer));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            return this.AudioAttributesCompatParcelizer == segment.AudioAttributesCompatParcelizer && this.write == segment.write && this.RemoteActionCompatParcelizer == segment.RemoteActionCompatParcelizer;
        }

        public final int hashCode() {
            return parseSmta.read(Long.valueOf(this.AudioAttributesCompatParcelizer), Long.valueOf(this.write), Integer.valueOf(this.RemoteActionCompatParcelizer));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.AudioAttributesCompatParcelizer);
            parcel.writeLong(this.write);
            parcel.writeInt(this.RemoteActionCompatParcelizer);
        }
    }

    public SlowMotionData(List<Segment> list) {
        this.RemoteActionCompatParcelizer = list;
        buildTypeSerializer.IconCompatParcelizer(!write(list));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlowMotion: segments=");
        sb.append(this.RemoteActionCompatParcelizer);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.RemoteActionCompatParcelizer.equals(((SlowMotionData) obj).RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.RemoteActionCompatParcelizer);
    }

    private static boolean write(List<Segment> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).write;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).AudioAttributesCompatParcelizer < j) {
                return true;
            }
            j = list.get(i).write;
        }
        return false;
    }
}
