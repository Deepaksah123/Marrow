package kotlin;

import android.content.Context;
import com.marrow.data.models.custommodule.FilterParams;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class r8lambdaQhKDSbjrsLfLz7h85E2gZ0PpZrc<T> extends getIntervalUntilNextManifestRefreshMs<T> {
    private final getStreamPositionUsForContent read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaQhKDSbjrsLfLz7h85E2gZ0PpZrc(Context context, String str, getStreamPositionUsForContent getstreampositionusforcontent) {
        super(context, str);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        this.read = getstreampositionusforcontent;
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write(FilterParams.KEY_COURSE_ID, "INTEGER"));
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String[] read(String str, String str2, String[] strArr, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        String[] strArr2 = super.read(str, FilterParams.KEY_COURSE_ID.concat(String.valueOf(str2.length() == 0 ? " =? " : " =?  AND ".concat(String.valueOf(str2)))), parseDolbyChannelConfiguration.write(strArr, String.valueOf(write())), str3);
        if (strArr2 == null) {
            strArr2 = new String[0];
        }
        return (String[]) Arrays.copyOf(strArr2, strArr2.length);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    protected final int AudioAttributesCompatParcelizer(String str, String str2, String[] strArr) {
        toMagicModuleMetaRepoModel.write(str, "");
        String str3 = str2;
        return super.AudioAttributesCompatParcelizer(str, FilterParams.KEY_COURSE_ID.concat(String.valueOf((str3 == null || str3.length() == 0) ? " =? " : " =?  AND ".concat(String.valueOf(str2)))), parseDolbyChannelConfiguration.write(strArr, String.valueOf(write())));
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    protected final String write(String str, String str2, String[] strArr) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(strArr, "");
        return super.write(str, FilterParams.KEY_COURSE_ID.concat(String.valueOf(str2.length() == 0 ? " =? " : " =?  AND ".concat(String.valueOf(str2)))), parseDolbyChannelConfiguration.write(strArr, String.valueOf(write())));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public T[] read(String str, String[] strArr, String str2) {
        String str3 = str;
        return (T[]) super.read(FilterParams.KEY_COURSE_ID.concat(String.valueOf((str3 == null || str3.length() == 0) ? " =? " : " =?  AND ".concat(String.valueOf(str)))), parseDolbyChannelConfiguration.write(strArr, String.valueOf(write())), str2);
    }

    protected final int write() {
        return this.read.onRemoveQueueItem();
    }
}
