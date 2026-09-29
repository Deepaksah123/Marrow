package kotlin;

import kotlin.CurrentQuery;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R0\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lo/includeRootValue;", "Lo/allocReadIOBuffer;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lo/CurrentQuery;", "p0", "Lkotlin/Function2;", "Lo/TopUserCompanion;", "Lo/SampleVideos;", "", "", "p1", "<init>", "(Lo/CurrentQuery;Lo/MagicModuleSubmissionRequestBody;)V", "o_", "()V", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "", "handleException", "(Lo/CurrentQuery;Ljava/lang/Throwable;)V", "RemoteActionCompatParcelizer", "Lo/CurrentQuery;", "read", "Lo/MagicModuleSubmissionRequestBody;", "write", "Lo/TopUserCompanion;", "Lo/setPassingYear;", "Lo/setPassingYear;", "Lo/CurrentQuery$IconCompatParcelizer;", "getKey", "()Lo/CurrentQuery$IconCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class includeRootValue implements allocReadIOBuffer, CoroutineExceptionHandler {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final CurrentQuery read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private setPassingYear write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final TopUserCompanion IconCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public includeRootValue(CurrentQuery currentQuery, MagicModuleSubmissionRequestBody<? super TopUserCompanion, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody) {
        this.read = currentQuery;
        this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
        this.IconCompatParcelizer = College.AudioAttributesCompatParcelizer(currentQuery.plus(this));
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final <R> R fold(R r, MagicModuleSubmissionRequestBody<? super R, ? super CurrentQuery.write, ? extends R> magicModuleSubmissionRequestBody) {
        return (R) CoroutineExceptionHandler.DefaultImpls.read(this, r, magicModuleSubmissionRequestBody);
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final <E extends CurrentQuery.write> E get(CurrentQuery.IconCompatParcelizer<E> iconCompatParcelizer) {
        return (E) CoroutineExceptionHandler.DefaultImpls.IconCompatParcelizer(this, iconCompatParcelizer);
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final CurrentQuery minusKey(CurrentQuery.IconCompatParcelizer<?> iconCompatParcelizer) {
        return CoroutineExceptionHandler.DefaultImpls.AudioAttributesCompatParcelizer(this, iconCompatParcelizer);
    }

    @Override // kotlin.CurrentQuery
    public final CurrentQuery plus(CurrentQuery currentQuery) {
        return CoroutineExceptionHandler.DefaultImpls.IconCompatParcelizer(this, currentQuery);
    }

    @Override // kotlin.allocReadIOBuffer
    public final void o_() {
        setPassingYear setpassingyear = this.write;
        if (setpassingyear != null) {
            getUserConfig.RemoteActionCompatParcelizer(setpassingyear, "Old job was still running!", null);
        }
        this.write = C0201setMcqCount.IconCompatParcelizer(this.IconCompatParcelizer, null, null, this.AudioAttributesCompatParcelizer, 3);
    }

    @Override // kotlin.allocReadIOBuffer
    public final void IconCompatParcelizer() {
        setPassingYear setpassingyear = this.write;
        if (setpassingyear != null) {
            setpassingyear.RemoteActionCompatParcelizer(new TokenFilterContext());
        }
        this.write = null;
    }

    @Override // kotlin.allocReadIOBuffer
    public final void AudioAttributesCompatParcelizer() {
        setPassingYear setpassingyear = this.write;
        if (setpassingyear != null) {
            setpassingyear.RemoteActionCompatParcelizer(new TokenFilterContext());
        }
        this.write = null;
    }

    @Override // o.CurrentQuery.write
    public final CurrentQuery.IconCompatParcelizer<?> getKey() {
        return CoroutineExceptionHandler.INSTANCE;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CurrentQuery p0, Throwable p1) throws Throwable {
        _checkDup _checkdup = (_checkDup) p0.get(_checkDup.INSTANCE);
        if (_checkdup != null) {
            _checkdup.IconCompatParcelizer(p1, this);
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.read.get(CoroutineExceptionHandler.INSTANCE);
        if (coroutineExceptionHandler == null) {
            throw p1;
        }
        coroutineExceptionHandler.handleException(p0, p1);
    }
}
