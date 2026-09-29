package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.marrow.designsystem.theme.AppTheme;
import kotlin.Metadata;
import kotlin.zadb;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/setMenuGravity;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setMenuGravity extends NavigationRailMenuView {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return setBitrateKbps.AudioAttributesCompatParcelizer(this, multiplyFft.IconCompatParcelizer(-1246707206, true, new MagicModuleSubmissionRequestBody() { // from class: o.setAnimatorDurationScaleProvider
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return setMenuGravity.IconCompatParcelizer(this.read, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(final setMenuGravity setmenugravity, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1246707206, i, -1, "com.marrow2.ui.theme.fragment.ThemeSelectionFragment.onCreateView.<anonymous> (ThemeSelectionFragment.kt:61)");
            }
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(setmenugravity);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.NavigationRailView
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setMenuGravity.AudioAttributesCompatParcelizer(this.write);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            setIndeterminateDrawable.RemoteActionCompatParcelizer((getCreatedOnDateMs<getShowPopup>) objOnPause, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(setMenuGravity setmenugravity) {
        zadb.Companion companion = zadb.INSTANCE;
        Context contextRequireContext = setmenugravity.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        Intent intentWrite = zadb.Companion.write(contextRequireContext);
        intentWrite.setFlags(268468224);
        setmenugravity.startActivity(intentWrite);
        maybeGetTypeVariable activity = setmenugravity.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.setMenuGravity$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setMenuGravity$IconCompatParcelizer;", "", "<init>", "()V", "Lcom/marrow/designsystem/theme/AppTheme;", "p0", "Lo/setMenuGravity;", "write", "(Lcom/marrow/designsystem/theme/AppTheme;)Lo/setMenuGravity;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static setMenuGravity write(AppTheme p0) {
            setMenuGravity setmenugravity = new setMenuGravity();
            Bundle bundle = new Bundle();
            bundle.putSerializable("pre_selected_theme", p0);
            setmenugravity.setArguments(bundle);
            return setmenugravity;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
