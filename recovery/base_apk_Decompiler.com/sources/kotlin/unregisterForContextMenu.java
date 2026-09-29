package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.getCurrentTrackSelections;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\rJ\u001b\u0010\u000f\u001a\u00020\n*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\n*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u0002*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u000f\u001a\u00020\u0002*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u000f\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001e"}, d2 = {"Lo/unregisterForContextMenu;", "Lo/internalPathIteratorSize;", "", "p0", "<init>", "(I)V", "Lo/internalPathIteratorNext;", "", "Lo/FragmentManagerState;", "p1", "", "write", "(Lo/internalPathIteratorNext;FLo/FragmentManagerState;)V", "(Lo/internalPathIteratorNext;Lo/FragmentManagerState;)V", "Lo/setForegroundMode;", "AudioAttributesCompatParcelizer", "(Lo/setForegroundMode;I)V", "", "IconCompatParcelizer", "(Lo/FragmentManagerState;IZ)V", "read", "(Lo/FragmentManagerState;Z)I", "RemoteActionCompatParcelizer", "()V", "I", "Lo/UTF32Reader;", "Lo/getCurrentTrackSelections$RemoteActionCompatParcelizer;", "Lo/UTF32Reader;", "MediaBrowserCompatItemReceiver", "Z", "F", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class unregisterForContextMenu implements internalPathIteratorSize {
    private int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private float AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final UTF32Reader<getCurrentTrackSelections.RemoteActionCompatParcelizer> IconCompatParcelizer;

    public unregisterForContextMenu(int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = -1;
        this.IconCompatParcelizer = new UTF32Reader<>(new getCurrentTrackSelections.RemoteActionCompatParcelizer[16], 0);
        this.AudioAttributesCompatParcelizer = -1;
    }

    public /* synthetic */ unregisterForContextMenu(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 2 : i);
    }

    @Override // kotlin.internalPathIteratorSize
    public final void write(internalPathIteratorNext internalpathiteratornext, float f, FragmentManagerState fragmentManagerState) {
        if (!fragmentManagerState.AudioAttributesImplApi21Parcelizer().isEmpty()) {
            int i = 0;
            boolean z = f < BitmapDescriptorFactory.HUE_RED;
            int i2 = read(fragmentManagerState, z);
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(fragmentManagerState, z);
            if (iAudioAttributesCompatParcelizer >= 0 && iAudioAttributesCompatParcelizer < fragmentManagerState.write()) {
                if (i2 != this.read && i2 >= 0) {
                    if (this.write != z) {
                        UTF32Reader<getCurrentTrackSelections.RemoteActionCompatParcelizer> uTF32Reader = this.IconCompatParcelizer;
                        getCurrentTrackSelections.RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr = uTF32Reader.IconCompatParcelizer;
                        int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
                        for (int i3 = 0; i3 < audioAttributesCompatParcelizer; i3++) {
                            remoteActionCompatParcelizerArr[i3].AudioAttributesCompatParcelizer();
                        }
                    }
                    this.write = z;
                    this.read = i2;
                    this.IconCompatParcelizer.RemoteActionCompatParcelizer();
                    UTF32Reader<getCurrentTrackSelections.RemoteActionCompatParcelizer> uTF32Reader2 = this.IconCompatParcelizer;
                    uTF32Reader2.write(uTF32Reader2.getAudioAttributesCompatParcelizer(), internalpathiteratornext.write(i2));
                }
                if (z) {
                    onResumeFragments onresumefragments = (onResumeFragments) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) fragmentManagerState.AudioAttributesImplApi21Parcelizer());
                    if (((onPopulateAccessibilityEvent.AudioAttributesCompatParcelizer(onresumefragments, fragmentManagerState.RemoteActionCompatParcelizer()) + onPopulateAccessibilityEvent.IconCompatParcelizer(onresumefragments, fragmentManagerState.RemoteActionCompatParcelizer())) + fragmentManagerState.AudioAttributesCompatParcelizer()) - fragmentManagerState.MediaBrowserCompatCustomActionResultReceiver() < (-f)) {
                        UTF32Reader<getCurrentTrackSelections.RemoteActionCompatParcelizer> uTF32Reader3 = this.IconCompatParcelizer;
                        getCurrentTrackSelections.RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr2 = uTF32Reader3.IconCompatParcelizer;
                        int audioAttributesCompatParcelizer2 = uTF32Reader3.getAudioAttributesCompatParcelizer();
                        while (i < audioAttributesCompatParcelizer2) {
                            remoteActionCompatParcelizerArr2[i].write();
                            i++;
                        }
                    }
                } else if (fragmentManagerState.AudioAttributesImplBaseParcelizer() - onPopulateAccessibilityEvent.AudioAttributesCompatParcelizer((onResumeFragments) IntermediateLoginResponseBody.RatingCompat((List) fragmentManagerState.AudioAttributesImplApi21Parcelizer()), fragmentManagerState.RemoteActionCompatParcelizer()) < f) {
                    UTF32Reader<getCurrentTrackSelections.RemoteActionCompatParcelizer> uTF32Reader4 = this.IconCompatParcelizer;
                    getCurrentTrackSelections.RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr3 = uTF32Reader4.IconCompatParcelizer;
                    int audioAttributesCompatParcelizer3 = uTF32Reader4.getAudioAttributesCompatParcelizer();
                    while (i < audioAttributesCompatParcelizer3) {
                        remoteActionCompatParcelizerArr3[i].write();
                        i++;
                    }
                }
            }
        }
        this.AudioAttributesImplApi26Parcelizer = f;
    }

    @Override // kotlin.internalPathIteratorSize
    public final void write(internalPathIteratorNext internalpathiteratornext, FragmentManagerState fragmentManagerState) {
        IconCompatParcelizer(fragmentManagerState, this.read, this.write);
        int iWrite = fragmentManagerState.write();
        int i = this.AudioAttributesCompatParcelizer;
        if (i != -1 && this.AudioAttributesImplApi26Parcelizer != BitmapDescriptorFactory.HUE_RED && i != iWrite && !fragmentManagerState.AudioAttributesImplApi21Parcelizer().isEmpty()) {
            int i2 = read(fragmentManagerState, this.AudioAttributesImplApi26Parcelizer < BitmapDescriptorFactory.HUE_RED);
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(fragmentManagerState, this.AudioAttributesImplApi26Parcelizer < BitmapDescriptorFactory.HUE_RED);
            if (iAudioAttributesCompatParcelizer >= 0 && iAudioAttributesCompatParcelizer < fragmentManagerState.write() && i2 != this.read && i2 >= 0) {
                this.read = i2;
                this.IconCompatParcelizer.RemoteActionCompatParcelizer();
                UTF32Reader<getCurrentTrackSelections.RemoteActionCompatParcelizer> uTF32Reader = this.IconCompatParcelizer;
                uTF32Reader.write(uTF32Reader.getAudioAttributesCompatParcelizer(), internalpathiteratornext.write(i2));
            }
        }
        this.AudioAttributesCompatParcelizer = iWrite;
    }

    @Override // kotlin.internalPathIteratorSize
    public final void AudioAttributesCompatParcelizer(setForegroundMode setforegroundmode, int i) {
        int write;
        if (setforegroundmode.getWrite() == -1) {
            write = this.RemoteActionCompatParcelizer;
        } else {
            write = setforegroundmode.getWrite();
        }
        for (int i2 = 0; i2 < write; i2++) {
            setforegroundmode.IconCompatParcelizer(i + i2);
        }
    }

    private final void IconCompatParcelizer(FragmentManagerState fragmentManagerState, int i, boolean z) {
        if (i == -1 || fragmentManagerState.AudioAttributesImplApi21Parcelizer().isEmpty() || i == read(fragmentManagerState, z)) {
            return;
        }
        RemoteActionCompatParcelizer();
    }

    private final int read(FragmentManagerState fragmentManagerState, boolean z) {
        if (z) {
            onResumeFragments onresumefragments = (onResumeFragments) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) fragmentManagerState.AudioAttributesImplApi21Parcelizer());
            return (fragmentManagerState.RemoteActionCompatParcelizer() == superDispatchKeyEvent.write ? onresumefragments.IconCompatParcelizer() : onresumefragments.RemoteActionCompatParcelizer()) + 1;
        }
        onResumeFragments onresumefragments2 = (onResumeFragments) IntermediateLoginResponseBody.RatingCompat((List) fragmentManagerState.AudioAttributesImplApi21Parcelizer());
        return (fragmentManagerState.RemoteActionCompatParcelizer() == superDispatchKeyEvent.write ? onresumefragments2.IconCompatParcelizer() : onresumefragments2.RemoteActionCompatParcelizer()) - 1;
    }

    private final int AudioAttributesCompatParcelizer(FragmentManagerState fragmentManagerState, boolean z) {
        if (z) {
            return ((onResumeFragments) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) fragmentManagerState.AudioAttributesImplApi21Parcelizer())).read() + 1;
        }
        return ((onResumeFragments) IntermediateLoginResponseBody.RatingCompat((List) fragmentManagerState.AudioAttributesImplApi21Parcelizer())).read() - 1;
    }

    private final void RemoteActionCompatParcelizer() {
        this.read = -1;
        UTF32Reader<getCurrentTrackSelections.RemoteActionCompatParcelizer> uTF32Reader = this.IconCompatParcelizer;
        getCurrentTrackSelections.RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr = uTF32Reader.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            remoteActionCompatParcelizerArr[i].AudioAttributesCompatParcelizer();
        }
        this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public unregisterForContextMenu() {
        this(0, 1, null);
    }
}
