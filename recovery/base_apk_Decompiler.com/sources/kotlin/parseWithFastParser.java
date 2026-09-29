package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\u000eJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0011J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\fJ5\u0010\u0014\u001a\u00020\b2\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\b0\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\fR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0014\u0010\t\u001a\u00028\u00008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u001a"}, d2 = {"Lo/parseWithFastParser;", "N", "Lo/_closeInput;", "p0", "", "p1", "<init>", "(Lo/_closeInput;I)V", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;)V", "IconCompatParcelizer", "()V", "write", "(ILjava/lang/Object;)V", "(II)V", "p2", "(III)V", "Lkotlin/Function2;", "", "read", "(Lo/MagicModuleSubmissionRequestBody;Ljava/lang/Object;)V", "AudioAttributesImplApi26Parcelizer", "Lo/_closeInput;", "RemoteActionCompatParcelizer", "I", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class parseWithFastParser<N> implements _closeInput<N> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final _closeInput<N> IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int write;

    public parseWithFastParser(_closeInput<N> _closeinput, int i) {
        this.IconCompatParcelizer = _closeinput;
        this.read = i;
    }

    @Override // kotlin._closeInput
    public final N write() {
        return this.IconCompatParcelizer.write();
    }

    @Override // kotlin._closeInput
    public final void AudioAttributesCompatParcelizer(N p0) {
        this.write++;
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p0);
    }

    @Override // kotlin._closeInput
    public final void IconCompatParcelizer() {
        if (this.write <= 0) {
            _validJsonValueList.AudioAttributesCompatParcelizer("OffsetApplier up called with no corresponding down");
        }
        this.write--;
        this.IconCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin._closeInput
    public final void write(int p0, N p1) {
        this.IconCompatParcelizer.write(p0 + (this.write == 0 ? this.read : 0), p1);
    }

    @Override // kotlin._closeInput
    public final void IconCompatParcelizer(int p0, N p1) {
        this.IconCompatParcelizer.IconCompatParcelizer(p0 + (this.write == 0 ? this.read : 0), p1);
    }

    @Override // kotlin._closeInput
    public final void AudioAttributesCompatParcelizer(int p0, int p1) {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p0 + (this.write == 0 ? this.read : 0), p1);
    }

    @Override // kotlin._closeInput
    public final void write(int p0, int p1, int p2) {
        int i = this.write == 0 ? this.read : 0;
        this.IconCompatParcelizer.write(p0 + i, p1 + i, p2);
    }

    @Override // kotlin._closeInput
    public final void AudioAttributesCompatParcelizer() {
        _validJsonValueList.AudioAttributesCompatParcelizer("Clear is not valid on OffsetApplier");
    }

    @Override // kotlin._closeInput
    public final void read(MagicModuleSubmissionRequestBody<? super N, Object, getShowPopup> p0, Object p1) {
        this.IconCompatParcelizer.read(p0, p1);
    }

    @Override // kotlin._closeInput
    public final void AudioAttributesImplApi26Parcelizer() {
        this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
    }
}
