package kotlin;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.marrow2.ui.video.lesson_list.adapter.ClickedLessonDetails;

/* JADX INFO: loaded from: classes4.dex */
public final class ak {
    public static final void read(setVerdictOptOut setverdictoptout, FragmentManager fragmentManager, getAnswerMap<? super ClickedLessonDetails, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(setverdictoptout, "");
        toMagicModuleMetaRepoModel.write(fragmentManager, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        setverdictoptout.show(fragmentManager, "SuggestedQBankBottomSheet");
        fragmentManager.IconCompatParcelizer("qBankId", setverdictoptout, new ai(getanswermap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(getAnswerMap getanswermap, String str, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        Parcelable parcelable = bundle.getParcelable("qBankId");
        if (parcelable != null) {
            getanswermap.invoke(parcelable);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
