package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new Parcelable.Creator<VorbisComment>() { // from class: com.google.android.exoplayer2.metadata.flac.VorbisComment.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VorbisComment[] newArray(int i) {
            return new VorbisComment[i];
        }
    };
    public final String key;
    public final String value;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VorbisComment(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public VorbisComment(Parcel parcel) {
        this.key = (String) Util.castNonNull(parcel.readString());
        this.value = (String) Util.castNonNull(parcel.readString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.key
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case 62359119: goto L39;
                case 79833656: goto L2f;
                case 428414940: goto L25;
                case 1746739798: goto L1b;
                case 1939198791: goto L11;
                default: goto L10;
            }
        L10:
            goto L43
        L11:
            java.lang.String r1 = "ARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L43
            r0 = r2
            goto L44
        L1b:
            java.lang.String r1 = "ALBUMARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L43
            r0 = r3
            goto L44
        L25:
            java.lang.String r1 = "DESCRIPTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L43
            r0 = r4
            goto L44
        L2f:
            java.lang.String r1 = "TITLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L43
            r0 = r5
            goto L44
        L39:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L43
            r0 = 0
            goto L44
        L43:
            r0 = -1
        L44:
            if (r0 == 0) goto L67
            if (r0 == r5) goto L61
            if (r0 == r4) goto L5b
            if (r0 == r3) goto L55
            if (r0 == r2) goto L4f
            return
        L4f:
            java.lang.String r6 = r6.value
            r7.setArtist(r6)
            return
        L55:
            java.lang.String r6 = r6.value
            r7.setAlbumArtist(r6)
            return
        L5b:
            java.lang.String r6 = r6.value
            r7.setDescription(r6)
            return
        L61:
            java.lang.String r6 = r6.value
            r7.setTitle(r6)
            return
        L67:
            java.lang.String r6 = r6.value
            r7.setAlbumTitle(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.flac.VorbisComment.populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata$Builder):void");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VC: ");
        sb.append(this.key);
        sb.append("=");
        sb.append(this.value);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.key.equals(vorbisComment.key) && this.value.equals(vorbisComment.value);
    }

    public int hashCode() {
        return ((this.key.hashCode() + 527) * 31) + this.value.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.value);
    }
}
