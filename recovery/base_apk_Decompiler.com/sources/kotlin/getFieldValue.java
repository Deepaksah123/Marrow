package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lo/getFieldValue;", "", "<init>", "()V", "write", "read", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Lo/getFieldValue$RemoteActionCompatParcelizer;", "Lo/getFieldValue$write;", "Lo/getFieldValue$IconCompatParcelizer;", "Lo/getFieldValue$read;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class getFieldValue {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getFieldValue$write;", "Lo/getFieldValue;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends getFieldValue {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    private getFieldValue() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getFieldValue$read;", "Lo/getFieldValue;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends getFieldValue {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    public /* synthetic */ getFieldValue(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class RemoteActionCompatParcelizer extends getFieldValue {
        private final String IconCompatParcelizer;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str, String str2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.IconCompatParcelizer = str;
            this.write = str2;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final String write() {
            return this.IconCompatParcelizer;
        }
    }

    public static final class IconCompatParcelizer extends getFieldValue {
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.read;
        }
    }
}
