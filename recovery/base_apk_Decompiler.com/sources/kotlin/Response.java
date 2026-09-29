package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/Response;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Response {
    private static final /* synthetic */ Response[] read;
    public static final Response IconCompatParcelizer = new Response("NORMAL", 0);
    public static final Response AudioAttributesCompatParcelizer = new Response("IMAGE_ATTRIBUTION", 1);

    private Response(String str, int i) {
    }

    static {
        Response[] responseArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        read = responseArrRemoteActionCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(responseArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ Response[] RemoteActionCompatParcelizer() {
        return new Response[]{IconCompatParcelizer, AudioAttributesCompatParcelizer};
    }

    public static Response valueOf(String str) {
        return (Response) Enum.valueOf(Response.class, str);
    }

    public static Response[] values() {
        return (Response[]) read.clone();
    }
}
