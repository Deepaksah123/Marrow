package androidx.media3.extractor.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import kotlin.C0170format;
import kotlin.LaissezFaireSubTypeValidator;

/* JADX INFO: loaded from: classes2.dex */
public final class EventMessage implements Metadata.Entry {
    public final String AudioAttributesCompatParcelizer;
    private int AudioAttributesImplBaseParcelizer;
    public final long IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final long read;
    public final byte[] write;
    private static final C0170format AudioAttributesImplApi21Parcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(MimeTypes.APPLICATION_ID3).IconCompatParcelizer();
    private static final C0170format MediaBrowserCompatItemReceiver = new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(MimeTypes.APPLICATION_SCTE35).IconCompatParcelizer();
    public static final Parcelable.Creator<EventMessage> CREATOR = new Parcelable.Creator<EventMessage>() { // from class: androidx.media3.extractor.metadata.emsg.EventMessage.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EventMessage createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EventMessage[] newArray(int i) {
            return RemoteActionCompatParcelizer(i);
        }

        private static EventMessage IconCompatParcelizer(Parcel parcel) {
            return new EventMessage(parcel);
        }

        private static EventMessage[] RemoteActionCompatParcelizer(int i) {
            return new EventMessage[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.AudioAttributesCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.IconCompatParcelizer = j;
        this.read = j2;
        this.write = bArr;
    }

    EventMessage(Parcel parcel) {
        this.AudioAttributesCompatParcelizer = (String) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.readString());
        this.RemoteActionCompatParcelizer = (String) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.readString());
        this.IconCompatParcelizer = parcel.readLong();
        this.read = parcel.readLong();
        this.write = (byte[]) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.createByteArray());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    @Override // androidx.media3.common.Metadata.Entry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.C0170format read() {
        /*
            r4 = this;
            java.lang.String r4 = r4.AudioAttributesCompatParcelizer
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
            o.format r4 = androidx.media3.extractor.metadata.emsg.EventMessage.AudioAttributesImplApi21Parcelizer
            return r4
        L45:
            o.format r4 = androidx.media3.extractor.metadata.emsg.EventMessage.MediaBrowserCompatItemReceiver
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.emsg.EventMessage.read():o.format");
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final byte[] RemoteActionCompatParcelizer() {
        if (read() != null) {
            return this.write;
        }
        return null;
    }

    public final int hashCode() {
        if (this.AudioAttributesImplBaseParcelizer == 0) {
            String str = this.AudioAttributesCompatParcelizer;
            int iHashCode = str != null ? str.hashCode() : 0;
            String str2 = this.RemoteActionCompatParcelizer;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.IconCompatParcelizer;
            long j2 = this.read;
            this.AudioAttributesImplBaseParcelizer = ((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + Arrays.hashCode(this.write);
        }
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.IconCompatParcelizer == eventMessage.IconCompatParcelizer && this.read == eventMessage.read && LaissezFaireSubTypeValidator.read(this.AudioAttributesCompatParcelizer, eventMessage.AudioAttributesCompatParcelizer) && LaissezFaireSubTypeValidator.read(this.RemoteActionCompatParcelizer, eventMessage.RemoteActionCompatParcelizer) && Arrays.equals(this.write, eventMessage.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EMSG: scheme=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", id=");
        sb.append(this.read);
        sb.append(", durationMs=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", value=");
        sb.append(this.RemoteActionCompatParcelizer);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.AudioAttributesCompatParcelizer);
        parcel.writeString(this.RemoteActionCompatParcelizer);
        parcel.writeLong(this.IconCompatParcelizer);
        parcel.writeLong(this.read);
        parcel.writeByteArray(this.write);
    }
}
