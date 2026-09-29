package kotlin;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin._outputSurrogates;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0016\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0003,/\u0012B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bH\u0080@¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u0010\u0010\u001aJ\u001d\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b\u0010\u0010\u001dJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u0012\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\u0015J\u000f\u0010\"\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010\u0015J\u001d\u0010\u0012\u001a\u0004\u0018\u00010#*\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u0012\u0010$J-\u0010\u0012\u001a\u00020\u000b*\u00020\u00182\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b0%H\u0002¢\u0006\u0004\b\u0012\u0010&J!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u001e2\b\u0010\u0007\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b\u0010\u0010'J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u0012\u0010(J\u000f\u0010)\u001a\u00020\u000bH\u0002¢\u0006\u0004\b)\u0010\u0015J\u001f\u0010*\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u0018H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0012\u0010-J\u000f\u0010.\u001a\u00020\u000bH\u0000¢\u0006\u0004\b.\u0010\u0015J\u000f\u0010*\u001a\u00020\u000bH\u0000¢\u0006\u0004\b*\u0010\u0015J\u000f\u0010/\u001a\u00020\u000bH\u0000¢\u0006\u0004\b/\u0010\u0015J\u000f\u00100\u001a\u00020\u000bH\u0002¢\u0006\u0004\b0\u0010\u0015J\u000f\u00101\u001a\u00020\u000bH\u0002¢\u0006\u0004\b1\u0010\u0015J\u000f\u00102\u001a\u00020\u000bH\u0002¢\u0006\u0004\b2\u0010\u0015J/\u0010,\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u0002032\u0006\u0010\u0007\u001a\u0002042\u000e\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010605H\u0000¢\u0006\u0004\b,\u00108J'\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00002\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:09H\u0000¢\u0006\u0004\b\u0012\u0010;R\u0017\u0010\u0012\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b,\u0010>R\u001e\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b*\u0010?R\u0018\u0010,\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b/\u0010@R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u0010CR\u0016\u0010\u0010\u001a\u00020D8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010ER\u0016\u00102\u001a\u00020F8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010\u0014\u001a\u00020I8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010JR\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0K8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010LR\u0014\u0010.\u001a\u00020M8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b0\u0010NR\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8A@\u0000X\u0081\f¢\u0006\f\n\u0004\b\u0014\u0010O\u001a\u0004\b\u0010\u0010PR\u0016\u0010\"\u001a\u00020D8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010ER\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u00190Q8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010RR\u0016\u0010!\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010SR\u0016\u0010\u0017\u001a\u00020I8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010JR\u0014\u0010)\u001a\u00020T8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u0010UR\u0014\u0010G\u001a\u00020I8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010V"}, d2 = {"Lo/_outputSurrogates;", "Lo/addGetter;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "p0", "Lkotlin/Function0;", "Lo/UTF8StreamJsonParser;", "p1", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lo/getCreatedOnDateMs;)V", "Landroid/view/View;", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Lo/hasGetter;", "IconCompatParcelizer", "(Lo/hasGetter;)V", "RemoteActionCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "AudioAttributesImplApi26Parcelizer", "()V", "MediaBrowserCompatItemReceiver", "MediaMetadataCompat", "Lo/valueInstantiatorInstance;", "Lo/JsonValueInstantiator;", "(Lo/valueInstantiatorInstance;Lo/JsonValueInstantiator;)V", "Lo/setExpandedActionViewsExclusive;", "Lo/JsonNodeFeature;", "(Lo/setExpandedActionViewsExclusive;)V", "", "", "(ILjava/lang/String;)V", "MediaBrowserCompatMediaItem", "MediaDescriptionCompat", "Lo/findOverride;", "(Lo/valueInstantiatorInstance;I)Lo/findOverride;", "Lkotlin/Function2;", "(Lo/valueInstantiatorInstance;Lo/MagicModuleSubmissionRequestBody;)V", "(ILo/findOverride;)V", "(I)V", "RatingCompat", "AudioAttributesCompatParcelizer", "(ILo/valueInstantiatorInstance;)V", "read", "(Lo/valueInstantiatorInstance;)V", "MediaBrowserCompatCustomActionResultReceiver", "write", "MediaBrowserCompatSearchResultReceiver", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "", "", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "p2", "([J[ILjava/util/function/Consumer;)V", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "(Lo/_outputSurrogates;Landroid/util/LongSparseArray;)V", "handleMediaPlayPauseIfPendingOnHandler", "Landroidx/compose/ui/platform/AndroidComposeView;", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Lo/getCreatedOnDateMs;", "Lo/UTF8StreamJsonParser;", "", "Lo/_writeStringSegments;", "Ljava/util/List;", "", "J", "Lo/_outputSurrogates$read;", "onCommand", "Lo/_outputSurrogates$read;", "", "Z", "Lo/fromCursor;", "Lo/fromCursor;", "Landroid/os/Handler;", "Landroid/os/Handler;", "Lo/setExpandedActionViewsExclusive;", "()Lo/setExpandedActionViewsExclusive;", "Lo/setProvider;", "Lo/setProvider;", "Lo/JsonValueInstantiator;", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _outputSurrogates implements addGetter, View.OnAttachStateChangeListener {
    public static final int read = 8;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public getCreatedOnDateMs<? extends UTF8StreamJsonParser> write;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private boolean MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private JsonValueInstantiator MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private long MediaDescriptionCompat;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final AndroidComposeView RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public UTF8StreamJsonParser read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final List<_writeStringSegments> AudioAttributesCompatParcelizer = new ArrayList();
    private long IconCompatParcelizer = 100;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private read AudioAttributesImplBaseParcelizer = read.RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi26Parcelizer = true;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final fromCursor<getShowPopup> AudioAttributesImplApi21Parcelizer = getLastName.read(1, null, 6);

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final Handler MediaBrowserCompatCustomActionResultReceiver = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private setExpandedActionViewsExclusive<JsonNodeFeature> MediaBrowserCompatItemReceiver = ActionMenuView.RemoteActionCompatParcelizer();

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private setProvider<JsonValueInstantiator> MediaBrowserCompatSearchResultReceiver = ActionMenuView.write();

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final Runnable RatingCompat = new Runnable() { // from class: o.getHexBytes
        @Override // java.lang.Runnable
        public final void run() {
            _outputSurrogates.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
        }
    };

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[_flushBuffer.values().length];
            try {
                iArr[_flushBuffer.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[_flushBuffer.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return _outputSurrogates.this.RemoteActionCompatParcelizer(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View p0) {
    }

    public _outputSurrogates(AndroidComposeView androidComposeView, getCreatedOnDateMs<? extends UTF8StreamJsonParser> getcreatedondatems) {
        this.RemoteActionCompatParcelizer = androidComposeView;
        this.write = getcreatedondatems;
        this.MediaBrowserCompatMediaItem = new JsonValueInstantiator(androidComposeView.getAddContentView().read(), ActionMenuView.RemoteActionCompatParcelizer());
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final AndroidComposeView getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/_outputSurrogates$read;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class read {
        private static final /* synthetic */ getMagicModuleSavedMcqCount AudioAttributesCompatParcelizer;
        private static final /* synthetic */ read[] read;
        public static final read RemoteActionCompatParcelizer = new read("SHOW_ORIGINAL", 0);
        public static final read IconCompatParcelizer = new read("SHOW_TRANSLATED", 1);

        private read(String str, int i) {
        }

        static {
            read[] readVarArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            read = readVarArrRemoteActionCompatParcelizer;
            AudioAttributesCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(readVarArrRemoteActionCompatParcelizer);
        }

        private static final /* synthetic */ read[] RemoteActionCompatParcelizer() {
            return new read[]{RemoteActionCompatParcelizer, IconCompatParcelizer};
        }

        public static read valueOf(String str) {
            return (read) Enum.valueOf(read.class, str);
        }

        public static read[] values() {
            return (read[]) read.clone();
        }
    }

    public final setExpandedActionViewsExclusive<JsonNodeFeature> IconCompatParcelizer() {
        if (this.AudioAttributesImplApi26Parcelizer) {
            this.AudioAttributesImplApi26Parcelizer = false;
            this.MediaBrowserCompatItemReceiver = addModule.write(this.RemoteActionCompatParcelizer.getAddContentView(), -1, AnonymousClass2.RemoteActionCompatParcelizer);
            this.MediaDescriptionCompat = System.currentTimeMillis();
        }
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: o._outputSurrogates$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/valueInstantiatorInstance;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/valueInstantiatorInstance;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<valueInstantiatorInstance, Boolean> {
        public static final AnonymousClass2 RemoteActionCompatParcelizer = new AnonymousClass2();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(valueInstantiatorInstance valueinstantiatorinstance) {
            return Boolean.valueOf(typeResolverBuilderInstance.RemoteActionCompatParcelizer(valueinstantiatorinstance));
        }

        AnonymousClass2() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RemoteActionCompatParcelizer(kotlin._outputSurrogates r4) {
        /*
            boolean r0 = r4.RemoteActionCompatParcelizer()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "ContentCapture:changeChecker"
            android.os.Trace.beginSection(r0)
            androidx.compose.ui.platform.AndroidComposeView r0 = r4.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L49
            o._configureGenerator r0 = (kotlin._configureGenerator) r0     // Catch: java.lang.Throwable -> L49
            r1 = 1
            r2 = 0
            r3 = 0
            kotlin._configureGenerator.RemoteActionCompatParcelizer$default(r0, r3, r1, r2)     // Catch: java.lang.Throwable -> L49
            r4.MediaMetadataCompat()     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "ContentCapture:sendAppearEvents"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L49
            androidx.compose.ui.platform.AndroidComposeView r0 = r4.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L44
            o.typeIdResolverInstance r0 = r0.getAddContentView()     // Catch: java.lang.Throwable -> L44
            o.valueInstantiatorInstance r0 = r0.read()     // Catch: java.lang.Throwable -> L44
            o.JsonValueInstantiator r1 = r4.MediaBrowserCompatMediaItem     // Catch: java.lang.Throwable -> L44
            r4.IconCompatParcelizer(r0, r1)     // Catch: java.lang.Throwable -> L44
            o.getShowPopup r0 = kotlin.getShowPopup.INSTANCE     // Catch: java.lang.Throwable -> L44
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L49
            o.setExpandedActionViewsExclusive r0 = r4.IconCompatParcelizer()     // Catch: java.lang.Throwable -> L49
            r4.IconCompatParcelizer(r0)     // Catch: java.lang.Throwable -> L49
            r4.MediaBrowserCompatMediaItem()     // Catch: java.lang.Throwable -> L49
            r4.MediaMetadataCompat = r3     // Catch: java.lang.Throwable -> L49
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE     // Catch: java.lang.Throwable -> L49
            android.os.Trace.endSection()
            return
        L44:
            r4 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L49
            throw r4     // Catch: java.lang.Throwable -> L49
        L49:
            r4 = move-exception
            android.os.Trace.endSection()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._outputSurrogates.RemoteActionCompatParcelizer(o._outputSurrogates):void");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View p0) {
        this.MediaBrowserCompatCustomActionResultReceiver.removeCallbacks(this.RatingCompat);
        this.read = null;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return _writePPFieldName.INSTANCE.RemoteActionCompatParcelizer() && this.read != null;
    }

    @Override // kotlin.addGetter
    public final void IconCompatParcelizer(hasGetter p0) {
        this.read = this.write.invoke();
        AudioAttributesCompatParcelizer(-1, this.RemoteActionCompatParcelizer.getAddContentView().read());
        RatingCompat();
    }

    @Override // kotlin.addGetter
    public final void RemoteActionCompatParcelizer(hasGetter p0) {
        read(this.RemoteActionCompatParcelizer.getAddContentView().read());
        RatingCompat();
        this.read = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (kotlin.setCountry.IconCompatParcelizer(r5, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0083 -> B:13:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof o._outputSurrogates.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r9
            o._outputSurrogates$IconCompatParcelizer r0 = (o._outputSurrogates.IconCompatParcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.RemoteActionCompatParcelizer
            int r9 = r9 + r2
            r0.RemoteActionCompatParcelizer = r9
            goto L19
        L14:
            o._outputSurrogates$IconCompatParcelizer r0 = new o._outputSurrogates$IconCompatParcelizer
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r2 = r0.write
            o.getFirstName r2 = (kotlin.getFirstName) r2
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
        L30:
            r9 = r2
            goto L4b
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            java.lang.Object r2 = r0.write
            o.getFirstName r2 = (kotlin.getFirstName) r2
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L58
        L42:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.fromCursor<o.getShowPopup> r9 = r8.AudioAttributesImplApi21Parcelizer
            o.getFirstName r9 = r9.AudioAttributesImplApi21Parcelizer()
        L4b:
            r0.write = r9
            r0.RemoteActionCompatParcelizer = r4
            java.lang.Object r2 = r9.AudioAttributesCompatParcelizer(r0)
            if (r2 == r1) goto L89
            r7 = r2
            r2 = r9
            r9 = r7
        L58:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L86
            r2.AudioAttributesCompatParcelizer()
            boolean r9 = r8.RemoteActionCompatParcelizer()
            if (r9 == 0) goto L6c
            r8.RatingCompat()
        L6c:
            boolean r9 = r8.MediaMetadataCompat
            if (r9 != 0) goto L79
            r8.MediaMetadataCompat = r4
            android.os.Handler r9 = r8.MediaBrowserCompatCustomActionResultReceiver
            java.lang.Runnable r5 = r8.RatingCompat
            r9.post(r5)
        L79:
            long r5 = r8.IconCompatParcelizer
            r0.write = r2
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r9 = kotlin.setCountry.IconCompatParcelizer(r5, r0)
            if (r9 != r1) goto L30
            goto L89
        L86:
            o.getShowPopup r8 = kotlin.getShowPopup.INSTANCE
            return r8
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._outputSurrogates.RemoteActionCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        this.AudioAttributesImplApi26Parcelizer = true;
        if (!RemoteActionCompatParcelizer() || this.MediaMetadataCompat) {
            return;
        }
        this.MediaMetadataCompat = true;
        this.MediaBrowserCompatCustomActionResultReceiver.post(this.RatingCompat);
    }

    public final void MediaBrowserCompatItemReceiver() {
        this.AudioAttributesImplApi26Parcelizer = true;
        if (RemoteActionCompatParcelizer()) {
            MediaDescriptionCompat();
        }
    }

    private final void MediaMetadataCompat() {
        setProvider<JsonValueInstantiator> setprovider = this.MediaBrowserCompatSearchResultReceiver;
        int[] iArr = setprovider.IconCompatParcelizer;
        long[] jArr = setprovider.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = iArr[(i << 3) + i3];
                        if (!IconCompatParcelizer().IconCompatParcelizer(i4)) {
                            RemoteActionCompatParcelizer(i4);
                            MediaDescriptionCompat();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: o._outputSurrogates$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "p0", "Lo/valueInstantiatorInstance;", "p1", "", "write", "(ILo/valueInstantiatorInstance;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<Integer, valueInstantiatorInstance, getShowPopup> {
        final /* synthetic */ JsonValueInstantiator $AudioAttributesCompatParcelizer;
        final /* synthetic */ _outputSurrogates IconCompatParcelizer;

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(Integer num, valueInstantiatorInstance valueinstantiatorinstance) {
            write(num.intValue(), valueinstantiatorinstance);
            return getShowPopup.INSTANCE;
        }

        public final void write(int i, valueInstantiatorInstance valueinstantiatorinstance) {
            if (this.$AudioAttributesCompatParcelizer.getWrite().IconCompatParcelizer(valueinstantiatorinstance.getAudioAttributesImplApi21Parcelizer())) {
                return;
            }
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(i, valueinstantiatorinstance);
            this.IconCompatParcelizer.MediaDescriptionCompat();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(JsonValueInstantiator jsonValueInstantiator, _outputSurrogates _outputsurrogates) {
            super(2);
            this.$AudioAttributesCompatParcelizer = jsonValueInstantiator;
            this.IconCompatParcelizer = _outputsurrogates;
        }
    }

    private final void IconCompatParcelizer(valueInstantiatorInstance p0, JsonValueInstantiator p1) {
        RemoteActionCompatParcelizer(p0, new AnonymousClass3(p1, this));
        List<valueInstantiatorInstance> listMediaBrowserCompatSearchResultReceiver = p0.MediaBrowserCompatSearchResultReceiver();
        int size = listMediaBrowserCompatSearchResultReceiver.size();
        for (int i = 0; i < size; i++) {
            valueInstantiatorInstance valueinstantiatorinstance = listMediaBrowserCompatSearchResultReceiver.get(i);
            if (IconCompatParcelizer().IconCompatParcelizer(valueinstantiatorinstance.getAudioAttributesImplApi21Parcelizer()) && this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(valueinstantiatorinstance.getAudioAttributesImplApi21Parcelizer())) {
                JsonValueInstantiator jsonValueInstantiatorAudioAttributesCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(valueinstantiatorinstance.getAudioAttributesImplApi21Parcelizer());
                if (jsonValueInstantiatorAudioAttributesCompatParcelizer != null) {
                    IconCompatParcelizer(valueinstantiatorinstance, jsonValueInstantiatorAudioAttributesCompatParcelizer);
                } else {
                    reportWrongTokenException.write("node not present in pruned tree before this change");
                    throw new PlanDetailsCreator();
                }
            }
        }
    }

    private final void RemoteActionCompatParcelizer(int p0, String p1) {
        UTF8StreamJsonParser uTF8StreamJsonParser = this.read;
        if (uTF8StreamJsonParser == null) {
            return;
        }
        AutofillId autofillIdAudioAttributesCompatParcelizer = uTF8StreamJsonParser.AudioAttributesCompatParcelizer(p0);
        if (autofillIdAudioAttributesCompatParcelizer != null) {
            uTF8StreamJsonParser.read(autofillIdAudioAttributesCompatParcelizer, p1);
        } else {
            reportWrongTokenException.write("Invalid content capture ID");
            throw new PlanDetailsCreator();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void MediaBrowserCompatMediaItem() {
        /*
            r16 = this;
            r0 = r16
            o.setProvider<o.JsonValueInstantiator> r1 = r0.MediaBrowserCompatSearchResultReceiver
            r1.AudioAttributesCompatParcelizer()
            o.setExpandedActionViewsExclusive r1 = r16.IconCompatParcelizer()
            int[] r2 = r1.IconCompatParcelizer
            java.lang.Object[] r3 = r1.MediaBrowserCompatItemReceiver
            long[] r1 = r1.RemoteActionCompatParcelizer
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L62
            r6 = 0
        L17:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5d
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L31:
            if (r11 >= r9) goto L5b
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L57
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r2[r12]
            r12 = r3[r12]
            o.JsonNodeFeature r12 = (kotlin.JsonNodeFeature) r12
            o.setProvider<o.JsonValueInstantiator> r14 = r0.MediaBrowserCompatSearchResultReceiver
            o.JsonValueInstantiator r15 = new o.JsonValueInstantiator
            o.valueInstantiatorInstance r12 = r12.getRemoteActionCompatParcelizer()
            o.setExpandedActionViewsExclusive r5 = r16.IconCompatParcelizer()
            r15.<init>(r12, r5)
            r14.write(r13, r15)
        L57:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L31
        L5b:
            if (r9 != r10) goto L62
        L5d:
            if (r6 == r4) goto L62
            int r6 = r6 + 1
            goto L17
        L62:
            o.JsonValueInstantiator r1 = new o.JsonValueInstantiator
            androidx.compose.ui.platform.AndroidComposeView r2 = r0.RemoteActionCompatParcelizer
            o.typeIdResolverInstance r2 = r2.getAddContentView()
            o.valueInstantiatorInstance r2 = r2.read()
            o.setExpandedActionViewsExclusive r3 = r16.IconCompatParcelizer()
            r1.<init>(r2, r3)
            r0.MediaBrowserCompatMediaItem = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._outputSurrogates.MediaBrowserCompatMediaItem():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaDescriptionCompat() {
        this.AudioAttributesImplApi21Parcelizer.read(getShowPopup.INSTANCE);
    }

    private final findOverride RemoteActionCompatParcelizer(valueInstantiatorInstance valueinstantiatorinstance, int i) {
        findFormatDefaults findformatdefaultsWrite;
        AutofillId autofillIdAudioAttributesCompatParcelizer;
        String strRemoteActionCompatParcelizer;
        UTF8StreamJsonParser uTF8StreamJsonParser = this.read;
        if (uTF8StreamJsonParser == null || (findformatdefaultsWrite = getDefaultInclusion.write(this.RemoteActionCompatParcelizer)) == null) {
            return null;
        }
        if (valueinstantiatorinstance.MediaBrowserCompatMediaItem() != null) {
            autofillIdAudioAttributesCompatParcelizer = uTF8StreamJsonParser.AudioAttributesCompatParcelizer(r3.getAudioAttributesImplApi21Parcelizer());
            if (autofillIdAudioAttributesCompatParcelizer == null) {
                return null;
            }
        } else {
            autofillIdAudioAttributesCompatParcelizer = findformatdefaultsWrite.AudioAttributesCompatParcelizer();
        }
        findOverride findoverrideRemoteActionCompatParcelizer = uTF8StreamJsonParser.RemoteActionCompatParcelizer(autofillIdAudioAttributesCompatParcelizer, valueinstantiatorinstance.getAudioAttributesImplApi21Parcelizer());
        if (findoverrideRemoteActionCompatParcelizer == null) {
            return null;
        }
        C0216valueInstantiators c0216valueInstantiatorsHandleMediaPlayPauseIfPendingOnHandler = valueinstantiatorinstance.getWrite();
        if (c0216valueInstantiatorsHandleMediaPlayPauseIfPendingOnHandler.read(_this.INSTANCE.onPrepareFromMediaId())) {
            return null;
        }
        Bundle bundleAudioAttributesCompatParcelizer = findoverrideRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        if (bundleAudioAttributesCompatParcelizer != null) {
            bundleAudioAttributesCompatParcelizer.putLong("android.view.contentcapture.EventTimestamp", this.MediaDescriptionCompat);
            bundleAudioAttributesCompatParcelizer.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
        }
        String str = (String) withDeserializerModifier.read(c0216valueInstantiatorsHandleMediaPlayPauseIfPendingOnHandler, _this.INSTANCE.onSetPlaybackSpeed());
        if (str != null) {
            findoverrideRemoteActionCompatParcelizer.IconCompatParcelizer(valueinstantiatorinstance.getAudioAttributesImplApi21Parcelizer(), null, null, str);
        }
        if (((Boolean) withDeserializerModifier.read(c0216valueInstantiatorsHandleMediaPlayPauseIfPendingOnHandler, _this.INSTANCE.onPause())) != null) {
            findoverrideRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer("android.widget.ViewGroup");
        }
        List list = (List) withDeserializerModifier.read(c0216valueInstantiatorsHandleMediaPlayPauseIfPendingOnHandler, _this.INSTANCE.onSetRating());
        if (list != null) {
            findoverrideRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer("android.widget.TextView");
            findoverrideRemoteActionCompatParcelizer.write(ArrayBlockingQueueDeserializer.RemoteActionCompatParcelizer(list, "\n", null, null, 0, null, null, 62, null));
        }
        AbstractDeserializer abstractDeserializer = (AbstractDeserializer) withDeserializerModifier.read(c0216valueInstantiatorsHandleMediaPlayPauseIfPendingOnHandler, _this.INSTANCE.AudioAttributesImplApi26Parcelizer());
        if (abstractDeserializer != null) {
            findoverrideRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer("android.widget.EditText");
            findoverrideRemoteActionCompatParcelizer.write(abstractDeserializer);
        }
        List list2 = (List) withDeserializerModifier.read(c0216valueInstantiatorsHandleMediaPlayPauseIfPendingOnHandler, _this.INSTANCE.IconCompatParcelizer());
        if (list2 != null) {
            findoverrideRemoteActionCompatParcelizer.read(ArrayBlockingQueueDeserializer.RemoteActionCompatParcelizer(list2, "\n", null, null, 0, null, null, 62, null));
        }
        C0184keyDeserializers c0184keyDeserializers = (C0184keyDeserializers) withDeserializerModifier.read(c0216valueInstantiatorsHandleMediaPlayPauseIfPendingOnHandler, _this.INSTANCE.onRemoveQueueItem());
        if (c0184keyDeserializers != null && (strRemoteActionCompatParcelizer = NoClass.RemoteActionCompatParcelizer(c0184keyDeserializers.getWrite())) != null) {
            findoverrideRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer);
        }
        deserializeFromNumber deserializefromnumberAudioAttributesCompatParcelizer = NoClass.AudioAttributesCompatParcelizer(c0216valueInstantiatorsHandleMediaPlayPauseIfPendingOnHandler);
        if (deserializefromnumberAudioAttributesCompatParcelizer != null) {
            deserializeFromBoolean deserializefrombooleanMediaBrowserCompatCustomActionResultReceiver = deserializefromnumberAudioAttributesCompatParcelizer.getIconCompatParcelizer();
            findoverrideRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(ReadableObjectIdReferring.AudioAttributesCompatParcelizer(deserializefrombooleanMediaBrowserCompatCustomActionResultReceiver.getRead().AudioAttributesImplApi21Parcelizer()) * deserializefrombooleanMediaBrowserCompatCustomActionResultReceiver.getAudioAttributesImplBaseParcelizer().getRead() * deserializefrombooleanMediaBrowserCompatCustomActionResultReceiver.getAudioAttributesImplBaseParcelizer().getIconCompatParcelizer(), 0, 0, 0);
        }
        WritableTypeIdInclusion writableTypeIdInclusionWrite = valueinstantiatorinstance.write();
        findoverrideRemoteActionCompatParcelizer.IconCompatParcelizer((int) writableTypeIdInclusionWrite.getAudioAttributesCompatParcelizer(), (int) writableTypeIdInclusionWrite.getRemoteActionCompatParcelizer(), 0, 0, (int) (writableTypeIdInclusionWrite.getWrite() - writableTypeIdInclusionWrite.getAudioAttributesCompatParcelizer()), (int) (writableTypeIdInclusionWrite.getIconCompatParcelizer() - writableTypeIdInclusionWrite.getRemoteActionCompatParcelizer()));
        return findoverrideRemoteActionCompatParcelizer;
    }

    private final void RemoteActionCompatParcelizer(valueInstantiatorInstance valueinstantiatorinstance, MagicModuleSubmissionRequestBody<? super Integer, ? super valueInstantiatorInstance, getShowPopup> magicModuleSubmissionRequestBody) {
        List<valueInstantiatorInstance> listMediaBrowserCompatSearchResultReceiver = valueinstantiatorinstance.MediaBrowserCompatSearchResultReceiver();
        int size = listMediaBrowserCompatSearchResultReceiver.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            valueInstantiatorInstance valueinstantiatorinstance2 = listMediaBrowserCompatSearchResultReceiver.get(i2);
            if (IconCompatParcelizer().IconCompatParcelizer(valueinstantiatorinstance2.getAudioAttributesImplApi21Parcelizer())) {
                magicModuleSubmissionRequestBody.invoke(Integer.valueOf(i), valueinstantiatorinstance2);
                i++;
            }
        }
    }

    private final void IconCompatParcelizer(int p0, findOverride p1) {
        if (p1 == null) {
            return;
        }
        this.AudioAttributesCompatParcelizer.add(new _writeStringSegments(p0, this.MediaDescriptionCompat, _flushBuffer.RemoteActionCompatParcelizer, p1));
    }

    private final void RemoteActionCompatParcelizer(int p0) {
        this.AudioAttributesCompatParcelizer.add(new _writeStringSegments(p0, this.MediaDescriptionCompat, _flushBuffer.IconCompatParcelizer, null));
    }

    private final void RatingCompat() {
        UTF8StreamJsonParser uTF8StreamJsonParser = this.read;
        if (uTF8StreamJsonParser == null || this.AudioAttributesCompatParcelizer.isEmpty()) {
            return;
        }
        List<_writeStringSegments> list = this.AudioAttributesCompatParcelizer;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            _writeStringSegments _writestringsegments = list.get(i);
            int i2 = WhenMappings.IconCompatParcelizer[_writestringsegments.getRemoteActionCompatParcelizer().ordinal()];
            if (i2 == 1) {
                findOverride findoverride = _writestringsegments.getAudioAttributesCompatParcelizer();
                if (findoverride != null) {
                    uTF8StreamJsonParser.RemoteActionCompatParcelizer(findoverride.IconCompatParcelizer());
                }
            } else {
                if (i2 != 2) {
                    throw new RenewEligibleCreator();
                }
                AutofillId autofillIdAudioAttributesCompatParcelizer = uTF8StreamJsonParser.AudioAttributesCompatParcelizer(_writestringsegments.getWrite());
                if (autofillIdAudioAttributesCompatParcelizer != null) {
                    uTF8StreamJsonParser.write(autofillIdAudioAttributesCompatParcelizer);
                }
            }
        }
        uTF8StreamJsonParser.read();
        this.AudioAttributesCompatParcelizer.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(int p0, valueInstantiatorInstance p1) {
        if (RemoteActionCompatParcelizer()) {
            RemoteActionCompatParcelizer(p1);
            IconCompatParcelizer(p1.getAudioAttributesImplApi21Parcelizer(), RemoteActionCompatParcelizer(p1, p0));
            RemoteActionCompatParcelizer(p1, new AnonymousClass4());
        }
    }

    /* JADX INFO: renamed from: o._outputSurrogates$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "p0", "Lo/valueInstantiatorInstance;", "p1", "", "IconCompatParcelizer", "(ILo/valueInstantiatorInstance;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<Integer, valueInstantiatorInstance, getShowPopup> {
        public final void IconCompatParcelizer(int i, valueInstantiatorInstance valueinstantiatorinstance) {
            _outputSurrogates.this.AudioAttributesCompatParcelizer(i, valueinstantiatorinstance);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(Integer num, valueInstantiatorInstance valueinstantiatorinstance) {
            IconCompatParcelizer(num.intValue(), valueinstantiatorinstance);
            return getShowPopup.INSTANCE;
        }

        AnonymousClass4() {
            super(2);
        }
    }

    private final void read(valueInstantiatorInstance p0) {
        if (RemoteActionCompatParcelizer()) {
            RemoteActionCompatParcelizer(p0.getAudioAttributesImplApi21Parcelizer());
            List<valueInstantiatorInstance> listMediaBrowserCompatSearchResultReceiver = p0.MediaBrowserCompatSearchResultReceiver();
            int size = listMediaBrowserCompatSearchResultReceiver.size();
            for (int i = 0; i < size; i++) {
                read(listMediaBrowserCompatSearchResultReceiver.get(i));
            }
        }
    }

    private final void RemoteActionCompatParcelizer(valueInstantiatorInstance p0) {
        defaultFeatures defaultfeatures;
        getAnswerMap getanswermap;
        getAnswerMap getanswermap2;
        C0216valueInstantiators c0216valueInstantiatorsHandleMediaPlayPauseIfPendingOnHandler = p0.getWrite();
        Boolean bool = (Boolean) withDeserializerModifier.read(c0216valueInstantiatorsHandleMediaPlayPauseIfPendingOnHandler, _this.INSTANCE.onMediaButtonEvent());
        read readVar = this.AudioAttributesImplBaseParcelizer;
        read readVar2 = read.RemoteActionCompatParcelizer;
        Boolean bool2 = Boolean.FALSE;
        Boolean bool3 = Boolean.TRUE;
        if (readVar == readVar2 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(bool, bool3)) {
            defaultFeatures defaultfeatures2 = (defaultFeatures) withDeserializerModifier.read(c0216valueInstantiatorsHandleMediaPlayPauseIfPendingOnHandler, withAbstractTypeResolver.INSTANCE.onPrepareFromSearch());
            if (defaultfeatures2 == null || (getanswermap2 = (getAnswerMap) defaultfeatures2.RemoteActionCompatParcelizer()) == null) {
                return;
            }
            return;
        }
        if (this.AudioAttributesImplBaseParcelizer != read.IconCompatParcelizer || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(bool, bool2) || (defaultfeatures = (defaultFeatures) withDeserializerModifier.read(c0216valueInstantiatorsHandleMediaPlayPauseIfPendingOnHandler, withAbstractTypeResolver.INSTANCE.onPrepareFromSearch())) == null || (getanswermap = (getAnswerMap) defaultfeatures.RemoteActionCompatParcelizer()) == null) {
            return;
        }
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.AudioAttributesImplBaseParcelizer = read.IconCompatParcelizer;
        MediaBrowserCompatSearchResultReceiver();
    }

    public final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesImplBaseParcelizer = read.RemoteActionCompatParcelizer;
        AudioAttributesImplApi21Parcelizer();
    }

    public final void write() {
        this.AudioAttributesImplBaseParcelizer = read.RemoteActionCompatParcelizer;
        AudioAttributesImplBaseParcelizer();
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        defaultFeatures defaultfeatures;
        getAnswerMap getanswermap;
        setExpandedActionViewsExclusive<JsonNodeFeature> setexpandedactionviewsexclusiveIconCompatParcelizer = IconCompatParcelizer();
        Object[] objArr = setexpandedactionviewsexclusiveIconCompatParcelizer.MediaBrowserCompatItemReceiver;
        long[] jArr = setexpandedactionviewsexclusiveIconCompatParcelizer.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        C0216valueInstantiators c0216valueInstantiatorsHandleMediaPlayPauseIfPendingOnHandler = ((JsonNodeFeature) objArr[(i << 3) + i3]).getRemoteActionCompatParcelizer().getWrite();
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(withDeserializerModifier.read(c0216valueInstantiatorsHandleMediaPlayPauseIfPendingOnHandler, _this.INSTANCE.onMediaButtonEvent()), Boolean.FALSE) && (defaultfeatures = (defaultFeatures) withDeserializerModifier.read(c0216valueInstantiatorsHandleMediaPlayPauseIfPendingOnHandler, withAbstractTypeResolver.INSTANCE.onPrepareFromSearch())) != null && (getanswermap = (getAnswerMap) defaultfeatures.RemoteActionCompatParcelizer()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        defaultFeatures defaultfeatures;
        getAnswerMap getanswermap;
        setExpandedActionViewsExclusive<JsonNodeFeature> setexpandedactionviewsexclusiveIconCompatParcelizer = IconCompatParcelizer();
        Object[] objArr = setexpandedactionviewsexclusiveIconCompatParcelizer.MediaBrowserCompatItemReceiver;
        long[] jArr = setexpandedactionviewsexclusiveIconCompatParcelizer.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        C0216valueInstantiators c0216valueInstantiatorsHandleMediaPlayPauseIfPendingOnHandler = ((JsonNodeFeature) objArr[(i << 3) + i3]).getRemoteActionCompatParcelizer().getWrite();
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(withDeserializerModifier.read(c0216valueInstantiatorsHandleMediaPlayPauseIfPendingOnHandler, _this.INSTANCE.onMediaButtonEvent()), Boolean.TRUE) && (defaultfeatures = (defaultFeatures) withDeserializerModifier.read(c0216valueInstantiatorsHandleMediaPlayPauseIfPendingOnHandler, withAbstractTypeResolver.INSTANCE.onPrepareFromSearch())) != null && (getanswermap = (getAnswerMap) defaultfeatures.RemoteActionCompatParcelizer()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        defaultFeatures defaultfeatures;
        getCreatedOnDateMs getcreatedondatems;
        setExpandedActionViewsExclusive<JsonNodeFeature> setexpandedactionviewsexclusiveIconCompatParcelizer = IconCompatParcelizer();
        Object[] objArr = setexpandedactionviewsexclusiveIconCompatParcelizer.MediaBrowserCompatItemReceiver;
        long[] jArr = setexpandedactionviewsexclusiveIconCompatParcelizer.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        C0216valueInstantiators c0216valueInstantiatorsHandleMediaPlayPauseIfPendingOnHandler = ((JsonNodeFeature) objArr[(i << 3) + i3]).getRemoteActionCompatParcelizer().getWrite();
                        if (withDeserializerModifier.read(c0216valueInstantiatorsHandleMediaPlayPauseIfPendingOnHandler, _this.INSTANCE.onMediaButtonEvent()) != null && (defaultfeatures = (defaultFeatures) withDeserializerModifier.read(c0216valueInstantiatorsHandleMediaPlayPauseIfPendingOnHandler, withAbstractTypeResolver.INSTANCE.write())) != null && (getcreatedondatems = (getCreatedOnDateMs) defaultfeatures.RemoteActionCompatParcelizer()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010¢\u0006\u0004\b\u000e\u0010\u0012J'\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012"}, d2 = {"Lo/_outputSurrogates$write;", "", "<init>", "()V", "Lo/_outputSurrogates;", "p0", "", "p1", "", "p2", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "p3", "", "AudioAttributesCompatParcelizer", "(Lo/_outputSurrogates;[J[ILjava/util/function/Consumer;)V", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "(Lo/_outputSurrogates;Landroid/util/LongSparseArray;)V", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class write {
        public static final write INSTANCE = new write();

        private write() {
        }

        public final void AudioAttributesCompatParcelizer(final _outputSurrogates p0, final LongSparseArray<ViewTranslationResponse> p1) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                read(p0, p1);
            } else {
                p0.getRemoteActionCompatParcelizer().post(new Runnable() { // from class: o._writeUnq
                    @Override // java.lang.Runnable
                    public final void run() {
                        _outputSurrogates.write.RemoteActionCompatParcelizer(p0, p1);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void RemoteActionCompatParcelizer(_outputSurrogates _outputsurrogates, LongSparseArray longSparseArray) {
            INSTANCE.read(_outputsurrogates, longSparseArray);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final void read(_outputSurrogates p0, LongSparseArray<ViewTranslationResponse> p1) {
            TranslationResponseValue value;
            CharSequence text;
            JsonNodeFeature jsonNodeFeatureAudioAttributesCompatParcelizer;
            valueInstantiatorInstance valueinstantiatorinstanceAudioAttributesCompatParcelizer;
            defaultFeatures defaultfeatures;
            getAnswerMap getanswermap;
            int size = p1.size();
            for (int i = 0; i < size; i++) {
                long jKeyAt = p1.keyAt(i);
                ViewTranslationResponse viewTranslationResponse = p1.get(jKeyAt);
                if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (jsonNodeFeatureAudioAttributesCompatParcelizer = p0.IconCompatParcelizer().AudioAttributesCompatParcelizer((int) jKeyAt)) != null && (valueinstantiatorinstanceAudioAttributesCompatParcelizer = jsonNodeFeatureAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()) != null && (defaultfeatures = (defaultFeatures) withDeserializerModifier.read(valueinstantiatorinstanceAudioAttributesCompatParcelizer.getWrite(), withAbstractTypeResolver.INSTANCE.onPlayFromSearch())) != null && (getanswermap = (getAnswerMap) defaultfeatures.RemoteActionCompatParcelizer()) != null) {
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void AudioAttributesCompatParcelizer(kotlin._outputSurrogates r18, long[] r19, int[] r20, java.util.function.Consumer<android.view.translation.ViewTranslationRequest> r21) {
            /*
                r17 = this;
                r0 = r19
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L75
                r3 = r0[r2]
                o.setExpandedActionViewsExclusive r5 = r18.IconCompatParcelizer()
                int r3 = (int) r3
                java.lang.Object r3 = r5.AudioAttributesCompatParcelizer(r3)
                o.JsonNodeFeature r3 = (kotlin.JsonNodeFeature) r3
                if (r3 == 0) goto L70
                o.valueInstantiatorInstance r3 = r3.getRemoteActionCompatParcelizer()
                if (r3 == 0) goto L70
                androidx.compose.ui.platform.AndroidComposeView r4 = r18.getRemoteActionCompatParcelizer()
                android.view.autofill.AutofillId r4 = r4.getAutofillId()
                int r5 = r3.getAudioAttributesImplApi21Parcelizer()
                long r5 = (long) r5
                android.view.translation.ViewTranslationRequest$Builder r7 = new android.view.translation.ViewTranslationRequest$Builder
                r7.<init>(r4, r5)
                o.valueInstantiators r3 = r3.getWrite()
                o._this r4 = kotlin._this.INSTANCE
                o.MapperConfig r4 = r4.onSetRating()
                java.lang.Object r3 = kotlin.withDeserializerModifier.read(r3, r4)
                r8 = r3
                java.util.List r8 = (java.util.List) r8
                if (r8 == 0) goto L70
                java.lang.String r3 = "\n"
                r9 = r3
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 62
                r16 = 0
                java.lang.String r3 = kotlin.ArrayBlockingQueueDeserializer.RemoteActionCompatParcelizer(r8, r9, r10, r11, r12, r13, r14, r15, r16)
                if (r3 == 0) goto L70
                o.AbstractDeserializer r4 = new o.AbstractDeserializer
                r5 = 2
                r6 = 0
                r4.<init>(r3, r6, r5, r6)
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                android.view.translation.TranslationRequestValue r3 = android.view.translation.TranslationRequestValue.forText(r4)
                java.lang.String r4 = "android:text"
                r7.setValue(r4, r3)
                android.view.translation.ViewTranslationRequest r3 = r7.build()
                r4 = r21
                r4.accept(r3)
                goto L72
            L70:
                r4 = r21
            L72:
                int r2 = r2 + 1
                goto L4
            L75:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o._outputSurrogates.write.AudioAttributesCompatParcelizer(o._outputSurrogates, long[], int[], java.util.function.Consumer):void");
        }
    }

    public final void read(long[] p0, int[] p1, Consumer<ViewTranslationRequest> p2) {
        write.INSTANCE.AudioAttributesCompatParcelizer(this, p0, p1, p2);
    }

    public final void RemoteActionCompatParcelizer(_outputSurrogates p0, LongSparseArray<ViewTranslationResponse> p1) {
        write.INSTANCE.AudioAttributesCompatParcelizer(p0, p1);
    }

    private final void IconCompatParcelizer(setExpandedActionViewsExclusive<JsonNodeFeature> p0) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        int i;
        char c;
        long j;
        int i2;
        long[] jArr3;
        Object[] objArr;
        JsonValueInstantiator jsonValueInstantiator;
        long[] jArr4;
        Object[] objArr2;
        JsonValueInstantiator jsonValueInstantiator2;
        Object[] objArr3;
        Object[] objArr4;
        setExpandedActionViewsExclusive<JsonNodeFeature> setexpandedactionviewsexclusive = p0;
        int[] iArr3 = setexpandedactionviewsexclusive.IconCompatParcelizer;
        long[] jArr5 = setexpandedactionviewsexclusive.RemoteActionCompatParcelizer;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j2 = jArr5[i3];
            char c2 = 7;
            long j3 = -9187201950435737472L;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j2 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        JsonValueInstantiator jsonValueInstantiatorAudioAttributesCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(i7);
                        JsonNodeFeature jsonNodeFeatureAudioAttributesCompatParcelizer = setexpandedactionviewsexclusive.AudioAttributesCompatParcelizer(i7);
                        valueInstantiatorInstance valueinstantiatorinstanceAudioAttributesCompatParcelizer = jsonNodeFeatureAudioAttributesCompatParcelizer != null ? jsonNodeFeatureAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer() : null;
                        if (valueinstantiatorinstanceAudioAttributesCompatParcelizer == null) {
                            reportWrongTokenException.write("no value for specified key");
                            throw new PlanDetailsCreator();
                        }
                        if (jsonValueInstantiatorAudioAttributesCompatParcelizer == null) {
                            setKeyListener<MapperConfig<?>, Object> setkeylistenerRemoteActionCompatParcelizer = valueinstantiatorinstanceAudioAttributesCompatParcelizer.getWrite().RemoteActionCompatParcelizer();
                            Object[] objArr5 = setkeylistenerRemoteActionCompatParcelizer.IconCompatParcelizer;
                            long[] jArr6 = setkeylistenerRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                            int length2 = jArr6.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i8 = 0;
                                while (true) {
                                    long j4 = jArr6[i8];
                                    jArr2 = jArr5;
                                    i = length;
                                    if ((((~j4) << c2) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        int i10 = 0;
                                        while (i10 < i9) {
                                            if ((j4 & 255) < 128) {
                                                objArr4 = objArr5;
                                                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((MapperConfig) objArr5[(i8 << 3) + i10], _this.INSTANCE.onSetRating())) {
                                                    List list = (List) withDeserializerModifier.read(valueinstantiatorinstanceAudioAttributesCompatParcelizer.getWrite(), _this.INSTANCE.onSetRating());
                                                    RemoteActionCompatParcelizer(valueinstantiatorinstanceAudioAttributesCompatParcelizer.getAudioAttributesImplApi21Parcelizer(), String.valueOf(list != null ? (AbstractDeserializer) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(list) : null));
                                                }
                                            } else {
                                                objArr4 = objArr5;
                                            }
                                            j4 >>= 8;
                                            i10++;
                                            objArr5 = objArr4;
                                        }
                                        objArr3 = objArr5;
                                        if (i9 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr3 = objArr5;
                                    }
                                    if (i8 == length2) {
                                        break;
                                    }
                                    i8++;
                                    jArr5 = jArr2;
                                    length = i;
                                    objArr5 = objArr3;
                                    c2 = 7;
                                }
                                j = -9187201950435737472L;
                                c = 7;
                                i2 = 8;
                            } else {
                                jArr2 = jArr5;
                                i = length;
                                c = c2;
                                j = -9187201950435737472L;
                                i2 = 8;
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr5;
                            i = length;
                            setKeyListener<MapperConfig<?>, Object> setkeylistenerRemoteActionCompatParcelizer2 = valueinstantiatorinstanceAudioAttributesCompatParcelizer.getWrite().RemoteActionCompatParcelizer();
                            Object[] objArr6 = setkeylistenerRemoteActionCompatParcelizer2.IconCompatParcelizer;
                            long[] jArr7 = setkeylistenerRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer;
                            int length3 = jArr7.length - 2;
                            if (length3 >= 0) {
                                int i11 = 0;
                                while (true) {
                                    long j5 = jArr7[i11];
                                    c = 7;
                                    j = -9187201950435737472L;
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i12 = 8 - ((~(i11 - length3)) >>> 31);
                                        int i13 = 0;
                                        while (i13 < i12) {
                                            if ((j5 & 255) < 128) {
                                                jArr4 = jArr7;
                                                objArr2 = objArr6;
                                                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((MapperConfig) objArr6[(i11 << 3) + i13], _this.INSTANCE.onSetRating())) {
                                                    List list2 = (List) withDeserializerModifier.read(jsonValueInstantiatorAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer(), _this.INSTANCE.onSetRating());
                                                    AbstractDeserializer abstractDeserializer = list2 != null ? (AbstractDeserializer) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(list2) : null;
                                                    jsonValueInstantiator2 = jsonValueInstantiatorAudioAttributesCompatParcelizer;
                                                    List list3 = (List) withDeserializerModifier.read(valueinstantiatorinstanceAudioAttributesCompatParcelizer.getWrite(), _this.INSTANCE.onSetRating());
                                                    AbstractDeserializer abstractDeserializer2 = list3 != null ? (AbstractDeserializer) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(list3) : null;
                                                    if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractDeserializer, abstractDeserializer2)) {
                                                        RemoteActionCompatParcelizer(valueinstantiatorinstanceAudioAttributesCompatParcelizer.getAudioAttributesImplApi21Parcelizer(), String.valueOf(abstractDeserializer2));
                                                    }
                                                }
                                                j5 >>= 8;
                                                i13++;
                                                jArr7 = jArr4;
                                                objArr6 = objArr2;
                                                jsonValueInstantiatorAudioAttributesCompatParcelizer = jsonValueInstantiator2;
                                            } else {
                                                jArr4 = jArr7;
                                                objArr2 = objArr6;
                                            }
                                            jsonValueInstantiator2 = jsonValueInstantiatorAudioAttributesCompatParcelizer;
                                            j5 >>= 8;
                                            i13++;
                                            jArr7 = jArr4;
                                            objArr6 = objArr2;
                                            jsonValueInstantiatorAudioAttributesCompatParcelizer = jsonValueInstantiator2;
                                        }
                                        jArr3 = jArr7;
                                        objArr = objArr6;
                                        jsonValueInstantiator = jsonValueInstantiatorAudioAttributesCompatParcelizer;
                                        if (i12 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = jArr7;
                                        objArr = objArr6;
                                        jsonValueInstantiator = jsonValueInstantiatorAudioAttributesCompatParcelizer;
                                    }
                                    if (i11 == length3) {
                                        break;
                                    }
                                    i11++;
                                    jArr7 = jArr3;
                                    objArr6 = objArr;
                                    jsonValueInstantiatorAudioAttributesCompatParcelizer = jsonValueInstantiator;
                                }
                            } else {
                                j = -9187201950435737472L;
                                c = 7;
                            }
                            i2 = 8;
                        }
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr5;
                        i = length;
                        c = c2;
                        j = j3;
                        i2 = i4;
                    }
                    j2 >>= i2;
                    i6++;
                    i4 = i2;
                    j3 = j;
                    iArr3 = iArr2;
                    jArr5 = jArr2;
                    length = i;
                    c2 = c;
                    setexpandedactionviewsexclusive = p0;
                }
                iArr = iArr3;
                jArr = jArr5;
                int i14 = length;
                if (i5 != i4) {
                    return;
                } else {
                    length = i14;
                }
            } else {
                iArr = iArr3;
                jArr = jArr5;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            setexpandedactionviewsexclusive = p0;
            iArr3 = iArr;
            jArr5 = jArr;
        }
    }
}
