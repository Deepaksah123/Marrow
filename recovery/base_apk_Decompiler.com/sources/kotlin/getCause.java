package kotlin;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.exoplayer2.RendererCapabilities;
import com.marrow.data.models.ResponseError;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.ThemeKt;
import com.marrow2.ui.qbank.score.model.RevisionSubjectUIModel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\n\u001a\u00020\u00168CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/getCause;", "Lo/argCount;", "<init>", "()V", "", "onStart", "Landroid/content/res/Configuration;", "p0", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "IconCompatParcelizer", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)V", "Lcom/marrow2/ui/qbank/score/model/RevisionSubjectUIModel;", "read", "Lo/RenewEligible;", "write", "()Lcom/marrow2/ui/qbank/score/model/RevisionSubjectUIModel;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getCause extends argCount {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final RenewEligible IconCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.setCloudProjectNumber
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return getCause.AudioAttributesImplApi21Parcelizer(this.read);
        }
    });

    private final RevisionSubjectUIModel write() {
        return (RevisionSubjectUIModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RevisionSubjectUIModel AudioAttributesImplApi21Parcelizer(getCause getcause) {
        Parcelable parcelable;
        Bundle bundleRequireArguments = getcause.requireArguments();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bundleRequireArguments, "");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) bundleRequireArguments.getParcelable("wor_data", RevisionSubjectUIModel.class);
        } else {
            parcelable = bundleRequireArguments.getParcelable("wor_data");
        }
        if (parcelable != null) {
            return (RevisionSubjectUIModel) parcelable;
        }
        throw new IllegalArgumentException("WORStatusUIModel argument missing".toString());
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        IconCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onConfigurationChanged(p0);
        IconCompatParcelizer();
    }

    private final void IconCompatParcelizer() {
        Window window;
        Window window2;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        if (!CmcdConfigurationRequestConfig.AudioAttributesImplApi21Parcelizer(contextRequireContext)) {
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            if (!CmcdConfigurationRequestConfig.IconCompatParcelizer(contextRequireContext2)) {
                Dialog dialog = getDialog();
                if (dialog == null || (window2 = dialog.getWindow()) == null) {
                    return;
                }
                window2.setLayout(-1, -2);
                return;
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        Context contextRequireContext3 = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
        window.setLayout(DataSourceBitmapLoaderExternalSyntheticLambda1.read(contextRequireContext3, ResponseError.NO_INTERNET_ERROR), -2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(multiplyFft.IconCompatParcelizer(855529179, true, new MagicModuleSubmissionRequestBody() { // from class: o.IntegrityTokenRequestBuilder
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return getCause.IconCompatParcelizer(this.RemoteActionCompatParcelizer, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(final getCause getcause, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(855529179, i, -1, "com.marrow2.ui.video.lesson_completion.RevisionVideoCompletedDialogFragment.onCreateView.<anonymous>.<anonymous> (RevisionVideoCompletedDialogFragment.kt:52)");
            }
            ThemeKt.read((AppTheme) null, false, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(-618516133, true, new MagicModuleSubmissionRequestBody() { // from class: o.cloudProjectNumber
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return getCause.RemoteActionCompatParcelizer(this.IconCompatParcelizer, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 3);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(final getCause getcause, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-618516133, i, -1, "com.marrow2.ui.video.lesson_completion.RevisionVideoCompletedDialogFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (RevisionVideoCompletedDialogFragment.kt:53)");
            }
            RevisionSubjectUIModel revisionSubjectUIModelWrite = getcause.write();
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(getcause);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.IntegrityTokenRequest
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return getCause.IconCompatParcelizer(this.read);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objOnPause;
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(getcause);
            Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer2 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getCreatedOnDateMs() { // from class: o.nonce
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return getCause.write(this.write);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
            }
            StandardIntegrityManagerStandardIntegrityToken.AudioAttributesCompatParcelizer(revisionSubjectUIModelWrite, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getCreatedOnDateMs<getShowPopup>) objOnPause2, _handleunrecognizedcharacterescape, 0, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getCause getcause) {
        getcause.RemoteActionCompatParcelizer("watch_next_subject");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getCause getcause) {
        getcause.RemoteActionCompatParcelizer("related_schema_clicked");
        return getShowPopup.INSTANCE;
    }

    private final void RemoteActionCompatParcelizer(String p0) {
        withAlwaysAsId.read(this, "wor_video_completed", _getIndexResolver.write(setAction.write("action", p0)));
        dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: o.getCause$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/getCause$write;", "", "<init>", "()V", "Lcom/marrow2/ui/qbank/score/model/RevisionSubjectUIModel;", "p0", "Lo/getCause;", "RemoteActionCompatParcelizer", "(Lcom/marrow2/ui/qbank/score/model/RevisionSubjectUIModel;)Lo/getCause;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getCause RemoteActionCompatParcelizer(RevisionSubjectUIModel p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            getCause getcause = new getCause();
            getcause.setArguments(_getIndexResolver.write(setAction.write("wor_data", p0)));
            return getcause;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
