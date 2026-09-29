package kotlin;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import kotlin.Metadata;
import kotlin.findRenameByField;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/_closeObjectScope;", "Landroid/view/View$DragShadowBuilder;", "Lo/bufferMapProperty;", "p0", "Lo/calloc;", "p1", "Lkotlin/Function1;", "Lo/findSetterInfo;", "", "p2", "<init>", "(Lo/bufferMapProperty;JLo/getAnswerMap;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Landroid/graphics/Point;", "onProvideShadowMetrics", "(Landroid/graphics/Point;Landroid/graphics/Point;)V", "Landroid/graphics/Canvas;", "onDrawShadow", "(Landroid/graphics/Canvas;)V", "AudioAttributesCompatParcelizer", "Lo/bufferMapProperty;", "RemoteActionCompatParcelizer", "J", "write", "Lo/getAnswerMap;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _closeObjectScope extends View.DragShadowBuilder {
    private final bufferMapProperty AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getAnswerMap<findSetterInfo, getShowPopup> IconCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    private _closeObjectScope(bufferMapProperty buffermapproperty, long j, getAnswerMap<? super findSetterInfo, getShowPopup> getanswermap) {
        this.AudioAttributesCompatParcelizer = buffermapproperty;
        this.write = j;
        this.IconCompatParcelizer = getanswermap;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point p0, Point p1) {
        bufferMapProperty buffermapproperty = this.AudioAttributesCompatParcelizer;
        p0.set(buffermapproperty.IconCompatParcelizer(buffermapproperty.write(Float.intBitsToFloat((int) (this.write >> 32)))), buffermapproperty.IconCompatParcelizer(buffermapproperty.write(Float.intBitsToFloat((int) this.write))));
        p1.set(p0.x / 2, p0.y / 2);
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas p0) {
        findRenameByField findrenamebyfield = new findRenameByField();
        bufferMapProperty buffermapproperty = this.AudioAttributesCompatParcelizer;
        long j = this.write;
        tryToResolveUnresolved trytoresolveunresolved = tryToResolveUnresolved.write;
        JsonParserDelegate jsonParserDelegateRemoteActionCompatParcelizer = balloc.RemoteActionCompatParcelizer(p0);
        getAnswerMap<findSetterInfo, getShowPopup> getanswermap = this.IconCompatParcelizer;
        findRenameByField.write remoteActionCompatParcelizer = findrenamebyfield.getRemoteActionCompatParcelizer();
        bufferMapProperty buffermappropertyWrite = remoteActionCompatParcelizer.write();
        tryToResolveUnresolved remoteActionCompatParcelizer2 = remoteActionCompatParcelizer.getRemoteActionCompatParcelizer();
        JsonParserDelegate read = remoteActionCompatParcelizer.getRead();
        long jRemoteActionCompatParcelizer = remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        findRenameByField.write remoteActionCompatParcelizer3 = findrenamebyfield.getRemoteActionCompatParcelizer();
        remoteActionCompatParcelizer3.IconCompatParcelizer(buffermapproperty);
        remoteActionCompatParcelizer3.IconCompatParcelizer(trytoresolveunresolved);
        remoteActionCompatParcelizer3.AudioAttributesCompatParcelizer(jsonParserDelegateRemoteActionCompatParcelizer);
        remoteActionCompatParcelizer3.RemoteActionCompatParcelizer(j);
        jsonParserDelegateRemoteActionCompatParcelizer.IconCompatParcelizer();
        getanswermap.invoke(findrenamebyfield);
        jsonParserDelegateRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        findRenameByField.write remoteActionCompatParcelizer4 = findrenamebyfield.getRemoteActionCompatParcelizer();
        remoteActionCompatParcelizer4.IconCompatParcelizer(buffermappropertyWrite);
        remoteActionCompatParcelizer4.IconCompatParcelizer(remoteActionCompatParcelizer2);
        remoteActionCompatParcelizer4.AudioAttributesCompatParcelizer(read);
        remoteActionCompatParcelizer4.RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer);
    }

    public /* synthetic */ _closeObjectScope(bufferMapProperty buffermapproperty, long j, getAnswerMap getanswermap, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(buffermapproperty, j, getanswermap);
    }
}
