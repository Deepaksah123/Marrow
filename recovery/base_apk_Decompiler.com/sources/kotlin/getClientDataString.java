package kotlin;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.marrow.R;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.ThemeKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/getClientDataString;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getClientDataString extends getDisplayHint {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o.getClientDataString$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/getClientDataString$read;", "", "<init>", "()V", "", "p0", "p1", "Lo/readBlockToCache;", "p2", "", "p3", "p4", "Lo/getClientDataString;", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Lo/readBlockToCache;ILjava/lang/String;)Lo/getClientDataString;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getClientDataString IconCompatParcelizer(String p0, String p1, readBlockToCache p2, int p3, String p4) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p4, "");
            getClientDataString getclientdatastring = new getClientDataString();
            Bundle bundle = new Bundle();
            bundle.putString("step_id", p0);
            bundle.putString("lesson_title", p1);
            bundle.putSerializable("parent_type", p2);
            bundle.putInt("bookmark_start_index", p3);
            bundle.putString("bookmark_start_mcq_id", p4);
            getclientdatastring.setArguments(bundle);
            return getclientdatastring;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return setBitrateKbps.AudioAttributesCompatParcelizer(this, multiplyFft.IconCompatParcelizer(1621935864, true, new MagicModuleSubmissionRequestBody() { // from class: o.getRegisterData
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return getClientDataString.AudioAttributesCompatParcelizer(this.write, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(final getClientDataString getclientdatastring, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1621935864, i, -1, "com.marrow2.ui.qbank.play.QBankPlayFragment.onCreateView.<anonymous> (QBankPlayFragment.kt:90)");
            }
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(getclientdatastring);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.setRegisteredKeys
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return getClientDataString.write(this.IconCompatParcelizer);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            final getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objOnPause;
            maybeGetTypeVariable activity = getclientdatastring.getActivity();
            if (activity != null) {
                CmcdConfigurationRequestConfig.RemoteActionCompatParcelizer(activity, R.attr.backgroundColor);
            }
            ThemeKt.read((AppTheme) null, true, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(306994296, true, new MagicModuleSubmissionRequestBody() { // from class: o.setDisplayHint
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return getClientDataString.read(getcreatedondatems, getclientdatastring, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 432, 1);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getClientDataString getclientdatastring) {
        maybeGetTypeVariable activity = getclientdatastring.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getCreatedOnDateMs getcreatedondatems, final getClientDataString getclientdatastring, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(306994296, i, -1, "com.marrow2.ui.qbank.play.QBankPlayFragment.onCreateView.<anonymous>.<anonymous> (QBankPlayFragment.kt:95)");
            }
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(getclientdatastring);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.RegisterResponseData
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return getClientDataString.write(this.AudioAttributesCompatParcelizer, ((Integer) obj).intValue());
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            RequestParams.read(getcreatedondatems, (getAnswerMap) objOnPause, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getClientDataString getclientdatastring, int i) {
        maybeGetTypeVariable activity = getclientdatastring.getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            intent.putExtra("result_mcq_index", i);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            activity.setResult(-1, intent);
        }
        return getShowPopup.INSTANCE;
    }
}
