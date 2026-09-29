package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u000b\u0006\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lo/KotlinKeySerializersKt;", "", "", "p0", "<init>", "(Z)V", "IconCompatParcelizer", "Z", "read", "()Z", "AudioAttributesCompatParcelizer", "write", "RemoteActionCompatParcelizer", "Lo/KotlinKeySerializersKt$write;", "Lo/KotlinKeySerializersKt$IconCompatParcelizer;", "Lo/KotlinKeySerializersKt$RemoteActionCompatParcelizer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class KotlinKeySerializersKt {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    private KotlinKeySerializersKt(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public /* synthetic */ KotlinKeySerializersKt(boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(z);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/KotlinKeySerializersKt$RemoteActionCompatParcelizer;", "Lo/KotlinKeySerializersKt;", "", "p0", "<init>", "(Z)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends KotlinKeySerializersKt {

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final RemoteActionCompatParcelizer write = new RemoteActionCompatParcelizer(true);
        private static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer(false);

        public RemoteActionCompatParcelizer(boolean z) {
            super(z, null);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotLoading(endOfPaginationReached=");
            sb.append(getAudioAttributesCompatParcelizer());
            sb.append(')');
            return sb.toString();
        }

        public final boolean equals(Object p0) {
            return (p0 instanceof RemoteActionCompatParcelizer) && getAudioAttributesCompatParcelizer() == ((RemoteActionCompatParcelizer) p0).getAudioAttributesCompatParcelizer();
        }

        public final int hashCode() {
            return Boolean.hashCode(getAudioAttributesCompatParcelizer());
        }

        /* JADX INFO: renamed from: o.KotlinKeySerializersKt$RemoteActionCompatParcelizer$read, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0007\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\b"}, d2 = {"Lo/KotlinKeySerializersKt$RemoteActionCompatParcelizer$read;", "", "<init>", "()V", "Lo/KotlinKeySerializersKt$RemoteActionCompatParcelizer;", "write", "Lo/KotlinKeySerializersKt$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "()Lo/KotlinKeySerializersKt$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public static RemoteActionCompatParcelizer IconCompatParcelizer() {
                return RemoteActionCompatParcelizer.write;
            }

            public static RemoteActionCompatParcelizer write() {
                return RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/KotlinKeySerializersKt$IconCompatParcelizer;", "Lo/KotlinKeySerializersKt;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class IconCompatParcelizer extends KotlinKeySerializersKt {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super(false, null);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loading(endOfPaginationReached=");
            sb.append(getAudioAttributesCompatParcelizer());
            sb.append(')');
            return sb.toString();
        }

        public final boolean equals(Object p0) {
            return (p0 instanceof IconCompatParcelizer) && getAudioAttributesCompatParcelizer() == ((IconCompatParcelizer) p0).getAudioAttributesCompatParcelizer();
        }

        public final int hashCode() {
            return Boolean.hashCode(getAudioAttributesCompatParcelizer());
        }
    }

    public static final class write extends KotlinKeySerializersKt {
        private final Throwable IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(Throwable th) {
            super(false, null);
            toMagicModuleMetaRepoModel.write(th, "");
            this.IconCompatParcelizer = th;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            return getAudioAttributesCompatParcelizer() == writeVar.getAudioAttributesCompatParcelizer() && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, writeVar.IconCompatParcelizer);
        }

        public final int hashCode() {
            return Boolean.hashCode(getAudioAttributesCompatParcelizer()) + this.IconCompatParcelizer.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Error(endOfPaginationReached=");
            sb.append(getAudioAttributesCompatParcelizer());
            sb.append(", error=");
            sb.append(this.IconCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }
}
