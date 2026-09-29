package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.PlayerEvent;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0003J\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/PlayerEvent;", "", "<init>", "()V", "", "IconCompatParcelizer", "()Z", "p0", "", "write", "Landroid/content/Context;", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "p1", "read", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlayerEvent {
    private static volatile PlayerEvent AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean RemoteActionCompatParcelizer = true;

    public static boolean IconCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    public static void write() {
        RemoteActionCompatParcelizer = false;
    }

    public static void read(final Context p0, CleverTapInstanceConfig p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(p1).IconCompatParcelizer().read("updateCacheToDisk", new Callable() { // from class: o.PlayerPlayWhenReadyChangeReason
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return PlayerEvent.read(p0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void read(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        RendererCapabilitiesFormatSupport.IconCompatParcelizer(context, "firstTimeRequest", RemoteActionCompatParcelizer);
        return null;
    }

    /* JADX INFO: renamed from: o.PlayerEvent$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f"}, d2 = {"Lo/PlayerEvent$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "p1", "Lo/PlayerEvent;", "write", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)Lo/PlayerEvent;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "Lo/PlayerEvent;", "", "Z", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public final PlayerEvent write(Context p0, CleverTapInstanceConfig p1) {
            PlayerEvent playerEventRemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            PlayerEvent playerEvent = PlayerEvent.AudioAttributesCompatParcelizer;
            if (playerEvent != null) {
                return playerEvent;
            }
            synchronized (this) {
                playerEventRemoteActionCompatParcelizer = PlayerEvent.AudioAttributesCompatParcelizer;
                if (playerEventRemoteActionCompatParcelizer == null) {
                    Companion companion = PlayerEvent.INSTANCE;
                    playerEventRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0, p1);
                    Companion companion2 = PlayerEvent.INSTANCE;
                    PlayerEvent.AudioAttributesCompatParcelizer = playerEventRemoteActionCompatParcelizer;
                }
            }
            return playerEventRemoteActionCompatParcelizer;
        }

        private static PlayerEvent RemoteActionCompatParcelizer(final Context p0, CleverTapInstanceConfig p1) {
            TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(p1).IconCompatParcelizer().read("buildCache", new Callable() { // from class: o.PlayerMediaItemTransitionReason
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return PlayerEvent.Companion.AudioAttributesCompatParcelizer(p0);
                }
            });
            return new PlayerEvent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Void AudioAttributesCompatParcelizer(Context context) {
            toMagicModuleMetaRepoModel.write(context, "");
            Companion companion = PlayerEvent.INSTANCE;
            PlayerEvent.RemoteActionCompatParcelizer = RendererCapabilitiesFormatSupport.RemoteActionCompatParcelizer(context, "firstTimeRequest", true);
            return null;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
