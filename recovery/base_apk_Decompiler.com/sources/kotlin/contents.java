package kotlin;

import com.google.android.exoplayer2.C;
import kotlin.isCollectionMapOrArray;

/* JADX INFO: loaded from: classes2.dex */
interface contents extends isCollectionMapOrArray {
    long AudioAttributesCompatParcelizer();

    int RemoteActionCompatParcelizer();

    long RemoteActionCompatParcelizer(long j);

    public static class AudioAttributesCompatParcelizer extends isCollectionMapOrArray.write implements contents {
        @Override // kotlin.contents
        public final long AudioAttributesCompatParcelizer() {
            return -1L;
        }

        @Override // kotlin.contents
        public final int RemoteActionCompatParcelizer() {
            return C.RATE_UNSET_INT;
        }

        @Override // kotlin.contents
        public final long RemoteActionCompatParcelizer(long j) {
            return 0L;
        }

        public AudioAttributesCompatParcelizer() {
            super(C.TIME_UNSET);
        }
    }
}
