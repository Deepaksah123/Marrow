package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/extractScalarFromObject;", "", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface extractScalarFromObject {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: o.extractScalarFromObject$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\b"}, d2 = {"Lo/extractScalarFromObject$read;", "", "<init>", "()V", "Lo/extractScalarFromObject;", "write", "Lo/extractScalarFromObject;", "read", "()Lo/extractScalarFromObject;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion AudioAttributesCompatParcelizer = new Companion();
        private static final extractScalarFromObject write = findNonContextualValueDeserializer.read();

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private static final extractScalarFromObject AudioAttributesCompatParcelizer = findNonContextualValueDeserializer.AudioAttributesCompatParcelizer();
        private static final extractScalarFromObject RemoteActionCompatParcelizer = findNonContextualValueDeserializer.write();
        private static final extractScalarFromObject IconCompatParcelizer = findNonContextualValueDeserializer.IconCompatParcelizer();

        private Companion() {
        }

        public final extractScalarFromObject read() {
            return write;
        }

        public final extractScalarFromObject RemoteActionCompatParcelizer() {
            return RemoteActionCompatParcelizer;
        }

        public final extractScalarFromObject write() {
            return IconCompatParcelizer;
        }
    }
}
