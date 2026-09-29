package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\b"}, d2 = {"Lo/_reportInvalidOther;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/addKeySerializers;", "Lkotlin/Function1;", "Lo/findSetterInfo;", "", "p0", "<init>", "(Lo/getAnswerMap;)V", "Lo/findSerializer;", "write", "(Lo/findSerializer;)V", "IconCompatParcelizer", "Lo/getAnswerMap;", "RemoteActionCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _reportInvalidOther extends _handleOddName.IconCompatParcelizer implements addKeySerializers {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private getAnswerMap<? super findSetterInfo, getShowPopup> read;

    public _reportInvalidOther(getAnswerMap<? super findSetterInfo, getShowPopup> getanswermap) {
        this.read = getanswermap;
    }

    public final void RemoteActionCompatParcelizer(getAnswerMap<? super findSetterInfo, getShowPopup> getanswermap) {
        this.read = getanswermap;
    }

    @Override // kotlin.addKeySerializers
    public final void write(findSerializer findserializer) {
        this.read.invoke(findserializer);
        findserializer.write();
    }
}
