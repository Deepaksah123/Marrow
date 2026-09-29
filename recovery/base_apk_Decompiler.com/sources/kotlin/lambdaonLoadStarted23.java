package kotlin;

import com.facebook.FacebookRequestError;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/lambdaonLoadStarted23;", "Lo/lambdaonMetadata50;", "Lcom/facebook/FacebookRequestError;", "p0", "", "p1", "<init>", "(Lcom/facebook/FacebookRequestError;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Lcom/facebook/FacebookRequestError;", "IconCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 4, 0})
public final class lambdaonLoadStarted23 extends lambdaonMetadata50 {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final FacebookRequestError IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lambdaonLoadStarted23(FacebookRequestError facebookRequestError, String str) {
        super(str);
        toMagicModuleMetaRepoModel.write(facebookRequestError, "");
        this.IconCompatParcelizer = facebookRequestError;
    }

    @Override // kotlin.lambdaonMetadata50, java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("{FacebookServiceException: httpResponseCode: ");
        sb.append(this.IconCompatParcelizer.getMediaDescriptionCompat());
        sb.append(", facebookErrorCode: ");
        sb.append(this.IconCompatParcelizer.getAudioAttributesImplApi21Parcelizer());
        sb.append(", facebookErrorType: ");
        sb.append(this.IconCompatParcelizer.getAudioAttributesImplBaseParcelizer());
        sb.append(", message: ");
        sb.append(this.IconCompatParcelizer.AudioAttributesCompatParcelizer());
        sb.append("}");
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }
}
