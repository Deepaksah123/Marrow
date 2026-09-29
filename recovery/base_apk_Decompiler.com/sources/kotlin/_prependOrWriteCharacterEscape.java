package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\b"}, d2 = {"Lo/_prependOrWriteCharacterEscape;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/addKeySerializers;", "Lkotlin/Function1;", "Lo/findSerializer;", "", "p0", "<init>", "(Lo/getAnswerMap;)V", "write", "(Lo/findSerializer;)V", "read", "Lo/getAnswerMap;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class _prependOrWriteCharacterEscape extends _handleOddName.IconCompatParcelizer implements addKeySerializers {
    private getAnswerMap<? super findSerializer, getShowPopup> read;

    public _prependOrWriteCharacterEscape(getAnswerMap<? super findSerializer, getShowPopup> getanswermap) {
        this.read = getanswermap;
    }

    public final void RemoteActionCompatParcelizer(getAnswerMap<? super findSerializer, getShowPopup> getanswermap) {
        this.read = getanswermap;
    }

    @Override // kotlin.addKeySerializers
    public final void write(findSerializer findserializer) {
        this.read.invoke(findserializer);
    }
}
