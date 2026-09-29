package kotlin;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class indexOfTerminator {
    private final decodeCommentFrame AudioAttributesCompatParcelizer;
    private final decodeUrlLinkFrame AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final hasSamples AudioAttributesImplBaseParcelizer;
    private final validateFrames IconCompatParcelizer;
    private final Set<EventMessage1> MediaBrowserCompatCustomActionResultReceiver;
    private final ScheduledExecutorService MediaBrowserCompatItemReceiver;
    private final FirebaseApp RemoteActionCompatParcelizer;
    private final Context read;
    private final decodeTextInformationFrame write;

    public indexOfTerminator(FirebaseApp firebaseApp, hasSamples hassamples, decodeTextInformationFrame decodetextinformationframe, decodeCommentFrame decodecommentframe, Context context, String str, decodeUrlLinkFrame decodeurllinkframe, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.MediaBrowserCompatCustomActionResultReceiver = linkedHashSet;
        this.IconCompatParcelizer = new validateFrames(firebaseApp, hassamples, decodetextinformationframe, decodecommentframe, context, str, linkedHashSet, decodeurllinkframe, scheduledExecutorService);
        this.RemoteActionCompatParcelizer = firebaseApp;
        this.write = decodetextinformationframe;
        this.AudioAttributesImplBaseParcelizer = hassamples;
        this.AudioAttributesCompatParcelizer = decodecommentframe;
        this.read = context;
        this.AudioAttributesImplApi26Parcelizer = str;
        this.AudioAttributesImplApi21Parcelizer = decodeurllinkframe;
        this.MediaBrowserCompatItemReceiver = scheduledExecutorService;
    }

    private void IconCompatParcelizer() {
        synchronized (this) {
            if (!this.MediaBrowserCompatCustomActionResultReceiver.isEmpty()) {
                this.IconCompatParcelizer.RemoteActionCompatParcelizer();
            }
        }
    }

    public final void read(boolean z) {
        synchronized (this) {
            this.IconCompatParcelizer.IconCompatParcelizer(z);
            if (!z) {
                IconCompatParcelizer();
            }
        }
    }
}
