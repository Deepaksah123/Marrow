package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.List;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new Parcelable.Creator<TextInformationFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.TextInformationFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TextInformationFrame[] newArray(int i) {
            return new TextInformationFrame[i];
        }
    };
    public final String description;

    @Deprecated
    public final String value;
    public final initExtraTracks<String> values;

    public TextInformationFrame(String str, String str2, List<String> list) {
        super(str);
        Assertions.checkArgument(!list.isEmpty());
        this.description = str2;
        initExtraTracks<String> initextratracksWrite = initExtraTracks.write(list);
        this.values = initextratracksWrite;
        this.value = initextratracksWrite.get(0);
    }

    @Deprecated
    public TextInformationFrame(String str, String str2, String str3) {
        this(str, str2, initExtraTracks.read(str3));
    }

    private TextInformationFrame(Parcel parcel) {
        this((String) Assertions.checkNotNull(parcel.readString()), parcel.readString(), initExtraTracks.write((String[]) Assertions.checkNotNull(parcel.createStringArray())));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010a  */
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder r8) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.TextInformationFrame.populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata$Builder):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return Util.areEqual(this.id, textInformationFrame.id) && Util.areEqual(this.description, textInformationFrame.description) && this.values.equals(textInformationFrame.values);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        String str = this.description;
        return ((((iHashCode + 527) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.values.hashCode();
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.id);
        sb.append(": description=");
        sb.append(this.description);
        sb.append(": values=");
        sb.append(this.values);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.description);
        parcel.writeStringArray((String[]) this.values.toArray(new String[0]));
    }

    private static List<Integer> parseId3v2point4TimestampFrameForDate(String str) {
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
