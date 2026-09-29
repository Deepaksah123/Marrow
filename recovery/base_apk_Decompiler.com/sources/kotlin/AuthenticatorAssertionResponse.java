package kotlin;

import android.content.Context;
import com.marrow.TrainingApplication;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u000e\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/AuthenticatorAssertionResponse;", "", "<init>", "()V", "", "p0", "p1", "p2", "p3", "p4", "Lkotlin/Function2;", "", "", "p5", "read", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/MagicModuleSubmissionRequestBody;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AuthenticatorAssertionResponse {
    public static final AuthenticatorAssertionResponse INSTANCE = new AuthenticatorAssertionResponse();

    private AuthenticatorAssertionResponse() {
    }

    public static void read(String str, String str2, String str3, MagicModuleSubmissionRequestBody<? super String, ? super Boolean, getShowPopup> magicModuleSubmissionRequestBody) {
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        Context applicationContext = TrainingApplication.read().getApplicationContext();
        String str4 = joinWithSeparator.read(applicationContext);
        if (!getTrackName.write(applicationContext)) {
            toMagicModuleMetaRepoModel.write((Object) str4);
            magicModuleSubmissionRequestBody.invoke(str4, Boolean.TRUE);
        } else {
            toMagicModuleMetaRepoModel.write(applicationContext);
            dispatchTouchEvent.IconCompatParcelizer(applicationContext, str, str2, new RemoteActionCompatParcelizer(magicModuleSubmissionRequestBody, str4), 80);
        }
    }

    public static final class RemoteActionCompatParcelizer extends HlsPlaylist<String> {
        private /* synthetic */ MagicModuleSubmissionRequestBody<String, Boolean, getShowPopup> AudioAttributesCompatParcelizer;
        private /* synthetic */ String read;

        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody<? super String, ? super Boolean, getShowPopup> magicModuleSubmissionRequestBody, String str) {
            this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
            this.read = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.HlsPlaylist
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void IconCompatParcelizer(String str) {
            MagicModuleSubmissionRequestBody<String, Boolean, getShowPopup> magicModuleSubmissionRequestBody = this.AudioAttributesCompatParcelizer;
            if (str == null) {
                str = this.read;
            }
            toMagicModuleMetaRepoModel.write((Object) str);
            magicModuleSubmissionRequestBody.invoke(str, Boolean.FALSE);
        }
    }
}
