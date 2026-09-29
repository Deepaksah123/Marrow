package kotlin;

import android.os.Bundle;
import com.marrow.ui.activities.learn.video.overlay.VideoTimelineItem;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001(BE\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u001d\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003JQ\u0010!\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001R%\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006)"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/timelines/VideoBookmarkedTimelinesArgs;", "", "timelineList", "Ljava/util/ArrayList;", "Lcom/marrow/ui/activities/learn/video/overlay/VideoTimelineItem;", "Lkotlin/collections/ArrayList;", "videoId", "", "lessonId", "activeRecallQbankId", "subjectId", "<init>", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTimelineList", "()Ljava/util/ArrayList;", "getVideoId", "()Ljava/lang/String;", "getLessonId", "getActiveRecallQbankId", "getSubjectId", "loadToIntent", "", "intent", "Landroid/content/Intent;", "toBundle", "Landroid/os/Bundle;", "toSavedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setFontSize {
    public static final write read = new write(null);
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final ArrayList<VideoTimelineItem> IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String write;

    public setFontSize(ArrayList<VideoTimelineItem> arrayList, String str, String str2, String str3, String str4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.IconCompatParcelizer = arrayList;
        this.AudioAttributesImplApi26Parcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.AudioAttributesCompatParcelizer = str3;
        this.write = str4;
    }

    public final ArrayList<VideoTimelineItem> read() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    public final Bundle MediaBrowserCompatItemReceiver() {
        return _getIndexResolver.write(setAction.write("timeline_list", this.IconCompatParcelizer), setAction.write("video_id", this.AudioAttributesImplApi26Parcelizer), setAction.write("lesson_id", this.RemoteActionCompatParcelizer), setAction.write("root_subject_id", this.write), setAction.write("ar_qbank_id", this.AudioAttributesCompatParcelizer));
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof setFontSize)) {
            return false;
        }
        setFontSize setfontsize = (setFontSize) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, setfontsize.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) setfontsize.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) setfontsize.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) setfontsize.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) setfontsize.write);
    }

    public final int hashCode() {
        ArrayList<VideoTimelineItem> arrayList = this.IconCompatParcelizer;
        int iHashCode = arrayList == null ? 0 : arrayList.hashCode();
        int iHashCode2 = this.AudioAttributesImplApi26Parcelizer.hashCode();
        int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
        String str = this.AudioAttributesCompatParcelizer;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.write.hashCode();
    }

    public final String toString() {
        ArrayList<VideoTimelineItem> arrayList = this.IconCompatParcelizer;
        String str = this.AudioAttributesImplApi26Parcelizer;
        String str2 = this.RemoteActionCompatParcelizer;
        String str3 = this.AudioAttributesCompatParcelizer;
        String str4 = this.write;
        StringBuilder sb = new StringBuilder("VideoBookmarkedTimelinesArgs(timelineList=");
        sb.append(arrayList);
        sb.append(", videoId=");
        sb.append(str);
        sb.append(", lessonId=");
        sb.append(str2);
        sb.append(", activeRecallQbankId=");
        sb.append(str3);
        sb.append(", subjectId=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setFontSize$write;", "", "<init>", "()V", "Lo/POJOPropertyBuilder5;", "p0", "Lo/setFontSize;", "read", "(Lo/POJOPropertyBuilder5;)Lo/setFontSize;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write {
        private write() {
        }

        public static setFontSize read(POJOPropertyBuilder5 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            ArrayList arrayList = (ArrayList) p0.write("timeline_list");
            Object objWrite = p0.write("video_id");
            if (objWrite == null) {
                throw new IllegalArgumentException("videoId is required".toString());
            }
            String str = (String) objWrite;
            Object objWrite2 = p0.write("lesson_id");
            if (objWrite2 == null) {
                throw new IllegalArgumentException("lessonId is required".toString());
            }
            String str2 = (String) objWrite2;
            Object objWrite3 = p0.write("root_subject_id");
            if (objWrite3 == null) {
                throw new IllegalArgumentException("rootSubjectId is required".toString());
            }
            return new setFontSize(arrayList, str, str2, (String) p0.write("ar_qbank_id"), (String) objWrite3);
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
