package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.AsPropertyTypeDeserializer;
import kotlin.MinimalClassNameIdResolver;

/* JADX INFO: loaded from: classes2.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new Parcelable.Creator<SpliceInsertCommand>() { // from class: androidx.media3.extractor.metadata.scte35.SpliceInsertCommand.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SpliceInsertCommand createFromParcel(Parcel parcel) {
            return AudioAttributesCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SpliceInsertCommand[] newArray(int i) {
            return AudioAttributesCompatParcelizer(i);
        }

        private static SpliceInsertCommand AudioAttributesCompatParcelizer(Parcel parcel) {
            return new SpliceInsertCommand(parcel, (byte) 0);
        }

        private static SpliceInsertCommand[] AudioAttributesCompatParcelizer(int i) {
            return new SpliceInsertCommand[i];
        }
    };
    public final List<IconCompatParcelizer> AudioAttributesCompatParcelizer;
    public final boolean AudioAttributesImplApi21Parcelizer;
    public final long AudioAttributesImplApi26Parcelizer;
    public final boolean AudioAttributesImplBaseParcelizer;
    public final long IconCompatParcelizer;
    public final boolean MediaBrowserCompatCustomActionResultReceiver;
    public final long MediaBrowserCompatItemReceiver;
    public final long MediaBrowserCompatSearchResultReceiver;
    public final int MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public final int RemoteActionCompatParcelizer;
    public final boolean read;
    public final int write;

    /* synthetic */ SpliceInsertCommand(Parcel parcel, byte b) {
        this(parcel);
    }

    private SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<IconCompatParcelizer> list, boolean z5, long j4, int i, int i2, int i3) {
        this.MediaBrowserCompatSearchResultReceiver = j;
        this.AudioAttributesImplBaseParcelizer = z;
        this.AudioAttributesImplApi21Parcelizer = z2;
        this.MediaBrowserCompatCustomActionResultReceiver = z3;
        this.MediaMetadataCompat = z4;
        this.AudioAttributesImplApi26Parcelizer = j2;
        this.MediaBrowserCompatItemReceiver = j3;
        this.AudioAttributesCompatParcelizer = Collections.unmodifiableList(list);
        this.read = z5;
        this.IconCompatParcelizer = j4;
        this.MediaDescriptionCompat = i;
        this.write = i2;
        this.RemoteActionCompatParcelizer = i3;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.MediaBrowserCompatSearchResultReceiver = parcel.readLong();
        this.AudioAttributesImplBaseParcelizer = parcel.readByte() == 1;
        this.AudioAttributesImplApi21Parcelizer = parcel.readByte() == 1;
        this.MediaBrowserCompatCustomActionResultReceiver = parcel.readByte() == 1;
        this.MediaMetadataCompat = parcel.readByte() == 1;
        this.AudioAttributesImplApi26Parcelizer = parcel.readLong();
        this.MediaBrowserCompatItemReceiver = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(IconCompatParcelizer.write(parcel));
        }
        this.AudioAttributesCompatParcelizer = Collections.unmodifiableList(arrayList);
        this.read = parcel.readByte() == 1;
        this.IconCompatParcelizer = parcel.readLong();
        this.MediaDescriptionCompat = parcel.readInt();
        this.write = parcel.readInt();
        this.RemoteActionCompatParcelizer = parcel.readInt();
    }

    public static SpliceInsertCommand IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, long j, MinimalClassNameIdResolver minimalClassNameIdResolver) {
        List list;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        int iOnPrepare;
        int iOnPlayFromMediaId;
        int iOnPlayFromMediaId2;
        boolean z4;
        boolean z5;
        long jOnMediaButtonEvent;
        long jOnMediaButtonEvent2 = asPropertyTypeDeserializer.onMediaButtonEvent();
        boolean z6 = (asPropertyTypeDeserializer.onPlayFromMediaId() & 128) != 0;
        List listEmptyList = Collections.emptyList();
        if (z6) {
            list = listEmptyList;
            z = false;
            z2 = false;
            j2 = C.TIME_UNSET;
            z3 = false;
            j3 = C.TIME_UNSET;
            iOnPrepare = 0;
            iOnPlayFromMediaId = 0;
            iOnPlayFromMediaId2 = 0;
            z4 = false;
        } else {
            int iOnPlayFromMediaId3 = asPropertyTypeDeserializer.onPlayFromMediaId();
            boolean z7 = (iOnPlayFromMediaId3 & 128) != 0;
            boolean z8 = (iOnPlayFromMediaId3 & 64) != 0;
            boolean z9 = (iOnPlayFromMediaId3 & 32) != 0;
            boolean z10 = (iOnPlayFromMediaId3 & 16) != 0;
            long jAudioAttributesCompatParcelizer = (!z8 || z10) ? C.TIME_UNSET : TimeSignalCommand.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer, j);
            if (!z8) {
                int iOnPlayFromMediaId4 = asPropertyTypeDeserializer.onPlayFromMediaId();
                ArrayList arrayList = new ArrayList(iOnPlayFromMediaId4);
                for (int i = 0; i < iOnPlayFromMediaId4; i++) {
                    int iOnPlayFromMediaId5 = asPropertyTypeDeserializer.onPlayFromMediaId();
                    long jAudioAttributesCompatParcelizer2 = !z10 ? TimeSignalCommand.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer, j) : C.TIME_UNSET;
                    arrayList.add(new IconCompatParcelizer(iOnPlayFromMediaId5, jAudioAttributesCompatParcelizer2, minimalClassNameIdResolver.write(jAudioAttributesCompatParcelizer2), (byte) 0));
                }
                listEmptyList = arrayList;
            }
            if (z9) {
                long jOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
                boolean z11 = (128 & jOnPlayFromMediaId) != 0;
                jOnMediaButtonEvent = ((((jOnPlayFromMediaId & 1) << 32) | asPropertyTypeDeserializer.onMediaButtonEvent()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
                jOnMediaButtonEvent = C.TIME_UNSET;
            }
            iOnPrepare = asPropertyTypeDeserializer.onPrepare();
            z4 = z8;
            iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
            iOnPlayFromMediaId2 = asPropertyTypeDeserializer.onPlayFromMediaId();
            list = listEmptyList;
            long j4 = jAudioAttributesCompatParcelizer;
            z3 = z5;
            j3 = jOnMediaButtonEvent;
            z2 = z10;
            z = z7;
            j2 = j4;
        }
        return new SpliceInsertCommand(jOnMediaButtonEvent2, z6, z, z4, z2, j2, minimalClassNameIdResolver.write(j2), list, z3, j3, iOnPrepare, iOnPlayFromMediaId, iOnPlayFromMediaId2);
    }

    public static final class IconCompatParcelizer {
        public final long AudioAttributesCompatParcelizer;
        public final int RemoteActionCompatParcelizer;
        public final long read;

        /* synthetic */ IconCompatParcelizer(int i, long j, long j2, byte b) {
            this(i, j, j2);
        }

        private IconCompatParcelizer(int i, long j, long j2) {
            this.RemoteActionCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = j;
            this.read = j2;
        }

        public final void RemoteActionCompatParcelizer(Parcel parcel) {
            parcel.writeInt(this.RemoteActionCompatParcelizer);
            parcel.writeLong(this.AudioAttributesCompatParcelizer);
            parcel.writeLong(this.read);
        }

        public static IconCompatParcelizer write(Parcel parcel) {
            return new IconCompatParcelizer(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", programSplicePlaybackPositionUs= ");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(" }");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.MediaBrowserCompatSearchResultReceiver);
        parcel.writeByte(this.AudioAttributesImplBaseParcelizer ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.AudioAttributesImplApi21Parcelizer ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.MediaBrowserCompatCustomActionResultReceiver ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.MediaMetadataCompat ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.AudioAttributesImplApi26Parcelizer);
        parcel.writeLong(this.MediaBrowserCompatItemReceiver);
        int size = this.AudioAttributesCompatParcelizer.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.AudioAttributesCompatParcelizer.get(i2).RemoteActionCompatParcelizer(parcel);
        }
        parcel.writeByte(this.read ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.IconCompatParcelizer);
        parcel.writeInt(this.MediaDescriptionCompat);
        parcel.writeInt(this.write);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
    }
}
