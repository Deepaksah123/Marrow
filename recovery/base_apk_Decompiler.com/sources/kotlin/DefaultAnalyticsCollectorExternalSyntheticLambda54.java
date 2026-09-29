package kotlin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ#\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda54;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "IconCompatParcelizer", "()V", "finalize", "Landroid/content/Intent;", "p1", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "read", "Landroid/content/Context;", "write"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda54 extends BroadcastReceiver {
    private static DefaultAnalyticsCollectorExternalSyntheticLambda54 AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Context write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String RemoteActionCompatParcelizer = "com.parse.bolts.measurement_event";

    private DefaultAnalyticsCollectorExternalSyntheticLambda54(Context context) {
        Context applicationContext = context.getApplicationContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(applicationContext, "");
        this.write = applicationContext;
    }

    public /* synthetic */ DefaultAnalyticsCollectorExternalSyntheticLambda54(Context context, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context);
    }

    public static final /* synthetic */ DefaultAnalyticsCollectorExternalSyntheticLambda54 AudioAttributesCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda54.class)) {
            return null;
        }
        try {
            return AudioAttributesCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda54.class);
            return null;
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda54 defaultAnalyticsCollectorExternalSyntheticLambda54) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda54.class)) {
            return;
        }
        try {
            AudioAttributesCompatParcelizer = defaultAnalyticsCollectorExternalSyntheticLambda54;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda54.class);
        }
    }

    public static final /* synthetic */ void write(DefaultAnalyticsCollectorExternalSyntheticLambda54 defaultAnalyticsCollectorExternalSyntheticLambda54) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda54.class)) {
            return;
        }
        try {
            defaultAnalyticsCollectorExternalSyntheticLambda54.read();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda54.class);
        }
    }

    /* JADX INFO: renamed from: o.DefaultAnalyticsCollectorExternalSyntheticLambda54$write, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0006X\u0086D¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda54$write;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda54;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda54;", "", "Ljava/lang/String;", "read", "AudioAttributesCompatParcelizer", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda54;"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @getMagicModuleMeta
        public static DefaultAnalyticsCollectorExternalSyntheticLambda54 RemoteActionCompatParcelizer(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (DefaultAnalyticsCollectorExternalSyntheticLambda54.AudioAttributesCompatParcelizer() != null) {
                return DefaultAnalyticsCollectorExternalSyntheticLambda54.AudioAttributesCompatParcelizer();
            }
            DefaultAnalyticsCollectorExternalSyntheticLambda54 defaultAnalyticsCollectorExternalSyntheticLambda54 = new DefaultAnalyticsCollectorExternalSyntheticLambda54(p0, null);
            DefaultAnalyticsCollectorExternalSyntheticLambda54.write(defaultAnalyticsCollectorExternalSyntheticLambda54);
            DefaultAnalyticsCollectorExternalSyntheticLambda54.IconCompatParcelizer(defaultAnalyticsCollectorExternalSyntheticLambda54);
            return DefaultAnalyticsCollectorExternalSyntheticLambda54.AudioAttributesCompatParcelizer();
        }
    }

    private final void read() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            getProvider getprovider = getProvider.getInstance(this.write);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getprovider, "");
            getprovider.registerReceiver(this, new IntentFilter(RemoteActionCompatParcelizer));
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    private final void IconCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            getProvider getprovider = getProvider.getInstance(this.write);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getprovider, "");
            getprovider.IconCompatParcelizer(this);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    public final void finalize() throws Throwable {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            IconCompatParcelizer();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context p0, Intent p1) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            lambdaonVideoFrameProcessingOffset20 lambdaonvideoframeprocessingoffset20 = new lambdaonVideoFrameProcessingOffset20(p0);
            StringBuilder sb = new StringBuilder("bf_");
            sb.append(p1 != null ? p1.getStringExtra("event_name") : null);
            String string = sb.toString();
            Bundle bundleExtra = p1 != null ? p1.getBundleExtra("event_args") : null;
            Bundle bundle = new Bundle();
            Set<String> setKeySet = bundleExtra != null ? bundleExtra.keySet() : null;
            if (setKeySet != null) {
                for (String str : setKeySet) {
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                    bundle.putString(new newYearNameItem("[ -]*$").RemoteActionCompatParcelizer(new newYearNameItem("^[ -]*").RemoteActionCompatParcelizer(new newYearNameItem("[^0-9a-zA-Z _-]").RemoteActionCompatParcelizer(str, "-"), ""), ""), (String) bundleExtra.get(str));
                }
            }
            lambdaonvideoframeprocessingoffset20.IconCompatParcelizer(string, bundle);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    @getMagicModuleMeta
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda54 write(Context context) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda54.class)) {
            return null;
        }
        try {
            return Companion.RemoteActionCompatParcelizer(context);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda54.class);
            return null;
        }
    }
}
