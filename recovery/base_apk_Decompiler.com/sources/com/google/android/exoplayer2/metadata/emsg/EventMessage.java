package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class EventMessage implements Metadata.Entry {
    public static final String ID3_SCHEME_ID_AOM = "https://aomedia.org/emsg/ID3";
    private static final String ID3_SCHEME_ID_APPLE = "https://developer.apple.com/streaming/emsg-id3";
    public static final String SCTE35_SCHEME_ID = "urn:scte:scte35:2014:bin";
    public final long durationMs;
    private int hashCode;
    public final long id;
    public final byte[] messageData;
    public final String schemeIdUri;
    public final String value;
    private static final Format ID3_FORMAT = new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_ID3).build();
    private static final Format SCTE35_FORMAT = new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_SCTE35).build();
    public static final Parcelable.Creator<EventMessage> CREATOR = new Parcelable.Creator<EventMessage>() { // from class: com.google.android.exoplayer2.metadata.emsg.EventMessage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EventMessage[] newArray(int i) {
            return new EventMessage[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.schemeIdUri = str;
        this.value = str2;
        this.durationMs = j;
        this.id = j2;
        this.messageData = bArr;
    }

    EventMessage(Parcel parcel) {
        this.schemeIdUri = (String) Util.castNonNull(parcel.readString());
        this.value = (String) Util.castNonNull(parcel.readString());
        this.durationMs = parcel.readLong();
        this.id = parcel.readLong();
        this.messageData = (byte[]) Util.castNonNull(parcel.createByteArray());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.exoplayer2.Format getWrappedMetadataFormat() {
        /*
            r4 = this;
            java.lang.String r4 = r4.schemeIdUri
            r4.hashCode()
            int r0 = r4.hashCode()
            r1 = -1468477611(0xffffffffa878cf55, float:-1.38117235E-14)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2f
            r1 = -795945609(0xffffffffd08ed577, float:-1.9170834E10)
            if (r0 == r1) goto L25
            r1 = 1303648457(0x4db418c9, float:3.776904E8)
            if (r0 == r1) goto L1b
            goto L39
        L1b:
            java.lang.String r0 = "https://developer.apple.com/streaming/emsg-id3"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L39
            r4 = r2
            goto L3a
        L25:
            java.lang.String r0 = "https://aomedia.org/emsg/ID3"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L39
            r4 = r3
            goto L3a
        L2f:
            java.lang.String r0 = "urn:scte:scte35:2014:bin"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L39
            r4 = 0
            goto L3a
        L39:
            r4 = -1
        L3a:
            if (r4 == 0) goto L45
            if (r4 == r3) goto L42
            if (r4 == r2) goto L42
            r4 = 0
            return r4
        L42:
            com.google.android.exoplayer2.Format r4 = com.google.android.exoplayer2.metadata.emsg.EventMessage.ID3_FORMAT
            return r4
        L45:
            com.google.android.exoplayer2.Format r4 = com.google.android.exoplayer2.metadata.emsg.EventMessage.SCTE35_FORMAT
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.emsg.EventMessage.getWrappedMetadataFormat():com.google.android.exoplayer2.Format");
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.messageData;
        }
        return null;
    }

    public final int hashCode() {
        if (this.hashCode == 0) {
            String str = this.schemeIdUri;
            int iHashCode = str != null ? str.hashCode() : 0;
            String str2 = this.value;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.durationMs;
            long j2 = this.id;
            this.hashCode = ((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + Arrays.hashCode(this.messageData);
        }
        return this.hashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.durationMs == eventMessage.durationMs && this.id == eventMessage.id && Util.areEqual(this.schemeIdUri, eventMessage.schemeIdUri) && Util.areEqual(this.value, eventMessage.value) && Arrays.equals(this.messageData, eventMessage.messageData);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EMSG: scheme=");
        sb.append(this.schemeIdUri);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", durationMs=");
        sb.append(this.durationMs);
        sb.append(", value=");
        sb.append(this.value);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.schemeIdUri);
        parcel.writeString(this.value);
        parcel.writeLong(this.durationMs);
        parcel.writeLong(this.id);
        parcel.writeByteArray(this.messageData);
    }
}
