package kotlin;

import android.content.Context;
import com.marrow.data.models.custommodule.FilterParams;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.PlayerEmsgHandlerManifestExpiryEventInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class primaryTrack<T extends PlayerEmsgHandlerManifestExpiryEventInfo> extends DashMediaPeriodTrackGroupInfoTrackGroupCategory<T> {
    public BundledChunkExtractor IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public primaryTrack(Context context, String str, BundledChunkExtractor bundledChunkExtractor) {
        super(context, str);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundledChunkExtractor, "");
        this.IconCompatParcelizer = bundledChunkExtractor;
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write(FilterParams.KEY_COURSE_ID, "INTEGER"));
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public String[] read(String str, String str2, String[] strArr, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        String[] strArr2 = super.read(str, FilterParams.KEY_COURSE_ID.concat(String.valueOf(str2.length() == 0 ? " =? " : " =?  AND ".concat(String.valueOf(str2)))), parseDolbyChannelConfiguration.write(strArr, String.valueOf(AudioAttributesCompatParcelizer())), str3);
        if (strArr2 == null) {
            strArr2 = new String[0];
        }
        return (String[]) Arrays.copyOf(strArr2, strArr2.length);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    protected final int AudioAttributesCompatParcelizer(String str, String str2, String[] strArr) {
        toMagicModuleMetaRepoModel.write(str, "");
        String str3 = str2;
        return super.AudioAttributesCompatParcelizer(str, FilterParams.KEY_COURSE_ID.concat(String.valueOf((str3 == null || str3.length() == 0) ? " =? " : " =?  AND ".concat(String.valueOf(str2)))), parseDolbyChannelConfiguration.write(strArr, String.valueOf(AudioAttributesCompatParcelizer())));
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    protected final String write(String str, String str2, String[] strArr) {
        toMagicModuleMetaRepoModel.write(str, "");
        String str3 = str2;
        return super.write(str, FilterParams.KEY_COURSE_ID.concat(String.valueOf((str3 == null || str3.length() == 0) ? " =? " : " =?  AND ".concat(String.valueOf(str2)))), parseDolbyChannelConfiguration.write(strArr, String.valueOf(AudioAttributesCompatParcelizer())));
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public T[] read(String str, String[] strArr, String str2) {
        String str3 = str;
        return (T[]) ((PlayerEmsgHandlerManifestExpiryEventInfo[]) super.read(FilterParams.KEY_COURSE_ID.concat(String.valueOf((str3 == null || str3.length() == 0) ? " =? " : " =?  AND ".concat(String.valueOf(str)))), parseDolbyChannelConfiguration.write(strArr, String.valueOf(AudioAttributesCompatParcelizer())), str2));
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer.onRemoveQueueItem();
    }
}
