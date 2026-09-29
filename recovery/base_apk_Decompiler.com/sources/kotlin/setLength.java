package kotlin;

import android.os.Bundle;
import com.marrow.data.api.models.response.ApiResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u000e2\u00020\u0001:\u0003\u000e\t\u000fB!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f\u0082\u0001\u0002\u0010\u0011"}, d2 = {"Lo/setLength;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "write", "()Landroid/os/Bundle;", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "read", "Lo/setLength$read;", "Lo/setLength$write;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class setLength {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String write;
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    private setLength(String str, String str2, String str3) {
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.AudioAttributesCompatParcelizer = str3;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n"}, d2 = {"Lo/setLength$write;", "Lo/setLength;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "RemoteActionCompatParcelizer", "write", "Lo/setLength$write$write;", "Lo/setLength$write$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class write extends setLength {
        private write(String str, String str2) {
            super("recaptcha", str, str2, null);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setLength$write$RemoteActionCompatParcelizer;", "Lo/setLength$write;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class RemoteActionCompatParcelizer extends write {
            public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

            private RemoteActionCompatParcelizer() {
                super("success", "NA", null);
            }
        }

        /* JADX INFO: renamed from: o.setLength$write$write, reason: collision with other inner class name */
        public static final class C0143write extends write {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0143write(String str) {
                super(ApiResponse.STATUS_FAILURE, str, null);
                toMagicModuleMetaRepoModel.write(str, "");
            }
        }

        public /* synthetic */ write(String str, String str2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(str, str2);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n"}, d2 = {"Lo/setLength$read;", "Lo/setLength;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Lo/setLength$read$IconCompatParcelizer;", "Lo/setLength$read$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class read extends setLength {
        private read(String str, String str2) {
            super("hcaptcha", str, str2, null);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setLength$read$RemoteActionCompatParcelizer;", "Lo/setLength$read;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class RemoteActionCompatParcelizer extends read {
            public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

            private RemoteActionCompatParcelizer() {
                super("success", "NA", null);
            }
        }

        public static final class IconCompatParcelizer extends read {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IconCompatParcelizer(String str) {
                super(ApiResponse.STATUS_FAILURE, str, null);
                toMagicModuleMetaRepoModel.write(str, "");
            }
        }

        public /* synthetic */ read(String str, String str2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(str, str2);
        }
    }

    public final Bundle write() {
        Bundle bundle = new Bundle();
        bundle.putString("vendor", this.write);
        bundle.putString("status", this.RemoteActionCompatParcelizer);
        bundle.putString("errorCode", this.AudioAttributesCompatParcelizer);
        return bundle;
    }

    public /* synthetic */ setLength(String str, String str2, String str3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, str3);
    }
}
