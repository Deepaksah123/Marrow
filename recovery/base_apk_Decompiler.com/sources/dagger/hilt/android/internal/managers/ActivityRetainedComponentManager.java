package dagger.hilt.android.internal.managers;

import android.content.Context;
import kotlin.FreeVideoListResponseLesson;
import kotlin.MediaBrowserCompatMediaItem;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.TypeResolutionContext;
import kotlin.VisibilityChecker;
import kotlin.getLessonId;
import kotlin.getModifiedScore;
import kotlin.getSubjectStat;
import kotlin.setLessonAuthor;
import kotlin.setLessonId;
import kotlin.setNextPercentile;
import kotlin.setSubTitle;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
public final class ActivityRetainedComponentManager implements getModifiedScore<getLessonId> {
    private final Context AudioAttributesCompatParcelizer;
    private volatile getLessonId IconCompatParcelizer;
    private final TypeResolutionContext read;
    private final Object write = new Object();

    public interface RemoteActionCompatParcelizer {
        setLessonId AudioAttributesCompatParcelizer();
    }

    public interface read {
        setSubTitle addOnNewIntentListener();
    }

    static final class IconCompatParcelizer extends POJOPropertyBuilderWithMember {
        private final getLessonId IconCompatParcelizer;
        private final getSubjectStat write;

        IconCompatParcelizer(getLessonId getlessonid, getSubjectStat getsubjectstat) {
            this.IconCompatParcelizer = getlessonid;
            this.write = getsubjectstat;
        }

        final getLessonId read() {
            return this.IconCompatParcelizer;
        }

        final getSubjectStat AudioAttributesCompatParcelizer() {
            return this.write;
        }

        @Override // kotlin.POJOPropertyBuilderWithMember
        public final void write() {
            super.write();
            ((setNextPercentile) ((RemoteActionCompatParcelizer) FreeVideoListResponseLesson.RemoteActionCompatParcelizer(this.IconCompatParcelizer, RemoteActionCompatParcelizer.class)).AudioAttributesCompatParcelizer()).read();
        }
    }

    public ActivityRetainedComponentManager(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
        this.read = mediaBrowserCompatMediaItem;
        this.AudioAttributesCompatParcelizer = mediaBrowserCompatMediaItem;
    }

    private VisibilityChecker read(TypeResolutionContext typeResolutionContext, final Context context) {
        return new VisibilityChecker(typeResolutionContext, new VisibilityChecker.RemoteActionCompatParcelizer() { // from class: dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.5
            @Override // o.VisibilityChecker.RemoteActionCompatParcelizer
            public final <T extends POJOPropertyBuilderWithMember> T AudioAttributesCompatParcelizer(Class<T> cls, withFieldVisibility withfieldvisibility) {
                getSubjectStat getsubjectstat = new getSubjectStat(withfieldvisibility);
                return new IconCompatParcelizer(((read) setLessonAuthor.write(context, read.class)).addOnNewIntentListener().write(getsubjectstat).AudioAttributesCompatParcelizer(), getsubjectstat);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getModifiedScore
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public getLessonId af_() {
        if (this.IconCompatParcelizer == null) {
            synchronized (this.write) {
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = AudioAttributesCompatParcelizer();
                }
            }
        }
        return this.IconCompatParcelizer;
    }

    public final getSubjectStat RemoteActionCompatParcelizer() {
        return ((IconCompatParcelizer) read(this.read, this.AudioAttributesCompatParcelizer).RemoteActionCompatParcelizer(IconCompatParcelizer.class)).AudioAttributesCompatParcelizer();
    }

    private getLessonId AudioAttributesCompatParcelizer() {
        return ((IconCompatParcelizer) read(this.read, this.AudioAttributesCompatParcelizer).RemoteActionCompatParcelizer(IconCompatParcelizer.class)).read();
    }

    public static abstract class LifecycleModule {
        LifecycleModule() {
        }

        public static setLessonId RemoteActionCompatParcelizer() {
            return new setNextPercentile();
        }
    }
}
