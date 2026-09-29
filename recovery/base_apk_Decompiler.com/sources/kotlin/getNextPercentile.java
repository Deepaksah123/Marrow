package kotlin;

import androidx.fragment.app.Fragment;
import java.util.Map;
import kotlin.VisibilityChecker;

/* JADX INFO: loaded from: classes.dex */
public final class getNextPercentile {

    /* JADX INFO: loaded from: classes4.dex */
    public interface AudioAttributesCompatParcelizer {
        read RemoteActionCompatParcelizer();
    }

    /* JADX INFO: loaded from: classes4.dex */
    public interface IconCompatParcelizer {
        read write();
    }

    public static VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, VisibilityChecker.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return ((IconCompatParcelizer) FreeVideoListResponseLesson.RemoteActionCompatParcelizer(mediaBrowserCompatMediaItem, IconCompatParcelizer.class)).write().RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
    }

    public static VisibilityChecker.RemoteActionCompatParcelizer write(Fragment fragment, VisibilityChecker.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return ((AudioAttributesCompatParcelizer) FreeVideoListResponseLesson.RemoteActionCompatParcelizer(fragment, AudioAttributesCompatParcelizer.class)).RemoteActionCompatParcelizer().read(remoteActionCompatParcelizer);
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class read {
        private final Map<Class<?>, Boolean> AudioAttributesCompatParcelizer;
        private final GtaModel IconCompatParcelizer;

        @setSdkPayload
        read(Map<Class<?>, Boolean> map, GtaModel gtaModel) {
            this.AudioAttributesCompatParcelizer = map;
            this.IconCompatParcelizer = gtaModel;
        }

        final VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer(VisibilityChecker.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            return AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
        }

        final VisibilityChecker.RemoteActionCompatParcelizer read(VisibilityChecker.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            return AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
        }

        private VisibilityChecker.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(VisibilityChecker.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            return new setHighlighted(this.AudioAttributesCompatParcelizer, (VisibilityChecker.RemoteActionCompatParcelizer) getSubjScore.read(remoteActionCompatParcelizer), this.IconCompatParcelizer);
        }
    }
}
