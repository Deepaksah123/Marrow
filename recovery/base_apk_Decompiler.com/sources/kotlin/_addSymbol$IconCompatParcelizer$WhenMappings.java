package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final /* synthetic */ class _addSymbol$IconCompatParcelizer$WhenMappings {
    public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

    static {
        int[] iArr = new int[_addSymbol.values().length];
        try {
            iArr[_addSymbol.read.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[_addSymbol.RemoteActionCompatParcelizer.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[_addSymbol.write.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[_addSymbol.AudioAttributesCompatParcelizer.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        AudioAttributesCompatParcelizer = iArr;
    }
}
