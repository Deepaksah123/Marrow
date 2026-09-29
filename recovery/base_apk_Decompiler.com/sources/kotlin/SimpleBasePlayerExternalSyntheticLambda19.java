package kotlin;

import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\u0003R\u0014\u0010\u0006\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda19;", "Lo/SimpleBasePlayerExternalSyntheticLambda14;", "<init>", "()V", "", "onStart", "read", "AudioAttributesCompatParcelizer", "Ljava/util/concurrent/atomic/AtomicBoolean;", "write", "Ljava/util/concurrent/atomic/AtomicBoolean;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SimpleBasePlayerExternalSyntheticLambda19 extends SimpleBasePlayerExternalSyntheticLambda14 {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final AtomicBoolean read = new AtomicBoolean();

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.read.get()) {
            read();
        }
    }

    @Override // kotlin.SimpleBasePlayerExternalSyntheticLambda14
    protected final void read() {
        maybeGetTypeVariable activity = getActivity();
        if (activity == null || RendererCapabilitiesListener.read((Activity) activity) || !this.read.compareAndSet(false, true)) {
            return;
        }
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(supportFragmentManager, "");
        _doAddInjectable _doaddinjectableIconCompatParcelizer = supportFragmentManager.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(_doaddinjectableIconCompatParcelizer, "");
        try {
            _doaddinjectableIconCompatParcelizer.read(this).write();
        } catch (IllegalStateException unused) {
            supportFragmentManager.IconCompatParcelizer().read(this).read();
        }
    }

    @Override // kotlin.SimpleBasePlayerExternalSyntheticLambda14
    protected final void AudioAttributesCompatParcelizer() {
        AudioAttributesCompatParcelizer(PlayerTimelineChangeReason.RemoteActionCompatParcelizer(requireContext(), write()).MediaBrowserCompatCustomActionResultReceiver().RatingCompat());
    }
}
