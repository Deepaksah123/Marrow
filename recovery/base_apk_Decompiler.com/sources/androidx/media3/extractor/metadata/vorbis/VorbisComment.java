package androidx.media3.extractor.metadata.vorbis;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class VorbisComment extends androidx.media3.extractor.metadata.flac.VorbisComment {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new Parcelable.Creator<VorbisComment>() { // from class: androidx.media3.extractor.metadata.vorbis.VorbisComment.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VorbisComment createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VorbisComment[] newArray(int i) {
            return read(i);
        }

        private static VorbisComment IconCompatParcelizer(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        private static VorbisComment[] read(int i) {
            return new VorbisComment[i];
        }
    };

    public VorbisComment(String str, String str2) {
        super(str, str2);
    }

    VorbisComment(Parcel parcel) {
        super(parcel);
    }
}
