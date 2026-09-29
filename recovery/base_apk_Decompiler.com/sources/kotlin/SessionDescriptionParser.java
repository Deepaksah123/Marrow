package kotlin;

import android.R;
import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class SessionDescriptionParser {
    private static final getAnswerMap<getApplicationLabel, getShowPopup> AudioAttributesCompatParcelizer = new getAnswerMap() { // from class: o.setPhoneNumber
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return SessionDescriptionParser.read((getApplicationLabel) obj);
        }
    };

    public static final View AudioAttributesCompatParcelizer(Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        if (viewGroup == null) {
            throw new IllegalStateException("Activity has no content view".toString());
        }
        int childCount = viewGroup.getChildCount();
        if (childCount == 0) {
            throw new IllegalStateException("Content view has no children. Provide a root view explicitly".toString());
        }
        if (childCount == 1) {
            View childAt = viewGroup.getChildAt(0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childAt, "");
            return childAt;
        }
        throw new IllegalStateException("More than one child view found in the Activity content view".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getApplicationLabel getapplicationlabel) {
        toMagicModuleMetaRepoModel.write(getapplicationlabel, "");
        return getShowPopup.INSTANCE;
    }

    public static final <T extends getApplicationLabel> getAnswerMap<T, getShowPopup> RemoteActionCompatParcelizer() {
        return (getAnswerMap<T, getShowPopup>) AudioAttributesCompatParcelizer;
    }

    public static final void AudioAttributesCompatParcelizer() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("The method must be called on the main thread".toString());
        }
    }
}
