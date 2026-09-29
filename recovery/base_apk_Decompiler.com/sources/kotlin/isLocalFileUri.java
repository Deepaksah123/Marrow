package kotlin;

import com.marrow.data.models.common.Editor;
import com.marrow.data.models.pearl.PearlMini;
import com.marrow.data.models.video.Subtitle;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u000bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\f\u0010\u001dR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u0010\u0010\u001dR\u0018\u0010\r\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b\u0014\u0010\u000b"}, d2 = {"Lo/isLocalFileUri;", "", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "", "IconCompatParcelizer", "(Lorg/json/JSONObject;)V", "", "AudioAttributesImplApi21Parcelizer", "Ljava/lang/String;", "write", "MediaBrowserCompatMediaItem", "AudioAttributesCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "RemoteActionCompatParcelizer", "", "MediaDescriptionCompat", "I", "read", "AudioAttributesImplApi26Parcelizer", "", "Lcom/marrow/data/models/video/Subtitle;", "[Lcom/marrow/data/models/video/Subtitle;", "MediaBrowserCompatItemReceiver", "Lcom/marrow/data/models/common/Editor;", "Lcom/marrow/data/models/common/Editor;", "MediaMetadataCompat", "()Ljava/lang/String;", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isLocalFileUri {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private Editor AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private int IconCompatParcelizer;
    private String AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private int read;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private String MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public String MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public String MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private String write = "";

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private Subtitle[] MediaBrowserCompatItemReceiver = new Subtitle[0];

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private String AudioAttributesImplApi21Parcelizer = "";

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void IconCompatParcelizer(JSONObject p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String strOptString = p0.optString("source_type");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString, "");
        this.write = strOptString;
        String strOptString2 = p0.optString("_id");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString2, "");
        this.AudioAttributesImplApi21Parcelizer = strOptString2;
        this.AudioAttributesCompatParcelizer = p0.optString("title");
        this.MediaBrowserCompatCustomActionResultReceiver = p0.optString("url");
        this.MediaDescriptionCompat = p0.optString("pssh_data");
        this.RemoteActionCompatParcelizer = p0.optString(PearlMini.KEY_THUMBNAIL);
        this.read = p0.optInt("twidth");
        this.IconCompatParcelizer = p0.optInt("theight");
        JSONObject jSONObjectOptJSONObject = p0.optJSONObject("license_url");
        this.MediaBrowserCompatMediaItem = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("widevine_url") : null;
        this.AudioAttributesImplBaseParcelizer = p0.optString("training_media_id");
        Subtitle[] subtitleArrFromJSON = Subtitle.fromJSON(p0.optJSONArray("video_subtitle"));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(subtitleArrFromJSON, "");
        this.MediaBrowserCompatItemReceiver = subtitleArrFromJSON;
        Editor editor = new Editor();
        this.AudioAttributesImplApi26Parcelizer = editor;
        editor.fromJSON(p0.optJSONObject("editor_detail"));
    }
}
