package kotlin;

import com.marrow.R;
import com.marrow.data.models.ResponseError;
import com.marrow.data.models.common.PresenterBundle;
import com.marrow.data.utils.product.exceptions.ResponseErrorException;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.handleMiscCode;

/* JADX INFO: loaded from: classes3.dex */
public abstract class isRtspStartLine<V extends handleMiscCode> implements getExtendedEsFrChar {
    private final parseLongAttr AudioAttributesCompatParcelizer;
    private getSno IconCompatParcelizer;
    private final getIds MediaBrowserCompatCustomActionResultReceiver;
    public final V RemoteActionCompatParcelizer;
    private final endsWithLivePostrollPlaceHolder read;
    private final getIds write;

    @Override // kotlin.getExtendedEsFrChar
    public void AudioAttributesImplApi21Parcelizer() {
    }

    @Override // kotlin.getExtendedEsFrChar
    public void MediaBrowserCompatCustomActionResultReceiver() {
    }

    @Override // kotlin.getExtendedEsFrChar
    public void MediaBrowserCompatSearchResultReceiver() {
    }

    @Override // kotlin.getExtendedEsFrChar
    public final void write(PresenterBundle presenterBundle) {
    }

    public isRtspStartLine(parseLongAttr parselongattr, endsWithLivePostrollPlaceHolder endswithlivepostrollplaceholder, getIds getids, getIds getids2, V v) {
        toMagicModuleMetaRepoModel.write(parselongattr, "");
        toMagicModuleMetaRepoModel.write(endswithlivepostrollplaceholder, "");
        toMagicModuleMetaRepoModel.write(getids, "");
        toMagicModuleMetaRepoModel.write(getids2, "");
        toMagicModuleMetaRepoModel.write(v, "");
        this.AudioAttributesCompatParcelizer = parselongattr;
        this.read = endswithlivepostrollplaceholder;
        this.write = getids;
        this.MediaBrowserCompatCustomActionResultReceiver = getids2;
        this.RemoteActionCompatParcelizer = v;
        this.IconCompatParcelizer = new getSno();
    }

    public final parseLongAttr am_() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final endsWithLivePostrollPlaceHolder ap_() {
        return this.read;
    }

    public final getIds al_() {
        return this.write;
    }

    public final getIds aq_() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    protected final getSno an_() {
        return this.IconCompatParcelizer;
    }

    protected final getSno ao_() {
        return this.IconCompatParcelizer;
    }

    private void read(Throwable th, HashMap<String, String> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        this.AudioAttributesCompatParcelizer.write(th, map);
    }

    public final void RemoteActionCompatParcelizer(Throwable th) {
        this.AudioAttributesCompatParcelizer.write(th, null);
    }

    public final void write(Throwable th, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        HashMap<String, String> map = new HashMap<>();
        map.put("key", str);
        read(th, map);
    }

    @Override // kotlin.getExtendedEsFrChar
    public void AudioAttributesImplApi26Parcelizer() {
        this.IconCompatParcelizer.read();
    }

    @Override // kotlin.getExtendedEsFrChar
    public PresenterBundle AudioAttributesImplBaseParcelizer() {
        return new PresenterBundle();
    }

    protected final <T> void read(accessgetEmptyStatecp<T> accessgetemptystatecp, getAnswerMap<? super T, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(accessgetemptystatecp, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        IconCompatParcelizer(accessgetemptystatecp, getanswermap, "unhandled");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(isRtspStartLine isrtspstartline, String str, Throwable th) {
        toMagicModuleMetaRepoModel.write(th, "");
        isrtspstartline.write(th, str);
        return getShowPopup.INSTANCE;
    }

    protected final <T> void IconCompatParcelizer(accessgetEmptyStatecp<T> accessgetemptystatecp, getAnswerMap<? super T, getShowPopup> getanswermap, final String str) {
        toMagicModuleMetaRepoModel.write(accessgetemptystatecp, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(str, "");
        IconCompatParcelizer(accessgetemptystatecp, getanswermap, new getAnswerMap() { // from class: o.parseMethodString
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return isRtspStartLine.write(this.RemoteActionCompatParcelizer, str, (Throwable) obj);
            }
        });
    }

    public final void RemoteActionCompatParcelizer(Throwable th, String str) {
        ResponseError responseErrorWrite;
        toMagicModuleMetaRepoModel.write(th, "");
        toMagicModuleMetaRepoModel.write(str, "");
        if (parseDescriptor.read(th)) {
            ResponseErrorException responseErrorExceptionAudioAttributesCompatParcelizer = parseDescriptor.AudioAttributesCompatParcelizer(th);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(responseErrorExceptionAudioAttributesCompatParcelizer, "");
            th = responseErrorExceptionAudioAttributesCompatParcelizer;
        }
        if (th instanceof ResponseErrorException) {
            responseErrorWrite = ((ResponseErrorException) th).getError();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(responseErrorWrite, "");
        } else {
            responseErrorWrite = this.read.write();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(responseErrorWrite, "");
        }
        V v = this.RemoteActionCompatParcelizer;
        if (v instanceof getExtendedPtDeChar) {
            toMagicModuleMetaRepoModel.read(v, "");
            ((getExtendedPtDeChar) v).write(responseErrorWrite);
        }
        write(th, str);
    }

    public final void IconCompatParcelizer(Throwable th, String str, String str2) {
        ResponseErrorException responseErrorException;
        ResponseError responseErrorWrite;
        toMagicModuleMetaRepoModel.write(th, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        if (parseDescriptor.read(th)) {
            ResponseErrorException responseErrorExceptionAudioAttributesCompatParcelizer = parseDescriptor.AudioAttributesCompatParcelizer(th);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(responseErrorExceptionAudioAttributesCompatParcelizer, "");
            responseErrorException = responseErrorExceptionAudioAttributesCompatParcelizer;
        } else {
            responseErrorException = th;
        }
        if (responseErrorException instanceof ResponseErrorException) {
            responseErrorWrite = ((ResponseErrorException) responseErrorException).getError();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(responseErrorWrite, "");
        } else {
            responseErrorWrite = this.read.write();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(responseErrorWrite, "");
        }
        V v = this.RemoteActionCompatParcelizer;
        if (v instanceof getExtendedPtDeChar) {
            toMagicModuleMetaRepoModel.read(v, "");
            ((getExtendedPtDeChar) v).write(responseErrorWrite);
        }
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> map2 = map;
        map2.put("key", str);
        map2.put("_id", str2);
        read(th, map);
    }

    protected final <T> void IconCompatParcelizer(accessgetEmptyStatecp<T> accessgetemptystatecp, final getAnswerMap<? super T, getShowPopup> getanswermap, final getAnswerMap<? super Throwable, getShowPopup> getanswermap2) {
        toMagicModuleMetaRepoModel.write(accessgetemptystatecp, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        accessgetEmptyStatecp<T> accessgetemptystatecpAudioAttributesCompatParcelizer = accessgetemptystatecp.RemoteActionCompatParcelizer(this.write).AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        getTimelineId<? super T> gettimelineid = new getTimelineId() { // from class: o.getStringBytes
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) {
                isRtspStartLine.write(getanswermap, obj);
            }
        };
        final getAnswerMap getanswermap3 = new getAnswerMap() { // from class: o.parseSessionHeader
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return isRtspStartLine.read(this.write, getanswermap2, (Throwable) obj);
            }
        };
        this.IconCompatParcelizer.read(accessgetemptystatecpAudioAttributesCompatParcelizer.IconCompatParcelizer(gettimelineid, new getTimelineId() { // from class: o.parseResponse
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) {
                isRtspStartLine.AudioAttributesImplApi21Parcelizer(getanswermap3, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi21Parcelizer(getAnswerMap getanswermap, Object obj) {
        getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(getAnswerMap getanswermap, Object obj) {
        getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(isRtspStartLine isrtspstartline, getAnswerMap getanswermap, Throwable th) {
        if (!isrtspstartline.IconCompatParcelizer.write()) {
            toMagicModuleMetaRepoModel.write((Object) th);
            getanswermap.invoke(th);
        }
        return getShowPopup.INSTANCE;
    }

    protected final <T> void AudioAttributesCompatParcelizer(LessonDynamicResponseBody<T> lessonDynamicResponseBody, final getAnswerMap<? super T, getShowPopup> getanswermap, final getAnswerMap<? super Throwable, getShowPopup> getanswermap2) {
        toMagicModuleMetaRepoModel.write(lessonDynamicResponseBody, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        LessonDynamicResponseBody<T> lessonDynamicResponseBodyAudioAttributesCompatParcelizer = lessonDynamicResponseBody.write(this.write).AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        getTimelineId<? super T> gettimelineid = new getTimelineId() { // from class: o.isRtspResponse
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) {
                isRtspStartLine.AudioAttributesImplApi26Parcelizer(getanswermap, obj);
            }
        };
        final getAnswerMap getanswermap3 = new getAnswerMap() { // from class: o.parsePublicHeader
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return isRtspStartLine.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, getanswermap2, (Throwable) obj);
            }
        };
        this.IconCompatParcelizer.read(lessonDynamicResponseBodyAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(gettimelineid, new getTimelineId() { // from class: o.parseUserInfo
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) {
                isRtspStartLine.MediaBrowserCompatItemReceiver(getanswermap3, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi26Parcelizer(getAnswerMap getanswermap, Object obj) {
        getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatItemReceiver(getAnswerMap getanswermap, Object obj) {
        getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(isRtspStartLine isrtspstartline, getAnswerMap getanswermap, Throwable th) {
        if (!isrtspstartline.IconCompatParcelizer.write()) {
            toMagicModuleMetaRepoModel.write((Object) th);
            getanswermap.invoke(th);
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(Throwable th) {
        toMagicModuleMetaRepoModel.write(th, "");
        return getShowPopup.INSTANCE;
    }

    protected final <T> void AudioAttributesCompatParcelizer(LessonDynamicResponseBody<T> lessonDynamicResponseBody, getAnswerMap<? super T, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(lessonDynamicResponseBody, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        AudioAttributesCompatParcelizer(lessonDynamicResponseBody, getanswermap, new getAnswerMap() { // from class: o.parseContentLengthHeader
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return isRtspStartLine.read((Throwable) obj);
            }
        });
    }

    public final String read(int i) {
        String strWrite = this.read.write(i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
        return strWrite;
    }

    protected final String read(int i, Object... objArr) {
        toMagicModuleMetaRepoModel.write(objArr, "");
        String str = this.read.read(i, Arrays.copyOf(objArr, objArr.length));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }

    protected final String IconCompatParcelizer(int i, int i2) {
        String strAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(R.plurals.plural_bookmark_count, i, Integer.valueOf(i2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
        return strAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getExtendedEsFrChar
    public void read(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
    }
}
