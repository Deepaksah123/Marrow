package kotlin;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class SubscriptionRSModelKt extends RuntimeException {
    private final transient getTopicStat<?> AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final int write;

    private static String write(getTopicStat<?> gettopicstat) {
        Objects.requireNonNull(gettopicstat, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        sb.append(gettopicstat.RemoteActionCompatParcelizer());
        sb.append(" ");
        sb.append(gettopicstat.IconCompatParcelizer());
        return sb.toString();
    }

    public SubscriptionRSModelKt(getTopicStat<?> gettopicstat) {
        super(write(gettopicstat));
        this.write = gettopicstat.RemoteActionCompatParcelizer();
        this.RemoteActionCompatParcelizer = gettopicstat.IconCompatParcelizer();
        this.AudioAttributesCompatParcelizer = gettopicstat;
    }

    public final int write() {
        return this.write;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
