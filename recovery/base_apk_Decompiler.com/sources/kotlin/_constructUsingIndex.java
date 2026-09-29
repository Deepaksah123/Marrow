package kotlin;

import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class _constructUsingIndex {
    public final long IconCompatParcelizer;
    public final List<write> write;

    public static final class write {
        public final long AudioAttributesCompatParcelizer;
        public final String IconCompatParcelizer;
        public final String RemoteActionCompatParcelizer;
        public final long write;

        public write(String str, String str2, long j, long j2) {
            this.IconCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = str2;
            this.write = j;
            this.AudioAttributesCompatParcelizer = j2;
        }
    }

    public _constructUsingIndex(long j, List<write> list) {
        this.IconCompatParcelizer = j;
        this.write = list;
    }

    public final MotionPhotoMetadata AudioAttributesCompatParcelizer(long j) {
        long j2;
        if (this.write.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.write.size() - 1; size >= 0; size--) {
            write writeVar = this.write.get(size);
            boolean zEquals = MimeTypes.VIDEO_MP4.equals(writeVar.IconCompatParcelizer) | z;
            if (size == 0) {
                j3 -= writeVar.AudioAttributesCompatParcelizer;
                j2 = 0;
            } else {
                j2 = j3 - writeVar.write;
            }
            long j8 = j3;
            j3 = j2;
            if (!zEquals || j3 == j8) {
                z = zEquals;
            } else {
                j7 = j8 - j3;
                j6 = j3;
                z = false;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j8;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j4, j5, this.IconCompatParcelizer, j6, j7);
    }
}
