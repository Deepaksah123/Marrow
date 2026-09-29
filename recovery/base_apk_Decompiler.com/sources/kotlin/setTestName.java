package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import kotlin.setTestProgressData;

/* JADX INFO: loaded from: classes4.dex */
public final class setTestName implements getModifiedScore<Object> {
    private volatile Object AudioAttributesCompatParcelizer;
    private final Object IconCompatParcelizer = new Object();
    private final Fragment write;

    public interface AudioAttributesCompatParcelizer {
        setToolbarTitle IconCompatParcelizer();
    }

    public setTestName(Fragment fragment) {
        this.write = fragment;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        if (this.AudioAttributesCompatParcelizer == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    this.AudioAttributesCompatParcelizer = write();
                }
            }
        }
        return this.AudioAttributesCompatParcelizer;
    }

    private Object write() {
        getSubjScore.write(this.write.getHost(), "Hilt Fragments must be attached before creating the component.");
        getSubjScore.IconCompatParcelizer(this.write.getHost() instanceof getModifiedScore, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.write.getHost().getClass());
        return ((AudioAttributesCompatParcelizer) FreeVideoListResponseLesson.RemoteActionCompatParcelizer(this.write.getHost(), AudioAttributesCompatParcelizer.class)).IconCompatParcelizer().read(this.write).AudioAttributesCompatParcelizer();
    }

    public static final Context read(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static ContextWrapper read(Context context, Fragment fragment) {
        return new setTestProgressData.write(context, fragment);
    }

    public static ContextWrapper IconCompatParcelizer(LayoutInflater layoutInflater, Fragment fragment) {
        return new setTestProgressData.write(layoutInflater, fragment);
    }
}
