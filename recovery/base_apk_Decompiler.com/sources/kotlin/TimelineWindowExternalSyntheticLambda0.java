package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\rH\u0016¢\u0006\u0004\b\b\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0015\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u001e\u0010\u0010\u001a\f\u0012\b\u0012\u0006*\u00020\u00020\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a"}, d2 = {"Lo/TimelineWindowExternalSyntheticLambda0;", "Lo/containsType;", "Landroid/content/Context;", "p0", "", "p1", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "write", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "read", "(Ljava/lang/String;)J", "", "()Ljava/util/Map;", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)V", "RemoteActionCompatParcelizer", "(Ljava/lang/String;J)V", "(Ljava/lang/String;)V", "IconCompatParcelizer", "Landroid/content/SharedPreferences;", "()Landroid/content/SharedPreferences;", "Ljava/lang/String;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimelineWindowExternalSyntheticLambda0 implements containsType {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final WeakReference<Context> AudioAttributesCompatParcelizer;
    private String write;

    public TimelineWindowExternalSyntheticLambda0(Context context, String str) {
        toMagicModuleMetaRepoModel.write(context, "");
        this.write = str;
        this.AudioAttributesCompatParcelizer = new WeakReference<>(context);
    }

    @Override // kotlin.containsType
    public final String write(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        SharedPreferences sharedPreferencesIconCompatParcelizer = IconCompatParcelizer();
        return sharedPreferencesIconCompatParcelizer == null ? p1 : sharedPreferencesIconCompatParcelizer.getString(p0, p1);
    }

    @Override // kotlin.containsType
    public final long read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        SharedPreferences sharedPreferencesIconCompatParcelizer = IconCompatParcelizer();
        if (sharedPreferencesIconCompatParcelizer == null) {
            return 0L;
        }
        return sharedPreferencesIconCompatParcelizer.getLong(str, 0L);
    }

    @Override // kotlin.containsType
    public final Map<String, ?> write() {
        SharedPreferences sharedPreferencesIconCompatParcelizer = IconCompatParcelizer();
        return sharedPreferencesIconCompatParcelizer == null ? VideoTimelineResponseBody.read() : sharedPreferencesIconCompatParcelizer.getAll();
    }

    @Override // kotlin.containsType
    public final void AudioAttributesCompatParcelizer(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        SharedPreferences sharedPreferencesIconCompatParcelizer = IconCompatParcelizer();
        if (sharedPreferencesIconCompatParcelizer == null) {
            return;
        }
        sharedPreferencesIconCompatParcelizer.edit().putString(p0, p1).apply();
    }

    @Override // kotlin.containsType
    public final void RemoteActionCompatParcelizer(String p0, long p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        SharedPreferences sharedPreferencesIconCompatParcelizer = IconCompatParcelizer();
        if (sharedPreferencesIconCompatParcelizer == null) {
            return;
        }
        sharedPreferencesIconCompatParcelizer.edit().putLong(p0, p1).apply();
    }

    @Override // kotlin.containsType
    public final void RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        SharedPreferences sharedPreferencesIconCompatParcelizer = IconCompatParcelizer();
        if (sharedPreferencesIconCompatParcelizer == null) {
            return;
        }
        sharedPreferencesIconCompatParcelizer.edit().remove(p0).apply();
    }

    @Override // kotlin.containsType
    public final void IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.write = p0;
    }

    private SharedPreferences IconCompatParcelizer() {
        Context context = this.AudioAttributesCompatParcelizer.get();
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(this.write, 0);
    }
}
