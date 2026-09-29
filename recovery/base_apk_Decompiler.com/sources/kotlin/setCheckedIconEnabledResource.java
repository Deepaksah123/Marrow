package kotlin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.marrow.R;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.ThemeKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/setCheckedIconEnabledResource;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setCheckedIconEnabledResource extends Chip {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o.setCheckedIconEnabledResource$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/setCheckedIconEnabledResource$read;", "", "<init>", "()V", "", "p0", "Lo/readBlockToCache;", "p1", "Lo/setCheckedIconEnabledResource;", "IconCompatParcelizer", "(Ljava/lang/String;Lo/readBlockToCache;)Lo/setCheckedIconEnabledResource;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static setCheckedIconEnabledResource IconCompatParcelizer(String p0, readBlockToCache p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            setCheckedIconEnabledResource setcheckediconenabledresource = new setCheckedIconEnabledResource();
            Bundle bundle = new Bundle();
            bundle.putString("testId", p0);
            bundle.putSerializable("parent_type", p1);
            setcheckediconenabledresource.setArguments(bundle);
            return setcheckediconenabledresource;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return setBitrateKbps.AudioAttributesCompatParcelizer(this, multiplyFft.IconCompatParcelizer(-2143530893, true, new MagicModuleSubmissionRequestBody() { // from class: o.setCheckedIconTintResource
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return setCheckedIconEnabledResource.AudioAttributesCompatParcelizer(this.write, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(final setCheckedIconEnabledResource setcheckediconenabledresource, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-2143530893, i, -1, "com.marrow2.ui.test.testplay.TestPlayFragment.onCreateView.<anonymous> (TestPlayFragment.kt:70)");
            }
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(setcheckediconenabledresource);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.setAccessibilityClassName
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setCheckedIconEnabledResource.IconCompatParcelizer(this.write);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            final getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objOnPause;
            maybeGetTypeVariable activity = setcheckediconenabledresource.getActivity();
            if (activity != null) {
                CmcdConfigurationRequestConfig.RemoteActionCompatParcelizer(activity, R.attr.backgroundColor);
            }
            ThemeKt.read((AppTheme) null, true, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(42953459, true, new MagicModuleSubmissionRequestBody() { // from class: o.setChipBackgroundColorResource
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setCheckedIconEnabledResource.read(getcreatedondatems, setcheckediconenabledresource, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 432, 1);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(setCheckedIconEnabledResource setcheckediconenabledresource) {
        maybeGetTypeVariable activity = setcheckediconenabledresource.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getCreatedOnDateMs getcreatedondatems, final setCheckedIconEnabledResource setcheckediconenabledresource, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(42953459, i, -1, "com.marrow2.ui.test.testplay.TestPlayFragment.onCreateView.<anonymous>.<anonymous> (TestPlayFragment.kt:75)");
            }
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(setcheckediconenabledresource);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.setChipCornerRadiusResource
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setCheckedIconEnabledResource.read(this.read);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            setCheckedIconVisible.AudioAttributesCompatParcelizer((getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getCreatedOnDateMs<getShowPopup>) objOnPause, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(setCheckedIconEnabledResource setcheckediconenabledresource) {
        setcheckediconenabledresource.requireActivity().setResult(-1);
        return getShowPopup.INSTANCE;
    }
}
