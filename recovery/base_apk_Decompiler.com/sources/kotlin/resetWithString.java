package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\b\t\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f"}, d2 = {"Lo/resetWithString;", "", "<init>", "()V", "Lo/WritableTypeIdInclusion;", "IconCompatParcelizer", "()Lo/WritableTypeIdInclusion;", "AudioAttributesCompatParcelizer", "read", "RemoteActionCompatParcelizer", "Lo/resetWithString$AudioAttributesCompatParcelizer;", "Lo/resetWithString$read;", "Lo/resetWithString$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class resetWithString {
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public abstract WritableTypeIdInclusion getRead();

    private resetWithString() {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\r\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010"}, d2 = {"Lo/resetWithString$read;", "Lo/resetWithString;", "Lo/WritableTypeIdInclusion;", "p0", "<init>", "(Lo/WritableTypeIdInclusion;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "AudioAttributesCompatParcelizer", "Lo/WritableTypeIdInclusion;", "write", "()Lo/WritableTypeIdInclusion;", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read extends resetWithString {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final WritableTypeIdInclusion read;

        public read(WritableTypeIdInclusion writableTypeIdInclusion) {
            super(null);
            this.read = writableTypeIdInclusion;
        }

        public final WritableTypeIdInclusion write() {
            return this.read;
        }

        @Override // kotlin.resetWithString
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final WritableTypeIdInclusion getRead() {
            return this.read;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, ((read) p0).read);
        }

        public final int hashCode() {
            return this.read.hashCode();
        }
    }

    public /* synthetic */ resetWithString(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00118\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\r\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0016"}, d2 = {"Lo/resetWithString$RemoteActionCompatParcelizer;", "Lo/resetWithString;", "Lo/WritableTypeId;", "p0", "<init>", "(Lo/WritableTypeId;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "read", "Lo/WritableTypeId;", "RemoteActionCompatParcelizer", "()Lo/WritableTypeId;", "Lo/removeSoftRefsClearedByGc;", "IconCompatParcelizer", "Lo/removeSoftRefsClearedByGc;", "()Lo/removeSoftRefsClearedByGc;", "Lo/WritableTypeIdInclusion;", "()Lo/WritableTypeIdInclusion;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends resetWithString {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final removeSoftRefsClearedByGc RemoteActionCompatParcelizer;
        private final WritableTypeId read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public RemoteActionCompatParcelizer(WritableTypeId writableTypeId) {
            super(0 == true ? 1 : 0);
            removeSoftRefsClearedByGc removesoftrefsclearedbygc = null;
            this.read = writableTypeId;
            if (!allocByteBuffer.read(writableTypeId)) {
                removeSoftRefsClearedByGc removesoftrefsclearedbygcWrite = writeIndentation.write();
                removeSoftRefsClearedByGc.RemoteActionCompatParcelizer$default(removesoftrefsclearedbygcWrite, writableTypeId, null, 2, null);
                removesoftrefsclearedbygc = removesoftrefsclearedbygcWrite;
            }
            this.RemoteActionCompatParcelizer = removesoftrefsclearedbygc;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final WritableTypeId getRead() {
            return this.read;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final removeSoftRefsClearedByGc getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.resetWithString
        /* JADX INFO: renamed from: IconCompatParcelizer */
        public final WritableTypeIdInclusion getRead() {
            return allocByteBuffer.write(this.read);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, ((RemoteActionCompatParcelizer) p0).read);
        }

        public final int hashCode() {
            return this.read.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\f\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b"}, d2 = {"Lo/resetWithString$AudioAttributesCompatParcelizer;", "Lo/resetWithString;", "Lo/removeSoftRefsClearedByGc;", "p0", "<init>", "(Lo/removeSoftRefsClearedByGc;)V", "AudioAttributesCompatParcelizer", "Lo/removeSoftRefsClearedByGc;", "()Lo/removeSoftRefsClearedByGc;", "IconCompatParcelizer", "Lo/WritableTypeIdInclusion;", "()Lo/WritableTypeIdInclusion;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends resetWithString {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final removeSoftRefsClearedByGc IconCompatParcelizer;

        public AudioAttributesCompatParcelizer(removeSoftRefsClearedByGc removesoftrefsclearedbygc) {
            super(null);
            this.IconCompatParcelizer = removesoftrefsclearedbygc;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final removeSoftRefsClearedByGc getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        @Override // kotlin.resetWithString
        /* JADX INFO: renamed from: IconCompatParcelizer */
        public final WritableTypeIdInclusion getRead() {
            return this.IconCompatParcelizer.IconCompatParcelizer();
        }
    }
}
