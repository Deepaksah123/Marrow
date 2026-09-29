package kotlin;

import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public interface ArrayBuilders1 {

    public interface IconCompatParcelizer {
        public static final IconCompatParcelizer write = new IconCompatParcelizer() { // from class: o.ArrayBuilders1.IconCompatParcelizer.1
            @Override // o.ArrayBuilders1.IconCompatParcelizer
            public final void AudioAttributesCompatParcelizer() {
            }

            @Override // o.ArrayBuilders1.IconCompatParcelizer
            public final void RemoteActionCompatParcelizer() {
            }
        };

        void AudioAttributesCompatParcelizer();

        void RemoteActionCompatParcelizer();
    }

    void AudioAttributesCompatParcelizer();

    void AudioAttributesCompatParcelizer(List<JsonValueFormat> list);

    void AudioAttributesCompatParcelizer(C0170format c0170format) throws read;

    void AudioAttributesCompatParcelizer(boolean z);

    boolean AudioAttributesImplApi21Parcelizer();

    void AudioAttributesImplApi26Parcelizer();

    boolean AudioAttributesImplBaseParcelizer();

    void IconCompatParcelizer(C0170format c0170format);

    boolean MediaBrowserCompatCustomActionResultReceiver();

    boolean MediaBrowserCompatItemReceiver();

    void MediaBrowserCompatMediaItem();

    void MediaDescriptionCompat();

    void RatingCompat();

    long RemoteActionCompatParcelizer(long j, boolean z);

    void RemoteActionCompatParcelizer();

    void RemoteActionCompatParcelizer(float f);

    void RemoteActionCompatParcelizer(long j, long j2);

    void RemoteActionCompatParcelizer(boolean z);

    void read(Surface surface, AsWrapperTypeSerializer asWrapperTypeSerializer);

    void read(getRemainingInput getremaininginput);

    Surface write();

    void write(long j, long j2) throws read;

    void write(IconCompatParcelizer iconCompatParcelizer, Executor executor);

    public static final class read extends Exception {
        public final C0170format RemoteActionCompatParcelizer;

        public read(Throwable th, C0170format c0170format) {
            super(th);
            this.RemoteActionCompatParcelizer = c0170format;
        }
    }
}
