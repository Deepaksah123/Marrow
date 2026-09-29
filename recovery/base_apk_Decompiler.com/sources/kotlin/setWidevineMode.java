package kotlin;

import kotlin.setTotalFramesDropped;

/* JADX INFO: loaded from: classes4.dex */
@submitMagicModule
public final class setWidevineMode<S extends setTotalFramesDropped<S>> {
    private final Object RemoteActionCompatParcelizer;

    public static <S extends setTotalFramesDropped<S>> Object write(Object obj) {
        return obj;
    }

    public static final boolean IconCompatParcelizer(Object obj) {
        return obj == VideoAnalyticInterimSession.RemoteActionCompatParcelizer;
    }

    public static final S RemoteActionCompatParcelizer(Object obj) {
        if (obj == VideoAnalyticInterimSession.RemoteActionCompatParcelizer) {
            throw new IllegalStateException("Does not contain segment".toString());
        }
        toMagicModuleMetaRepoModel.read(obj, "");
        return (S) obj;
    }

    private static boolean read(Object obj, Object obj2) {
        return (obj2 instanceof setWidevineMode) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, ((setWidevineMode) obj2).IconCompatParcelizer());
    }

    private static int AudioAttributesCompatParcelizer(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    private static String read(Object obj) {
        StringBuilder sb = new StringBuilder("SegmentOrClosed(value=");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        return read(this.RemoteActionCompatParcelizer, obj);
    }

    public final int hashCode() {
        return AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return read(this.RemoteActionCompatParcelizer);
    }

    private /* synthetic */ Object IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
