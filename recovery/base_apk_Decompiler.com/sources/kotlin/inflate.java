package kotlin;

import android.text.TextUtils;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/inflate;", "", "<init>", "()V", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class inflate {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o.inflate$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/inflate$write;", "", "<init>", "()V", "Lo/ColorParser;", "p0", "Lo/isLocalFileUri;", "AudioAttributesCompatParcelizer", "(Lo/ColorParser;)Lo/isLocalFileUri;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static isLocalFileUri AudioAttributesCompatParcelizer(ColorParser p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String mediaBrowserCompatCustomActionResultReceiver = p0.getMediaBrowserCompatCustomActionResultReceiver();
            if (TextUtils.isEmpty(mediaBrowserCompatCustomActionResultReceiver)) {
                return null;
            }
            String strRemoteActionCompatParcelizer = filterRedundantIncompleteSchemeDatas.RemoteActionCompatParcelizer(p0.getWrite(), mediaBrowserCompatCustomActionResultReceiver);
            if (TextUtils.isEmpty(strRemoteActionCompatParcelizer)) {
                return null;
            }
            JSONObject jSONObjectAudioAttributesCompatParcelizer = parseLastSegmentNumberSupplementalProperty.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer);
            isLocalFileUri islocalfileuri = new isLocalFileUri();
            toMagicModuleMetaRepoModel.write(jSONObjectAudioAttributesCompatParcelizer);
            islocalfileuri.IconCompatParcelizer(jSONObjectAudioAttributesCompatParcelizer);
            p0.getAudioAttributesImplApi26Parcelizer();
            return islocalfileuri;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
