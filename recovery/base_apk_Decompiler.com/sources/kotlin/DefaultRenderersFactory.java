package kotlin;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultRenderersFactory {
    static {
        n.write("EnqueueRunnable");
    }

    public static void AudioAttributesCompatParcelizer(AudioFocusManagerPlayerControl audioFocusManagerPlayerControl) {
        if (audioFocusManagerPlayerControl.MediaBrowserCompatItemReceiver()) {
            StringBuilder sb = new StringBuilder("WorkContinuation has cycles (");
            sb.append(audioFocusManagerPlayerControl);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }
        if (IconCompatParcelizer(audioFocusManagerPlayerControl)) {
            RemoteActionCompatParcelizer(audioFocusManagerPlayerControl);
        }
    }

    private static boolean IconCompatParcelizer(AudioFocusManagerPlayerControl audioFocusManagerPlayerControl) {
        hasPrevious haspreviousMediaBrowserCompatCustomActionResultReceiver = audioFocusManagerPlayerControl.MediaBrowserCompatCustomActionResultReceiver();
        WorkDatabase workDatabaseAudioAttributesImplApi26Parcelizer = haspreviousMediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer();
        workDatabaseAudioAttributesImplApi26Parcelizer.read();
        try {
            onPlaybackParametersChanged.RemoteActionCompatParcelizer(workDatabaseAudioAttributesImplApi26Parcelizer, haspreviousMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(), audioFocusManagerPlayerControl);
            boolean zWrite = write(audioFocusManagerPlayerControl);
            workDatabaseAudioAttributesImplApi26Parcelizer.onCustomAction();
            return zWrite;
        } finally {
            workDatabaseAudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer();
        }
    }

    private static void RemoteActionCompatParcelizer(AudioFocusManagerPlayerControl audioFocusManagerPlayerControl) {
        hasPrevious haspreviousMediaBrowserCompatCustomActionResultReceiver = audioFocusManagerPlayerControl.MediaBrowserCompatCustomActionResultReceiver();
        setAudioFocusState.write(haspreviousMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(), haspreviousMediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer(), haspreviousMediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer());
    }

    private static boolean write(AudioFocusManagerPlayerControl audioFocusManagerPlayerControl) {
        List<AudioFocusManagerPlayerControl> listRemoteActionCompatParcelizer = audioFocusManagerPlayerControl.RemoteActionCompatParcelizer();
        boolean zWrite = false;
        if (listRemoteActionCompatParcelizer != null) {
            for (AudioFocusManagerPlayerControl audioFocusManagerPlayerControl2 : listRemoteActionCompatParcelizer) {
                if (!audioFocusManagerPlayerControl2.AudioAttributesImplBaseParcelizer()) {
                    zWrite |= write(audioFocusManagerPlayerControl2);
                } else {
                    n.write();
                    TextUtils.join(", ", audioFocusManagerPlayerControl2.write());
                }
            }
        }
        return read(audioFocusManagerPlayerControl) | zWrite;
    }

    private static boolean read(AudioFocusManagerPlayerControl audioFocusManagerPlayerControl) {
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(audioFocusManagerPlayerControl.MediaBrowserCompatCustomActionResultReceiver(), audioFocusManagerPlayerControl.AudioAttributesImplApi26Parcelizer(), (String[]) AudioFocusManagerPlayerControl.RemoteActionCompatParcelizer(audioFocusManagerPlayerControl).toArray(new String[0]), audioFocusManagerPlayerControl.IconCompatParcelizer(), audioFocusManagerPlayerControl.AudioAttributesCompatParcelizer());
        audioFocusManagerPlayerControl.RatingCompat();
        return zRemoteActionCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0138 A[PHI: r0 r8 r10 r11 r12
      0x0138: PHI (r0v1 java.lang.String[]) = 
      (r0v0 java.lang.String[])
      (r0v0 java.lang.String[])
      (r0v0 java.lang.String[])
      (r0v12 java.lang.String[])
      (r0v12 java.lang.String[])
     binds: [B:28:0x0057, B:29:0x0059, B:31:0x0067, B:81:0x0137, B:80:0x0135] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r8v2 boolean) = (r8v1 boolean), (r8v1 boolean), (r8v1 boolean), (r8v6 boolean), (r8v7 boolean) binds: [B:28:0x0057, B:29:0x0059, B:31:0x0067, B:81:0x0137, B:80:0x0135] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:28:0x0057, B:29:0x0059, B:31:0x0067, B:81:0x0137, B:80:0x0135] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r11v2 boolean) = (r11v1 boolean), (r11v1 boolean), (r11v1 boolean), (r11v5 boolean), (r11v5 boolean) binds: [B:28:0x0057, B:29:0x0059, B:31:0x0067, B:81:0x0137, B:80:0x0135] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r12v2 boolean) = (r12v1 boolean), (r12v1 boolean), (r12v1 boolean), (r12v5 boolean), (r12v5 boolean) binds: [B:28:0x0057, B:29:0x0059, B:31:0x0067, B:81:0x0137, B:80:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean RemoteActionCompatParcelizer(kotlin.hasPrevious r17, java.util.List<? extends kotlin.getChildIndexByChildUid> r18, java.lang.String[] r19, java.lang.String r20, kotlin.g2 r21) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultRenderersFactory.RemoteActionCompatParcelizer(o.hasPrevious, java.util.List, java.lang.String[], java.lang.String, o.g2):boolean");
    }
}
