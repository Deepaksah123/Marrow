package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\b\u0010\f\"\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\" \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"T", "Lkotlin/Function0;", "p0", "Lo/parseDouble;", "RemoteActionCompatParcelizer", "(Lo/getCreatedOnDateMs;)Lo/parseDouble;", "Lo/quoteAsUTF8;", "p1", "IconCompatParcelizer", "(Lo/quoteAsUTF8;Lo/getCreatedOnDateMs;)Lo/parseDouble;", "Lo/UTF32Reader;", "Lo/reportOverflowInt;", "()Lo/UTF32Reader;", "Lo/applyWeights;", "Lo/ifftMixedRadix;", "AudioAttributesCompatParcelizer", "Lo/applyWeights;", "write", "read"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "o/_qbuf")
final /* synthetic */ class quoteAsString {
    private static final applyWeights<ifftMixedRadix> AudioAttributesCompatParcelizer = new applyWeights<>();
    private static final applyWeights<UTF32Reader<reportOverflowInt>> write = new applyWeights<>();

    public static final <T> parseDouble<T> RemoteActionCompatParcelizer(getCreatedOnDateMs<? extends T> getcreatedondatems) {
        return new _reportUnexpectedNumberChar(getcreatedondatems, null);
    }

    public static final <T> parseDouble<T> IconCompatParcelizer(quoteAsUTF8<T> quoteasutf8, getCreatedOnDateMs<? extends T> getcreatedondatems) {
        return new _reportUnexpectedNumberChar(getcreatedondatems, quoteasutf8);
    }

    public static final UTF32Reader<reportOverflowInt> IconCompatParcelizer() {
        applyWeights<UTF32Reader<reportOverflowInt>> applyweights = write;
        UTF32Reader<reportOverflowInt> uTF32ReaderAudioAttributesCompatParcelizer = applyweights.AudioAttributesCompatParcelizer();
        if (uTF32ReaderAudioAttributesCompatParcelizer != null) {
            return uTF32ReaderAudioAttributesCompatParcelizer;
        }
        UTF32Reader<reportOverflowInt> uTF32Reader = new UTF32Reader<>(new reportOverflowInt[0], 0);
        applyweights.IconCompatParcelizer(uTF32Reader);
        return uTF32Reader;
    }
}
