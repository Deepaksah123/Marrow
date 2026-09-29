package kotlin;

import android.app.Application;
import com.marrow2.ui.home.worker.NotifyVideoSubmitWorker;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.e1;
import kotlin.getChildIndexByWindowIndex;
import kotlin.onServiceDisconnected;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/OptionalPendingResult;", "Lo/OptionalModuleApi;", "Landroid/app/Application;", "p0", "<init>", "(Landroid/app/Application;)V", "", "p1", "p2", "", "p3", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "Lo/getChildIndexByWindowIndex;", "AudioAttributesCompatParcelizer", "Lo/getChildIndexByWindowIndex;", "IconCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OptionalPendingResult implements OptionalModuleApi {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getChildIndexByWindowIndex IconCompatParcelizer;

    @setSdkPayload
    public OptionalPendingResult(Application application) {
        toMagicModuleMetaRepoModel.write(application, "");
        getChildIndexByWindowIndex.Companion companion = getChildIndexByWindowIndex.INSTANCE;
        this.IconCompatParcelizer = getChildIndexByWindowIndex.Companion.RemoteActionCompatParcelizer(application);
    }

    @Override // kotlin.OptionalModuleApi
    public final void RemoteActionCompatParcelizer(String p0, String p1, String p2, long p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        onServiceDisconnected.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = new onServiceDisconnected.RemoteActionCompatParcelizer(NotifyVideoSubmitWorker.class).IconCompatParcelizer(p3, TimeUnit.MILLISECONDS).write("LiveVideoNotificationJob".concat(String.valueOf(p0)));
        Pair[] pairArr = {setAction.write("contentId", p0), setAction.write("contentTitle", p1), setAction.write("contentDescription", p2)};
        e1.IconCompatParcelizer iconCompatParcelizer = new e1.IconCompatParcelizer();
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            iconCompatParcelizer.read((String) pair.write(), pair.IconCompatParcelizer());
        }
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(remoteActionCompatParcelizerWrite.read(iconCompatParcelizer.IconCompatParcelizer()).write());
    }
}
