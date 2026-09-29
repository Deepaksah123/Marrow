package kotlin;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.AccessorNamingStrategy;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getMimeTypeFromTag {
    final TextInputLayout IconCompatParcelizer;
    final Context RemoteActionCompatParcelizer;
    final parseBitmapInfoHeader read;
    final CheckableImageButton write;

    int AudioAttributesCompatParcelizer() {
        return 0;
    }

    void AudioAttributesCompatParcelizer(EditText editText) {
    }

    View.OnClickListener IconCompatParcelizer() {
        return null;
    }

    public void IconCompatParcelizer(hasSuperClassStartingWith hassuperclassstartingwith) {
    }

    void MediaBrowserCompatCustomActionResultReceiver() {
    }

    View.OnFocusChangeListener MediaBrowserCompatItemReceiver() {
        return null;
    }

    boolean MediaDescriptionCompat() {
        return false;
    }

    boolean MediaMetadataCompat() {
        return false;
    }

    void RatingCompat() {
    }

    int RemoteActionCompatParcelizer() {
        return 0;
    }

    AccessorNamingStrategy.IconCompatParcelizer aa_() {
        return null;
    }

    boolean ab_() {
        return false;
    }

    boolean ac_() {
        return false;
    }

    void onAddQueueItem() {
    }

    boolean onCommand() {
        return false;
    }

    void read() {
    }

    void read(boolean z) {
    }

    View.OnFocusChangeListener write() {
        return null;
    }

    public void write(AccessibilityEvent accessibilityEvent) {
    }

    boolean write(int i) {
        return true;
    }

    getMimeTypeFromTag(parseBitmapInfoHeader parsebitmapinfoheader) {
        this.IconCompatParcelizer = parsebitmapinfoheader.write;
        this.read = parsebitmapinfoheader;
        this.RemoteActionCompatParcelizer = parsebitmapinfoheader.getContext();
        this.write = parsebitmapinfoheader.RemoteActionCompatParcelizer();
    }

    final void handleMediaPlayPauseIfPendingOnHandler() {
        this.read.read(false);
    }
}
