package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lo/AttachmentUnsupportedAttachmentException;", "", "<init>", "()V", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "read", "Lo/AttachmentUnsupportedAttachmentException$RemoteActionCompatParcelizer;", "Lo/AttachmentUnsupportedAttachmentException$read;", "Lo/AttachmentUnsupportedAttachmentException$IconCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AttachmentUnsupportedAttachmentException {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/AttachmentUnsupportedAttachmentException$RemoteActionCompatParcelizer;", "Lo/AttachmentUnsupportedAttachmentException;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends AttachmentUnsupportedAttachmentException {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }

    private AttachmentUnsupportedAttachmentException() {
    }

    public static final class IconCompatParcelizer extends AttachmentUnsupportedAttachmentException {
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.write = str;
        }

        public final String write() {
            return this.write;
        }
    }

    public /* synthetic */ AttachmentUnsupportedAttachmentException(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class read extends AttachmentUnsupportedAttachmentException {
        private final String read;
        private final String write;

        public read(String str, String str2) {
            super(null);
            this.read = str;
            this.write = str2;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.write;
        }
    }
}
