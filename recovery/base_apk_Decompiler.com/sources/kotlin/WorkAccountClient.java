package kotlin;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.exoplayer2.C;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow2.data.tag.local.model.TagLSModel;
import com.marrow2.domain.custom_module.model.CustomModuleSubjectListModel;
import com.marrow2.domain.custom_module.model.CustomModuleUCModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0001XBí\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u00120\b\u0002\u0010\u000e\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u000fj\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b`\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\r\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fB\u0019\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010 J\u000e\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?J\u0006\u0010@\u001a\u00020AJ\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003J\t\u0010G\u001a\u00020\rHÆ\u0003J1\u0010H\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u000fj\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b`\u0010HÆ\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00120\bHÆ\u0003J\t\u0010J\u001a\u00020\rHÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\rHÆ\u0003J\t\u0010O\u001a\u00020\u0019HÆ\u0003J\t\u0010P\u001a\u00020\u0019HÆ\u0003J\t\u0010Q\u001a\u00020\rHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u001dHÆ\u0003Jï\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\b\b\u0002\u0010\f\u001a\u00020\r20\b\u0002\u0010\u000e\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u000fj\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b`\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\r2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÆ\u0001J\u0013\u0010T\u001a\u00020\r2\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010V\u001a\u00020\u0003HÖ\u0001J\t\u0010W\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R9\u0010\u000e\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u000fj\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b`\u0010¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010'R\u0011\u0010\u0013\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0011\u0010\u0017\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u001a\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b5\u00104R\u001a\u0010\u001b\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010*\"\u0004\b6\u00107R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006Y"}, d2 = {"Lcom/marrow2/ui/custom_module/creation/model/CustomModuleCreationArgs;", "", "ques", "", FilterParams.KEY_DIFFICULTY, "", "quesSource", "sourceCategory", "", "Lcom/marrow2/ui/custom_module/creation/model/QuestionSourceCategoryEnum;", FilterParams.KEY_SUBJECTS, "Lcom/marrow2/domain/custom_module/model/CustomModuleSubjectListModel;", "areAllSubjects", "", "selectedTopicsMapping", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", FilterParams.KEY_TAGS, "Lcom/marrow2/data/tag/local/model/TagLSModel;", "areAllTagsSelected", FilterParams.KEY_MODE, "subjectTitle", "rootId", "includeUntaggedMcqs", "creationTime", "", "submissionTime", "isFromJoin", "model", "Lcom/marrow2/domain/custom_module/model/CustomModuleUCModel;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/util/HashMap;Ljava/util/List;ZILjava/lang/String;Ljava/lang/String;ZJJZLcom/marrow2/domain/custom_module/model/CustomModuleUCModel;)V", "(Lcom/marrow2/domain/custom_module/model/CustomModuleUCModel;Z)V", "getQues", "()I", "getDifficulty", "()Ljava/lang/String;", "getQuesSource", "getSourceCategory", "()Ljava/util/List;", "getSubjects", "getAreAllSubjects", "()Z", "getSelectedTopicsMapping", "()Ljava/util/HashMap;", "getTags", "getAreAllTagsSelected", "getMode", "getSubjectTitle", "getRootId", "getIncludeUntaggedMcqs", "getCreationTime", "()J", "getSubmissionTime", "setFromJoin", "(Z)V", "getModel", "()Lcom/marrow2/domain/custom_module/model/CustomModuleUCModel;", "setModel", "(Lcom/marrow2/domain/custom_module/model/CustomModuleUCModel;)V", "loadToIntent", "", "intent", "Landroid/content/Intent;", "get", "Landroid/os/Bundle;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "other", "hashCode", "toString", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WorkAccountClient {
    public static final IconCompatParcelizer write = new IconCompatParcelizer(null);
    private final boolean AudioAttributesCompatParcelizer;
    private CustomModuleUCModel AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private final boolean AudioAttributesImplBaseParcelizer;
    private final boolean IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private final int MediaBrowserCompatItemReceiver;
    private final String MediaBrowserCompatMediaItem;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final List<TagLSModel> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final HashMap<String, List<String>> MediaDescriptionCompat;
    private final List<AccountTransferClient> MediaMetadataCompat;
    private final String RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private final long handleMediaPlayPauseIfPendingOnHandler;
    private final List<CustomModuleSubjectListModel> onCustomAction;
    private final long read;

    /* JADX WARN: Multi-variable type inference failed */
    public WorkAccountClient(int i, String str, String str2, List<? extends AccountTransferClient> list, List<CustomModuleSubjectListModel> list2, boolean z, HashMap<String, List<String>> map, List<TagLSModel> list3, boolean z2, int i2, String str3, String str4, boolean z3, long j, long j2, boolean z4, CustomModuleUCModel customModuleUCModel) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.MediaBrowserCompatItemReceiver = i;
        this.RemoteActionCompatParcelizer = str;
        this.MediaBrowserCompatSearchResultReceiver = str2;
        this.MediaMetadataCompat = list;
        this.onCustomAction = list2;
        this.AudioAttributesCompatParcelizer = z;
        this.MediaDescriptionCompat = map;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = list3;
        this.IconCompatParcelizer = z2;
        this.AudioAttributesImplApi26Parcelizer = i2;
        this.MediaBrowserCompatMediaItem = str3;
        this.RatingCompat = str4;
        this.AudioAttributesImplBaseParcelizer = z3;
        this.read = j;
        this.handleMediaPlayPauseIfPendingOnHandler = j2;
        this.MediaBrowserCompatCustomActionResultReceiver = z4;
        this.AudioAttributesImplApi21Parcelizer = customModuleUCModel;
    }

    public /* synthetic */ WorkAccountClient(int i, String str, String str2, List list, List list2, boolean z, HashMap map, List list3, boolean z2, int i2, String str3, String str4, boolean z3, long j, long j2, boolean z4, CustomModuleUCModel customModuleUCModel, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? 10 : i, (i3 & 2) != 0 ? "all" : str, (i3 & 4) == 0 ? str2 : "all", (i3 & 8) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i3 & 16) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2, (i3 & 32) != 0 ? true : z, (i3 & 64) != 0 ? new HashMap() : map, (i3 & 128) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list3, (i3 & 256) != 0 ? true : z2, (i3 & 512) != 0 ? 1 : i2, (i3 & 1024) != 0 ? "" : str3, (i3 & 2048) == 0 ? str4 : "", (i3 & 4096) == 0 ? z3 : true, (i3 & 8192) != 0 ? 0L : j, (i3 & 16384) == 0 ? j2 : 0L, (32768 & i3) != 0 ? false : z4, (i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : customModuleUCModel);
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final int getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final String getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final List<AccountTransferClient> MediaBrowserCompatItemReceiver() {
        return this.MediaMetadataCompat;
    }

    public final List<CustomModuleSubjectListModel> MediaBrowserCompatSearchResultReceiver() {
        return this.onCustomAction;
    }

    public final HashMap<String, List<String>> MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaDescriptionCompat;
    }

    public final List<TagLSModel> MediaBrowserCompatMediaItem() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final String getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final boolean getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final CustomModuleUCModel getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WorkAccountClient(CustomModuleUCModel customModuleUCModel, boolean z) {
        toMagicModuleMetaRepoModel.write(customModuleUCModel, "");
        long j = 0;
        this(0, null, null, null, null, false, null, null, false, 0, null, null, false, j, j, false, null, 131071, null);
        this.AudioAttributesImplApi21Parcelizer = customModuleUCModel;
        this.MediaBrowserCompatCustomActionResultReceiver = z;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\nJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\f"}, d2 = {"Lo/WorkAccountClient$IconCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Intent;", "p0", "Lo/WorkAccountClient;", "read", "(Landroid/content/Intent;)Lo/WorkAccountClient;", "Lo/POJOPropertyBuilder5;", "(Lo/POJOPropertyBuilder5;)Lo/WorkAccountClient;", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)Lo/WorkAccountClient;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public static WorkAccountClient read(Intent p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Bundle extras = p0.getExtras();
            if (extras != null) {
                IconCompatParcelizer iconCompatParcelizer = WorkAccountClient.write;
                return read(extras);
            }
            return new WorkAccountClient(0, null, null, null, null, false, null, null, false, 0, null, null, false, 0L, 0L, false, null, 131071, null);
        }

        public static WorkAccountClient read(POJOPropertyBuilder5 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Integer num = (Integer) p0.write("ques_count");
            int iIntValue = num != null ? num.intValue() : 10;
            String str = (String) p0.write(FilterParams.KEY_DIFFICULTY);
            String str2 = str == null ? "all" : str;
            String str3 = (String) p0.write("source");
            String str4 = str3 == null ? "all" : str3;
            List listRemoteActionCompatParcelizer = (List) p0.write("source_category");
            if (listRemoteActionCompatParcelizer == null) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            List list = listRemoteActionCompatParcelizer;
            List listRemoteActionCompatParcelizer2 = (List) p0.write(FilterParams.KEY_SUBJECTS);
            if (listRemoteActionCompatParcelizer2 == null) {
                listRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            List list2 = listRemoteActionCompatParcelizer2;
            Boolean bool = (Boolean) p0.write("are_all_subjects");
            boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
            Boolean bool2 = (Boolean) p0.write("are_all_tags");
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
            HashMap map = (HashMap) p0.write("topics");
            if (map == null) {
                map = new HashMap();
            }
            HashMap map2 = map;
            List listRemoteActionCompatParcelizer3 = (List) p0.write(FilterParams.KEY_TAGS);
            if (listRemoteActionCompatParcelizer3 == null) {
                listRemoteActionCompatParcelizer3 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            List list3 = listRemoteActionCompatParcelizer3;
            Integer num2 = (Integer) p0.write(FilterParams.KEY_MODE);
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            String str5 = (String) p0.write("subject_title");
            if (str5 == null) {
                str5 = "";
            }
            String str6 = (String) p0.write("root_id");
            if (str6 == null) {
                str6 = "";
            }
            Boolean bool3 = (Boolean) p0.write("include_untagged_mcqs");
            boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : true;
            Long l = (Long) p0.write("creation_time");
            long jLongValue = l != null ? l.longValue() : 0L;
            Long l2 = (Long) p0.write("submission_time");
            long jLongValue2 = l2 != null ? l2.longValue() : 0L;
            Boolean bool4 = (Boolean) p0.write("isFromJoinCode");
            return new WorkAccountClient(iIntValue, str2, str4, list, list2, zBooleanValue, map2, list3, zBooleanValue2, iIntValue2, str5, str6, zBooleanValue3, jLongValue, jLongValue2, bool4 != null ? bool4.booleanValue() : false, (CustomModuleUCModel) p0.write("model"));
        }

        private static WorkAccountClient read(Bundle p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            int i = p0.getInt("ques_count", 10);
            String string = p0.getString(FilterParams.KEY_DIFFICULTY, "all");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            String string2 = p0.getString("source", "all");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            Serializable serializable = p0.getSerializable("source_category");
            List listRemoteActionCompatParcelizer = serializable instanceof List ? (List) serializable : null;
            if (listRemoteActionCompatParcelizer == null) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            List list = listRemoteActionCompatParcelizer;
            ArrayList parcelableArrayList = p0.getParcelableArrayList(FilterParams.KEY_SUBJECTS);
            ArrayList arrayListRemoteActionCompatParcelizer = parcelableArrayList instanceof List ? parcelableArrayList : null;
            if (arrayListRemoteActionCompatParcelizer == null) {
                arrayListRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            List list2 = arrayListRemoteActionCompatParcelizer;
            boolean z = p0.getBoolean("are_all_subjects");
            boolean z2 = p0.getBoolean("are_all_tags");
            Serializable serializable2 = p0.getSerializable("topics");
            HashMap map = serializable2 instanceof HashMap ? (HashMap) serializable2 : null;
            if (map == null) {
                map = new HashMap();
            }
            HashMap map2 = map;
            ArrayList parcelableArrayList2 = p0.getParcelableArrayList(FilterParams.KEY_TAGS);
            ArrayList arrayList = parcelableArrayList2 instanceof List ? parcelableArrayList2 : null;
            List listRemoteActionCompatParcelizer2 = arrayList == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : arrayList;
            int i2 = p0.getInt(FilterParams.KEY_MODE, 0);
            String string3 = p0.getString("subject_title", "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
            String string4 = p0.getString("root_id", "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
            return new WorkAccountClient(i, string, string2, list, list2, z, map2, listRemoteActionCompatParcelizer2, z2, i2, string3, string4, p0.getBoolean("include_untagged_mcqs"), p0.getLong("creation_time"), p0.getLong("submission_time"), p0.getBoolean("isFromJoinCode"), (CustomModuleUCModel) p0.getParcelable("model"));
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final void AudioAttributesCompatParcelizer(Intent intent) {
        toMagicModuleMetaRepoModel.write(intent, "");
        intent.putExtra("ques_count", this.MediaBrowserCompatItemReceiver);
        intent.putExtra(FilterParams.KEY_DIFFICULTY, this.RemoteActionCompatParcelizer);
        intent.putExtra("source", this.MediaBrowserCompatSearchResultReceiver);
        intent.putExtra("source_category", new ArrayList(this.MediaMetadataCompat));
        intent.putParcelableArrayListExtra(FilterParams.KEY_SUBJECTS, new ArrayList<>(this.onCustomAction));
        intent.putExtra("are_all_subjects", this.AudioAttributesCompatParcelizer);
        intent.putExtra("are_all_tags", this.IconCompatParcelizer);
        intent.putExtra("topics", this.MediaDescriptionCompat);
        intent.putParcelableArrayListExtra(FilterParams.KEY_TAGS, new ArrayList<>(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
        intent.putExtra(FilterParams.KEY_MODE, this.AudioAttributesImplApi26Parcelizer);
        intent.putExtra("subject_title", this.MediaBrowserCompatMediaItem);
        intent.putExtra("root_id", this.RatingCompat);
        intent.putExtra("include_untagged_mcqs", this.AudioAttributesImplBaseParcelizer);
        intent.putExtra("creation_time", this.read);
        intent.putExtra("submission_time", this.handleMediaPlayPauseIfPendingOnHandler);
        intent.putExtra("model", this.AudioAttributesImplApi21Parcelizer);
        intent.putExtra("isFromJoinCode", this.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final Bundle RemoteActionCompatParcelizer() {
        Bundle bundle = new Bundle();
        bundle.putInt("ques_count", this.MediaBrowserCompatItemReceiver);
        bundle.putString(FilterParams.KEY_DIFFICULTY, this.RemoteActionCompatParcelizer);
        bundle.putString("source", this.MediaBrowserCompatSearchResultReceiver);
        bundle.putSerializable("source_category", new ArrayList(this.MediaMetadataCompat));
        bundle.putParcelableArrayList(FilterParams.KEY_SUBJECTS, new ArrayList<>(this.onCustomAction));
        bundle.putBoolean("are_all_subjects", this.AudioAttributesCompatParcelizer);
        bundle.putBoolean("are_all_tags", this.IconCompatParcelizer);
        bundle.putSerializable("topics", this.MediaDescriptionCompat);
        bundle.putParcelableArrayList(FilterParams.KEY_TAGS, new ArrayList<>(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
        bundle.putInt(FilterParams.KEY_MODE, this.AudioAttributesImplApi26Parcelizer);
        bundle.putString("subject_title", this.MediaBrowserCompatMediaItem);
        bundle.putString("root_id", this.RatingCompat);
        bundle.putBoolean("include_untagged_mcqs", this.AudioAttributesImplBaseParcelizer);
        bundle.putLong("creation_time", this.read);
        bundle.putLong("submission_time", this.handleMediaPlayPauseIfPendingOnHandler);
        bundle.putParcelable("model", this.AudioAttributesImplApi21Parcelizer);
        bundle.putBoolean("isFromJoinCode", this.MediaBrowserCompatCustomActionResultReceiver);
        return bundle;
    }

    public WorkAccountClient() {
        this(0, null, null, null, null, false, null, null, false, 0, null, null, false, 0L, 0L, false, null, 131071, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static WorkAccountClient read(int i, String str, String str2, List<? extends AccountTransferClient> list, List<CustomModuleSubjectListModel> list2, boolean z, HashMap<String, List<String>> map, List<TagLSModel> list3, boolean z2, int i2, String str3, String str4, boolean z3, long j, long j2, boolean z4, CustomModuleUCModel customModuleUCModel) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        return new WorkAccountClient(i, str, str2, list, list2, z, map, list3, z2, i2, str3, str4, z3, j, j2, z4, customModuleUCModel);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkAccountClient)) {
            return false;
        }
        WorkAccountClient workAccountClient = (WorkAccountClient) other;
        return this.MediaBrowserCompatItemReceiver == workAccountClient.MediaBrowserCompatItemReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) workAccountClient.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) workAccountClient.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaMetadataCompat, workAccountClient.MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onCustomAction, workAccountClient.onCustomAction) && this.AudioAttributesCompatParcelizer == workAccountClient.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, workAccountClient.MediaDescriptionCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, workAccountClient.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && this.IconCompatParcelizer == workAccountClient.IconCompatParcelizer && this.AudioAttributesImplApi26Parcelizer == workAccountClient.AudioAttributesImplApi26Parcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatMediaItem, (Object) workAccountClient.MediaBrowserCompatMediaItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RatingCompat, (Object) workAccountClient.RatingCompat) && this.AudioAttributesImplBaseParcelizer == workAccountClient.AudioAttributesImplBaseParcelizer && this.read == workAccountClient.read && this.handleMediaPlayPauseIfPendingOnHandler == workAccountClient.handleMediaPlayPauseIfPendingOnHandler && this.MediaBrowserCompatCustomActionResultReceiver == workAccountClient.MediaBrowserCompatCustomActionResultReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, workAccountClient.AudioAttributesImplApi21Parcelizer);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.MediaBrowserCompatItemReceiver);
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = this.MediaBrowserCompatSearchResultReceiver.hashCode();
        int iHashCode4 = this.MediaMetadataCompat.hashCode();
        int iHashCode5 = this.onCustomAction.hashCode();
        int iHashCode6 = Boolean.hashCode(this.AudioAttributesCompatParcelizer);
        int iHashCode7 = this.MediaDescriptionCompat.hashCode();
        int iHashCode8 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.hashCode();
        int iHashCode9 = Boolean.hashCode(this.IconCompatParcelizer);
        int iHashCode10 = Integer.hashCode(this.AudioAttributesImplApi26Parcelizer);
        int iHashCode11 = this.MediaBrowserCompatMediaItem.hashCode();
        int iHashCode12 = this.RatingCompat.hashCode();
        int iHashCode13 = Boolean.hashCode(this.AudioAttributesImplBaseParcelizer);
        int iHashCode14 = Long.hashCode(this.read);
        int iHashCode15 = Long.hashCode(this.handleMediaPlayPauseIfPendingOnHandler);
        int iHashCode16 = Boolean.hashCode(this.MediaBrowserCompatCustomActionResultReceiver);
        CustomModuleUCModel customModuleUCModel = this.AudioAttributesImplApi21Parcelizer;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (customModuleUCModel == null ? 0 : customModuleUCModel.hashCode());
    }

    public final String toString() {
        int i = this.MediaBrowserCompatItemReceiver;
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.MediaBrowserCompatSearchResultReceiver;
        List<AccountTransferClient> list = this.MediaMetadataCompat;
        List<CustomModuleSubjectListModel> list2 = this.onCustomAction;
        boolean z = this.AudioAttributesCompatParcelizer;
        HashMap<String, List<String>> map = this.MediaDescriptionCompat;
        List<TagLSModel> list3 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        boolean z2 = this.IconCompatParcelizer;
        int i2 = this.AudioAttributesImplApi26Parcelizer;
        String str3 = this.MediaBrowserCompatMediaItem;
        String str4 = this.RatingCompat;
        boolean z3 = this.AudioAttributesImplBaseParcelizer;
        long j = this.read;
        long j2 = this.handleMediaPlayPauseIfPendingOnHandler;
        boolean z4 = this.MediaBrowserCompatCustomActionResultReceiver;
        CustomModuleUCModel customModuleUCModel = this.AudioAttributesImplApi21Parcelizer;
        StringBuilder sb = new StringBuilder("CustomModuleCreationArgs(ques=");
        sb.append(i);
        sb.append(", difficulty=");
        sb.append(str);
        sb.append(", quesSource=");
        sb.append(str2);
        sb.append(", sourceCategory=");
        sb.append(list);
        sb.append(", subjects=");
        sb.append(list2);
        sb.append(", areAllSubjects=");
        sb.append(z);
        sb.append(", selectedTopicsMapping=");
        sb.append(map);
        sb.append(", tags=");
        sb.append(list3);
        sb.append(", areAllTagsSelected=");
        sb.append(z2);
        sb.append(", mode=");
        sb.append(i2);
        sb.append(", subjectTitle=");
        sb.append(str3);
        sb.append(", rootId=");
        sb.append(str4);
        sb.append(", includeUntaggedMcqs=");
        sb.append(z3);
        sb.append(", creationTime=");
        sb.append(j);
        sb.append(", submissionTime=");
        sb.append(j2);
        sb.append(", isFromJoin=");
        sb.append(z4);
        sb.append(", model=");
        sb.append(customModuleUCModel);
        sb.append(")");
        return sb.toString();
    }
}
