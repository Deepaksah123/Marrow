package kotlin;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.exoplayer2.RendererCapabilities;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.ThemeKt;
import com.marrow2.ui.video.downloaded_videos.model.DownloadedCourseUIModel;
import com.marrow2.ui.video.downloaded_videos.model.MaxDownloadReachedArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.withPropertyNamingStrategy;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0003R\u001b\u0010\u0015\u001a\u00020\u00108CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/Slider;", "Lo/argCount;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onStart", "RemoteActionCompatParcelizer", "Lcom/marrow2/ui/video/downloaded_videos/model/MaxDownloadReachedArgs;", "AudioAttributesCompatParcelizer", "Lo/RenewEligible;", "IconCompatParcelizer", "()Lcom/marrow2/ui/video/downloaded_videos/model/MaxDownloadReachedArgs;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Slider extends argCount {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible read = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.TabItem
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return Slider.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
        }
    });

    private final MaxDownloadReachedArgs IconCompatParcelizer() {
        return (MaxDownloadReachedArgs) this.read.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaxDownloadReachedArgs RemoteActionCompatParcelizer(Slider slider) {
        MaxDownloadReachedArgs maxDownloadReachedArgs = (MaxDownloadReachedArgs) StdKeyDeserializerDelegatingKD.IconCompatParcelizer(slider.requireArguments(), "courses_state_key", MaxDownloadReachedArgs.class);
        return maxDownloadReachedArgs == null ? new MaxDownloadReachedArgs(0, null, false, 7, null) : maxDownloadReachedArgs;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(withPropertyNamingStrategy.AudioAttributesCompatParcelizer.INSTANCE);
        composeView.setContent(multiplyFft.IconCompatParcelizer(1082785578, true, new MagicModuleSubmissionRequestBody() { // from class: o.ExtendableSavedState
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return Slider.AudioAttributesCompatParcelizer(this.write, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(final Slider slider, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1082785578, i, -1, "com.marrow2.ui.video.downloaded_videos.dialog.MaxDownloadReachedDialogFragment.onCreateView.<anonymous>.<anonymous> (MaxDownloadReachedDialogFragment.kt:36)");
            }
            ThemeKt.read((AppTheme) null, false, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(1866519722, true, new MagicModuleSubmissionRequestBody() { // from class: o.BaseTransientBottomBarBehavior
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return Slider.write(this.read, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 3);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(final Slider slider, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1866519722, i, -1, "com.marrow2.ui.video.downloaded_videos.dialog.MaxDownloadReachedDialogFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (MaxDownloadReachedDialogFragment.kt:37)");
            }
            int audioAttributesCompatParcelizer = slider.IconCompatParcelizer().getAudioAttributesCompatParcelizer();
            List<DownloadedCourseUIModel> listAudioAttributesCompatParcelizer = slider.IconCompatParcelizer().AudioAttributesCompatParcelizer();
            boolean write = slider.IconCompatParcelizer().getWrite();
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(slider);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.SnackbarSnackbarLayout
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return Slider.read(this.RemoteActionCompatParcelizer);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objOnPause;
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(slider);
            Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer2 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getCreatedOnDateMs() { // from class: o.TabLayout
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return Slider.AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
            }
            setCustomThumbDrawablesForValues.read(audioAttributesCompatParcelizer, listAudioAttributesCompatParcelizer, write, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getCreatedOnDateMs<getShowPopup>) objOnPause2, (_handleOddName) null, _handleunrecognizedcharacterescape, 0, 32);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(Slider slider) {
        withAlwaysAsId.read(slider, "max_download_reached_request_key", _getIndexResolver.write(setAction.write("result_open_saved_videos", Boolean.TRUE)));
        slider.dismiss();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(Slider slider) {
        slider.dismiss();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        RemoteActionCompatParcelizer();
    }

    private final void RemoteActionCompatParcelizer() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setGravity(17);
    }

    /* JADX INFO: renamed from: o.Slider$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/Slider$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lcom/marrow2/ui/video/downloaded_videos/model/MaxDownloadReachedArgs;", "p0", "Lo/Slider;", "write", "(Lcom/marrow2/ui/video/downloaded_videos/model/MaxDownloadReachedArgs;)Lo/Slider;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Slider write(MaxDownloadReachedArgs p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Slider slider = new Slider();
            slider.setArguments(_getIndexResolver.write(setAction.write("courses_state_key", p0)));
            return slider;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
