package kotlin;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes3.dex */
final class FlacBinarySearchSeeker1 extends getMimeTypeFromTag {
    private EditText AudioAttributesCompatParcelizer;
    private final View.OnClickListener AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplBaseParcelizer;

    @Override // kotlin.getMimeTypeFromTag
    final boolean MediaMetadataCompat() {
        return true;
    }

    final /* synthetic */ void MediaBrowserCompatMediaItem() {
        EditText editText = this.AudioAttributesCompatParcelizer;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (MediaBrowserCompatSearchResultReceiver()) {
            this.AudioAttributesCompatParcelizer.setTransformationMethod(null);
        } else {
            this.AudioAttributesCompatParcelizer.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            this.AudioAttributesCompatParcelizer.setSelection(selectionEnd);
        }
        handleMediaPlayPauseIfPendingOnHandler();
    }

    FlacBinarySearchSeeker1(parseBitmapInfoHeader parsebitmapinfoheader, int i) {
        super(parsebitmapinfoheader);
        this.AudioAttributesImplBaseParcelizer = calculateNextSearchBytePosition.MediaBrowserCompatItemReceiver.design_password_eye;
        this.AudioAttributesImplApi21Parcelizer = new View.OnClickListener() { // from class: o.findNextFrame
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.IconCompatParcelizer.MediaBrowserCompatMediaItem();
            }
        };
        if (i != 0) {
            this.AudioAttributesImplBaseParcelizer = i;
        }
    }

    @Override // kotlin.getMimeTypeFromTag
    final void MediaBrowserCompatCustomActionResultReceiver() {
        if (write(this.AudioAttributesCompatParcelizer)) {
            this.AudioAttributesCompatParcelizer.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // kotlin.getMimeTypeFromTag
    final void RatingCompat() {
        EditText editText = this.AudioAttributesCompatParcelizer;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // kotlin.getMimeTypeFromTag
    final int AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.getMimeTypeFromTag
    final int RemoteActionCompatParcelizer() {
        return calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.password_toggle_content_description;
    }

    @Override // kotlin.getMimeTypeFromTag
    final boolean MediaDescriptionCompat() {
        return !MediaBrowserCompatSearchResultReceiver();
    }

    @Override // kotlin.getMimeTypeFromTag
    final View.OnClickListener IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.getMimeTypeFromTag
    final void AudioAttributesCompatParcelizer(EditText editText) {
        this.AudioAttributesCompatParcelizer = editText;
        handleMediaPlayPauseIfPendingOnHandler();
    }

    @Override // kotlin.getMimeTypeFromTag
    final void onAddQueueItem() {
        handleMediaPlayPauseIfPendingOnHandler();
    }

    private boolean MediaBrowserCompatSearchResultReceiver() {
        EditText editText = this.AudioAttributesCompatParcelizer;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean write(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }
}
