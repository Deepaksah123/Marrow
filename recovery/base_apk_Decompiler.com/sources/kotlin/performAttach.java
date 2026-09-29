package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.getCurrentTrackSelections;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\n*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000b\u001a\u00020\n*\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u0002*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\r\u001a\u00020\n*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\r\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0016\u0010\r\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001d"}, d2 = {"Lo/performAttach;", "Lo/setHasOptionsMenu;", "", "p0", "<init>", "(I)V", "Lo/setExitTransition;", "", "Lo/requireParentFragment;", "p1", "", "read", "(Lo/setExitTransition;FLo/requireParentFragment;)V", "write", "(Lo/setExitTransition;Lo/requireParentFragment;)V", "Lo/setForegroundMode;", "(Lo/setForegroundMode;I)V", "IconCompatParcelizer", "()V", "", "AudioAttributesCompatParcelizer", "(Lo/requireParentFragment;Z)I", "(Lo/requireParentFragment;IZ)V", "I", "Lo/getCurrentTrackSelections$RemoteActionCompatParcelizer;", "Lo/getCurrentTrackSelections$RemoteActionCompatParcelizer;", "MediaBrowserCompatCustomActionResultReceiver", "Z", "RemoteActionCompatParcelizer", "F", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class performAttach implements setHasOptionsMenu {
    private getCurrentTrackSelections.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private boolean write;
    private int RemoteActionCompatParcelizer;
    private final int read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private float MediaBrowserCompatItemReceiver;

    public performAttach(int i) {
        this.read = i;
        this.IconCompatParcelizer = -1;
        this.RemoteActionCompatParcelizer = -1;
    }

    public /* synthetic */ performAttach(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 2 : i);
    }

    @Override // kotlin.setHasOptionsMenu
    public final void read(setExitTransition setexittransition, float f, requireParentFragment requireparentfragment) {
        getCurrentTrackSelections.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        getCurrentTrackSelections.RemoteActionCompatParcelizer remoteActionCompatParcelizer2;
        if (!requireparentfragment.AudioAttributesImplBaseParcelizer().isEmpty()) {
            boolean z = f < BitmapDescriptorFactory.HUE_RED;
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(requireparentfragment, z);
            if (iAudioAttributesCompatParcelizer >= 0 && iAudioAttributesCompatParcelizer < requireparentfragment.write()) {
                if (iAudioAttributesCompatParcelizer != this.IconCompatParcelizer) {
                    if (this.write != z) {
                        IconCompatParcelizer();
                    }
                    this.write = z;
                    this.IconCompatParcelizer = iAudioAttributesCompatParcelizer;
                    this.AudioAttributesCompatParcelizer = setExitTransition.read$default(setexittransition, iAudioAttributesCompatParcelizer, null, 2, null);
                }
                if (z) {
                    performPrimaryNavigationFragmentChanged performprimarynavigationfragmentchanged = (performPrimaryNavigationFragmentChanged) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) requireparentfragment.AudioAttributesImplBaseParcelizer());
                    if (((performprimarynavigationfragmentchanged.AudioAttributesCompatParcelizer() + performprimarynavigationfragmentchanged.RemoteActionCompatParcelizer()) + requireparentfragment.IconCompatParcelizer()) - requireparentfragment.MediaBrowserCompatItemReceiver() < (-f) && (remoteActionCompatParcelizer2 = this.AudioAttributesCompatParcelizer) != null) {
                        remoteActionCompatParcelizer2.write();
                    }
                } else if (requireparentfragment.MediaBrowserCompatCustomActionResultReceiver() - ((performPrimaryNavigationFragmentChanged) IntermediateLoginResponseBody.RatingCompat((List) requireparentfragment.AudioAttributesImplBaseParcelizer())).AudioAttributesCompatParcelizer() < f && (remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer) != null) {
                    remoteActionCompatParcelizer.write();
                }
            }
        }
        this.MediaBrowserCompatItemReceiver = f;
    }

    @Override // kotlin.setHasOptionsMenu
    public final void write(setExitTransition setexittransition, requireParentFragment requireparentfragment) {
        write(requireparentfragment, this.IconCompatParcelizer, this.write);
        int iWrite = requireparentfragment.write();
        int i = this.RemoteActionCompatParcelizer;
        if (i != -1 && this.MediaBrowserCompatItemReceiver != BitmapDescriptorFactory.HUE_RED && i != iWrite && !requireparentfragment.AudioAttributesImplBaseParcelizer().isEmpty()) {
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(requireparentfragment, this.MediaBrowserCompatItemReceiver < BitmapDescriptorFactory.HUE_RED);
            if (iAudioAttributesCompatParcelizer >= 0 && iAudioAttributesCompatParcelizer < iWrite) {
                this.IconCompatParcelizer = iAudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = setExitTransition.read$default(setexittransition, iAudioAttributesCompatParcelizer, null, 2, null);
            }
        }
        this.RemoteActionCompatParcelizer = iWrite;
    }

    @Override // kotlin.setHasOptionsMenu
    public final void read(setForegroundMode setforegroundmode, int i) {
        int write;
        if (setforegroundmode.getWrite() == -1) {
            write = this.read;
        } else {
            write = setforegroundmode.getWrite();
        }
        for (int i2 = 0; i2 < write; i2++) {
            setforegroundmode.IconCompatParcelizer(i + i2);
        }
    }

    private final void IconCompatParcelizer() {
        this.IconCompatParcelizer = -1;
        getCurrentTrackSelections.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        }
        this.AudioAttributesCompatParcelizer = null;
    }

    private final int AudioAttributesCompatParcelizer(requireParentFragment requireparentfragment, boolean z) {
        if (z) {
            return ((performPrimaryNavigationFragmentChanged) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) requireparentfragment.AudioAttributesImplBaseParcelizer())).read() + 1;
        }
        return ((performPrimaryNavigationFragmentChanged) IntermediateLoginResponseBody.RatingCompat((List) requireparentfragment.AudioAttributesImplBaseParcelizer())).read() - 1;
    }

    private final void write(requireParentFragment requireparentfragment, int i, boolean z) {
        if (i == -1 || requireparentfragment.AudioAttributesImplBaseParcelizer().isEmpty() || i == AudioAttributesCompatParcelizer(requireparentfragment, z)) {
            return;
        }
        IconCompatParcelizer();
    }

    public performAttach() {
        this(0, 1, null);
    }
}
