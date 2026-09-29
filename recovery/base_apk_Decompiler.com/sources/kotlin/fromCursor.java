package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004"}, d2 = {"Lo/fromCursor;", "E", "Lo/UserConfigSerializer;", "Lo/setLastName;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface fromCursor<E> extends UserConfigSerializer<E>, setLastName<E> {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.write;

    /* JADX INFO: renamed from: o.fromCursor$read, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion write = new Companion();
        private static final int RemoteActionCompatParcelizer = VideoPlaybackConfiguration.RemoteActionCompatParcelizer("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        private Companion() {
        }

        public static int write() {
            return RemoteActionCompatParcelizer;
        }
    }
}
