package kotlin;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.marrow.R;
import com.marrow.ui.activities.learn.video.overlay.SettingsItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.getFontSize;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/setFontSizeUnit;", "Lo/getFontSize;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "onGetLayoutInflater", "(Landroid/os/Bundle;)Landroid/view/LayoutInflater;", "Landroid/view/View;", "p1", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "getTheme", "()I", "Landroid/content/DialogInterface;", "onDismiss", "(Landroid/content/DialogInterface;)V", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setFontSizeUnit extends getFontSize {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // kotlin.getFontSize, kotlin.argCount
    public final int getTheme() {
        return R.style.AppThemeV2_Dark_Dialog;
    }

    @Override // kotlin.argCount
    public final Dialog onCreateDialog(Bundle p0) {
        readMoviChunks readmovichunks = new readMoviChunks(requireContext(), getTheme());
        readmovichunks.setCanceledOnTouchOutside(true);
        return readmovichunks;
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle p0) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(layoutInflaterOnGetLayoutInflater, "");
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(new initializeViewTreeOwners(requireContext(), R.style.AppThemeV2_Dark_Dialog));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(layoutInflaterCloneInContext, "");
        return layoutInflaterCloneInContext;
    }

    @Override // kotlin.getFontSize, androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        ViewGroup.LayoutParams layoutParams = RemoteActionCompatParcelizer().IconCompatParcelizer().getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -1;
        RemoteActionCompatParcelizer().IconCompatParcelizer().setLayoutParams(layoutParams);
    }

    @Override // kotlin.argCount, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onDismiss(p0);
    }

    /* JADX INFO: renamed from: o.setFontSizeUnit$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007¨\u0006\r"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/settings/SettingsSideSheet$Companion;", "", "<init>", "()V", "newInstance", "Lcom/marrow/ui/activities/learn/video/overlay/settings/SettingsSideSheet;", "title", "", "rows", "Ljava/util/ArrayList;", "Lcom/marrow/ui/activities/learn/video/overlay/SettingsItem;", "Lkotlin/collections/ArrayList;", "resultKey", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static setFontSizeUnit read(String str, ArrayList<SettingsItem> arrayList, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(arrayList, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            setFontSizeUnit setfontsizeunit = new setFontSizeUnit();
            getFontSize.IconCompatParcelizer iconCompatParcelizer = getFontSize.read;
            setfontsizeunit.setArguments(getFontSize.IconCompatParcelizer.IconCompatParcelizer(str, arrayList, str2));
            return setfontsizeunit;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final setFontSizeUnit AudioAttributesCompatParcelizer(String str, ArrayList<SettingsItem> arrayList, String str2) {
        return Companion.read(str, arrayList, str2);
    }
}
