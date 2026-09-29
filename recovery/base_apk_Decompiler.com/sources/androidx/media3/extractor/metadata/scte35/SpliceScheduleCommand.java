package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.AsPropertyTypeDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new Parcelable.Creator<SpliceScheduleCommand>() { // from class: androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return read(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SpliceScheduleCommand[] newArray(int i) {
            return IconCompatParcelizer(i);
        }

        private static SpliceScheduleCommand read(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, (byte) 0);
        }

        private static SpliceScheduleCommand[] IconCompatParcelizer(int i) {
            return new SpliceScheduleCommand[i];
        }
    };
    public final List<IconCompatParcelizer> IconCompatParcelizer;

    /* synthetic */ SpliceScheduleCommand(Parcel parcel, byte b) {
        this(parcel);
    }

    public static final class IconCompatParcelizer {
        public final List<AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer;
        public final boolean AudioAttributesImplApi21Parcelizer;
        public final long AudioAttributesImplApi26Parcelizer;
        public final boolean AudioAttributesImplBaseParcelizer;
        public final int IconCompatParcelizer;
        public final boolean MediaBrowserCompatCustomActionResultReceiver;
        public final int MediaBrowserCompatItemReceiver;
        public final long MediaBrowserCompatMediaItem;
        public final int RemoteActionCompatParcelizer;
        public final boolean read;
        public final long write;

        private IconCompatParcelizer(long j, boolean z, boolean z2, boolean z3, List<AudioAttributesCompatParcelizer> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.AudioAttributesImplApi26Parcelizer = j;
            this.AudioAttributesImplBaseParcelizer = z;
            this.MediaBrowserCompatCustomActionResultReceiver = z2;
            this.AudioAttributesImplApi21Parcelizer = z3;
            this.AudioAttributesCompatParcelizer = Collections.unmodifiableList(list);
            this.MediaBrowserCompatMediaItem = j2;
            this.read = z4;
            this.write = j3;
            this.MediaBrowserCompatItemReceiver = i;
            this.RemoteActionCompatParcelizer = i2;
            this.IconCompatParcelizer = i3;
        }

        private IconCompatParcelizer(Parcel parcel) {
            this.AudioAttributesImplApi26Parcelizer = parcel.readLong();
            this.AudioAttributesImplBaseParcelizer = parcel.readByte() == 1;
            this.MediaBrowserCompatCustomActionResultReceiver = parcel.readByte() == 1;
            this.AudioAttributesImplApi21Parcelizer = parcel.readByte() == 1;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(AudioAttributesCompatParcelizer.IconCompatParcelizer(parcel));
            }
            this.AudioAttributesCompatParcelizer = Collections.unmodifiableList(arrayList);
            this.MediaBrowserCompatMediaItem = parcel.readLong();
            this.read = parcel.readByte() == 1;
            this.write = parcel.readLong();
            this.MediaBrowserCompatItemReceiver = parcel.readInt();
            this.RemoteActionCompatParcelizer = parcel.readInt();
            this.IconCompatParcelizer = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static IconCompatParcelizer write(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
            ArrayList arrayList;
            boolean z;
            boolean z2;
            boolean z3;
            int i;
            int i2;
            int iOnPlayFromMediaId;
            long j;
            long j2;
            long jOnMediaButtonEvent;
            long jOnMediaButtonEvent2 = asPropertyTypeDeserializer.onMediaButtonEvent();
            boolean z4 = (asPropertyTypeDeserializer.onPlayFromMediaId() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z4) {
                arrayList = arrayList2;
                z = false;
                z2 = 0;
                z3 = false;
                i = 0;
                i2 = 0;
                iOnPlayFromMediaId = 0;
                j = C.TIME_UNSET;
                j2 = C.TIME_UNSET;
            } else {
                int iOnPlayFromMediaId2 = asPropertyTypeDeserializer.onPlayFromMediaId();
                boolean z5 = (iOnPlayFromMediaId2 & 128) != 0;
                z3 = (iOnPlayFromMediaId2 & 64) != 0;
                boolean z6 = (iOnPlayFromMediaId2 & 32) != 0;
                long jOnMediaButtonEvent3 = z3 ? asPropertyTypeDeserializer.onMediaButtonEvent() : C.TIME_UNSET;
                if (!z3) {
                    int iOnPlayFromMediaId3 = asPropertyTypeDeserializer.onPlayFromMediaId();
                    ArrayList arrayList3 = new ArrayList(iOnPlayFromMediaId3);
                    for (int i3 = 0; i3 < iOnPlayFromMediaId3; i3++) {
                        arrayList3.add(new AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.onPlayFromMediaId(), asPropertyTypeDeserializer.onMediaButtonEvent(), b));
                    }
                    arrayList2 = arrayList3;
                }
                if (z6) {
                    long jOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
                    b = (128 & jOnPlayFromMediaId) != 0 ? (byte) 1 : (byte) 0;
                    jOnMediaButtonEvent = ((((jOnPlayFromMediaId & 1) << 32) | asPropertyTypeDeserializer.onMediaButtonEvent()) * 1000) / 90;
                } else {
                    jOnMediaButtonEvent = C.TIME_UNSET;
                }
                int iOnPrepare = asPropertyTypeDeserializer.onPrepare();
                int iOnPlayFromMediaId4 = asPropertyTypeDeserializer.onPlayFromMediaId();
                j2 = jOnMediaButtonEvent;
                iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
                arrayList = arrayList2;
                boolean z7 = z5;
                z2 = b;
                long j3 = jOnMediaButtonEvent3;
                i = iOnPrepare;
                i2 = iOnPlayFromMediaId4;
                z = z7;
                j = j3;
            }
            return new IconCompatParcelizer(jOnMediaButtonEvent2, z4, z, z3, arrayList, j, z2, j2, i, i2, iOnPlayFromMediaId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void AudioAttributesCompatParcelizer(Parcel parcel) {
            parcel.writeLong(this.AudioAttributesImplApi26Parcelizer);
            parcel.writeByte(this.AudioAttributesImplBaseParcelizer ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.MediaBrowserCompatCustomActionResultReceiver ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.AudioAttributesImplApi21Parcelizer ? (byte) 1 : (byte) 0);
            int size = this.AudioAttributesCompatParcelizer.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.AudioAttributesCompatParcelizer.get(i).write(parcel);
            }
            parcel.writeLong(this.MediaBrowserCompatMediaItem);
            parcel.writeByte(this.read ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.write);
            parcel.writeInt(this.MediaBrowserCompatItemReceiver);
            parcel.writeInt(this.RemoteActionCompatParcelizer);
            parcel.writeInt(this.IconCompatParcelizer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static IconCompatParcelizer write(Parcel parcel) {
            return new IconCompatParcelizer(parcel);
        }
    }

    public static final class AudioAttributesCompatParcelizer {
        public final long AudioAttributesCompatParcelizer;
        public final int IconCompatParcelizer;

        /* synthetic */ AudioAttributesCompatParcelizer(int i, long j, byte b) {
            this(i, j);
        }

        private AudioAttributesCompatParcelizer(int i, long j) {
            this.IconCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static AudioAttributesCompatParcelizer IconCompatParcelizer(Parcel parcel) {
            return new AudioAttributesCompatParcelizer(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void write(Parcel parcel) {
            parcel.writeInt(this.IconCompatParcelizer);
            parcel.writeLong(this.AudioAttributesCompatParcelizer);
        }
    }

    private SpliceScheduleCommand(List<IconCompatParcelizer> list) {
        this.IconCompatParcelizer = Collections.unmodifiableList(list);
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(IconCompatParcelizer.write(parcel));
        }
        this.IconCompatParcelizer = Collections.unmodifiableList(arrayList);
    }

    public static SpliceScheduleCommand AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        ArrayList arrayList = new ArrayList(iOnPlayFromMediaId);
        for (int i = 0; i < iOnPlayFromMediaId; i++) {
            arrayList.add(IconCompatParcelizer.write(asPropertyTypeDeserializer));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.IconCompatParcelizer.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.IconCompatParcelizer.get(i2).AudioAttributesCompatParcelizer(parcel);
        }
    }
}
