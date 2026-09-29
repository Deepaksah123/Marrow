package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012"}, d2 = {"Lo/withProperty;", "", "Lo/ReadableObjectIdReferring;", "p0", "p1", "<init>", "(JJLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "J", "()J", "IconCompatParcelizer", "read", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class withProperty {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long IconCompatParcelizer;
    private final long read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final withProperty AudioAttributesCompatParcelizer = new withProperty(0, 0, 3, null);

    private withProperty(long j, long j2) {
        this.IconCompatParcelizer = j;
        this.read = j2;
    }

    /* JADX INFO: renamed from: o.withProperty$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007"}, d2 = {"Lo/withProperty$IconCompatParcelizer;", "", "<init>", "()V", "Lo/withProperty;", "AudioAttributesCompatParcelizer", "Lo/withProperty;", "()Lo/withProperty;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final withProperty AudioAttributesCompatParcelizer() {
            return withProperty.AudioAttributesCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public /* synthetic */ withProperty(long j, long j2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? setResolver.RemoteActionCompatParcelizer(0) : j, (i & 2) != 0 ? setResolver.RemoteActionCompatParcelizer(0) : j2, null);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getRead() {
        return this.read;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof withProperty)) {
            return false;
        }
        withProperty withproperty = (withProperty) p0;
        return ReadableObjectIdReferring.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, withproperty.IconCompatParcelizer) && ReadableObjectIdReferring.AudioAttributesCompatParcelizer(this.read, withproperty.read);
    }

    public final int hashCode() {
        return (ReadableObjectIdReferring.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer) * 31) + ReadableObjectIdReferring.MediaBrowserCompatItemReceiver(this.read);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextIndent(firstLine=");
        sb.append((Object) ReadableObjectIdReferring.AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer));
        sb.append(", restLine=");
        sb.append((Object) ReadableObjectIdReferring.AudioAttributesImplApi21Parcelizer(this.read));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ withProperty(long j, long j2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, j2);
    }
}
