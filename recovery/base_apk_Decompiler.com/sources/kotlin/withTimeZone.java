package kotlin;

import com.google.android.exoplayer2.C;
import java.util.Objects;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes2.dex */
public interface withTimeZone {

    public interface IconCompatParcelizer {
        public static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer() { // from class: o.withTimeZone.IconCompatParcelizer.3
            @Override // o.withTimeZone.IconCompatParcelizer
            public final int RemoteActionCompatParcelizer(C0170format c0170format) {
                return 1;
            }

            @Override // o.withTimeZone.IconCompatParcelizer
            public final boolean write(C0170format c0170format) {
                return false;
            }

            @Override // o.withTimeZone.IconCompatParcelizer
            public final withTimeZone IconCompatParcelizer(C0170format c0170format) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        };

        withTimeZone IconCompatParcelizer(C0170format c0170format);

        int RemoteActionCompatParcelizer(C0170format c0170format);

        boolean write(C0170format c0170format);
    }

    int IconCompatParcelizer();

    default void RemoteActionCompatParcelizer() {
    }

    void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2, RemoteActionCompatParcelizer remoteActionCompatParcelizer, TypeSerializer<pad3> typeSerializer);

    public static class RemoteActionCompatParcelizer {
        private static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer(C.TIME_UNSET, false);
        public final long IconCompatParcelizer;
        public final boolean RemoteActionCompatParcelizer;

        private RemoteActionCompatParcelizer(long j, boolean z) {
            this.IconCompatParcelizer = j;
            this.RemoteActionCompatParcelizer = z;
        }

        public static RemoteActionCompatParcelizer AudioAttributesCompatParcelizer() {
            return AudioAttributesCompatParcelizer;
        }

        public static RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(long j) {
            return new RemoteActionCompatParcelizer(j, true);
        }
    }

    default isLenient AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) {
        final initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        Objects.requireNonNull(iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver);
        RemoteActionCompatParcelizer(bArr, i, i2, remoteActionCompatParcelizer, new TypeSerializer() { // from class: o.setTimeZone
            @Override // kotlin.TypeSerializer
            public final void read(Object obj) {
                iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read((pad3) obj);
            }
        });
        return new _parseAsISO8601(iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer());
    }
}
