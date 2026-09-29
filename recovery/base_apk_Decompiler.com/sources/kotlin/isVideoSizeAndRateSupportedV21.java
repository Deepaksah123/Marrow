package kotlin;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import kotlin.maybeThrowInternalException;

/* JADX INFO: loaded from: classes3.dex */
final class isVideoSizeAndRateSupportedV21 {
    private final bypassRender AudioAttributesCompatParcelizer;
    private final onInputBufferAvailable<EventMessageDecoder> AudioAttributesImplBaseParcelizer;
    private final onInputBufferAvailable<maybeThrowInternalException> IconCompatParcelizer;
    private final hasSamples RemoteActionCompatParcelizer;
    private final FirebaseApp read;
    private final Rpc write;

    isVideoSizeAndRateSupportedV21(FirebaseApp firebaseApp, bypassRender bypassrender, onInputBufferAvailable<EventMessageDecoder> oninputbufferavailable, onInputBufferAvailable<maybeThrowInternalException> oninputbufferavailable2, hasSamples hassamples) {
        this(firebaseApp, bypassrender, new Rpc(firebaseApp.AudioAttributesCompatParcelizer()), oninputbufferavailable, oninputbufferavailable2, hassamples);
    }

    private isVideoSizeAndRateSupportedV21(FirebaseApp firebaseApp, bypassRender bypassrender, Rpc rpc, onInputBufferAvailable<EventMessageDecoder> oninputbufferavailable, onInputBufferAvailable<maybeThrowInternalException> oninputbufferavailable2, hasSamples hassamples) {
        this.read = firebaseApp;
        this.AudioAttributesCompatParcelizer = bypassrender;
        this.write = rpc;
        this.AudioAttributesImplBaseParcelizer = oninputbufferavailable;
        this.IconCompatParcelizer = oninputbufferavailable2;
        this.RemoteActionCompatParcelizer = hassamples;
    }

    final Task<String> AudioAttributesCompatParcelizer() {
        return RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(bypassRender.AudioAttributesCompatParcelizer(this.read), "*", new Bundle()));
    }

    final Task<?> write(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/".concat(String.valueOf(str2)));
        return RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(str, "/topics/".concat(String.valueOf(str2)), bundle));
    }

    final Task<?> AudioAttributesCompatParcelizer(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/".concat(String.valueOf(str2)));
        bundle.putString("delete", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        return RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(str, "/topics/".concat(String.valueOf(str2)), bundle));
    }

    private Task<Bundle> RemoteActionCompatParcelizer(String str, String str2, Bundle bundle) {
        try {
            read(str, str2, bundle);
            return this.write.send(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }

    private static String RemoteActionCompatParcelizer(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private String read() {
        try {
            return RemoteActionCompatParcelizer(MessageDigest.getInstance("SHA-1").digest(this.read.IconCompatParcelizer().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private void read(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        maybeThrowInternalException.read readVarAudioAttributesCompatParcelizer;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.read.read().RemoteActionCompatParcelizer());
        bundle.putString("gmsv", Integer.toString(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.AudioAttributesCompatParcelizer.read());
        bundle.putString("app_ver_name", this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer());
        bundle.putString("firebase-app-name-hash", read());
        try {
            String strAudioAttributesCompatParcelizer = ((getLastOutputBufferPresentationTimeUs) Tasks.await(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer())).AudioAttributesCompatParcelizer();
            if (!TextUtils.isEmpty(strAudioAttributesCompatParcelizer)) {
                bundle.putString("Goog-Firebase-Installations-Auth", strAudioAttributesCompatParcelizer);
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        bundle.putString("appid", (String) Tasks.await(this.RemoteActionCompatParcelizer.write()));
        bundle.putString("cliv", "fcm-23.2.1");
        maybeThrowInternalException maybethrowinternalexceptionWrite = this.IconCompatParcelizer.write();
        EventMessageDecoder eventMessageDecoderWrite = this.AudioAttributesImplBaseParcelizer.write();
        if (maybethrowinternalexceptionWrite == null || eventMessageDecoderWrite == null || (readVarAudioAttributesCompatParcelizer = maybethrowinternalexceptionWrite.AudioAttributesCompatParcelizer()) == maybeThrowInternalException.read.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(readVarAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()));
        bundle.putString("Firebase-Client", eventMessageDecoderWrite.IconCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String RemoteActionCompatParcelizer(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Objects.toString(bundle);
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    private Task<String> RemoteActionCompatParcelizer(Task<Bundle> task) {
        return task.continueWith(new ObjectIdWriter(), new Continuation() { // from class: o.MediaCodecInfoApi29
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return isVideoSizeAndRateSupportedV21.RemoteActionCompatParcelizer((Bundle) task2.getResult(IOException.class));
            }
        });
    }

    static boolean RemoteActionCompatParcelizer(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }
}
