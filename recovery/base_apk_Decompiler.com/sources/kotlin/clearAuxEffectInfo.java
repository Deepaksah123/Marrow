package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR+\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00028W@SX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\u0012\"\u0004\b\u000f\u0010\u0013R\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\f"}, d2 = {"Lo/clearAuxEffectInfo;", "Lo/parseDouble;", "Lo/newEncryptedObject;", "", "p0", "p1", "p2", "<init>", "(III)V", "", "read", "(I)V", "I", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "write", "RemoteActionCompatParcelizer", "Lo/InputAccessor;", "()Lo/newEncryptedObject;", "(Lo/newEncryptedObject;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class clearAuxEffectInfo implements parseDouble<newEncryptedObject> {
    private static final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final InputAccessor IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    public clearAuxEffectInfo(int i, int i2, int i3) {
        this.AudioAttributesCompatParcelizer = i2;
        this.write = i3;
        this.IconCompatParcelizer = _qbuf.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer.write(i, i2, i3), _qbuf.RemoteActionCompatParcelizer());
        this.RemoteActionCompatParcelizer = i;
    }

    private void write(newEncryptedObject newencryptedobject) {
        this.IconCompatParcelizer.write(newencryptedobject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.parseDouble
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final newEncryptedObject getRemoteActionCompatParcelizer() {
        return (newEncryptedObject) this.IconCompatParcelizer.getRemoteActionCompatParcelizer();
    }

    public final void read(int p0) {
        if (p0 != this.RemoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer = p0;
            write(AudioAttributesCompatParcelizer.write(p0, this.AudioAttributesCompatParcelizer, this.write));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/clearAuxEffectInfo$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "p0", "p1", "p2", "Lo/newEncryptedObject;", "write", "(III)Lo/newEncryptedObject;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final newEncryptedObject write(int p0, int p1, int p2) {
            int i = (p0 / p1) * p1;
            return getQues.IconCompatParcelizer(Math.max(i - p2, 0), i + p1 + p2);
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
