package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lo/readLongObject;", "", "<init>", "()V", "IconCompatParcelizer", "read", "Lo/readLongObject$read;", "Lo/readLongObject$IconCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class readLongObject {

    public static final class IconCompatParcelizer extends readLongObject {
        private final int IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(int i, String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = str;
        }

        public final int IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String read() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    private readLongObject() {
    }

    public static final class read extends readLongObject {
        private final int AudioAttributesCompatParcelizer;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(int i, String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = i;
            this.write = str;
        }

        public final int read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.write;
        }
    }

    public /* synthetic */ readLongObject(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }
}
