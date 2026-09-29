package kotlin;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioFocusManagerPlayerControl extends getChildTimelineUidFromConcatenatedUid {
    private final String AudioAttributesCompatParcelizer;
    private onTransact AudioAttributesImplApi21Parcelizer;
    private final List<? extends getChildIndexByChildUid> AudioAttributesImplApi26Parcelizer;
    private final List<AudioFocusManagerPlayerControl> AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private final hasPrevious MediaBrowserCompatCustomActionResultReceiver;
    private final List<String> RemoteActionCompatParcelizer;
    private final g2 read;
    private final List<String> write;

    static {
        n.write("WorkContinuationImpl");
    }

    public final hasPrevious MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final String IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final g2 AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final List<? extends getChildIndexByChildUid> AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final List<String> write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void RatingCompat() {
        this.IconCompatParcelizer = true;
    }

    public final List<AudioFocusManagerPlayerControl> RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public AudioFocusManagerPlayerControl(hasPrevious hasprevious, List<? extends getChildIndexByChildUid> list) {
        this(hasprevious, null, g2.read, list, (byte) 0);
    }

    public AudioFocusManagerPlayerControl(hasPrevious hasprevious, String str, g2 g2Var, List<? extends getChildIndexByChildUid> list) {
        this(hasprevious, str, g2Var, list, (byte) 0);
    }

    private AudioFocusManagerPlayerControl(hasPrevious hasprevious, String str, g2 g2Var, List<? extends getChildIndexByChildUid> list, byte b) {
        this.MediaBrowserCompatCustomActionResultReceiver = hasprevious;
        this.AudioAttributesCompatParcelizer = str;
        this.read = g2Var;
        this.AudioAttributesImplApi26Parcelizer = list;
        this.AudioAttributesImplBaseParcelizer = null;
        this.RemoteActionCompatParcelizer = new ArrayList(list.size());
        this.write = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (g2Var == g2.AudioAttributesCompatParcelizer && list.get(i).getRead().getOnFastForward() != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String strRemoteActionCompatParcelizer = list.get(i).RemoteActionCompatParcelizer();
            this.RemoteActionCompatParcelizer.add(strRemoteActionCompatParcelizer);
            this.write.add(strRemoteActionCompatParcelizer);
        }
    }

    public final onTransact read() {
        if (!this.IconCompatParcelizer) {
            getConcatenatedUid onFastForward = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().getOnFastForward();
            StringBuilder sb = new StringBuilder("EnqueueRunnable_");
            sb.append(AudioAttributesCompatParcelizer().name());
            this.AudioAttributesImplApi21Parcelizer = q.RemoteActionCompatParcelizer(onFastForward, sb.toString(), this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver().read(), new getCreatedOnDateMs() { // from class: o.AudioFocusManagerPlayerCommand
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer();
                }
            });
        } else {
            n.write();
            TextUtils.join(", ", this.RemoteActionCompatParcelizer);
        }
        return this.AudioAttributesImplApi21Parcelizer;
    }

    final /* synthetic */ getShowPopup AudioAttributesImplApi21Parcelizer() {
        DefaultRenderersFactory.AudioAttributesCompatParcelizer(this);
        return getShowPopup.INSTANCE;
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return write(this, new HashSet());
    }

    private static boolean write(AudioFocusManagerPlayerControl audioFocusManagerPlayerControl, Set<String> set) {
        set.addAll(audioFocusManagerPlayerControl.write());
        Set<String> setRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(audioFocusManagerPlayerControl);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (setRemoteActionCompatParcelizer.contains(it.next())) {
                return true;
            }
        }
        List<AudioFocusManagerPlayerControl> listRemoteActionCompatParcelizer = audioFocusManagerPlayerControl.RemoteActionCompatParcelizer();
        if (listRemoteActionCompatParcelizer != null && !listRemoteActionCompatParcelizer.isEmpty()) {
            Iterator<AudioFocusManagerPlayerControl> it2 = listRemoteActionCompatParcelizer.iterator();
            while (it2.hasNext()) {
                if (write(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(audioFocusManagerPlayerControl.write());
        return false;
    }

    public static Set<String> RemoteActionCompatParcelizer(AudioFocusManagerPlayerControl audioFocusManagerPlayerControl) {
        HashSet hashSet = new HashSet();
        List<AudioFocusManagerPlayerControl> listRemoteActionCompatParcelizer = audioFocusManagerPlayerControl.RemoteActionCompatParcelizer();
        if (listRemoteActionCompatParcelizer != null && !listRemoteActionCompatParcelizer.isEmpty()) {
            Iterator<AudioFocusManagerPlayerControl> it = listRemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().write());
            }
        }
        return hashSet;
    }
}
