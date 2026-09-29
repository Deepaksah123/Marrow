package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/_findSymbol2;", "Lo/Module;", "Lo/_checkNeedForRehash;", "p0", "", "IconCompatParcelizer", "(I)Z", "Lo/CharsToNameCanonicalizer;", "AudioAttributesCompatParcelizer", "()Lo/CharsToNameCanonicalizer;", "Lo/_handleSpillOverflow;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface _findSymbol2 extends Module {
    CharsToNameCanonicalizer AudioAttributesCompatParcelizer();

    boolean IconCompatParcelizer(int p0);

    static /* synthetic */ boolean IconCompatParcelizer$default(_findSymbol2 _findsymbol2, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFocus-3ESFkO8");
        }
        if ((i2 & 1) != 0) {
            i = _checkNeedForRehash.INSTANCE.RemoteActionCompatParcelizer();
        }
        return _findsymbol2.IconCompatParcelizer(i);
    }
}
