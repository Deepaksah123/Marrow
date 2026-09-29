package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a'\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\n"}, d2 = {"Lo/_initForReading;", "", "read", "(Lo/_initForReading;)V", "AudioAttributesCompatParcelizer", "write", "RemoteActionCompatParcelizer", "Lkotlin/Function1;", "Lo/validateAppend;", "p0", "(Lo/_initForReading;Lo/getAnswerMap;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _newReader {
    public static final void read(_initForReading _initforreading) {
        collectLongDefaults.AudioAttributesImplApi26Parcelizer(_initforreading).MediaBrowserCompatSearchResultReceiver();
    }

    public static final void AudioAttributesCompatParcelizer(_initForReading _initforreading) {
        collectLongDefaults.write((Module) _initforreading, _bind.write(2)).r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
    }

    public static final void write(_initForReading _initforreading) {
        _assertNotNull.AudioAttributesCompatParcelizer$default(collectLongDefaults.AudioAttributesImplApi26Parcelizer(_initforreading), false, 1, null);
    }

    public static final void RemoteActionCompatParcelizer(_initForReading _initforreading) {
        collectLongDefaults.AudioAttributesImplApi26Parcelizer(_initforreading).getOnBackPressedDispatcherannotations();
    }

    public static final void AudioAttributesCompatParcelizer(_initForReading _initforreading, getAnswerMap<? super validateAppend, getShowPopup> getanswermap) {
        _bindAndClose read;
        if (!_initforreading.getRead().getRatingCompat() || (read = collectLongDefaults.write((Module) _initforreading, _bind.write(2)).getRead()) == null) {
            return;
        }
        read.RemoteActionCompatParcelizer(getanswermap, true);
    }
}
