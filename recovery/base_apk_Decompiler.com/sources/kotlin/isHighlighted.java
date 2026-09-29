package kotlin;

import android.app.Activity;
import android.app.Application;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager;

/* JADX INFO: loaded from: classes.dex */
public final class isHighlighted implements getModifiedScore<Object> {
    private final getModifiedScore<getLessonId> IconCompatParcelizer;
    private Activity RemoteActionCompatParcelizer;
    private volatile Object read;
    private final Object write = new Object();

    /* JADX INFO: loaded from: classes4.dex */
    public interface RemoteActionCompatParcelizer {
        getToolbarTitle IconCompatParcelizer();
    }

    public isHighlighted(Activity activity) {
        this.RemoteActionCompatParcelizer = activity;
        this.IconCompatParcelizer = new ActivityRetainedComponentManager((MediaBrowserCompatMediaItem) activity);
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        if (this.read == null) {
            synchronized (this.write) {
                if (this.read == null) {
                    this.read = AudioAttributesCompatParcelizer();
                }
            }
        }
        return this.read;
    }

    public final getSubjectStat write() {
        return ((ActivityRetainedComponentManager) this.IconCompatParcelizer).RemoteActionCompatParcelizer();
    }

    private Object AudioAttributesCompatParcelizer() {
        String string;
        if (!(this.RemoteActionCompatParcelizer.getApplication() instanceof getModifiedScore)) {
            StringBuilder sb = new StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
            if (Application.class.equals(this.RemoteActionCompatParcelizer.getApplication().getClass())) {
                string = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
            } else {
                StringBuilder sb2 = new StringBuilder("Found: ");
                sb2.append(this.RemoteActionCompatParcelizer.getApplication().getClass());
                string = sb2.toString();
            }
            sb.append(string);
            throw new IllegalStateException(sb.toString());
        }
        return ((RemoteActionCompatParcelizer) FreeVideoListResponseLesson.RemoteActionCompatParcelizer(this.IconCompatParcelizer, RemoteActionCompatParcelizer.class)).IconCompatParcelizer().RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer).write();
    }
}
