package kotlin;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bR*\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\"\u0004\b\r\u0010\u000fR*\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u000e\"\u0004\b\u0010\u0010\u000f"}, d2 = {"Lo/getTypeFactory;", "Lo/objectIdGeneratorInstance;", "Lo/_handleOddName$IconCompatParcelizer;", "Lkotlin/Function1;", "Lo/constructType;", "", "p0", "p1", "<init>", "(Lo/getAnswerMap;Lo/getAnswerMap;)V", "write", "(Landroid/view/KeyEvent;)Z", "AudioAttributesCompatParcelizer", "read", "Lo/getAnswerMap;", "(Lo/getAnswerMap;)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getTypeFactory extends _handleOddName.IconCompatParcelizer implements objectIdGeneratorInstance {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private getAnswerMap<? super constructType, Boolean> IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private getAnswerMap<? super constructType, Boolean> RemoteActionCompatParcelizer;

    public getTypeFactory(getAnswerMap<? super constructType, Boolean> getanswermap, getAnswerMap<? super constructType, Boolean> getanswermap2) {
        this.RemoteActionCompatParcelizer = getanswermap;
        this.IconCompatParcelizer = getanswermap2;
    }

    public final void read(getAnswerMap<? super constructType, Boolean> getanswermap) {
        this.RemoteActionCompatParcelizer = getanswermap;
    }

    public final void RemoteActionCompatParcelizer(getAnswerMap<? super constructType, Boolean> getanswermap) {
        this.IconCompatParcelizer = getanswermap;
    }

    @Override // kotlin.objectIdGeneratorInstance
    public final boolean write(KeyEvent p0) {
        getAnswerMap<? super constructType, Boolean> getanswermap = this.RemoteActionCompatParcelizer;
        if (getanswermap != null) {
            return getanswermap.invoke(constructType.read(p0)).booleanValue();
        }
        return false;
    }

    @Override // kotlin.objectIdGeneratorInstance
    public final boolean AudioAttributesCompatParcelizer(KeyEvent p0) {
        getAnswerMap<? super constructType, Boolean> getanswermap = this.IconCompatParcelizer;
        if (getanswermap != null) {
            return getanswermap.invoke(constructType.read(p0)).booleanValue();
        }
        return false;
    }
}
