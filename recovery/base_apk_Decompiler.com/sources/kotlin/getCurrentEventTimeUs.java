package kotlin;

import com.marrow.data.models.ResponseError;
import com.marrow.data.models.common.PresenterBundle;
import com.marrow.data.utils.product.exceptions.ResponseErrorException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.handleMiscCode;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getCurrentEventTimeUs<V extends handleMiscCode> implements getExtendedEsFrChar {
    public final getIds AudioAttributesCompatParcelizer;
    public final parseLongAttr IconCompatParcelizer;
    public final V MediaBrowserCompatCustomActionResultReceiver;
    public final getIds RemoteActionCompatParcelizer;
    private getSno read = new getSno();
    public final endsWithLivePostrollPlaceHolder write;

    public interface IconCompatParcelizer<T> {
        void write(T t);
    }

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
    public void read(String str, String str2) {
    }

    @Override // kotlin.getExtendedEsFrChar
    public void write(PresenterBundle presenterBundle) {
    }

    public getCurrentEventTimeUs(parseLongAttr parselongattr, endsWithLivePostrollPlaceHolder endswithlivepostrollplaceholder, getIds getids, getIds getids2, V v) {
        this.RemoteActionCompatParcelizer = getids;
        this.AudioAttributesCompatParcelizer = getids2;
        this.IconCompatParcelizer = parselongattr;
        this.write = endswithlivepostrollplaceholder;
        this.MediaBrowserCompatCustomActionResultReceiver = v;
    }

    public final void read(Throwable th, Map<String, String> map) {
        this.IconCompatParcelizer.write(th, map);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void write(Throwable th, String str) {
        HashMap map = new HashMap();
        map.put("key", str);
        read(th, map);
    }

    @Override // kotlin.getExtendedEsFrChar
    public void AudioAttributesImplApi26Parcelizer() {
        this.read.read();
    }

    @Override // kotlin.getExtendedEsFrChar
    public PresenterBundle AudioAttributesImplBaseParcelizer() {
        return new PresenterBundle();
    }

    public final V aB_() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    protected final <T> void write(accessgetEmptyStatecp<T> accessgetemptystatecp, IconCompatParcelizer<T> iconCompatParcelizer) {
        write(accessgetemptystatecp, iconCompatParcelizer, "unhandled");
    }

    public final <T> void write(LessonDynamicResponseBody<T> lessonDynamicResponseBody, IconCompatParcelizer<T> iconCompatParcelizer) {
        IconCompatParcelizer(lessonDynamicResponseBody, iconCompatParcelizer, "unhandled");
    }

    public final <T> void write(accessgetEmptyStatecp<T> accessgetemptystatecp, IconCompatParcelizer<T> iconCompatParcelizer, final String str) {
        read(accessgetemptystatecp, iconCompatParcelizer, new IconCompatParcelizer() { // from class: o.initDecoder
            @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
            public final void write(Object obj) {
                this.write.IconCompatParcelizer(str, (Throwable) obj);
            }
        });
    }

    private <T> void IconCompatParcelizer(LessonDynamicResponseBody<T> lessonDynamicResponseBody, IconCompatParcelizer<T> iconCompatParcelizer, final String str) {
        IconCompatParcelizer(lessonDynamicResponseBody, iconCompatParcelizer, new IconCompatParcelizer() { // from class: o.replaceDecoder
            @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
            public final void write(Object obj) {
                this.RemoteActionCompatParcelizer.write(str, (Throwable) obj);
            }
        });
    }

    public final void AudioAttributesCompatParcelizer(Throwable th, String str) {
        ResponseError responseErrorWrite;
        if (parseDescriptor.read(th)) {
            th = parseDescriptor.AudioAttributesCompatParcelizer(th);
        }
        if (th instanceof ResponseErrorException) {
            responseErrorWrite = ((ResponseErrorException) th).getError();
        } else {
            responseErrorWrite = this.write.write();
        }
        V v = this.MediaBrowserCompatCustomActionResultReceiver;
        if (v instanceof getExtendedPtDeChar) {
            ((getExtendedPtDeChar) v).write(responseErrorWrite);
        }
        write(th, str);
    }

    public final <T> void read(accessgetEmptyStatecp<T> accessgetemptystatecp, IconCompatParcelizer<T> iconCompatParcelizer, final IconCompatParcelizer<Throwable> iconCompatParcelizer2) {
        accessgetEmptyStatecp<T> accessgetemptystatecpAudioAttributesCompatParcelizer = accessgetemptystatecp.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
        Objects.requireNonNull(iconCompatParcelizer);
        this.read.read(accessgetemptystatecpAudioAttributesCompatParcelizer.IconCompatParcelizer(new clearOutput(iconCompatParcelizer), new getTimelineId() { // from class: o.updateOutput
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(iconCompatParcelizer2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, Throwable th) throws Exception {
        if (this.read.write()) {
            return;
        }
        iconCompatParcelizer.write(th);
    }

    public final <T> void AudioAttributesCompatParcelizer(LessonDynamicResponseBody<T> lessonDynamicResponseBody, IconCompatParcelizer<T> iconCompatParcelizer, final IconCompatParcelizer<Throwable> iconCompatParcelizer2) {
        LessonDynamicResponseBody<T> lessonDynamicResponseBodyAudioAttributesCompatParcelizer = lessonDynamicResponseBody.write(this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        Objects.requireNonNull(iconCompatParcelizer);
        this.read.read(lessonDynamicResponseBodyAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(new clearOutput(iconCompatParcelizer), new getTimelineId() { // from class: o.TextRenderer
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                this.write.write(iconCompatParcelizer2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void write(IconCompatParcelizer iconCompatParcelizer, Throwable th) throws Exception {
        if (this.read.write()) {
            return;
        }
        iconCompatParcelizer.write(th);
    }

    public final <T> void IconCompatParcelizer(LessonDynamicResponseBody<T> lessonDynamicResponseBody, IconCompatParcelizer<T> iconCompatParcelizer, final IconCompatParcelizer<Throwable> iconCompatParcelizer2) {
        LessonDynamicResponseBody<T> lessonDynamicResponseBodyAudioAttributesCompatParcelizer = lessonDynamicResponseBody.write(this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
        Objects.requireNonNull(iconCompatParcelizer);
        this.read.read(lessonDynamicResponseBodyAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(new clearOutput(iconCompatParcelizer), new getTimelineId() { // from class: o.handleDecoderError
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iconCompatParcelizer2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, Throwable th) throws Exception {
        if (this.read.write()) {
            return;
        }
        iconCompatParcelizer.write(th);
    }

    public final String RemoteActionCompatParcelizer(int i) {
        return this.write.write(i);
    }

    public final String write(int i, Object... objArr) {
        return this.write.read(i, objArr);
    }
}
