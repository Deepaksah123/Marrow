package com.marrow.utils.exceptions;

import com.google.android.play.core.integrity.StandardIntegrityException;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.VideoTimelineResponseBody;
import kotlin.getKycMessage;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0012\u0010\u0012\u001a\u00020\u000f2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015J\u0012\u0010\u0016\u001a\u00020\u000f2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015J\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00182\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\tJ\f\u0010\u001b\u001a\u00020\t*\u00020\tH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/marrow/utils/exceptions/PlayIntegrityExceptionUtil;", "", "<init>", "()V", "RETRY_REQUIRED_ERROR_CODES", "", "", "SUPPRESSED_ERROR_CODES", "EVENT_NAME", "", "TAG_NON_FATAL", "KEY_ERROR_CODE", "KEY_ERROR_MSG", "KEY_TAG", "isSuppressed", "", "t", "", "isRetryRequired", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "isProviderInvalid", "toAnalyticMap", "", PlayIntegrityExceptionUtil.KEY_TAG, "MAX_FB_PARAM_LENGTH", "safeParam", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlayIntegrityExceptionUtil {
    public static final String EVENT_NAME = "pic";
    private static final String KEY_ERROR_CODE = "error_code";
    private static final String KEY_ERROR_MSG = "error_msg";
    private static final String KEY_TAG = "tag";
    private static final int MAX_FB_PARAM_LENGTH = 100;
    public static final String TAG_NON_FATAL = "non_fatal";
    public static final PlayIntegrityExceptionUtil INSTANCE = new PlayIntegrityExceptionUtil();
    private static final Set<Integer> RETRY_REQUIRED_ERROR_CODES = getKycMessage.read(-19);
    private static final Set<Integer> SUPPRESSED_ERROR_CODES = getKycMessage.IconCompatParcelizer(-2, -3, -19);
    public static final int $stable = 8;

    private PlayIntegrityExceptionUtil() {
    }

    public final boolean isSuppressed(Throwable t) {
        toMagicModuleMetaRepoModel.write(t, "");
        return (t instanceof StandardIntegrityException) && SUPPRESSED_ERROR_CODES.contains(Integer.valueOf(((StandardIntegrityException) t).getErrorCode()));
    }

    public final boolean isRetryRequired(Exception e) {
        toMagicModuleMetaRepoModel.write(e, "");
        return (e instanceof StandardIntegrityException) && RETRY_REQUIRED_ERROR_CODES.contains(Integer.valueOf(((StandardIntegrityException) e).getErrorCode()));
    }

    public final boolean isProviderInvalid(Exception e) {
        toMagicModuleMetaRepoModel.write(e, "");
        return (e instanceof StandardIntegrityException) && ((StandardIntegrityException) e).getErrorCode() == -19;
    }

    public final Map<String, String> toAnalyticMap(Throwable t, String tag) {
        toMagicModuleMetaRepoModel.write(t, "");
        toMagicModuleMetaRepoModel.write(tag, "");
        Map mapRemoteActionCompatParcelizer = VideoTimelineResponseBody.RemoteActionCompatParcelizer();
        if (t instanceof StandardIntegrityException) {
            mapRemoteActionCompatParcelizer.put(KEY_ERROR_CODE, String.valueOf(((StandardIntegrityException) t).getErrorCode()));
            PlayIntegrityExceptionUtil playIntegrityExceptionUtil = INSTANCE;
            String message = t.getMessage();
            if (message == null) {
                message = "PI_FAILURE";
            }
            mapRemoteActionCompatParcelizer.put(KEY_ERROR_MSG, playIntegrityExceptionUtil.safeParam(message));
        }
        mapRemoteActionCompatParcelizer.put(KEY_TAG, tag);
        return VideoTimelineResponseBody.read(mapRemoteActionCompatParcelizer);
    }

    private final String safeParam(String str) {
        return str.length() > 100 ? TestGroupLSModel.RemoteActionCompatParcelizer(str, 100) : str;
    }
}
