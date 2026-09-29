package kotlin;

import java.io.IOException;
import kotlin.C0156TypeKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000eH&¢\u0006\u0004\b\r\u0010\u0010J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0006\u001a\u00020\u0011H&¢\u0006\u0004\b\u0003\u0010\u0013J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u000eH&¢\u0006\u0004\b\n\u0010\u0014J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u0015R\u0014\u0010\n\u001a\u00020\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/ServiceProviderModule;", "", "", "write", "()V", "Lo/ThemeKtExternalSyntheticLambda0;", "p0", "", "p1", "Lo/setCompoundDrawablesWithIntrinsicBoundsCompatdefault;", "read", "(Lo/ThemeKtExternalSyntheticLambda0;J)Lo/setCompoundDrawablesWithIntrinsicBoundsCompatdefault;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Lo/TypeKt;", "Lo/setLockedFromSeek;", "(Lo/TypeKt;)Lo/setLockedFromSeek;", "", "Lo/TypeKt$IconCompatParcelizer;", "(Z)Lo/TypeKt$IconCompatParcelizer;", "(Lo/TypeKt;)J", "(Lo/ThemeKtExternalSyntheticLambda0;)V", "Lo/VideoAnalyticModule;", "AudioAttributesCompatParcelizer", "()Lo/VideoAnalyticModule;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ServiceProviderModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    VideoAnalyticModule getIconCompatParcelizer();

    setLockedFromSeek IconCompatParcelizer(C0156TypeKt p0) throws IOException;

    void IconCompatParcelizer() throws IOException;

    void RemoteActionCompatParcelizer() throws IOException;

    long read(C0156TypeKt p0) throws IOException;

    setCompoundDrawablesWithIntrinsicBoundsCompatdefault read(ThemeKtExternalSyntheticLambda0 p0, long p1) throws IOException;

    void read(ThemeKtExternalSyntheticLambda0 p0) throws IOException;

    C0156TypeKt.IconCompatParcelizer write(boolean p0) throws IOException;

    void write();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/ServiceProviderModule$Companion;", "", "<init>", "()V", "", "DISCARD_STREAM_TIMEOUT_MILLIS", "I"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

        private Companion() {
        }
    }
}
