package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class updateAvailableCommands {
    private final ArrayList<lambdanew1comgoogleandroidexoplayer2ExoPlayerImpl> read = new ArrayList<>(5);

    public final lambdanew1comgoogleandroidexoplayer2ExoPlayerImpl read(Context context, getCreatedOnDateMs<? extends RecyclerView.MediaMetadataCompat> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        Iterator<lambdanew1comgoogleandroidexoplayer2ExoPlayerImpl> it = this.read.iterator();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(it, "");
        lambdanew1comgoogleandroidexoplayer2ExoPlayerImpl lambdanew1comgoogleandroidexoplayer2exoplayerimpl = null;
        while (it.hasNext()) {
            lambdanew1comgoogleandroidexoplayer2ExoPlayerImpl next = it.next();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(next, "");
            lambdanew1comgoogleandroidexoplayer2ExoPlayerImpl lambdanew1comgoogleandroidexoplayer2exoplayerimpl2 = next;
            if (lambdanew1comgoogleandroidexoplayer2exoplayerimpl2.IconCompatParcelizer() == context) {
                if (lambdanew1comgoogleandroidexoplayer2exoplayerimpl != null) {
                    throw new IllegalStateException("A pool was already found");
                }
                lambdanew1comgoogleandroidexoplayer2exoplayerimpl = lambdanew1comgoogleandroidexoplayer2exoplayerimpl2;
            } else if (updatePlayWhenReady.AudioAttributesCompatParcelizer(lambdanew1comgoogleandroidexoplayer2exoplayerimpl2.IconCompatParcelizer())) {
                lambdanew1comgoogleandroidexoplayer2exoplayerimpl2.getAudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer();
                it.remove();
            }
        }
        if (lambdanew1comgoogleandroidexoplayer2exoplayerimpl != null) {
            return lambdanew1comgoogleandroidexoplayer2exoplayerimpl;
        }
        lambdanew1comgoogleandroidexoplayer2ExoPlayerImpl lambdanew1comgoogleandroidexoplayer2exoplayerimpl3 = new lambdanew1comgoogleandroidexoplayer2ExoPlayerImpl(context, getcreatedondatems.invoke(), this);
        anyIgnorals anyignoralsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context);
        if (anyignoralsRemoteActionCompatParcelizer != null) {
            anyignoralsRemoteActionCompatParcelizer.IconCompatParcelizer(lambdanew1comgoogleandroidexoplayer2exoplayerimpl3);
        }
        this.read.add(lambdanew1comgoogleandroidexoplayer2exoplayerimpl3);
        return lambdanew1comgoogleandroidexoplayer2exoplayerimpl3;
    }

    public final void write(lambdanew1comgoogleandroidexoplayer2ExoPlayerImpl lambdanew1comgoogleandroidexoplayer2exoplayerimpl) {
        toMagicModuleMetaRepoModel.write(lambdanew1comgoogleandroidexoplayer2exoplayerimpl, "");
        if (updatePlayWhenReady.AudioAttributesCompatParcelizer(lambdanew1comgoogleandroidexoplayer2exoplayerimpl.IconCompatParcelizer())) {
            lambdanew1comgoogleandroidexoplayer2exoplayerimpl.getAudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer();
            this.read.remove(lambdanew1comgoogleandroidexoplayer2exoplayerimpl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final anyIgnorals RemoteActionCompatParcelizer(Context context) {
        if (context instanceof hasGetter) {
            return ((hasGetter) context).getLifecycle();
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(baseContext, "");
        return RemoteActionCompatParcelizer(baseContext);
    }
}
