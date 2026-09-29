package kotlin;

import com.marrow.data.api.models.response.payment.PaymentStatusResponseKt;
import com.marrow.data.models.ResponseError;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u000e0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u000e0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0010J;\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u000e0\f¢\u0006\u0004\b\u0011\u0010\u0014"}, d2 = {"Lo/getNotesSlot;", "", "<init>", "()V", "", "p0", "", "p1", "", "p2", "Lcom/marrow/data/models/ResponseError;", "p3", "Lo/getSubscriptionExpiresOn;", "", "", "read", "(ZIJLcom/marrow/data/models/ResponseError;)Lo/getSubscriptionExpiresOn;", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "(ZIJLcom/marrow/data/models/ResponseError;)Ljava/util/Map;", "()Lo/getSubscriptionExpiresOn;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getNotesSlot {
    public static final getNotesSlot INSTANCE = new getNotesSlot();

    private getNotesSlot() {
    }

    public static Pair<String, Map<String, Object>> read(boolean p0, int p1, long p2, ResponseError p3) {
        toMagicModuleMetaRepoModel.write(p3, "");
        return setAction.write("video_error_dialog_shown", RemoteActionCompatParcelizer(p0, p1, p2, p3));
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer(boolean p0, int p1, long p2, ResponseError p3) {
        toMagicModuleMetaRepoModel.write(p3, "");
        return setAction.write("video_error_toast_shown", RemoteActionCompatParcelizer(p0, p1, p2, p3));
    }

    private static Map<String, Object> RemoteActionCompatParcelizer(boolean p0, int p1, long p2, ResponseError p3) {
        return VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("is_offline", Boolean.valueOf(p0)), setAction.write("resolution", Integer.valueOf(p1)), setAction.write("playback_time", Long.valueOf(p2)), setAction.write("error_code", Integer.valueOf(p3.getErrorCode())), setAction.write(PaymentStatusResponseKt.KEY_ERROR_MESSAGE, p3.getErrorMessage()));
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer() {
        return setAction.write("video_stream_online", VideoTimelineResponseBody.read());
    }
}
