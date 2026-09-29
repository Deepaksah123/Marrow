package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/GoogleSignInResult;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class GoogleSignInResult {
    private static final /* synthetic */ GoogleSignInResult[] write;
    public static final GoogleSignInResult RemoteActionCompatParcelizer = new GoogleSignInResult("STAGE_FAQ", 0);
    public static final GoogleSignInResult AudioAttributesCompatParcelizer = new GoogleSignInResult("STAGE_CHECKBOX", 1);
    public static final GoogleSignInResult read = new GoogleSignInResult("STAGE_TEXTBOX", 2);

    private GoogleSignInResult(String str, int i) {
    }

    static {
        GoogleSignInResult[] googleSignInResultArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        write = googleSignInResultArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(googleSignInResultArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ GoogleSignInResult[] AudioAttributesCompatParcelizer() {
        return new GoogleSignInResult[]{RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer, read};
    }

    public static GoogleSignInResult valueOf(String str) {
        return (GoogleSignInResult) Enum.valueOf(GoogleSignInResult.class, str);
    }

    public static GoogleSignInResult[] values() {
        return (GoogleSignInResult[]) write.clone();
    }
}
