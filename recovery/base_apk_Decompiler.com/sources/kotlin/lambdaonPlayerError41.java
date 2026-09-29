package kotlin;

import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\f¢\u0006\u0004\b\n\u0010\rB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u000fBC\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0012J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u001c\u0010#\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lo/lambdaonPlayerError41;", "", "Lcom/facebook/GraphRequest;", "p0", "Ljava/net/HttpURLConnection;", "p1", "", "p2", "Lorg/json/JSONObject;", "p3", "<init>", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONObject;)V", "Lorg/json/JSONArray;", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONArray;)V", "Lcom/facebook/FacebookRequestError;", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookRequestError;)V", "p4", "p5", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;Lcom/facebook/FacebookRequestError;)V", "AudioAttributesCompatParcelizer", "()Lorg/json/JSONObject;", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Ljava/net/HttpURLConnection;", "IconCompatParcelizer", "Lcom/facebook/FacebookRequestError;", "()Lcom/facebook/FacebookRequestError;", "write", "Lorg/json/JSONObject;", "read", "AudioAttributesImplApi26Parcelizer", "Lorg/json/JSONArray;", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "Ljava/lang/String;", "AudioAttributesImplApi21Parcelizer", "Lcom/facebook/GraphRequest;"}, k = 1, mv = {1, 4, 0})
public final class lambdaonPlayerError41 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String read = lambdaonPlayerError41.class.getCanonicalName();

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final GraphRequest AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final JSONArray AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final FacebookRequestError write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final JSONArray RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final JSONObject AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final HttpURLConnection IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final JSONObject read;

    private lambdaonPlayerError41(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        toMagicModuleMetaRepoModel.write(graphRequest, "");
        this.AudioAttributesImplApi26Parcelizer = graphRequest;
        this.IconCompatParcelizer = httpURLConnection;
        this.MediaBrowserCompatItemReceiver = str;
        this.read = jSONObject;
        this.AudioAttributesCompatParcelizer = jSONArray;
        this.write = facebookRequestError;
        this.AudioAttributesImplBaseParcelizer = jSONObject;
        this.RemoteActionCompatParcelizer = jSONArray;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final FacebookRequestError getWrite() {
        return this.write;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lambdaonPlayerError41(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, null, null);
        toMagicModuleMetaRepoModel.write(graphRequest, "");
        toMagicModuleMetaRepoModel.write(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lambdaonPlayerError41(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, null, jSONArray, null);
        toMagicModuleMetaRepoModel.write(graphRequest, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(jSONArray, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lambdaonPlayerError41(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, null, null, null, facebookRequestError);
        toMagicModuleMetaRepoModel.write(graphRequest, "");
        toMagicModuleMetaRepoModel.write(facebookRequestError, "");
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final JSONObject getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final JSONObject getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final String toString() {
        String str;
        try {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.IconCompatParcelizer;
            str = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200)}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder sb = new StringBuilder("{Response:  responseCode: ");
        sb.append(str);
        sb.append(", graphObject: ");
        sb.append(this.read);
        sb.append(", error: ");
        sb.append(this.write);
        sb.append("}");
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    /* JADX INFO: renamed from: o.lambdaonPlayerError41$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0011J1\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00122\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u0006\u001a\u00020\u00162\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\f\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00168\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c"}, d2 = {"Lo/lambdaonPlayerError41$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "Lcom/facebook/GraphRequest;", "p0", "Ljava/net/HttpURLConnection;", "p1", "Lo/lambdaonMetadata50;", "p2", "Lo/lambdaonPlayerError41;", "write", "(Ljava/util/List;Ljava/net/HttpURLConnection;Lo/lambdaonMetadata50;)Ljava/util/List;", "p3", "AudioAttributesCompatParcelizer", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/Object;Ljava/lang/Object;)Lo/lambdaonPlayerError41;", "(Ljava/net/HttpURLConnection;Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;", "Ljava/io/InputStream;", "Lo/lambdaonPlaybackSuppressionReasonChanged37;", "IconCompatParcelizer", "(Ljava/io/InputStream;Ljava/net/HttpURLConnection;Lo/lambdaonPlaybackSuppressionReasonChanged37;)Ljava/util/List;", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Ljava/net/HttpURLConnection;Lo/lambdaonPlaybackSuppressionReasonChanged37;)Ljava/util/List;", "(Ljava/net/HttpURLConnection;Lo/lambdaonPlaybackSuppressionReasonChanged37;)Ljava/util/List;", "read", "Ljava/lang/String;", "()Ljava/lang/String;"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        private static String read() {
            return lambdaonPlayerError41.read;
        }

        @getMagicModuleMeta
        public final List<lambdaonPlayerError41> write(HttpURLConnection p0, lambdaonPlaybackSuppressionReasonChanged37 p1) {
            List<lambdaonPlayerError41> listWrite;
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            InputStream inputStream = null;
            try {
                try {
                    try {
                    } catch (lambdaonMetadata50 e) {
                        DefaultAnalyticsCollectorExternalSyntheticLambda68.read.RemoteActionCompatParcelizer(lambdaonPositionDiscontinuity43.REQUESTS, "Response", "Response <Error>: %s", e);
                        Companion companion = this;
                        listWrite = write(p1, p0, e);
                    }
                } catch (Exception e2) {
                    DefaultAnalyticsCollectorExternalSyntheticLambda68.read.RemoteActionCompatParcelizer(lambdaonPositionDiscontinuity43.REQUESTS, "Response", "Response <Error>: %s", e2);
                    Companion companion2 = this;
                    listWrite = write(p1, p0, new lambdaonMetadata50(e2));
                }
                if (!lambdaonMediaMetadataChanged48.onCommand()) {
                    Companion companion3 = this;
                    read();
                    throw new lambdaonMetadata50("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                }
                if (p0.getResponseCode() >= 400) {
                    inputStream = p0.getErrorStream();
                } else {
                    inputStream = p0.getInputStream();
                }
                Companion companion4 = this;
                listWrite = IconCompatParcelizer(inputStream, p0, p1);
                return listWrite;
            } finally {
                DefaultAnalyticsCollectorMediaPeriodQueueTracker.RemoteActionCompatParcelizer((Closeable) null);
            }
        }

        @getMagicModuleMeta
        private List<lambdaonPlayerError41> IconCompatParcelizer(InputStream p0, HttpURLConnection p1, lambdaonPlaybackSuppressionReasonChanged37 p2) throws Throwable {
            toMagicModuleMetaRepoModel.write(p2, "");
            String strWrite = DefaultAnalyticsCollectorMediaPeriodQueueTracker.write(p0);
            DefaultAnalyticsCollectorExternalSyntheticLambda68.read.RemoteActionCompatParcelizer(lambdaonPositionDiscontinuity43.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(strWrite.length()), strWrite);
            return RemoteActionCompatParcelizer(strWrite, p1, p2);
        }

        @getMagicModuleMeta
        private List<lambdaonPlayerError41> RemoteActionCompatParcelizer(String p0, HttpURLConnection p1, lambdaonPlaybackSuppressionReasonChanged37 p2) throws JSONException, lambdaonMetadata50, IOException {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            Object objNextValue = new JSONTokener(p0).nextValue();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objNextValue, "");
            List<lambdaonPlayerError41> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p1, p2, objNextValue);
            DefaultAnalyticsCollectorExternalSyntheticLambda68.read.RemoteActionCompatParcelizer(lambdaonPositionDiscontinuity43.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", p2.getAudioAttributesCompatParcelizer(), Integer.valueOf(p0.length()), listAudioAttributesCompatParcelizer);
            return listAudioAttributesCompatParcelizer;
        }

        private final List<lambdaonPlayerError41> AudioAttributesCompatParcelizer(HttpURLConnection p0, List<GraphRequest> p1, Object p2) throws lambdaonMetadata50, JSONException {
            Object obj;
            int size = p1.size();
            ArrayList arrayList = new ArrayList(size);
            if (size == 1) {
                GraphRequest graphRequest = p1.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("body", p2);
                    jSONObject.put("code", p0 != null ? p0.getResponseCode() : 200);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    obj = jSONArray;
                } catch (IOException e) {
                    arrayList.add(new lambdaonPlayerError41(graphRequest, p0, new FacebookRequestError(p0, e)));
                    obj = p2;
                } catch (JSONException e2) {
                    arrayList.add(new lambdaonPlayerError41(graphRequest, p0, new FacebookRequestError(p0, e2)));
                    obj = p2;
                }
            } else {
                obj = p2;
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj;
                if (jSONArray2.length() == size) {
                    int length = jSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        GraphRequest graphRequest2 = p1.get(i);
                        try {
                            Object obj2 = ((JSONArray) obj).get(i);
                            Companion companion = this;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj2, "");
                            arrayList.add(AudioAttributesCompatParcelizer(graphRequest2, p0, obj2, p2));
                        } catch (lambdaonMetadata50 e3) {
                            arrayList.add(new lambdaonPlayerError41(graphRequest2, p0, new FacebookRequestError(p0, e3)));
                        } catch (JSONException e4) {
                            arrayList.add(new lambdaonPlayerError41(graphRequest2, p0, new FacebookRequestError(p0, e4)));
                        }
                    }
                    return arrayList;
                }
            }
            throw new lambdaonMetadata50("Unexpected number of results");
        }

        private final lambdaonPlayerError41 AudioAttributesCompatParcelizer(GraphRequest p0, HttpURLConnection p1, Object p2, Object p3) throws JSONException {
            if (p2 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) p2;
                FacebookRequestError facebookRequestErrorAudioAttributesCompatParcelizer = FacebookRequestError.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(jSONObject, p3, p1);
                if (facebookRequestErrorAudioAttributesCompatParcelizer != null) {
                    read();
                    if (facebookRequestErrorAudioAttributesCompatParcelizer.getAudioAttributesImplApi21Parcelizer() == 190 && DefaultAnalyticsCollectorMediaPeriodQueueTracker.read(p0.getIconCompatParcelizer())) {
                        if (facebookRequestErrorAudioAttributesCompatParcelizer.getOnCustomAction() != 493) {
                            AccessToken.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = AccessToken.RemoteActionCompatParcelizer;
                            AccessToken.AudioAttributesCompatParcelizer.IconCompatParcelizer(null);
                        } else {
                            AccessToken.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = AccessToken.RemoteActionCompatParcelizer;
                            AccessToken accessToken = AccessToken.AudioAttributesCompatParcelizer.read();
                            if (accessToken != null && !accessToken.RatingCompat()) {
                                AccessToken.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                            }
                        }
                    }
                    return new lambdaonPlayerError41(p0, p1, facebookRequestErrorAudioAttributesCompatParcelizer);
                }
                Object objIconCompatParcelizer = DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (objIconCompatParcelizer instanceof JSONObject) {
                    return new lambdaonPlayerError41(p0, p1, objIconCompatParcelizer.toString(), (JSONObject) objIconCompatParcelizer);
                }
                if (objIconCompatParcelizer instanceof JSONArray) {
                    return new lambdaonPlayerError41(p0, p1, objIconCompatParcelizer.toString(), (JSONArray) objIconCompatParcelizer);
                }
                p2 = JSONObject.NULL;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(p2, "");
            }
            if (p2 == JSONObject.NULL) {
                return new lambdaonPlayerError41(p0, p1, p2.toString(), (JSONObject) null);
            }
            StringBuilder sb = new StringBuilder("Got unexpected object type in response, class: ");
            sb.append(p2.getClass().getSimpleName());
            throw new lambdaonMetadata50(sb.toString());
        }

        @getMagicModuleMeta
        public static List<lambdaonPlayerError41> write(List<GraphRequest> p0, HttpURLConnection p1, lambdaonMetadata50 p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            List<GraphRequest> list = p0;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new lambdaonPlayerError41((GraphRequest) it.next(), p1, new FacebookRequestError(p1, p2)));
            }
            return arrayList;
        }
    }
}
