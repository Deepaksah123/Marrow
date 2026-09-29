package kotlin;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.marrow.data.models.mcq.bookmark.FilterItemRecord;
import com.marrow.data.models.subject.Subject;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00012BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eB;\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0012¢\u0006\u0004\b\r\u0010\u0013B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0012¢\u0006\u0004\b\r\u0010\u0014J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020%J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003JQ\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010.\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\tHÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00063"}, d2 = {"Lcom/marrow2/ui/pearl/model/PearlDetailArgs;", "", "pearlId", "", "subjectId", "subjectTitle", "bookmarkSelected", "", "bookmarkType", "", "showIsPreviewModel", "source", "Ljava/io/Serializable;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIZLjava/io/Serializable;)V", "filterSubjId", "subjTitle", "onlyBookmarked", "Lcom/marrow2/ui/pearl/model/PearlAnalyticsSourceType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILcom/marrow2/ui/pearl/model/PearlAnalyticsSourceType;)V", "(Ljava/lang/String;Lcom/marrow2/ui/pearl/model/PearlAnalyticsSourceType;)V", "getPearlId", "()Ljava/lang/String;", "getSubjectId", "getSubjectTitle", "getBookmarkSelected", "()Z", "getBookmarkType", "()I", "getShowIsPreviewModel", "getSource", "()Ljava/io/Serializable;", "loadToIntent", "", "intent", "Landroid/content/Intent;", "get", "Landroid/os/Bundle;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConnectionTracker {
    public static final IconCompatParcelizer RemoteActionCompatParcelizer = new IconCompatParcelizer(null);
    private final boolean AudioAttributesCompatParcelizer;
    private final Serializable AudioAttributesImplApi26Parcelizer;
    private final boolean IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final String read;
    private final int write;

    public ConnectionTracker(String str, String str2, String str3, boolean z, int i, boolean z2, Serializable serializable) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.read = str;
        this.MediaBrowserCompatItemReceiver = str2;
        this.MediaBrowserCompatCustomActionResultReceiver = str3;
        this.AudioAttributesCompatParcelizer = z;
        this.write = i;
        this.IconCompatParcelizer = z2;
        this.AudioAttributesImplApi26Parcelizer = serializable;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    public /* synthetic */ ConnectionTracker(String str, String str2, String str3, boolean z, int i, boolean z2, Serializable serializable, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, (i2 & 2) != 0 ? Subject.ROOT_PARENT_ID : str2, (i2 & 4) != 0 ? FilterItemRecord.filter_all_title : str3, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? -1 : i, (i2 & 32) == 0 ? z2 : false, (i2 & 64) != 0 ? null : serializable);
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final String getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final Serializable getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public /* synthetic */ ConnectionTracker(String str, fillWindow fillwindow, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, (i & 2) != 0 ? fillWindow.IconCompatParcelizer : fillwindow);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionTracker(String str, fillWindow fillwindow) {
        this(str, Subject.ROOT_PARENT_ID, null, false, 0, false, fillwindow, 60, null);
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(fillwindow, "");
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\n\u0010\r"}, d2 = {"Lo/ConnectionTracker$IconCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Intent;", "p0", "Lo/ConnectionTracker;", "IconCompatParcelizer", "(Landroid/content/Intent;)Lo/ConnectionTracker;", "Lo/POJOPropertyBuilder5;", "read", "(Lo/POJOPropertyBuilder5;)Lo/ConnectionTracker;", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)Lo/ConnectionTracker;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public static ConnectionTracker IconCompatParcelizer(Intent p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Bundle extras = p0.getExtras();
            if (extras == null) {
                return null;
            }
            IconCompatParcelizer iconCompatParcelizer = ConnectionTracker.RemoteActionCompatParcelizer;
            return read(extras);
        }

        public static ConnectionTracker read(POJOPropertyBuilder5 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String str = (String) p0.write("pearl_id");
            if (str == null) {
                str = SessionDescription.SUPPORTED_SDP_VERSION;
            }
            String str2 = str;
            String str3 = (String) p0.write("subject_id");
            if (str3 == null) {
                str3 = Subject.ROOT_PARENT_ID;
            }
            String str4 = str3;
            String str5 = (String) p0.write("subject_title");
            if (str5 == null) {
                str5 = FilterItemRecord.filter_all_title;
            }
            String str6 = str5;
            Boolean bool = (Boolean) p0.write("bookmark_selected");
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            Integer num = (Integer) p0.write("bookmark_type");
            int iIntValue = num != null ? num.intValue() : -1;
            Boolean bool2 = (Boolean) p0.write("is_preview_mode");
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
            fillWindow fillwindow = (Serializable) p0.write("analytics_source");
            if (fillwindow == null) {
                fillwindow = fillWindow.IconCompatParcelizer;
            }
            return new ConnectionTracker(str2, str4, str6, zBooleanValue, iIntValue, zBooleanValue2, fillwindow);
        }

        public static ConnectionTracker read(Bundle p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String string = p0.getString("pearl_id", SessionDescription.SUPPORTED_SDP_VERSION);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            String string2 = p0.getString("subject_id", Subject.ROOT_PARENT_ID);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            String string3 = p0.getString("subject_title", FilterItemRecord.filter_all_title);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
            boolean z = p0.getBoolean("bookmark_selected", true);
            int i = p0.getInt("bookmark_type");
            boolean z2 = p0.getBoolean("is_preview_mode", true);
            fillWindow serializable = p0.getSerializable("analytics_source");
            if (serializable == null) {
                serializable = fillWindow.IconCompatParcelizer;
            }
            return new ConnectionTracker(string, string2, string3, z, i, z2, serializable);
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final void IconCompatParcelizer(Intent intent) {
        toMagicModuleMetaRepoModel.write(intent, "");
        intent.putExtra("pearl_id", this.read);
        intent.putExtra("subject_id", this.MediaBrowserCompatItemReceiver);
        intent.putExtra("subject_title", this.MediaBrowserCompatCustomActionResultReceiver);
        intent.putExtra("bookmark_selected", this.AudioAttributesCompatParcelizer);
        intent.putExtra("bookmark_type", this.write);
        intent.putExtra("is_preview_mode", this.IconCompatParcelizer);
        intent.putExtra("analytics_source", this.AudioAttributesImplApi26Parcelizer);
    }

    public final Bundle write() {
        Bundle bundle = new Bundle();
        bundle.putString("pearl_id", this.read);
        bundle.putString("subject_id", this.MediaBrowserCompatItemReceiver);
        bundle.putString("subject_title", this.MediaBrowserCompatCustomActionResultReceiver);
        bundle.putBoolean("bookmark_selected", this.AudioAttributesCompatParcelizer);
        bundle.putInt("bookmark_type", this.write);
        bundle.putBoolean("is_preview_mode", this.IconCompatParcelizer);
        bundle.putSerializable("analytics_source", this.AudioAttributesImplApi26Parcelizer);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ConnectionTracker write(String str, String str2, String str3, boolean z, int i, boolean z2, Serializable serializable) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        return new ConnectionTracker(str, str2, str3, z, i, z2, serializable);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectionTracker)) {
            return false;
        }
        ConnectionTracker connectionTracker = (ConnectionTracker) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) connectionTracker.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) connectionTracker.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) connectionTracker.MediaBrowserCompatCustomActionResultReceiver) && this.AudioAttributesCompatParcelizer == connectionTracker.AudioAttributesCompatParcelizer && this.write == connectionTracker.write && this.IconCompatParcelizer == connectionTracker.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, connectionTracker.AudioAttributesImplApi26Parcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.MediaBrowserCompatItemReceiver.hashCode();
        int iHashCode3 = this.MediaBrowserCompatCustomActionResultReceiver.hashCode();
        int iHashCode4 = Boolean.hashCode(this.AudioAttributesCompatParcelizer);
        int iHashCode5 = Integer.hashCode(this.write);
        int iHashCode6 = Boolean.hashCode(this.IconCompatParcelizer);
        Serializable serializable = this.AudioAttributesImplApi26Parcelizer;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (serializable == null ? 0 : serializable.hashCode());
    }

    public final String toString() {
        String str = this.read;
        String str2 = this.MediaBrowserCompatItemReceiver;
        String str3 = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean z = this.AudioAttributesCompatParcelizer;
        int i = this.write;
        boolean z2 = this.IconCompatParcelizer;
        Serializable serializable = this.AudioAttributesImplApi26Parcelizer;
        StringBuilder sb = new StringBuilder("PearlDetailArgs(pearlId=");
        sb.append(str);
        sb.append(", subjectId=");
        sb.append(str2);
        sb.append(", subjectTitle=");
        sb.append(str3);
        sb.append(", bookmarkSelected=");
        sb.append(z);
        sb.append(", bookmarkType=");
        sb.append(i);
        sb.append(", showIsPreviewModel=");
        sb.append(z2);
        sb.append(", source=");
        sb.append(serializable);
        sb.append(")");
        return sb.toString();
    }
}
