package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/hashSeed;", "p0", "Lkotlin/Function2;", "Lo/CharsToNameCanonicalizer;", "", "p1", "Lo/_findSymbol2;", "RemoteActionCompatParcelizer", "(ILo/MagicModuleSubmissionRequestBody;)Lo/_findSymbol2;", "Lo/WritableTypeIdInclusion;", "write", "(Lo/_findSymbol2;)Lo/WritableTypeIdInclusion;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class findSymbol {
    public static /* synthetic */ _findSymbol2 RemoteActionCompatParcelizer$default(int i, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = hashSeed.INSTANCE.read();
        }
        if ((i2 & 2) != 0) {
            magicModuleSubmissionRequestBody = null;
        }
        return RemoteActionCompatParcelizer(i, magicModuleSubmissionRequestBody);
    }

    public static final _findSymbol2 RemoteActionCompatParcelizer(int i, MagicModuleSubmissionRequestBody<? super CharsToNameCanonicalizer, ? super CharsToNameCanonicalizer, getShowPopup> magicModuleSubmissionRequestBody) {
        return new _handleSpillOverflow(i, false, magicModuleSubmissionRequestBody, null, 10, null);
    }

    public static final WritableTypeIdInclusion write(_findSymbol2 _findsymbol2) {
        if (!_findsymbol2.getRead().getRatingCompat()) {
            return null;
        }
        CharsToNameCanonicalizer charsToNameCanonicalizerAudioAttributesCompatParcelizer = _findsymbol2.AudioAttributesCompatParcelizer();
        if (!charsToNameCanonicalizerAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer()) {
            return null;
        }
        if (charsToNameCanonicalizerAudioAttributesCompatParcelizer.write()) {
            toMagicModuleMetaRepoModel.read(_findsymbol2, "");
            return _handleSpillOverflow.RemoteActionCompatParcelizer$default((_handleSpillOverflow) _findsymbol2, null, 1, null);
        }
        _findSymbol2 _findsymbol22 = _findsymbol2;
        _handleSpillOverflow _handlespilloverflow = collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(_findsymbol22).getOnPlayFromSearch().read();
        if (_handlespilloverflow != null) {
            return _handlespilloverflow.RemoteActionCompatParcelizer(collectLongDefaults.AudioAttributesImplApi21Parcelizer(_findsymbol22));
        }
        return null;
    }
}
