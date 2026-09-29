package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lo/createFragmentContainer;", "Lo/writerFor;", "Lo/prepareDialog;", "Lo/access100;", "p0", "", "p1", "", "p2", "<init>", "(Lo/access100;FLjava/lang/String;)V", "write", "()Lo/prepareDialog;", "", "RemoteActionCompatParcelizer", "(Lo/prepareDialog;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lo/access100;", "AudioAttributesCompatParcelizer", "F", "IconCompatParcelizer", "Ljava/lang/String;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class createFragmentContainer extends writerFor<prepareDialog> {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final float write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final access100 AudioAttributesCompatParcelizer;

    public createFragmentContainer(access100 access100Var, float f, String str) {
        this.AudioAttributesCompatParcelizer = access100Var;
        this.write = f;
        this.read = str;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final prepareDialog IconCompatParcelizer() {
        return new prepareDialog(this.AudioAttributesCompatParcelizer, this.write);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(prepareDialog p0) {
        p0.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
        p0.read(this.write);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof createFragmentContainer)) {
            return false;
        }
        createFragmentContainer createfragmentcontainer = (createFragmentContainer) p0;
        return this.AudioAttributesCompatParcelizer == createfragmentcontainer.AudioAttributesCompatParcelizer && this.write == createfragmentcontainer.write;
    }

    public final int hashCode() {
        return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + Float.hashCode(this.write);
    }

    /* JADX INFO: renamed from: o.createFragmentContainer$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\b"}, d2 = {"Lo/createFragmentContainer$read;", "", "<init>", "()V", "", "p0", "Lo/createFragmentContainer;", "IconCompatParcelizer", "(F)Lo/createFragmentContainer;", "AudioAttributesCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final createFragmentContainer IconCompatParcelizer(float p0) {
            return new createFragmentContainer(access100.RemoteActionCompatParcelizer, p0, "fillMaxWidth");
        }

        public final createFragmentContainer AudioAttributesCompatParcelizer(float p0) {
            return new createFragmentContainer(access100.AudioAttributesCompatParcelizer, p0, "fillMaxHeight");
        }

        public final createFragmentContainer write(float p0) {
            return new createFragmentContainer(access100.IconCompatParcelizer, p0, "fillMaxSize");
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
