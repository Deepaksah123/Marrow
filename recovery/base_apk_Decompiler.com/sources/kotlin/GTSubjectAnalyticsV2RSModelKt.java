package kotlin;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.razorpay.C$0o__;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.GTAnalyticsV2ResponseModelCompanion;
import kotlin.ShapeKt;
import kotlin.ThemeKtWhenMappings;

/* JADX INFO: loaded from: classes4.dex */
final class GTSubjectAnalyticsV2RSModelKt {
    final String AudioAttributesCompatParcelizer;
    private final GTAnalyticsV2ResponseModelCompanion<?>[] AudioAttributesImplApi21Parcelizer;
    private final ShapeKt AudioAttributesImplApi26Parcelizer;
    private final boolean AudioAttributesImplBaseParcelizer;
    private final MediaType IconCompatParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final Method MediaBrowserCompatItemReceiver;
    private final String MediaMetadataCompat;
    final boolean RemoteActionCompatParcelizer;
    private final boolean read;
    private final ThemeAlphaConstantsKt write;

    static GTSubjectAnalyticsV2RSModelKt IconCompatParcelizer(GTNudgeRequestModel gTNudgeRequestModel, Method method) {
        return new write(gTNudgeRequestModel, method).IconCompatParcelizer();
    }

    GTSubjectAnalyticsV2RSModelKt(write writeVar) {
        this.MediaBrowserCompatItemReceiver = writeVar.MediaBrowserCompatItemReceiver;
        this.write = writeVar.MediaDescriptionCompat.write;
        this.AudioAttributesCompatParcelizer = writeVar.IconCompatParcelizer;
        this.MediaMetadataCompat = writeVar.AudioAttributesImplApi21Parcelizer;
        this.AudioAttributesImplApi26Parcelizer = writeVar.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = writeVar.AudioAttributesCompatParcelizer;
        this.read = writeVar.write;
        this.MediaBrowserCompatCustomActionResultReceiver = writeVar.read;
        this.AudioAttributesImplBaseParcelizer = writeVar.AudioAttributesImplBaseParcelizer;
        this.AudioAttributesImplApi21Parcelizer = writeVar.MediaBrowserCompatCustomActionResultReceiver;
        this.RemoteActionCompatParcelizer = writeVar.AudioAttributesImplApi26Parcelizer;
    }

    final ThemeKtExternalSyntheticLambda0 RemoteActionCompatParcelizer(Object[] objArr) throws IOException {
        GTAnalyticsV2ResponseModelCompanion<?>[] gTAnalyticsV2ResponseModelCompanionArr = this.AudioAttributesImplApi21Parcelizer;
        int length = objArr.length;
        if (length != gTAnalyticsV2ResponseModelCompanionArr.length) {
            StringBuilder sb = new StringBuilder("Argument count (");
            sb.append(length);
            sb.append(") doesn't match expected count (");
            sb.append(gTAnalyticsV2ResponseModelCompanionArr.length);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        toRSModel torsmodel = new toRSModel(this.AudioAttributesCompatParcelizer, this.write, this.MediaMetadataCompat, this.AudioAttributesImplApi26Parcelizer, this.IconCompatParcelizer, this.read, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer);
        if (this.RemoteActionCompatParcelizer) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            gTAnalyticsV2ResponseModelCompanionArr[i].RemoteActionCompatParcelizer(torsmodel, objArr[i]);
        }
        return torsmodel.read().IconCompatParcelizer((Class<? super TagLSModel>) TagLSModel.class, new TagLSModel(this.MediaBrowserCompatItemReceiver, arrayList)).RemoteActionCompatParcelizer();
    }

    static final class write {
        MediaType AudioAttributesCompatParcelizer;
        String AudioAttributesImplApi21Parcelizer;
        boolean AudioAttributesImplApi26Parcelizer;
        boolean AudioAttributesImplBaseParcelizer;
        String IconCompatParcelizer;
        GTAnalyticsV2ResponseModelCompanion<?>[] MediaBrowserCompatCustomActionResultReceiver;
        final Method MediaBrowserCompatItemReceiver;
        private boolean MediaBrowserCompatMediaItem;
        private boolean MediaBrowserCompatSearchResultReceiver;
        private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        final GTNudgeRequestModel MediaDescriptionCompat;
        ShapeKt RemoteActionCompatParcelizer;
        private boolean handleMediaPlayPauseIfPendingOnHandler;
        private boolean onAddQueueItem;
        private boolean onCommand;
        private boolean onCustomAction;
        private Annotation[][] onFastForward;
        private Type[] onMediaButtonEvent;
        private Set<String> onPause;
        private Annotation[] onPlay;
        private boolean onPlayFromMediaId;
        boolean read;
        boolean write;
        private static final Pattern RatingCompat = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        private static final Pattern MediaMetadataCompat = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        write(GTNudgeRequestModel gTNudgeRequestModel, Method method) {
            this.MediaDescriptionCompat = gTNudgeRequestModel;
            this.MediaBrowserCompatItemReceiver = method;
            this.onPlay = method.getAnnotations();
            this.onMediaButtonEvent = method.getGenericParameterTypes();
            this.onFastForward = method.getParameterAnnotations();
        }

        final GTSubjectAnalyticsV2RSModelKt IconCompatParcelizer() {
            for (Annotation annotation : this.onPlay) {
                IconCompatParcelizer(annotation);
            }
            if (this.IconCompatParcelizer == null) {
                throw GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.write) {
                if (this.AudioAttributesImplBaseParcelizer) {
                    throw GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.read) {
                    throw GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.onFastForward.length;
            this.MediaBrowserCompatCustomActionResultReceiver = new GTAnalyticsV2ResponseModelCompanion[length];
            int i = 0;
            while (i < length) {
                this.MediaBrowserCompatCustomActionResultReceiver[i] = read(i, this.onMediaButtonEvent[i], this.onFastForward[i], i == length + (-1));
                i++;
            }
            if (this.AudioAttributesImplApi21Parcelizer == null && !this.onPlayFromMediaId) {
                throw GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, "Missing either @%s URL or @Url parameter.", this.IconCompatParcelizer);
            }
            boolean z = this.read;
            if (!z && !this.AudioAttributesImplBaseParcelizer && !this.write && this.MediaBrowserCompatMediaItem) {
                throw GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z && !this.MediaBrowserCompatSearchResultReceiver) {
                throw GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (this.AudioAttributesImplBaseParcelizer && !this.handleMediaPlayPauseIfPendingOnHandler) {
                throw GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, "Multipart method must contain at least one @Part.", new Object[0]);
            }
            return new GTSubjectAnalyticsV2RSModelKt(this);
        }

        private void IconCompatParcelizer(Annotation annotation) {
            if (annotation instanceof getNtr) {
                RemoteActionCompatParcelizer("DELETE", ((getNtr) annotation).write(), false);
                return;
            }
            if (annotation instanceof setMcqTimingDetails) {
                RemoteActionCompatParcelizer("GET", ((setMcqTimingDetails) annotation).read(), false);
                return;
            }
            if (annotation instanceof setForceSubmit) {
                RemoteActionCompatParcelizer("HEAD", ((setForceSubmit) annotation).RemoteActionCompatParcelizer(), false);
                return;
            }
            if (annotation instanceof setChangeAnswerTimeMs) {
                RemoteActionCompatParcelizer("PATCH", ((setChangeAnswerTimeMs) annotation).write(), true);
                return;
            }
            if (annotation instanceof getReviewTimeMs) {
                RemoteActionCompatParcelizer("POST", ((getReviewTimeMs) annotation).read(), true);
                return;
            }
            if (annotation instanceof setReviewTimeMs) {
                RemoteActionCompatParcelizer("PUT", ((setReviewTimeMs) annotation).AudioAttributesCompatParcelizer(), true);
                return;
            }
            if (annotation instanceof setFirstAttemptTimeMs) {
                RemoteActionCompatParcelizer(C$0o__.OPTIONS, ((setFirstAttemptTimeMs) annotation).read(), false);
                return;
            }
            if (annotation instanceof setReviewAttemptTimeSeconds) {
                setReviewAttemptTimeSeconds setreviewattempttimeseconds = (setReviewAttemptTimeSeconds) annotation;
                RemoteActionCompatParcelizer(setreviewattempttimeseconds.read(), setreviewattempttimeseconds.IconCompatParcelizer(), setreviewattempttimeseconds.RemoteActionCompatParcelizer());
                return;
            }
            if (annotation instanceof getChangeAnswerTimeMs) {
                String[] strArr = ((getChangeAnswerTimeMs) annotation).read();
                if (strArr.length == 0) {
                    throw GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, "@Headers annotation is empty.", new Object[0]);
                }
                this.RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(strArr);
                return;
            }
            if (annotation instanceof MarkTestCompleteRequestBodyCompanion) {
                if (this.read) {
                    throw GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.AudioAttributesImplBaseParcelizer = true;
            } else if (annotation instanceof setNtr) {
                if (this.AudioAttributesImplBaseParcelizer) {
                    throw GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.read = true;
            }
        }

        private void RemoteActionCompatParcelizer(String str, String str2, boolean z) {
            String str3 = this.IconCompatParcelizer;
            if (str3 != null) {
                throw GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.IconCompatParcelizer = str;
            this.write = z;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (RatingCompat.matcher(strSubstring).find()) {
                    throw GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.AudioAttributesImplApi21Parcelizer = str2;
            this.onPause = RemoteActionCompatParcelizer(str2);
        }

        private ShapeKt RemoteActionCompatParcelizer(String[] strArr) {
            ShapeKt.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new ShapeKt.RemoteActionCompatParcelizer();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if (RtspHeaders.CONTENT_TYPE.equalsIgnoreCase(strSubstring)) {
                    try {
                        this.AudioAttributesCompatParcelizer = MediaType.read(strTrim);
                    } catch (IllegalArgumentException e) {
                        throw GTSubjectAnalyticsV2ResponseModel.read(this.MediaBrowserCompatItemReceiver, e, "Malformed content type: %s", strTrim);
                    }
                } else {
                    remoteActionCompatParcelizer.IconCompatParcelizer(strSubstring, strTrim);
                }
            }
            return remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        }

        private GTAnalyticsV2ResponseModelCompanion<?> read(int i, Type type, Annotation[] annotationArr, boolean z) {
            GTAnalyticsV2ResponseModelCompanion<?> gTAnalyticsV2ResponseModelCompanion;
            if (annotationArr != null) {
                gTAnalyticsV2ResponseModelCompanion = null;
                for (Annotation annotation : annotationArr) {
                    GTAnalyticsV2ResponseModelCompanion<?> gTAnalyticsV2ResponseModelCompanionAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i, type, annotationArr, annotation);
                    if (gTAnalyticsV2ResponseModelCompanionAudioAttributesCompatParcelizer != null) {
                        if (gTAnalyticsV2ResponseModelCompanion != null) {
                            throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        gTAnalyticsV2ResponseModelCompanion = gTAnalyticsV2ResponseModelCompanionAudioAttributesCompatParcelizer;
                    }
                }
            } else {
                gTAnalyticsV2ResponseModelCompanion = null;
            }
            if (gTAnalyticsV2ResponseModelCompanion != null) {
                return gTAnalyticsV2ResponseModelCompanion;
            }
            if (z) {
                try {
                    if (GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(type) == SampleVideos.class) {
                        this.AudioAttributesImplApi26Parcelizer = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "No Retrofit annotation found.", new Object[0]);
        }

        private GTAnalyticsV2ResponseModelCompanion<?> AudioAttributesCompatParcelizer(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof StateResultRSModel) {
                RemoteActionCompatParcelizer(i, type);
                if (this.onPlayFromMediaId) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.onCommand) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.onCustomAction) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.onAddQueueItem) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.AudioAttributesImplApi21Parcelizer != null) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@Url cannot be used with @%s URL", this.IconCompatParcelizer);
                }
                this.onPlayFromMediaId = true;
                if (type == ThemeAlphaConstantsKt.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new GTAnalyticsV2ResponseModelCompanion.MediaMetadataCompat(this.MediaBrowserCompatItemReceiver, i);
                }
                throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof setRankRange) {
                RemoteActionCompatParcelizer(i, type);
                if (this.onCommand) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.onCustomAction) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.onAddQueueItem) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.onPlayFromMediaId) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.AudioAttributesImplApi21Parcelizer == null) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@Path can only be used with relative url on @%s", this.IconCompatParcelizer);
                }
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = true;
                setRankRange setrankrange = (setRankRange) annotation;
                String strIconCompatParcelizer = setrankrange.IconCompatParcelizer();
                read(i, strIconCompatParcelizer);
                return new GTAnalyticsV2ResponseModelCompanion.AudioAttributesImplApi26Parcelizer(this.MediaBrowserCompatItemReceiver, i, strIconCompatParcelizer, this.MediaDescriptionCompat.RemoteActionCompatParcelizer(type, annotationArr), setrankrange.AudioAttributesCompatParcelizer());
            }
            if (annotation instanceof RankPairModel) {
                RemoteActionCompatParcelizer(i, type);
                RankPairModel rankPairModel = (RankPairModel) annotation;
                String str = rankPairModel.read();
                boolean zIconCompatParcelizer = rankPairModel.IconCompatParcelizer();
                Class<?> clsRemoteActionCompatParcelizer = GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(type);
                this.onCommand = true;
                if (Iterable.class.isAssignableFrom(clsRemoteActionCompatParcelizer)) {
                    if (!(type instanceof ParameterizedType)) {
                        Method method = this.MediaBrowserCompatItemReceiver;
                        StringBuilder sb = new StringBuilder();
                        sb.append(clsRemoteActionCompatParcelizer.getSimpleName());
                        sb.append(" must include generic type (e.g., ");
                        sb.append(clsRemoteActionCompatParcelizer.getSimpleName());
                        sb.append("<String>)");
                        throw GTSubjectAnalyticsV2ResponseModel.write(method, i, sb.toString(), new Object[0]);
                    }
                    return new GTAnalyticsV2ResponseModelCompanion.MediaBrowserCompatCustomActionResultReceiver(str, this.MediaDescriptionCompat.RemoteActionCompatParcelizer(GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(0, (ParameterizedType) type), annotationArr), zIconCompatParcelizer).AudioAttributesCompatParcelizer();
                }
                if (clsRemoteActionCompatParcelizer.isArray()) {
                    return new GTAnalyticsV2ResponseModelCompanion.MediaBrowserCompatCustomActionResultReceiver(str, this.MediaDescriptionCompat.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(clsRemoteActionCompatParcelizer.getComponentType()), annotationArr), zIconCompatParcelizer).RemoteActionCompatParcelizer();
                }
                return new GTAnalyticsV2ResponseModelCompanion.MediaBrowserCompatCustomActionResultReceiver(str, this.MediaDescriptionCompat.RemoteActionCompatParcelizer(type, annotationArr), zIconCompatParcelizer);
            }
            if (annotation instanceof getScoreRange) {
                RemoteActionCompatParcelizer(i, type);
                boolean z = ((getScoreRange) annotation).read();
                Class<?> clsRemoteActionCompatParcelizer2 = GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(type);
                this.onCustomAction = true;
                if (Iterable.class.isAssignableFrom(clsRemoteActionCompatParcelizer2)) {
                    if (!(type instanceof ParameterizedType)) {
                        Method method2 = this.MediaBrowserCompatItemReceiver;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(clsRemoteActionCompatParcelizer2.getSimpleName());
                        sb2.append(" must include generic type (e.g., ");
                        sb2.append(clsRemoteActionCompatParcelizer2.getSimpleName());
                        sb2.append("<String>)");
                        throw GTSubjectAnalyticsV2ResponseModel.write(method2, i, sb2.toString(), new Object[0]);
                    }
                    return new GTAnalyticsV2ResponseModelCompanion.MediaBrowserCompatMediaItem(this.MediaDescriptionCompat.RemoteActionCompatParcelizer(GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(0, (ParameterizedType) type), annotationArr), z).AudioAttributesCompatParcelizer();
                }
                if (clsRemoteActionCompatParcelizer2.isArray()) {
                    return new GTAnalyticsV2ResponseModelCompanion.MediaBrowserCompatMediaItem(this.MediaDescriptionCompat.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(clsRemoteActionCompatParcelizer2.getComponentType()), annotationArr), z).RemoteActionCompatParcelizer();
                }
                return new GTAnalyticsV2ResponseModelCompanion.MediaBrowserCompatMediaItem(this.MediaDescriptionCompat.RemoteActionCompatParcelizer(type, annotationArr), z);
            }
            if (annotation instanceof setScoreRange) {
                RemoteActionCompatParcelizer(i, type);
                Class<?> clsRemoteActionCompatParcelizer3 = GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(type);
                this.onAddQueueItem = true;
                if (!Map.class.isAssignableFrom(clsRemoteActionCompatParcelizer3)) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeIconCompatParcelizer = GTSubjectAnalyticsV2ResponseModel.IconCompatParcelizer(type, clsRemoteActionCompatParcelizer3, Map.class);
                if (!(typeIconCompatParcelizer instanceof ParameterizedType)) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeIconCompatParcelizer;
                Type typeRemoteActionCompatParcelizer = GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(0, parameterizedType);
                if (String.class != typeRemoteActionCompatParcelizer) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@QueryMap keys must be of type String: ".concat(String.valueOf(typeRemoteActionCompatParcelizer)), new Object[0]);
                }
                return new GTAnalyticsV2ResponseModelCompanion.MediaBrowserCompatSearchResultReceiver(this.MediaBrowserCompatItemReceiver, i, this.MediaDescriptionCompat.RemoteActionCompatParcelizer(GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(1, parameterizedType), annotationArr), ((setScoreRange) annotation).read());
            }
            if (annotation instanceof McqTimingRequestData) {
                RemoteActionCompatParcelizer(i, type);
                String strRemoteActionCompatParcelizer = ((McqTimingRequestData) annotation).RemoteActionCompatParcelizer();
                Class<?> clsRemoteActionCompatParcelizer4 = GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(type);
                if (Iterable.class.isAssignableFrom(clsRemoteActionCompatParcelizer4)) {
                    if (!(type instanceof ParameterizedType)) {
                        Method method3 = this.MediaBrowserCompatItemReceiver;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(clsRemoteActionCompatParcelizer4.getSimpleName());
                        sb3.append(" must include generic type (e.g., ");
                        sb3.append(clsRemoteActionCompatParcelizer4.getSimpleName());
                        sb3.append("<String>)");
                        throw GTSubjectAnalyticsV2ResponseModel.write(method3, i, sb3.toString(), new Object[0]);
                    }
                    return new GTAnalyticsV2ResponseModelCompanion.read(strRemoteActionCompatParcelizer, this.MediaDescriptionCompat.RemoteActionCompatParcelizer(GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(0, (ParameterizedType) type), annotationArr)).AudioAttributesCompatParcelizer();
                }
                if (clsRemoteActionCompatParcelizer4.isArray()) {
                    return new GTAnalyticsV2ResponseModelCompanion.read(strRemoteActionCompatParcelizer, this.MediaDescriptionCompat.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(clsRemoteActionCompatParcelizer4.getComponentType()), annotationArr)).RemoteActionCompatParcelizer();
                }
                return new GTAnalyticsV2ResponseModelCompanion.read(strRemoteActionCompatParcelizer, this.MediaDescriptionCompat.RemoteActionCompatParcelizer(type, annotationArr));
            }
            if (annotation instanceof setTimeTook) {
                if (type == ShapeKt.class) {
                    return new GTAnalyticsV2ResponseModelCompanion.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatItemReceiver, i);
                }
                RemoteActionCompatParcelizer(i, type);
                Class<?> clsRemoteActionCompatParcelizer5 = GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(type);
                if (!Map.class.isAssignableFrom(clsRemoteActionCompatParcelizer5)) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type typeIconCompatParcelizer2 = GTSubjectAnalyticsV2ResponseModel.IconCompatParcelizer(type, clsRemoteActionCompatParcelizer5, Map.class);
                if (!(typeIconCompatParcelizer2 instanceof ParameterizedType)) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeIconCompatParcelizer2;
                Type typeRemoteActionCompatParcelizer2 = GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(0, parameterizedType2);
                if (String.class != typeRemoteActionCompatParcelizer2) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@HeaderMap keys must be of type String: ".concat(String.valueOf(typeRemoteActionCompatParcelizer2)), new Object[0]);
                }
                return new GTAnalyticsV2ResponseModelCompanion.write(this.MediaBrowserCompatItemReceiver, i, this.MediaDescriptionCompat.RemoteActionCompatParcelizer(GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(1, parameterizedType2), annotationArr));
            }
            if (annotation instanceof setFirstAttemptTimeSeconds) {
                RemoteActionCompatParcelizer(i, type);
                if (!this.read) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                setFirstAttemptTimeSeconds setfirstattempttimeseconds = (setFirstAttemptTimeSeconds) annotation;
                String strRemoteActionCompatParcelizer2 = setfirstattempttimeseconds.RemoteActionCompatParcelizer();
                boolean z2 = setfirstattempttimeseconds.read();
                this.MediaBrowserCompatSearchResultReceiver = true;
                Class<?> clsRemoteActionCompatParcelizer6 = GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(type);
                if (Iterable.class.isAssignableFrom(clsRemoteActionCompatParcelizer6)) {
                    if (!(type instanceof ParameterizedType)) {
                        Method method4 = this.MediaBrowserCompatItemReceiver;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(clsRemoteActionCompatParcelizer6.getSimpleName());
                        sb4.append(" must include generic type (e.g., ");
                        sb4.append(clsRemoteActionCompatParcelizer6.getSimpleName());
                        sb4.append("<String>)");
                        throw GTSubjectAnalyticsV2ResponseModel.write(method4, i, sb4.toString(), new Object[0]);
                    }
                    return new GTAnalyticsV2ResponseModelCompanion.IconCompatParcelizer(strRemoteActionCompatParcelizer2, this.MediaDescriptionCompat.RemoteActionCompatParcelizer(GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(0, (ParameterizedType) type), annotationArr), z2).AudioAttributesCompatParcelizer();
                }
                if (clsRemoteActionCompatParcelizer6.isArray()) {
                    return new GTAnalyticsV2ResponseModelCompanion.IconCompatParcelizer(strRemoteActionCompatParcelizer2, this.MediaDescriptionCompat.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(clsRemoteActionCompatParcelizer6.getComponentType()), annotationArr), z2).RemoteActionCompatParcelizer();
                }
                return new GTAnalyticsV2ResponseModelCompanion.IconCompatParcelizer(strRemoteActionCompatParcelizer2, this.MediaDescriptionCompat.RemoteActionCompatParcelizer(type, annotationArr), z2);
            }
            if (annotation instanceof setDiscarded) {
                RemoteActionCompatParcelizer(i, type);
                if (!this.read) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> clsRemoteActionCompatParcelizer7 = GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(type);
                if (!Map.class.isAssignableFrom(clsRemoteActionCompatParcelizer7)) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeIconCompatParcelizer3 = GTSubjectAnalyticsV2ResponseModel.IconCompatParcelizer(type, clsRemoteActionCompatParcelizer7, Map.class);
                if (!(typeIconCompatParcelizer3 instanceof ParameterizedType)) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeIconCompatParcelizer3;
                Type typeRemoteActionCompatParcelizer3 = GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(0, parameterizedType3);
                if (String.class != typeRemoteActionCompatParcelizer3) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@FieldMap keys must be of type String: ".concat(String.valueOf(typeRemoteActionCompatParcelizer3)), new Object[0]);
                }
                PlanSubscriptionRSModel planSubscriptionRSModelRemoteActionCompatParcelizer = this.MediaDescriptionCompat.RemoteActionCompatParcelizer(GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(1, parameterizedType3), annotationArr);
                this.MediaBrowserCompatSearchResultReceiver = true;
                return new GTAnalyticsV2ResponseModelCompanion.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, i, planSubscriptionRSModelRemoteActionCompatParcelizer, ((setDiscarded) annotation).IconCompatParcelizer());
            }
            if (annotation instanceof getFirstAttemptTimeMs) {
                RemoteActionCompatParcelizer(i, type);
                if (!this.AudioAttributesImplBaseParcelizer) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
                getFirstAttemptTimeMs getfirstattempttimems = (getFirstAttemptTimeMs) annotation;
                this.handleMediaPlayPauseIfPendingOnHandler = true;
                String strWrite = getfirstattempttimems.write();
                Class<?> clsRemoteActionCompatParcelizer8 = GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(type);
                if (strWrite.isEmpty()) {
                    if (Iterable.class.isAssignableFrom(clsRemoteActionCompatParcelizer8)) {
                        if (!(type instanceof ParameterizedType)) {
                            Method method5 = this.MediaBrowserCompatItemReceiver;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(clsRemoteActionCompatParcelizer8.getSimpleName());
                            sb5.append(" must include generic type (e.g., ");
                            sb5.append(clsRemoteActionCompatParcelizer8.getSimpleName());
                            sb5.append("<String>)");
                            throw GTSubjectAnalyticsV2ResponseModel.write(method5, i, sb5.toString(), new Object[0]);
                        }
                        if (!ThemeKtWhenMappings.AudioAttributesCompatParcelizer.class.isAssignableFrom(GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(0, (ParameterizedType) type)))) {
                            throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        return GTAnalyticsV2ResponseModelCompanion.MediaDescriptionCompat.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
                    }
                    if (clsRemoteActionCompatParcelizer8.isArray()) {
                        if (!ThemeKtWhenMappings.AudioAttributesCompatParcelizer.class.isAssignableFrom(clsRemoteActionCompatParcelizer8.getComponentType())) {
                            throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        return GTAnalyticsV2ResponseModelCompanion.MediaDescriptionCompat.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                    }
                    if (ThemeKtWhenMappings.AudioAttributesCompatParcelizer.class.isAssignableFrom(clsRemoteActionCompatParcelizer8)) {
                        return GTAnalyticsV2ResponseModelCompanion.MediaDescriptionCompat.AudioAttributesCompatParcelizer;
                    }
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                StringBuilder sb6 = new StringBuilder("form-data; name=\"");
                sb6.append(strWrite);
                sb6.append("\"");
                ShapeKt shapeKtIconCompatParcelizer = ShapeKt.IconCompatParcelizer("Content-Disposition", sb6.toString(), "Content-Transfer-Encoding", getfirstattempttimems.read());
                if (Iterable.class.isAssignableFrom(clsRemoteActionCompatParcelizer8)) {
                    if (!(type instanceof ParameterizedType)) {
                        Method method6 = this.MediaBrowserCompatItemReceiver;
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(clsRemoteActionCompatParcelizer8.getSimpleName());
                        sb7.append(" must include generic type (e.g., ");
                        sb7.append(clsRemoteActionCompatParcelizer8.getSimpleName());
                        sb7.append("<String>)");
                        throw GTSubjectAnalyticsV2ResponseModel.write(method6, i, sb7.toString(), new Object[0]);
                    }
                    Type typeRemoteActionCompatParcelizer4 = GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(0, (ParameterizedType) type);
                    if (ThemeKtWhenMappings.AudioAttributesCompatParcelizer.class.isAssignableFrom(GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(typeRemoteActionCompatParcelizer4))) {
                        throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new GTAnalyticsV2ResponseModelCompanion.AudioAttributesImplBaseParcelizer(this.MediaBrowserCompatItemReceiver, i, shapeKtIconCompatParcelizer, this.MediaDescriptionCompat.IconCompatParcelizer(typeRemoteActionCompatParcelizer4, annotationArr, this.onPlay)).AudioAttributesCompatParcelizer();
                }
                if (clsRemoteActionCompatParcelizer8.isArray()) {
                    Class<?> clsRemoteActionCompatParcelizer9 = RemoteActionCompatParcelizer(clsRemoteActionCompatParcelizer8.getComponentType());
                    if (ThemeKtWhenMappings.AudioAttributesCompatParcelizer.class.isAssignableFrom(clsRemoteActionCompatParcelizer9)) {
                        throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new GTAnalyticsV2ResponseModelCompanion.AudioAttributesImplBaseParcelizer(this.MediaBrowserCompatItemReceiver, i, shapeKtIconCompatParcelizer, this.MediaDescriptionCompat.IconCompatParcelizer(clsRemoteActionCompatParcelizer9, annotationArr, this.onPlay)).RemoteActionCompatParcelizer();
                }
                if (ThemeKtWhenMappings.AudioAttributesCompatParcelizer.class.isAssignableFrom(clsRemoteActionCompatParcelizer8)) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new GTAnalyticsV2ResponseModelCompanion.AudioAttributesImplBaseParcelizer(this.MediaBrowserCompatItemReceiver, i, shapeKtIconCompatParcelizer, this.MediaDescriptionCompat.IconCompatParcelizer(type, annotationArr, this.onPlay));
            }
            if (annotation instanceof getRankRange) {
                RemoteActionCompatParcelizer(i, type);
                if (!this.AudioAttributesImplBaseParcelizer) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.handleMediaPlayPauseIfPendingOnHandler = true;
                Class<?> clsRemoteActionCompatParcelizer10 = GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(type);
                if (!Map.class.isAssignableFrom(clsRemoteActionCompatParcelizer10)) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type typeIconCompatParcelizer4 = GTSubjectAnalyticsV2ResponseModel.IconCompatParcelizer(type, clsRemoteActionCompatParcelizer10, Map.class);
                if (!(typeIconCompatParcelizer4 instanceof ParameterizedType)) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) typeIconCompatParcelizer4;
                Type typeRemoteActionCompatParcelizer5 = GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(0, parameterizedType4);
                if (String.class != typeRemoteActionCompatParcelizer5) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@PartMap keys must be of type String: ".concat(String.valueOf(typeRemoteActionCompatParcelizer5)), new Object[0]);
                }
                Type typeRemoteActionCompatParcelizer6 = GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(1, parameterizedType4);
                if (ThemeKtWhenMappings.AudioAttributesCompatParcelizer.class.isAssignableFrom(GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(typeRemoteActionCompatParcelizer6))) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                }
                return new GTAnalyticsV2ResponseModelCompanion.MediaBrowserCompatItemReceiver(this.MediaBrowserCompatItemReceiver, i, this.MediaDescriptionCompat.IconCompatParcelizer(typeRemoteActionCompatParcelizer6, annotationArr, this.onPlay), ((getRankRange) annotation).write());
            }
            if (annotation instanceof getTimeTook) {
                RemoteActionCompatParcelizer(i, type);
                if (this.read || this.AudioAttributesImplBaseParcelizer) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                }
                if (this.MediaBrowserCompatMediaItem) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "Multiple @Body method annotations found.", new Object[0]);
                }
                try {
                    PlanSubscriptionRSModel planSubscriptionRSModelIconCompatParcelizer = this.MediaDescriptionCompat.IconCompatParcelizer(type, annotationArr, this.onPlay);
                    this.MediaBrowserCompatMediaItem = true;
                    return new GTAnalyticsV2ResponseModelCompanion.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, i, planSubscriptionRSModelIconCompatParcelizer);
                } catch (RuntimeException e) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, e, i, "Unable to create @Body converter for %s", type);
                }
            }
            if (!(annotation instanceof getAverageTimeSeconds)) {
                return null;
            }
            RemoteActionCompatParcelizer(i, type);
            Class<?> clsRemoteActionCompatParcelizer11 = GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(type);
            for (int i2 = i - 1; i2 >= 0; i2--) {
                GTAnalyticsV2ResponseModelCompanion<?> gTAnalyticsV2ResponseModelCompanion = this.MediaBrowserCompatCustomActionResultReceiver[i2];
                if ((gTAnalyticsV2ResponseModelCompanion instanceof GTAnalyticsV2ResponseModelCompanion.RatingCompat) && ((GTAnalyticsV2ResponseModelCompanion.RatingCompat) gTAnalyticsV2ResponseModelCompanion).read.equals(clsRemoteActionCompatParcelizer11)) {
                    Method method7 = this.MediaBrowserCompatItemReceiver;
                    StringBuilder sb8 = new StringBuilder("@Tag type ");
                    sb8.append(clsRemoteActionCompatParcelizer11.getName());
                    sb8.append(" is duplicate of parameter #");
                    sb8.append(i2 + 1);
                    sb8.append(" and would always overwrite its value.");
                    throw GTSubjectAnalyticsV2ResponseModel.write(method7, i, sb8.toString(), new Object[0]);
                }
            }
            return new GTAnalyticsV2ResponseModelCompanion.RatingCompat(clsRemoteActionCompatParcelizer11);
        }

        private void RemoteActionCompatParcelizer(int i, Type type) {
            if (GTSubjectAnalyticsV2ResponseModel.IconCompatParcelizer(type)) {
                throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        private void read(int i, String str) {
            if (!MediaMetadataCompat.matcher(str).matches()) {
                throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "@Path parameter name must match %s. Found: %s", RatingCompat.pattern(), str);
            }
            if (!this.onPause.contains(str)) {
                throw GTSubjectAnalyticsV2ResponseModel.write(this.MediaBrowserCompatItemReceiver, i, "URL \"%s\" does not contain \"{%s}\".", this.AudioAttributesImplApi21Parcelizer, str);
            }
        }

        private static Set<String> RemoteActionCompatParcelizer(String str) {
            Matcher matcher = RatingCompat.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private static Class<?> RemoteActionCompatParcelizer(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }
    }
}
