package kotlin;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class ParcelableVolumeInfo {
    private static final ViewGroup.LayoutParams RemoteActionCompatParcelizer = new ViewGroup.LayoutParams(-2, -2);

    /* JADX INFO: Access modifiers changed from: private */
    public static void write(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, convertNumberToLong convertnumbertolong, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody) {
        View childAt = ((ViewGroup) mediaBrowserCompatMediaItem.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(magicModuleSubmissionRequestBody);
            return;
        }
        ComposeView composeView2 = new ComposeView(mediaBrowserCompatMediaItem, null, 0, 6, null);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(magicModuleSubmissionRequestBody);
        IconCompatParcelizer(mediaBrowserCompatMediaItem);
        mediaBrowserCompatMediaItem.setContentView(composeView2, RemoteActionCompatParcelizer);
    }

    private static final void IconCompatParcelizer(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
        View decorView = mediaBrowserCompatMediaItem.getWindow().getDecorView();
        if (isCreatorVisible.write(decorView) == null) {
            isCreatorVisible.IconCompatParcelizer(decorView, mediaBrowserCompatMediaItem);
        }
        if (isFieldVisible.write(decorView) == null) {
            isFieldVisible.AudioAttributesCompatParcelizer(decorView, mediaBrowserCompatMediaItem);
        }
        if (setCenterTextRadiusPercent.IconCompatParcelizer(decorView) == null) {
            setCenterTextRadiusPercent.read(decorView, mediaBrowserCompatMediaItem);
        }
    }
}
