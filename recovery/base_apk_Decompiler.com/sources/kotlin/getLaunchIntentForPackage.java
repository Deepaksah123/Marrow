package kotlin;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class getLaunchIntentForPackage extends RecyclerView.MediaBrowserCompatSearchResultReceiver {
    private int AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private final RecyclerView AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private ViewPager2.write IconCompatParcelizer;
    private final LinearLayoutManager MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private final ViewPager2 MediaBrowserCompatMediaItem;
    private AudioAttributesCompatParcelizer MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private boolean RemoteActionCompatParcelizer;
    private int read;
    private boolean write;

    public getLaunchIntentForPackage(ViewPager2 viewPager2) {
        this.MediaBrowserCompatMediaItem = viewPager2;
        RecyclerView recyclerView = viewPager2.write;
        this.AudioAttributesImplApi26Parcelizer = recyclerView;
        this.MediaBrowserCompatCustomActionResultReceiver = (LinearLayoutManager) recyclerView.AudioAttributesImplApi21Parcelizer();
        this.MediaDescriptionCompat = new AudioAttributesCompatParcelizer();
        MediaBrowserCompatItemReceiver();
    }

    private void MediaBrowserCompatItemReceiver() {
        this.read = 0;
        this.MediaBrowserCompatItemReceiver = 0;
        this.MediaDescriptionCompat.AudioAttributesCompatParcelizer();
        this.AudioAttributesCompatParcelizer = -1;
        this.MediaMetadataCompat = -1;
        this.RemoteActionCompatParcelizer = false;
        this.AudioAttributesImplBaseParcelizer = false;
        this.AudioAttributesImplApi21Parcelizer = false;
        this.write = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatSearchResultReceiver
    public final void AudioAttributesCompatParcelizer(RecyclerView recyclerView, int i) {
        if ((this.read != 1 || this.MediaBrowserCompatItemReceiver != 1) && i == 1) {
            AudioAttributesImplApi21Parcelizer();
            return;
        }
        if (MediaBrowserCompatCustomActionResultReceiver() && i == 2) {
            if (this.AudioAttributesImplBaseParcelizer) {
                read(2);
                this.RemoteActionCompatParcelizer = true;
                return;
            }
            return;
        }
        if (MediaBrowserCompatCustomActionResultReceiver() && i == 0) {
            AudioAttributesImplBaseParcelizer();
            if (!this.AudioAttributesImplBaseParcelizer) {
                if (this.MediaDescriptionCompat.read != -1) {
                    RemoteActionCompatParcelizer(this.MediaDescriptionCompat.read, BitmapDescriptorFactory.HUE_RED, 0);
                }
            } else if (this.MediaDescriptionCompat.write == 0) {
                if (this.AudioAttributesCompatParcelizer != this.MediaDescriptionCompat.read) {
                    AudioAttributesCompatParcelizer(this.MediaDescriptionCompat.read);
                }
            }
            read(0);
            MediaBrowserCompatItemReceiver();
        }
        if (this.read == 2 && i == 0 && this.write) {
            AudioAttributesImplBaseParcelizer();
            if (this.MediaDescriptionCompat.write == 0) {
                if (this.MediaMetadataCompat != this.MediaDescriptionCompat.read) {
                    AudioAttributesCompatParcelizer(this.MediaDescriptionCompat.read == -1 ? 0 : this.MediaDescriptionCompat.read);
                }
                read(0);
                MediaBrowserCompatItemReceiver();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041 A[PHI: r5
      0x0041: PHI (r5v5 int) = (r5v3 int), (r5v4 int), (r5v22 int) binds: [B:22:0x003e, B:23:0x0040, B:17:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatSearchResultReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void RemoteActionCompatParcelizer(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.AudioAttributesImplBaseParcelizer = r4
            r3.AudioAttributesImplBaseParcelizer()
            boolean r0 = r3.RemoteActionCompatParcelizer
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L36
            r3.RemoteActionCompatParcelizer = r2
            if (r6 > 0) goto L1f
            if (r6 != 0) goto L2b
            if (r5 >= 0) goto L16
            r5 = r4
            goto L17
        L16:
            r5 = r2
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.MediaBrowserCompatMediaItem
            boolean r6 = r6.AudioAttributesImplApi26Parcelizer()
            if (r5 != r6) goto L2b
        L1f:
            o.getLaunchIntentForPackage$AudioAttributesCompatParcelizer r5 = r3.MediaDescriptionCompat
            int r5 = r5.write
            if (r5 == 0) goto L2b
            o.getLaunchIntentForPackage$AudioAttributesCompatParcelizer r5 = r3.MediaDescriptionCompat
            int r5 = r5.read
            int r5 = r5 + r4
            goto L2f
        L2b:
            o.getLaunchIntentForPackage$AudioAttributesCompatParcelizer r5 = r3.MediaDescriptionCompat
            int r5 = r5.read
        L2f:
            r3.MediaMetadataCompat = r5
            int r6 = r3.AudioAttributesCompatParcelizer
            if (r6 == r5) goto L44
            goto L41
        L36:
            int r5 = r3.read
            if (r5 != 0) goto L44
            o.getLaunchIntentForPackage$AudioAttributesCompatParcelizer r5 = r3.MediaDescriptionCompat
            int r5 = r5.read
            if (r5 != r1) goto L41
            r5 = r2
        L41:
            r3.AudioAttributesCompatParcelizer(r5)
        L44:
            o.getLaunchIntentForPackage$AudioAttributesCompatParcelizer r5 = r3.MediaDescriptionCompat
            int r5 = r5.read
            if (r5 != r1) goto L4c
            r5 = r2
            goto L50
        L4c:
            o.getLaunchIntentForPackage$AudioAttributesCompatParcelizer r5 = r3.MediaDescriptionCompat
            int r5 = r5.read
        L50:
            o.getLaunchIntentForPackage$AudioAttributesCompatParcelizer r6 = r3.MediaDescriptionCompat
            float r6 = r6.AudioAttributesCompatParcelizer
            o.getLaunchIntentForPackage$AudioAttributesCompatParcelizer r0 = r3.MediaDescriptionCompat
            int r0 = r0.write
            r3.RemoteActionCompatParcelizer(r5, r6, r0)
            o.getLaunchIntentForPackage$AudioAttributesCompatParcelizer r5 = r3.MediaDescriptionCompat
            int r5 = r5.read
            int r6 = r3.MediaMetadataCompat
            if (r5 == r6) goto L65
            if (r6 != r1) goto L75
        L65:
            o.getLaunchIntentForPackage$AudioAttributesCompatParcelizer r5 = r3.MediaDescriptionCompat
            int r5 = r5.write
            if (r5 != 0) goto L75
            int r5 = r3.MediaBrowserCompatItemReceiver
            if (r5 == r4) goto L75
            r3.read(r2)
            r3.MediaBrowserCompatItemReceiver()
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getLaunchIntentForPackage.RemoteActionCompatParcelizer(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    private void AudioAttributesImplBaseParcelizer() {
        int top;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaDescriptionCompat;
        audioAttributesCompatParcelizer.read = this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver();
        if (audioAttributesCompatParcelizer.read == -1) {
            audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            return;
        }
        View viewWrite = this.MediaBrowserCompatCustomActionResultReceiver.write(audioAttributesCompatParcelizer.read);
        if (viewWrite == null) {
            audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            return;
        }
        int iMediaBrowserCompatSearchResultReceiver = LinearLayoutManager.MediaBrowserCompatSearchResultReceiver(viewWrite);
        int iHandleMediaPlayPauseIfPendingOnHandler = LinearLayoutManager.handleMediaPlayPauseIfPendingOnHandler(viewWrite);
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = LinearLayoutManager.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(viewWrite);
        int iAudioAttributesImplApi26Parcelizer = LinearLayoutManager.AudioAttributesImplApi26Parcelizer(viewWrite);
        ViewGroup.LayoutParams layoutParams = viewWrite.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            iMediaBrowserCompatSearchResultReceiver += marginLayoutParams.leftMargin;
            iHandleMediaPlayPauseIfPendingOnHandler += marginLayoutParams.rightMargin;
            iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver += marginLayoutParams.topMargin;
            iAudioAttributesImplApi26Parcelizer += marginLayoutParams.bottomMargin;
        }
        int height = viewWrite.getHeight() + iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + iAudioAttributesImplApi26Parcelizer;
        int width = viewWrite.getWidth();
        if (this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatSearchResultReceiver() == 0) {
            top = (viewWrite.getLeft() - iMediaBrowserCompatSearchResultReceiver) - this.AudioAttributesImplApi26Parcelizer.getPaddingLeft();
            if (this.MediaBrowserCompatMediaItem.AudioAttributesImplApi26Parcelizer()) {
                top = -top;
            }
            height = width + iMediaBrowserCompatSearchResultReceiver + iHandleMediaPlayPauseIfPendingOnHandler;
        } else {
            top = (viewWrite.getTop() - iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) - this.AudioAttributesImplApi26Parcelizer.getPaddingTop();
        }
        audioAttributesCompatParcelizer.write = -top;
        if (audioAttributesCompatParcelizer.write < 0) {
            if (new getDefaultActivityIcon(this.MediaBrowserCompatCustomActionResultReceiver).AudioAttributesCompatParcelizer()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(audioAttributesCompatParcelizer.write)));
        }
        audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = height == 0 ? BitmapDescriptorFactory.HUE_RED : audioAttributesCompatParcelizer.write / height;
    }

    private void AudioAttributesImplApi21Parcelizer() {
        this.AudioAttributesImplApi21Parcelizer = false;
        this.read = 1;
        int i = this.MediaMetadataCompat;
        if (i != -1) {
            this.AudioAttributesCompatParcelizer = i;
            this.MediaMetadataCompat = -1;
        } else if (this.AudioAttributesCompatParcelizer == -1) {
            this.AudioAttributesCompatParcelizer = AudioAttributesImplApi26Parcelizer();
        }
        read(1);
    }

    public final void IconCompatParcelizer() {
        this.write = true;
    }

    public final void write(int i, boolean z) {
        this.read = z ? 2 : 3;
        this.AudioAttributesImplApi21Parcelizer = false;
        boolean z2 = this.MediaMetadataCompat != i;
        this.MediaMetadataCompat = i;
        read(2);
        if (z2) {
            AudioAttributesCompatParcelizer(i);
        }
    }

    public final void RemoteActionCompatParcelizer(ViewPager2.write writeVar) {
        this.IconCompatParcelizer = writeVar;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final boolean read() {
        return this.MediaBrowserCompatItemReceiver == 0;
    }

    final boolean write() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    private boolean MediaBrowserCompatCustomActionResultReceiver() {
        int i = this.read;
        return i == 1 || i == 4;
    }

    public final double AudioAttributesCompatParcelizer() {
        AudioAttributesImplBaseParcelizer();
        return ((double) this.MediaDescriptionCompat.read) + ((double) this.MediaDescriptionCompat.AudioAttributesCompatParcelizer);
    }

    private void read(int i) {
        if ((this.read == 3 && this.MediaBrowserCompatItemReceiver == 0) || this.MediaBrowserCompatItemReceiver == i) {
            return;
        }
        this.MediaBrowserCompatItemReceiver = i;
        ViewPager2.write writeVar = this.IconCompatParcelizer;
        if (writeVar != null) {
            writeVar.AudioAttributesCompatParcelizer(i);
        }
    }

    private void AudioAttributesCompatParcelizer(int i) {
        ViewPager2.write writeVar = this.IconCompatParcelizer;
        if (writeVar != null) {
            writeVar.RemoteActionCompatParcelizer(i);
        }
    }

    private void RemoteActionCompatParcelizer(int i, float f, int i2) {
        ViewPager2.write writeVar = this.IconCompatParcelizer;
        if (writeVar != null) {
            writeVar.AudioAttributesCompatParcelizer(i, f, i2);
        }
    }

    private int AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver();
    }

    static final class AudioAttributesCompatParcelizer {
        float AudioAttributesCompatParcelizer;
        int read;
        int write;

        AudioAttributesCompatParcelizer() {
        }

        final void AudioAttributesCompatParcelizer() {
            this.read = -1;
            this.AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
            this.write = 0;
        }
    }
}
