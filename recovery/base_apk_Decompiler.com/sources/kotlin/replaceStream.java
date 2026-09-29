package kotlin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class replaceStream<T> extends onStreamChanged<T> {
    private final BroadcastReceiver read;

    public abstract IntentFilter IconCompatParcelizer();

    public abstract void write(Intent intent);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public replaceStream(Context context, setEnableDecoderFallback setenabledecoderfallback) {
        super(context, setenabledecoderfallback);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(setenabledecoderfallback, "");
        this.read = new read(this);
    }

    public static final class read extends BroadcastReceiver {
        final /* synthetic */ replaceStream<T> RemoteActionCompatParcelizer;

        read(replaceStream<T> replacestream) {
            this.RemoteActionCompatParcelizer = replacestream;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(intent, "");
            this.RemoteActionCompatParcelizer.write(intent);
        }
    }

    @Override // kotlin.onStreamChanged
    public void AudioAttributesCompatParcelizer() {
        n.write();
        String unused = readSource.IconCompatParcelizer;
        getClass().getSimpleName();
        write().registerReceiver(this.read, IconCompatParcelizer());
    }

    @Override // kotlin.onStreamChanged
    public void RemoteActionCompatParcelizer() {
        n.write();
        String unused = readSource.IconCompatParcelizer;
        getClass().getSimpleName();
        write().unregisterReceiver(this.read);
    }
}
