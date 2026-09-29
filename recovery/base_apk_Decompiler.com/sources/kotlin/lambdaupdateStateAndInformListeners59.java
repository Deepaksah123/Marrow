package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u0014J\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R \u0010\u0012\u001a\f\u0012\b\u0012\u0006*\u00020\u00020\u00020\u001a8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b"}, d2 = {"Lo/lambdaupdateStateAndInformListeners59;", "", "Landroid/content/Context;", "p0", "", "p1", "Lo/getChildTimelines;", "p2", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lo/getChildTimelines;)V", "", "write", "(Ljava/lang/String;)I", "", "read", "(Ljava/lang/String;)V", "AudioAttributesCompatParcelizer", "Landroid/content/SharedPreferences;", "RemoteActionCompatParcelizer", "(Landroid/content/SharedPreferences;Ljava/lang/String;)I", "(Landroid/content/SharedPreferences;Ljava/lang/String;I)V", "()Landroid/content/SharedPreferences;", "IconCompatParcelizer", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/String;", "Lo/getChildTimelines;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdaupdateStateAndInformListeners59 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getChildTimelines read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public WeakReference<Context> RemoteActionCompatParcelizer;

    public lambdaupdateStateAndInformListeners59(Context context, String str, getChildTimelines getchildtimelines) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getchildtimelines, "");
        this.write = str;
        this.read = getchildtimelines;
        this.RemoteActionCompatParcelizer = new WeakReference<>(context);
    }

    public final int write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        SharedPreferences sharedPreferences = read();
        if (sharedPreferences == null) {
            return 0;
        }
        return RemoteActionCompatParcelizer(sharedPreferences, IconCompatParcelizer(p0));
    }

    public final void read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        SharedPreferences sharedPreferences = read();
        if (sharedPreferences == null) {
            return;
        }
        read(sharedPreferences, IconCompatParcelizer(p0), write(p0) + 1);
    }

    public final void AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        SharedPreferences sharedPreferences = read();
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(IconCompatParcelizer(p0)).apply();
    }

    private static int RemoteActionCompatParcelizer(SharedPreferences p0, String p1) {
        return p0.getInt(p1, 0);
    }

    private static void read(SharedPreferences p0, String p1, int p2) {
        p0.edit().putInt(p1, p2).apply();
    }

    private SharedPreferences read() {
        StringBuilder sb = new StringBuilder("triggers_per_inapp:");
        sb.append(this.read.MediaBrowserCompatCustomActionResultReceiver());
        sb.append(':');
        sb.append(this.write);
        String string = sb.toString();
        Context context = this.RemoteActionCompatParcelizer.get();
        if (context == null) {
            return null;
        }
        return RendererCapabilitiesFormatSupport.IconCompatParcelizer(context, string);
    }

    private static String IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return "__triggers_".concat(String.valueOf(p0));
    }
}
