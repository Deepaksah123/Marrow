package kotlin;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlin.Metadata;
import kotlin.setBandwidthEstimator;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\f\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019"}, d2 = {"Lo/setMinSamples;", "Lo/setMinBytesTransferred;", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "p0", "<init>", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)V", "", "Lkotlin/Function1;", "Lo/setBandwidthEstimator;", "", "", "p1", "write", "(JLo/getAnswerMap;)V", "()V", "", "read", "(Ljava/lang/String;)Ljava/lang/String;", "(Ljava/lang/String;)Z", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "(Ljava/lang/String;)J", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)I", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setMinSamples implements setMinBytesTransferred {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final FirebaseRemoteConfig AudioAttributesCompatParcelizer;

    @setSdkPayload
    public setMinSamples(FirebaseRemoteConfig firebaseRemoteConfig) {
        toMagicModuleMetaRepoModel.write(firebaseRemoteConfig, "");
        this.AudioAttributesCompatParcelizer = firebaseRemoteConfig;
    }

    @Override // kotlin.setMinBytesTransferred
    public final void write(long p0, final getAnswerMap<? super setBandwidthEstimator<Boolean>, getShowPopup> p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        OnFailureListener onFailureListener = new OnFailureListener() { // from class: o.CombinedParallelSampleBandwidthEstimatorBuilder
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                setMinSamples.IconCompatParcelizer(p1, exc);
            }
        };
        this.AudioAttributesCompatParcelizer.read(p0).addOnFailureListener(onFailureListener).addOnSuccessListener(new OnSuccessListener() { // from class: o.ExperimentalBandwidthMeter1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                setMinSamples.write(this.read, p1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(getAnswerMap getanswermap, Exception exc) {
        toMagicModuleMetaRepoModel.write(exc, "");
        getanswermap.invoke(new setBandwidthEstimator.read(exc, null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(setMinSamples setminsamples, getAnswerMap getanswermap) {
        setminsamples.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        getanswermap.invoke(new setBandwidthEstimator.IconCompatParcelizer(Boolean.TRUE));
    }

    @Override // kotlin.setMinBytesTransferred
    public final void write() {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.setMinBytesTransferred
    public final String read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String strWrite = this.AudioAttributesCompatParcelizer.write(p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
        return strWrite;
    }

    @Override // kotlin.setMinBytesTransferred
    public final boolean write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver().keySet().contains(p0);
    }

    @Override // kotlin.setMinBytesTransferred
    public final boolean RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0);
    }

    @Override // kotlin.setMinBytesTransferred
    public final long IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0);
    }

    @Override // kotlin.setMinBytesTransferred
    public final int AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (int) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0);
    }
}
