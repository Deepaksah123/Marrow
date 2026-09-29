package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.LaissezFaireSubTypeValidator;
import kotlin.buildTypeSerializer;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes2.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new Parcelable.Creator<TextInformationFrame>() { // from class: androidx.media3.extractor.metadata.id3.TextInformationFrame.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TextInformationFrame createFromParcel(Parcel parcel) {
            return read(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TextInformationFrame[] newArray(int i) {
            return write(i);
        }

        private static TextInformationFrame read(Parcel parcel) {
            return new TextInformationFrame(parcel, (byte) 0);
        }

        private static TextInformationFrame[] write(int i) {
            return new TextInformationFrame[i];
        }
    };
    public final initExtraTracks<String> AudioAttributesCompatParcelizer;

    @Deprecated
    public final String RemoteActionCompatParcelizer;
    public final String write;

    /* synthetic */ TextInformationFrame(Parcel parcel, byte b) {
        this(parcel);
    }

    public TextInformationFrame(String str, String str2, List<String> list) {
        super(str);
        buildTypeSerializer.IconCompatParcelizer(!list.isEmpty());
        this.write = str2;
        initExtraTracks<String> initextratracksWrite = initExtraTracks.write(list);
        this.AudioAttributesCompatParcelizer = initextratracksWrite;
        this.RemoteActionCompatParcelizer = initextratracksWrite.get(0);
    }

    private TextInformationFrame(Parcel parcel) {
        this((String) buildTypeSerializer.IconCompatParcelizer(parcel.readString()), parcel.readString(), initExtraTracks.write((String[]) buildTypeSerializer.IconCompatParcelizer(parcel.createStringArray())));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0116  */
    @Override // androidx.media3.common.Metadata.Entry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AudioAttributesCompatParcelizer(o.getSchema.RemoteActionCompatParcelizer r8) {
        /*
            Method dump skipped, instruction units count: 758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.id3.TextInformationFrame.AudioAttributesCompatParcelizer(o.getSchema$RemoteActionCompatParcelizer):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return LaissezFaireSubTypeValidator.read(this.MediaBrowserCompatItemReceiver, textInformationFrame.MediaBrowserCompatItemReceiver) && LaissezFaireSubTypeValidator.read(this.write, textInformationFrame.write) && this.AudioAttributesCompatParcelizer.equals(textInformationFrame.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.MediaBrowserCompatItemReceiver.hashCode();
        String str = this.write;
        return ((((iHashCode + 527) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(": description=");
        sb.append(this.write);
        sb.append(": values=");
        sb.append(this.AudioAttributesCompatParcelizer);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompatItemReceiver);
        parcel.writeString(this.write);
        parcel.writeStringArray((String[]) this.AudioAttributesCompatParcelizer.toArray(new String[0]));
    }

    private static List<Integer> write(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }
}
