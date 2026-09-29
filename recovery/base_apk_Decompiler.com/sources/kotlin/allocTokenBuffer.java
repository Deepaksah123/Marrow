package kotlin;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0010B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0015\u001a\u00060\u0012j\u0002`\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0014\u0010\f\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/allocTokenBuffer;", "Lo/TopUserCompanion;", "Lo/allocReadIOBuffer;", "Lo/CurrentQuery;", "p0", "p1", "<init>", "(Lo/CurrentQuery;Lo/CurrentQuery;)V", "", "RemoteActionCompatParcelizer", "()V", "o_", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "Lo/CurrentQuery;", "write", "AudioAttributesImplApi21Parcelizer", "", "Lo/SynchronizedObject;", "Ljava/lang/Object;", "read", "bj_", "()Lo/CurrentQuery;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class allocTokenBuffer implements TopUserCompanion, allocReadIOBuffer {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final CurrentQuery RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final CurrentQuery write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Object read = this;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private volatile CurrentQuery AudioAttributesCompatParcelizer;
    public static final int read = 8;
    public static final CurrentQuery AudioAttributesCompatParcelizer = new _decodeEscaped();

    @Override // kotlin.allocReadIOBuffer
    public final void o_() {
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¸\u0006\n"}, d2 = {"Lo/YearItem$RemoteActionCompatParcelizer;", "Lo/getUnderrunThreshold;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lo/CurrentQuery;", "p0", "", "p1", "", "handleException", "(Lo/CurrentQuery;Ljava/lang/Throwable;)V", "o/YearItem$RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer extends getUnderrunThreshold implements CoroutineExceptionHandler {
        final /* synthetic */ _checkDup IconCompatParcelizer;
        final /* synthetic */ allocTokenBuffer read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(CoroutineExceptionHandler.Companion companion, _checkDup _checkdup, allocTokenBuffer alloctokenbuffer) {
            super(companion);
            this.IconCompatParcelizer = _checkdup;
            this.read = alloctokenbuffer;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(CurrentQuery p0, Throwable p1) throws Throwable {
            this.IconCompatParcelizer.IconCompatParcelizer(p1, this.read);
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.read.RemoteActionCompatParcelizer.get(CoroutineExceptionHandler.INSTANCE);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(p0, p1);
                return;
            }
            CoroutineExceptionHandler coroutineExceptionHandler2 = (CoroutineExceptionHandler) this.read.write.get(CoroutineExceptionHandler.INSTANCE);
            if (coroutineExceptionHandler2 == null) {
                throw p1;
            }
            coroutineExceptionHandler2.handleException(p0, p1);
        }
    }

    public allocTokenBuffer(CurrentQuery currentQuery, CurrentQuery currentQuery2) {
        this.write = currentQuery;
        this.RemoteActionCompatParcelizer = currentQuery2;
    }

    @Override // kotlin.TopUserCompanion
    /* JADX INFO: renamed from: bj_ */
    public final CurrentQuery getIconCompatParcelizer() {
        VideoSessionResponseBody iconCompatParcelizer;
        CurrentQuery currentQueryPlus;
        CurrentQuery currentQuery = this.AudioAttributesCompatParcelizer;
        if (currentQuery == null || currentQuery == AudioAttributesCompatParcelizer) {
            _checkDup _checkdup = (_checkDup) this.write.get(_checkDup.INSTANCE);
            if (_checkdup == null) {
                iconCompatParcelizer = VideoSessionResponseBody.RemoteActionCompatParcelizer;
            } else {
                iconCompatParcelizer = new IconCompatParcelizer(CoroutineExceptionHandler.INSTANCE, _checkdup, this);
            }
            synchronized (this.read) {
                CurrentQuery currentQuery2 = this.AudioAttributesCompatParcelizer;
                if (currentQuery2 == null) {
                    CurrentQuery currentQuery3 = this.write;
                    currentQueryPlus = currentQuery3.plus(getUserConfig.RemoteActionCompatParcelizer((setPassingYear) currentQuery3.get(setPassingYear.b_))).plus(this.RemoteActionCompatParcelizer).plus(iconCompatParcelizer);
                } else if (currentQuery2 == AudioAttributesCompatParcelizer) {
                    CurrentQuery currentQuery4 = this.write;
                    isMockTest ismocktestRemoteActionCompatParcelizer = getUserConfig.RemoteActionCompatParcelizer((setPassingYear) currentQuery4.get(setPassingYear.b_));
                    ismocktestRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new _nextToken2());
                    currentQueryPlus = currentQuery4.plus(ismocktestRemoteActionCompatParcelizer).plus(this.RemoteActionCompatParcelizer).plus(iconCompatParcelizer);
                } else {
                    currentQueryPlus = currentQuery2;
                }
                this.AudioAttributesCompatParcelizer = currentQueryPlus;
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            currentQuery = currentQueryPlus;
        }
        toMagicModuleMetaRepoModel.write(currentQuery);
        return currentQuery;
    }

    public final void RemoteActionCompatParcelizer() {
        synchronized (this.read) {
            CurrentQuery currentQuery = this.AudioAttributesCompatParcelizer;
            if (currentQuery == null) {
                this.AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer;
            } else {
                getUserConfig.AudioAttributesCompatParcelizer(currentQuery, new _nextToken2());
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    @Override // kotlin.allocReadIOBuffer
    public final void IconCompatParcelizer() {
        RemoteActionCompatParcelizer();
    }

    @Override // kotlin.allocReadIOBuffer
    public final void AudioAttributesCompatParcelizer() {
        RemoteActionCompatParcelizer();
    }
}
