package kotlin;

import android.view.autofill.AutofillValue;
import kotlin.Metadata;
import kotlin._writeStringSegment;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/_writeStringSegment$read;", "", "p0", "Lo/_writeStringSegment;", "AudioAttributesCompatParcelizer", "(Lo/_writeStringSegment$read;Ljava/lang/CharSequence;)Lo/_writeStringSegment;", "", "IconCompatParcelizer", "(Lo/_writeStringSegment$read;Z)Lo/_writeStringSegment;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _writeStringSegmentASCII2 {
    public static final _writeStringSegment AudioAttributesCompatParcelizer(_writeStringSegment.Companion companion, CharSequence charSequence) {
        return new _outputRawMultiByteChar(AutofillValue.forText(charSequence));
    }

    public static final _writeStringSegment IconCompatParcelizer(_writeStringSegment.Companion companion, boolean z) {
        return new _outputRawMultiByteChar(AutofillValue.forToggle(z));
    }
}
