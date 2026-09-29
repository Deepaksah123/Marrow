package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\t\u0010\nR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0011X\u0090\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lo/_hasTextualNull;", "T", "Lo/CharacterEscapes;", "Lkotlin/Function1;", "Lo/reportInvalidBase64Char;", "p0", "<init>", "(Lo/getAnswerMap;)V", "Lo/ContentReference;", "write", "(Ljava/lang/Object;)Lo/ContentReference;", "Lo/_reportInvalidEOFInValue;", "Lo/_reportInvalidEOFInValue;", "AudioAttributesCompatParcelizer", "()Lo/_reportInvalidEOFInValue;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _hasTextualNull<T> extends CharacterEscapes<T> {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final _reportInvalidEOFInValue<T> read;

    public _hasTextualNull(getAnswerMap<? super reportInvalidBase64Char, ? extends T> getanswermap) {
        super(new getCreatedOnDateMs() { // from class: o._reportUnexpectedChar
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return _hasTextualNull.read();
            }
        });
        this.read = new _reportInvalidEOFInValue<>(getanswermap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object read() {
        _validJsonValueList.RemoteActionCompatParcelizer("Unexpected call to default provider");
        throw new PlanDetailsCreator();
    }

    @Override // kotlin.getTokenColumnNr
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final _reportInvalidEOFInValue<T> IconCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.CharacterEscapes
    public final ContentReference<T> write(T p0) {
        return new ContentReference<>(this, p0, p0 == null, null, null, null, true);
    }
}
