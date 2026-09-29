package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lo/lambdaonIsLoadingChanged32;", "", "", "p0", "<init>", "(Ljava/lang/String;IZ)V", "RemoteActionCompatParcelizer", "()Z", "AudioAttributesCompatParcelizer", "Z", "read", "IconCompatParcelizer"}, k = 1, mv = {1, 4, 0})
public enum lambdaonIsLoadingChanged32 {
    /* JADX INFO: Fake field, exist only in values array */
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    /* JADX INFO: Fake field, exist only in values array */
    FACEBOOK_APPLICATION_NATIVE(true),
    /* JADX INFO: Fake field, exist only in values array */
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    /* JADX INFO: Fake field, exist only in values array */
    CHROME_CUSTOM_TAB(true),
    /* JADX INFO: Fake field, exist only in values array */
    TEST_USER(true),
    /* JADX INFO: Fake field, exist only in values array */
    CLIENT_TOKEN(true),
    /* JADX INFO: Fake field, exist only in values array */
    DEVICE_AUTH(true);


    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean read;

    lambdaonIsLoadingChanged32(boolean z) {
        this.read = z;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }
}
