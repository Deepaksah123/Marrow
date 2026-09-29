package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\t*\u0004\u0018\u00010\b2\u0006\u0010\u0001\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0007\u0010\n\u001a-\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u0010\u001a%\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0003\u0010\u0011\u001a%\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0005\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014"}, d2 = {"", "p0", "p1", "IconCompatParcelizer", "(II)I", "write", "(I)I", "read", "Lo/escapesFor;", "", "(Lo/escapesFor;Lo/escapesFor;)Z", "Lo/_handleUnrecognizedCharacterEscape;", "p2", "", "p3", "Lo/FastIntegerMathUInt128;", "(Lo/_handleUnrecognizedCharacterEscape;IZLjava/lang/Object;)Lo/FastIntegerMathUInt128;", "(IZLjava/lang/Object;)Lo/FastIntegerMathUInt128;", "AudioAttributesCompatParcelizer", "(IZLjava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;I)Lo/FastIntegerMathUInt128;", "Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class multiplyFft {
    private static final Object IconCompatParcelizer = new Object();

    public static final int IconCompatParcelizer(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final int write(int i) {
        return IconCompatParcelizer(1, i);
    }

    public static final int read(int i) {
        return IconCompatParcelizer(2, i);
    }

    public static final boolean read(escapesFor escapesfor, escapesFor escapesfor2) {
        if (escapesfor == null) {
            return true;
        }
        if (!(escapesfor instanceof rawReference) || !(escapesfor2 instanceof rawReference)) {
            return false;
        }
        rawReference rawreference = (rawReference) escapesfor;
        return !rawreference.MediaBrowserCompatSearchResultReceiver() || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(escapesfor, escapesfor2) || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(rawreference.getRemoteActionCompatParcelizer(), ((rawReference) escapesfor2).getRemoteActionCompatParcelizer());
    }

    public static final FastIntegerMathUInt128 IconCompatParcelizer(int i, boolean z, Object obj) {
        return new FftMultiplier(i, z, obj);
    }

    public static final FastIntegerMathUInt128 AudioAttributesCompatParcelizer(int i, boolean z, Object obj, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1573003438, i2, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:1372)");
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new FftMultiplier(i, z, obj);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        FftMultiplier fftMultiplier = (FftMultiplier) objOnPause;
        fftMultiplier.RemoteActionCompatParcelizer(obj);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return fftMultiplier;
    }

    public static final FastIntegerMathUInt128 read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, boolean z, Object obj) {
        FftMultiplier fftMultiplier;
        _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(Integer.rotateLeft(i, 1), IconCompatParcelizer);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            fftMultiplier = new FftMultiplier(i, z, obj);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(fftMultiplier);
        } else {
            toMagicModuleMetaRepoModel.read(objOnPause, "");
            fftMultiplier = (FftMultiplier) objOnPause;
            fftMultiplier.RemoteActionCompatParcelizer(obj);
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatItemReceiver();
        return fftMultiplier;
    }
}
