package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.net.HttpURLConnection;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda55;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda6;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda61;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getMagicModuleMeta;
import kotlin.lambdaonLoadStarted23;
import kotlin.lambdaonMediaMetadataChanged48;
import kotlin.lambdaonMetadata50;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 @2\u00020\u0001:\u0003?@AB!\b\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rB\u000f\b\u0012\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010B\u0081\u0001\b\u0002\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010\u001fJ\b\u00109\u001a\u00020\tH\u0016J\b\u0010:\u001a\u00020\u000bH\u0016J\u0018\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\tH\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010,\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010+R\"\u0010\u0004\u001a\u0004\u0018\u00010\u001c2\b\u00101\u001a\u0004\u0018\u00010\u001c@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0011\u0010\u0011\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b8\u0010)¨\u0006B"}, d2 = {"Lcom/facebook/FacebookRequestError;", "Landroid/os/Parcelable;", "connection", "Ljava/net/HttpURLConnection;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V", "errorCode", "", "errorType", "", "errorMessage", "(ILjava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "requestStatusCode", "subErrorCode", "errorMessageField", "errorUserTitle", "errorUserMessage", "requestResultBody", "Lorg/json/JSONObject;", "requestResult", "batchRequestResult", "", "exceptionField", "Lcom/facebook/FacebookException;", "errorIsTransient", "", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;Z)V", "getBatchRequestResult", "()Ljava/lang/Object;", "category", "Lcom/facebook/FacebookRequestError$Category;", "getCategory", "()Lcom/facebook/FacebookRequestError$Category;", "getConnection", "()Ljava/net/HttpURLConnection;", "getErrorCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "errorRecoveryMessage", "getErrorRecoveryMessage", "getErrorType", "getErrorUserMessage", "getErrorUserTitle", "<set-?>", "getException", "()Lcom/facebook/FacebookException;", "getRequestResult", "()Lorg/json/JSONObject;", "getRequestResultBody", "getRequestStatusCode", "getSubErrorCode", "describeContents", "toString", "writeToParcel", "", "out", "flags", "Category", "Companion", RtspHeaders.RANGE, "facebook-core_release"}, k = 1, mv = {1, 4, 0})
public final class FacebookRequestError implements Parcelable {
    private final int AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final HttpURLConnection IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final JSONObject MediaBrowserCompatMediaItem;
    private lambdaonMetadata50 MediaBrowserCompatSearchResultReceiver;
    private final int MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final JSONObject RatingCompat;
    private final int onCustomAction;
    private final Object read;
    private final read write;
    public static final write RemoteActionCompatParcelizer = new write(null);
    private static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer();
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new AudioAttributesCompatParcelizer();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/facebook/FacebookRequestError$read;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "read", "write"}, k = 1, mv = {1, 4, 0})
    public enum read {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, lambdaonMetadata50 lambdaonmetadata50, boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, i2, i3, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, lambdaonmetadata50, z);
    }

    public /* synthetic */ FacebookRequestError(Parcel parcel, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(parcel);
    }

    private FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, lambdaonMetadata50 lambdaonmetadata50, boolean z) {
        read readVarIconCompatParcelizer;
        this.MediaDescriptionCompat = i;
        this.AudioAttributesImplApi21Parcelizer = i2;
        this.onCustomAction = i3;
        this.AudioAttributesImplBaseParcelizer = str;
        this.MediaMetadataCompat = str3;
        this.MediaBrowserCompatCustomActionResultReceiver = str4;
        this.RatingCompat = jSONObject;
        this.MediaBrowserCompatMediaItem = jSONObject2;
        this.read = obj;
        this.IconCompatParcelizer = httpURLConnection;
        this.MediaBrowserCompatItemReceiver = str2;
        if (lambdaonmetadata50 != null) {
            this.MediaBrowserCompatSearchResultReceiver = lambdaonmetadata50;
            readVarIconCompatParcelizer = read.OTHER;
        } else {
            this.MediaBrowserCompatSearchResultReceiver = new lambdaonLoadStarted23(this, AudioAttributesCompatParcelizer());
            readVarIconCompatParcelizer = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().IconCompatParcelizer(i2, i3, z);
        }
        this.write = readVarIconCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(readVarIconCompatParcelizer);
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final int getOnCustomAction() {
        return this.onCustomAction;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public static final class RemoteActionCompatParcelizer {
        private final int RemoteActionCompatParcelizer = 200;
        private final int read = 299;

        public final boolean IconCompatParcelizer(int i) {
            return this.RemoteActionCompatParcelizer <= i && this.read >= i;
        }
    }

    public final String AudioAttributesCompatParcelizer() {
        String str = this.MediaBrowserCompatItemReceiver;
        if (str != null) {
            return str;
        }
        lambdaonMetadata50 lambdaonmetadata50 = this.MediaBrowserCompatSearchResultReceiver;
        if (lambdaonmetadata50 != null) {
            return lambdaonmetadata50.getLocalizedMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final lambdaonMetadata50 getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public FacebookRequestError(HttpURLConnection httpURLConnection, Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, exc instanceof lambdaonMetadata50 ? (lambdaonMetadata50) exc : new lambdaonMetadata50(exc), false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{HttpStatus: ");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", errorCode: ");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", subErrorCode: ");
        sb.append(this.onCustomAction);
        sb.append(", errorType: ");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", errorMessage: ");
        sb.append(AudioAttributesCompatParcelizer());
        sb.append("}");
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int flags) {
        toMagicModuleMetaRepoModel.write(out, "");
        out.writeInt(this.MediaDescriptionCompat);
        out.writeInt(this.AudioAttributesImplApi21Parcelizer);
        out.writeInt(this.onCustomAction);
        out.writeString(this.AudioAttributesImplBaseParcelizer);
        out.writeString(AudioAttributesCompatParcelizer());
        out.writeString(this.MediaMetadataCompat);
        out.writeString(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f8\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/facebook/FacebookRequestError$write;", "", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "p1", "Ljava/net/HttpURLConnection;", "p2", "Lcom/facebook/FacebookRequestError;", "AudioAttributesCompatParcelizer", "(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;)Lcom/facebook/FacebookRequestError;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/FacebookRequestError$RemoteActionCompatParcelizer;", "Lcom/facebook/FacebookRequestError$RemoteActionCompatParcelizer;", "read", "()Lcom/facebook/FacebookRequestError$RemoteActionCompatParcelizer;", "write", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55;", "RemoteActionCompatParcelizer", "()Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55;"}, k = 1, mv = {1, 4, 0})
    public static final class write {
        private write() {
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        private static RemoteActionCompatParcelizer read() {
            return FacebookRequestError.AudioAttributesCompatParcelizer;
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x00cd A[Catch: JSONException -> 0x0127, TryCatch #0 {JSONException -> 0x0127, blocks: (B:3:0x0012, B:5:0x0018, B:9:0x0026, B:12:0x0034, B:14:0x003f, B:17:0x0049, B:20:0x0053, B:23:0x005b, B:25:0x0061, B:28:0x006b, B:31:0x0075, B:45:0x00cd, B:34:0x0080, B:37:0x008d, B:39:0x0096, B:43:0x00a8, B:47:0x00ef, B:49:0x00fd, B:51:0x0103, B:53:0x010c), top: B:57:0x0012 }] */
        @kotlin.getMagicModuleMeta
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.facebook.FacebookRequestError AudioAttributesCompatParcelizer(org.json.JSONObject r20, java.lang.Object r21, java.net.HttpURLConnection r22) {
            /*
                Method dump skipped, instruction units count: 296
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookRequestError.write.AudioAttributesCompatParcelizer(org.json.JSONObject, java.lang.Object, java.net.HttpURLConnection):com.facebook.FacebookRequestError");
        }

        @getMagicModuleMeta
        public final DefaultAnalyticsCollectorExternalSyntheticLambda55 RemoteActionCompatParcelizer() {
            synchronized (this) {
                DefaultAnalyticsCollectorExternalSyntheticLambda6 defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda61.AudioAttributesCompatParcelizer(lambdaonMediaMetadataChanged48.write());
                if (defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer == null) {
                    return DefaultAnalyticsCollectorExternalSyntheticLambda55.INSTANCE.IconCompatParcelizer();
                }
                return defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer.getWrite();
            }
        }
    }

    public static final class AudioAttributesCompatParcelizer implements Parcelable.Creator<FacebookRequestError> {
        AudioAttributesCompatParcelizer() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FacebookRequestError createFromParcel(Parcel parcel) {
            return write(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FacebookRequestError[] newArray(int i) {
            return read(i);
        }

        private static FacebookRequestError write(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new FacebookRequestError(parcel, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
        }

        private static FacebookRequestError[] read(int i) {
            return new FacebookRequestError[i];
        }
    }
}
