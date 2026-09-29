package kotlin;

import android.app.Application;
import com.marrow2.ui.test.testplay.worker.TestSubmitWorker;
import com.marrow2.ui.test.testplay.worker.TestTimesUpWorker;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.e1;
import kotlin.getChildIndexByWindowIndex;
import kotlin.onServiceDisconnected;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/setItemIconSizeRes;", "Lo/setItemIconTintList;", "Landroid/app/Application;", "p0", "<init>", "(Landroid/app/Application;)V", "", "", "p1", "", "read", "(JLjava/lang/String;)V", "write", "(Ljava/lang/String;)V", "Lo/getChildIndexByWindowIndex;", "RemoteActionCompatParcelizer", "Lo/getChildIndexByWindowIndex;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setItemIconSizeRes implements setItemIconTintList {
    private final getChildIndexByWindowIndex RemoteActionCompatParcelizer;

    @setSdkPayload
    public setItemIconSizeRes(Application application) {
        toMagicModuleMetaRepoModel.write(application, "");
        getChildIndexByWindowIndex.Companion companion = getChildIndexByWindowIndex.INSTANCE;
        this.RemoteActionCompatParcelizer = getChildIndexByWindowIndex.Companion.RemoteActionCompatParcelizer(application);
    }

    @Override // kotlin.setItemIconTintList
    public final void write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RemoteActionCompatParcelizer.IconCompatParcelizer("testWorkerTag".concat(String.valueOf(p0)));
    }

    @Override // kotlin.setItemIconTintList
    public final void read(long p0, String p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        onServiceDisconnected.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = new onServiceDisconnected.RemoteActionCompatParcelizer(TestSubmitWorker.class).IconCompatParcelizer(p0, TimeUnit.MILLISECONDS).write("testWorkerTag".concat(String.valueOf(p1)));
        Pair[] pairArr = {setAction.write("testId", p1)};
        e1.IconCompatParcelizer iconCompatParcelizer = new e1.IconCompatParcelizer();
        Pair pair = pairArr[0];
        iconCompatParcelizer.read((String) pair.write(), pair.IconCompatParcelizer());
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(remoteActionCompatParcelizerWrite.read(iconCompatParcelizer.IconCompatParcelizer()).write());
    }

    @Override // kotlin.setItemIconTintList
    public final void write(long p0, String p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        onServiceDisconnected.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = new onServiceDisconnected.RemoteActionCompatParcelizer(TestTimesUpWorker.class).IconCompatParcelizer(p0, TimeUnit.MILLISECONDS).write("testWorkerTag".concat(String.valueOf(p1)));
        Pair[] pairArr = {setAction.write("testId", p1)};
        e1.IconCompatParcelizer iconCompatParcelizer = new e1.IconCompatParcelizer();
        Pair pair = pairArr[0];
        iconCompatParcelizer.read((String) pair.write(), pair.IconCompatParcelizer());
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(remoteActionCompatParcelizerWrite.read(iconCompatParcelizer.IconCompatParcelizer()).write());
    }
}
