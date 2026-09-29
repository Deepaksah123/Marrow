package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\u000eR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00078\u0001@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\r\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018"}, d2 = {"Lo/getBitSetjackson_module_kotlin;", "T", "", "Lkotlin/Function1;", "", "p0", "Lkotlin/Function0;", "", "p1", "<init>", "(Lo/getAnswerMap;Lo/getCreatedOnDateMs;)V", "AudioAttributesCompatParcelizer", "()Z", "IconCompatParcelizer", "(Ljava/lang/Object;)V", "read", "Lo/getAnswerMap;", "", "RemoteActionCompatParcelizer", "Ljava/util/List;", "write", "Z", "Lo/getCreatedOnDateMs;", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class getBitSetjackson_module_kotlin<T> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final ReentrantLock IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getCreatedOnDateMs<Boolean> write;
    private final List<T> RemoteActionCompatParcelizer;
    private final getAnswerMap<T, getShowPopup> read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private boolean AudioAttributesCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    private getBitSetjackson_module_kotlin(getAnswerMap<? super T, getShowPopup> getanswermap, getCreatedOnDateMs<Boolean> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.read = getanswermap;
        this.write = getcreatedondatems;
        this.IconCompatParcelizer = new ReentrantLock();
        this.RemoteActionCompatParcelizer = new ArrayList();
    }

    public /* synthetic */ getBitSetjackson_module_kotlin(getAnswerMap getanswermap, getCreatedOnDateMs getcreatedondatems, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(getanswermap, (i & 2) != 0 ? null : getcreatedondatems);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void IconCompatParcelizer(T p0) {
        getCreatedOnDateMs<Boolean> getcreatedondatems = this.write;
        boolean z = true;
        if (getcreatedondatems != null && getcreatedondatems.invoke().booleanValue()) {
            AudioAttributesCompatParcelizer();
        }
        if (this.AudioAttributesCompatParcelizer) {
            this.read.invoke(p0);
            return;
        }
        ReentrantLock reentrantLock = this.IconCompatParcelizer;
        reentrantLock.lock();
        try {
            if (this.AudioAttributesCompatParcelizer) {
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            } else {
                this.RemoteActionCompatParcelizer.add(p0);
                z = false;
            }
            if (z) {
                this.read.invoke(p0);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void AudioAttributesCompatParcelizer(T p0) {
        ReentrantLock reentrantLock = this.IconCompatParcelizer;
        reentrantLock.lock();
        try {
            this.RemoteActionCompatParcelizer.remove(p0);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean AudioAttributesCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer) {
            return false;
        }
        ReentrantLock reentrantLock = this.IconCompatParcelizer;
        reentrantLock.lock();
        try {
            if (this.AudioAttributesCompatParcelizer) {
                return false;
            }
            this.AudioAttributesCompatParcelizer = true;
            List listOnPlay = IntermediateLoginResponseBody.onPlay(this.RemoteActionCompatParcelizer);
            this.RemoteActionCompatParcelizer.clear();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            if (listOnPlay != null) {
                getAnswerMap<T, getShowPopup> getanswermap = this.read;
                Iterator<T> it = listOnPlay.iterator();
                while (it.hasNext()) {
                    getanswermap.invoke(it.next());
                }
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }
}
