package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/reportOverflowLong;", "Lo/allocReadIOBuffer;", "Lkotlin/Function1;", "Lo/StreamConstraintsException;", "Lo/_wrapError;", "p0", "<init>", "(Lo/getAnswerMap;)V", "", "o_", "()V", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "write", "Lo/getAnswerMap;", "RemoteActionCompatParcelizer", "Lo/_wrapError;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class reportOverflowLong implements allocReadIOBuffer {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private _wrapError read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getAnswerMap<StreamConstraintsException, _wrapError> IconCompatParcelizer;

    @Override // kotlin.allocReadIOBuffer
    public final void AudioAttributesCompatParcelizer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public reportOverflowLong(getAnswerMap<? super StreamConstraintsException, ? extends _wrapError> getanswermap) {
        this.IconCompatParcelizer = getanswermap;
    }

    @Override // kotlin.allocReadIOBuffer
    public final void o_() {
        this.read = this.IconCompatParcelizer.invoke(StreamReadException.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.allocReadIOBuffer
    public final void IconCompatParcelizer() {
        _wrapError _wraperror = this.read;
        if (_wraperror != null) {
            _wraperror.RemoteActionCompatParcelizer();
        }
        this.read = null;
    }
}
