package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0003\u0082\u0001\u0002\u0007\b"}, d2 = {"Lo/charsToString;", "", "<init>", "()V", "", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Lo/charsToString$IconCompatParcelizer;", "Lo/charsToString$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class charsToString {
    public abstract void RemoteActionCompatParcelizer();

    private charsToString() {
    }

    public /* synthetic */ charsToString(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003"}, d2 = {"Lo/charsToString$RemoteActionCompatParcelizer;", "Lo/charsToString;", "<init>", "()V", "", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends charsToString {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        @Override // kotlin.charsToString
        public final void RemoteActionCompatParcelizer() {
        }

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lo/charsToString$IconCompatParcelizer;", "Lo/charsToString;", "Lo/parseDigitsRecursive;", "p0", "<init>", "(Lo/parseDigitsRecursive;)V", "", "RemoteActionCompatParcelizer", "()V", "IconCompatParcelizer", "Lo/parseDigitsRecursive;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer extends charsToString {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final parseDigitsRecursive write;

        public IconCompatParcelizer(parseDigitsRecursive parsedigitsrecursive) {
            super(null);
            this.write = parsedigitsrecursive;
        }

        @Override // kotlin.charsToString
        public final void RemoteActionCompatParcelizer() throws exponent {
            this.write.write();
            throw new exponent(this.write);
        }
    }
}
