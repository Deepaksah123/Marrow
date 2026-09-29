package kotlin;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.marrow.R;
import com.marrow.ui.activities.learn.video.overlay.SettingsItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.getFontSize;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/getShearPercentage;", "Lo/getFontSize;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/View;", "p1", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getShearPercentage extends getFontSize {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // kotlin.argCount
    public final Dialog onCreateDialog(Bundle p0) {
        final readNon255TerminatedValue readnon255terminatedvalue = new readNon255TerminatedValue(requireContext(), getTheme());
        readnon255terminatedvalue.setCanceledOnTouchOutside(true);
        readnon255terminatedvalue.setOnShowListener(new DialogInterface.OnShowListener() { // from class: o.getTextCombine
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                getShearPercentage.read(readnon255terminatedvalue);
            }
        });
        return readnon255terminatedvalue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(readNon255TerminatedValue readnon255terminatedvalue) {
        readnon255terminatedvalue.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(true);
        readnon255terminatedvalue.RemoteActionCompatParcelizer().IconCompatParcelizer(3);
    }

    @Override // kotlin.getFontSize, androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        View view = RemoteActionCompatParcelizer().RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
        view.setVisibility(0);
        RemoteActionCompatParcelizer().IconCompatParcelizer().setBackground(_isNaN.getDrawable(requireContext(), R.drawable.bottom_sheet_background));
    }

    /* JADX INFO: renamed from: o.getShearPercentage$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007¨\u0006\r"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/settings/SettingsBottomSheet$Companion;", "", "<init>", "()V", "newInstance", "Lcom/marrow/ui/activities/learn/video/overlay/settings/SettingsBottomSheet;", "title", "", "rows", "Ljava/util/ArrayList;", "Lcom/marrow/ui/activities/learn/video/overlay/SettingsItem;", "Lkotlin/collections/ArrayList;", "resultKey", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static getShearPercentage IconCompatParcelizer(String str, ArrayList<SettingsItem> arrayList, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(arrayList, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            getShearPercentage getshearpercentage = new getShearPercentage();
            getFontSize.IconCompatParcelizer iconCompatParcelizer = getFontSize.read;
            getshearpercentage.setArguments(getFontSize.IconCompatParcelizer.IconCompatParcelizer(str, arrayList, str2));
            return getshearpercentage;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final getShearPercentage IconCompatParcelizer(String str, ArrayList<SettingsItem> arrayList, String str2) {
        return Companion.IconCompatParcelizer(str, arrayList, str2);
    }
}
