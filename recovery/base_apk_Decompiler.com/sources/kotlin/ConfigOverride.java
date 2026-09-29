package kotlin;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin._handleApos;
import kotlin.anyIgnorals;
import kotlin.getPytMcqIds;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0002\u0010\b\u001a'\u0010\u0002\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0002\u0010\r\",\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00018G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0003\"\u0004\b\u000f\u0010\u0010\"&\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0012\"\u0018\u0010\u000e\u001a\u00020\u0000*\u00020\u00008CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0018\u0010\u0014\u001a\u00020\f*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016"}, d2 = {"Landroid/view/View;", "Lo/convertNumberToLong;", "write", "(Landroid/view/View;)Lo/convertNumberToLong;", "Landroid/content/Context;", "p0", "Lo/setUpdatedStatus;", "", "(Landroid/content/Context;)Lo/setUpdatedStatus;", "Lo/CurrentQuery;", "Lo/anyIgnorals;", "p1", "Lo/_truncate;", "(Landroid/view/View;Lo/CurrentQuery;Lo/anyIgnorals;)Lo/_truncate;", "IconCompatParcelizer", "read", "(Landroid/view/View;Lo/convertNumberToLong;)V", "", "Ljava/util/Map;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "(Landroid/view/View;)Landroid/view/View;", "(Landroid/view/View;)Lo/_truncate;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConfigOverride {
    private static final Map<Context, setUpdatedStatus<Float>> write = new LinkedHashMap();

    public static final convertNumberToLong IconCompatParcelizer(View view) {
        Object tag = view.getTag(_handleApos.AudioAttributesCompatParcelizer.androidx_compose_ui_view_composition_context);
        if (tag instanceof convertNumberToLong) {
            return (convertNumberToLong) tag;
        }
        return null;
    }

    public static final void read(View view, convertNumberToLong convertnumbertolong) {
        view.setTag(_handleApos.AudioAttributesCompatParcelizer.androidx_compose_ui_view_composition_context, convertnumbertolong);
    }

    public static final convertNumberToLong write(View view) {
        convertNumberToLong convertnumbertolongIconCompatParcelizer = IconCompatParcelizer(view);
        if (convertnumbertolongIconCompatParcelizer != null) {
            return convertnumbertolongIconCompatParcelizer;
        }
        Object parent = view.getParent();
        while (convertnumbertolongIconCompatParcelizer == null && (parent instanceof View)) {
            View view2 = (View) parent;
            convertnumbertolongIconCompatParcelizer = IconCompatParcelizer(view2);
            parent = AnnotatedAndMetadata.IconCompatParcelizer(view2);
        }
        return convertnumbertolongIconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setUpdatedStatus<Float> write(Context context) {
        setUpdatedStatus<Float> setupdatedstatus;
        Map<Context, setUpdatedStatus<Float>> map = write;
        synchronized (map) {
            setUpdatedStatus<Float> setupdatedstatusIconCompatParcelizer = map.get(context);
            if (setupdatedstatusIconCompatParcelizer == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                fromCursor fromcursor = getLastName.read(-1, null, 6);
                NewNumberOtpResendRequest newNumberOtpResendRequest = VerifyNewNumberRequest.read((MagicModuleSubmissionRequestBody) new IconCompatParcelizer(contentResolver, uriFor, new write(fromcursor, StdKeyDeserializerStringFactoryKeyDeserializer.write(Looper.getMainLooper())), fromcursor, context, null));
                TopUserCompanion topUserCompanion = College.read();
                getPytMcqIds.Companion companion = getPytMcqIds.INSTANCE;
                setupdatedstatusIconCompatParcelizer = VerifyNewNumberRequest.IconCompatParcelizer(newNumberOtpResendRequest, topUserCompanion, getPytMcqIds.Companion.write(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                map.put(context, setupdatedstatusIconCompatParcelizer);
            }
            setupdatedstatus = setupdatedstatusIconCompatParcelizer;
        }
        return setupdatedstatus;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/ConfigOverride$write;", "Landroid/database/ContentObserver;", "", "p0", "Landroid/net/Uri;", "p1", "", "onChange", "(ZLandroid/net/Uri;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write extends ContentObserver {
        final /* synthetic */ fromCursor<getShowPopup> read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(fromCursor<getShowPopup> fromcursor, Handler handler) {
            super(handler);
            this.read = fromcursor;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean p0, Uri p1) {
            this.read.read(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<getValidationToken<? super Float>, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ Uri AudioAttributesCompatParcelizer;
        private /* synthetic */ Object AudioAttributesImplBaseParcelizer;
        final /* synthetic */ Context IconCompatParcelizer;
        int MediaBrowserCompatCustomActionResultReceiver;
        Object MediaBrowserCompatItemReceiver;
        final /* synthetic */ ContentResolver RemoteActionCompatParcelizer;
        final /* synthetic */ fromCursor<getShowPopup> read;
        final /* synthetic */ write write;

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
        
            if (r4.IconCompatParcelizer(kotlin.QBankStatsResponse.write(android.provider.Settings.Global.getFloat(r8.IconCompatParcelizer.getContentResolver(), "animator_duration_scale", 1.0f)), r8) == r0) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[Catch: all -> 0x0094, TRY_LEAVE, TryCatch #0 {all -> 0x0094, blocks: (B:7:0x0016, B:16:0x0048, B:19:0x005a, B:21:0x0062, B:12:0x002b, B:15:0x0042), top: B:30:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0084 -> B:8:0x0019). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r8.MediaBrowserCompatCustomActionResultReceiver
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2f
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r8.MediaBrowserCompatItemReceiver
                o.getFirstName r1 = (kotlin.getFirstName) r1
                java.lang.Object r4 = r8.AudioAttributesImplBaseParcelizer
                o.getValidationToken r4 = (kotlin.getValidationToken) r4
                kotlin.SdkPayloadData.IconCompatParcelizer(r9)     // Catch: java.lang.Throwable -> L94
            L19:
                r9 = r4
                goto L48
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L23:
                java.lang.Object r1 = r8.MediaBrowserCompatItemReceiver
                o.getFirstName r1 = (kotlin.getFirstName) r1
                java.lang.Object r4 = r8.AudioAttributesImplBaseParcelizer
                o.getValidationToken r4 = (kotlin.getValidationToken) r4
                kotlin.SdkPayloadData.IconCompatParcelizer(r9)     // Catch: java.lang.Throwable -> L94
                goto L5a
            L2f:
                kotlin.SdkPayloadData.IconCompatParcelizer(r9)
                java.lang.Object r9 = r8.AudioAttributesImplBaseParcelizer
                o.getValidationToken r9 = (kotlin.getValidationToken) r9
                android.content.ContentResolver r1 = r8.RemoteActionCompatParcelizer
                android.net.Uri r4 = r8.AudioAttributesCompatParcelizer
                o.ConfigOverride$write r5 = r8.write
                android.database.ContentObserver r5 = (android.database.ContentObserver) r5
                r6 = 0
                r1.registerContentObserver(r4, r6, r5)
                o.fromCursor<o.getShowPopup> r1 = r8.read     // Catch: java.lang.Throwable -> L94
                o.getFirstName r1 = r1.AudioAttributesImplApi21Parcelizer()     // Catch: java.lang.Throwable -> L94
            L48:
                r4 = r8
                o.SampleVideos r4 = (kotlin.SampleVideos) r4     // Catch: java.lang.Throwable -> L94
                r8.AudioAttributesImplBaseParcelizer = r9     // Catch: java.lang.Throwable -> L94
                r8.MediaBrowserCompatItemReceiver = r1     // Catch: java.lang.Throwable -> L94
                r8.MediaBrowserCompatCustomActionResultReceiver = r3     // Catch: java.lang.Throwable -> L94
                java.lang.Object r4 = r1.AudioAttributesCompatParcelizer(r4)     // Catch: java.lang.Throwable -> L94
                if (r4 == r0) goto L93
                r7 = r4
                r4 = r9
                r9 = r7
            L5a:
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L94
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L94
                if (r9 == 0) goto L87
                r1.AudioAttributesCompatParcelizer()     // Catch: java.lang.Throwable -> L94
                android.content.Context r9 = r8.IconCompatParcelizer     // Catch: java.lang.Throwable -> L94
                android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L94
                java.lang.String r5 = "animator_duration_scale"
                r6 = 1065353216(0x3f800000, float:1.0)
                float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch: java.lang.Throwable -> L94
                java.lang.Float r9 = kotlin.QBankStatsResponse.write(r9)     // Catch: java.lang.Throwable -> L94
                r5 = r8
                o.SampleVideos r5 = (kotlin.SampleVideos) r5     // Catch: java.lang.Throwable -> L94
                r8.AudioAttributesImplBaseParcelizer = r4     // Catch: java.lang.Throwable -> L94
                r8.MediaBrowserCompatItemReceiver = r1     // Catch: java.lang.Throwable -> L94
                r8.MediaBrowserCompatCustomActionResultReceiver = r2     // Catch: java.lang.Throwable -> L94
                java.lang.Object r9 = r4.IconCompatParcelizer(r9, r5)     // Catch: java.lang.Throwable -> L94
                if (r9 != r0) goto L19
                goto L93
            L87:
                android.content.ContentResolver r9 = r8.RemoteActionCompatParcelizer
                o.ConfigOverride$write r8 = r8.write
                android.database.ContentObserver r8 = (android.database.ContentObserver) r8
                r9.unregisterContentObserver(r8)
                o.getShowPopup r8 = kotlin.getShowPopup.INSTANCE
                return r8
            L93:
                return r0
            L94:
                r9 = move-exception
                android.content.ContentResolver r0 = r8.RemoteActionCompatParcelizer
                o.ConfigOverride$write r8 = r8.write
                android.database.ContentObserver r8 = (android.database.ContentObserver) r8
                r0.unregisterContentObserver(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ConfigOverride.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(ContentResolver contentResolver, Uri uri, write writeVar, fromCursor<getShowPopup> fromcursor, Context context, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = contentResolver;
            this.AudioAttributesCompatParcelizer = uri;
            this.write = writeVar;
            this.read = fromcursor;
            this.IconCompatParcelizer = context;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write, this.read, this.IconCompatParcelizer, sampleVideos);
            iconCompatParcelizer.AudioAttributesImplBaseParcelizer = obj;
            return iconCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(getValidationToken<? super Float> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(getvalidationtoken, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static final View RemoteActionCompatParcelizer(View view) {
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                break;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final _truncate AudioAttributesCompatParcelizer(View view) {
        if (!view.isAttachedToWindow()) {
            StringBuilder sb = new StringBuilder("Cannot locate windowRecomposer; View ");
            sb.append(view);
            sb.append(" is not attached to a window");
            reportWrongTokenException.read(sb.toString());
        }
        View viewRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(view);
        convertNumberToLong convertnumbertolongIconCompatParcelizer = IconCompatParcelizer(viewRemoteActionCompatParcelizer);
        if (convertnumbertolongIconCompatParcelizer == null) {
            return getInclude.INSTANCE.IconCompatParcelizer(viewRemoteActionCompatParcelizer);
        }
        if (convertnumbertolongIconCompatParcelizer instanceof _truncate) {
            return (_truncate) convertnumbertolongIconCompatParcelizer;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
    }

    public static /* synthetic */ _truncate write$default(View view, CurrentQuery currentQuery, anyIgnorals anyignorals, int i, Object obj) {
        if ((i & 1) != 0) {
            currentQuery = VideoSessionResponseBody.RemoteActionCompatParcelizer;
        }
        if ((i & 2) != 0) {
            anyignorals = null;
        }
        return write(view, currentQuery, anyignorals);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [T, o.keyUsing] */
    public static final _truncate write(View view, CurrentQuery currentQuery, anyIgnorals anyignorals) {
        getInputCodeComment getinputcodecomment;
        if (currentQuery.get(getPlaybackInterval.INSTANCE) == null || currentQuery.get(appendDesc.INSTANCE) == null) {
            currentQuery = getDefaultPrettyPrinter.INSTANCE.write().plus(currentQuery);
        }
        appendDesc appenddesc = (appendDesc) currentQuery.get(appendDesc.INSTANCE);
        if (appenddesc != null) {
            getInputCodeComment getinputcodecomment2 = new getInputCodeComment(appenddesc);
            getinputcodecomment2.write();
            getinputcodecomment = getinputcodecomment2;
        } else {
            getinputcodecomment = null;
        }
        MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        _handleOddValue _handleoddvalue = (_handleOddValue) currentQuery.get(_handleOddValue.INSTANCE);
        if (_handleoddvalue == null) {
            ?? keyusing = new keyUsing();
            writeVar.write = keyusing;
            _handleoddvalue = (_handleOddValue) keyusing;
        }
        CurrentQuery currentQueryPlus = currentQuery.plus(getinputcodecomment != null ? getinputcodecomment : VideoSessionResponseBody.RemoteActionCompatParcelizer).plus(_handleoddvalue);
        _truncate _truncateVar = new _truncate(currentQueryPlus);
        _truncateVar.onCustomAction();
        TopUserCompanion topUserCompanionAudioAttributesCompatParcelizer = College.AudioAttributesCompatParcelizer(currentQueryPlus);
        if (anyignorals == null) {
            hasGetter hasgetterWrite = isCreatorVisible.write(view);
            anyignorals = hasgetterWrite != null ? hasgetterWrite.getLifecycle() : null;
        }
        if (anyignorals != null) {
            view.addOnAttachStateChangeListener(new read(view, _truncateVar));
            anyignorals.IconCompatParcelizer(new RemoteActionCompatParcelizer(topUserCompanionAudioAttributesCompatParcelizer, getinputcodecomment, _truncateVar, writeVar, view));
            return _truncateVar;
        }
        reportWrongTokenException.write("ViewTreeLifecycleOwner not found from ".concat(String.valueOf(view)));
        throw new PlanDetailsCreator();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lo/ConfigOverride$read;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "p0", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements View.OnAttachStateChangeListener {
        final /* synthetic */ _truncate AudioAttributesCompatParcelizer;
        final /* synthetic */ View IconCompatParcelizer;

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View p0) {
        }

        read(View view, _truncate _truncateVar) {
            this.IconCompatParcelizer = view;
            this.AudioAttributesCompatParcelizer = _truncateVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View p0) {
            this.IconCompatParcelizer.removeOnAttachStateChangeListener(this);
            this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/ConfigOverride$RemoteActionCompatParcelizer;", "Lo/findAccess;", "Lo/hasGetter;", "p0", "Lo/anyIgnorals$read;", "p1", "", "read", "(Lo/hasGetter;Lo/anyIgnorals$read;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements findAccess {
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<keyUsing> AudioAttributesCompatParcelizer;
        final /* synthetic */ TopUserCompanion IconCompatParcelizer;
        final /* synthetic */ getInputCodeComment RemoteActionCompatParcelizer;
        final /* synthetic */ View read;
        final /* synthetic */ _truncate write;

        RemoteActionCompatParcelizer(TopUserCompanion topUserCompanion, getInputCodeComment getinputcodecomment, _truncate _truncateVar, MagicModuleUseCaseImplWhenMappings.write<keyUsing> writeVar, View view) {
            this.IconCompatParcelizer = topUserCompanion;
            this.RemoteActionCompatParcelizer = getinputcodecomment;
            this.write = _truncateVar;
            this.AudioAttributesCompatParcelizer = writeVar;
            this.read = view;
        }

        @Override // kotlin.findAccess
        public final void read(hasGetter p0, anyIgnorals.read p1) {
            switch (ConfigOverride$RemoteActionCompatParcelizer$AudioAttributesCompatParcelizer$WhenMappings.write[p1.ordinal()]) {
                case 1:
                    C0201setMcqCount.IconCompatParcelizer(this.IconCompatParcelizer, null, getCollegeName.AudioAttributesCompatParcelizer, new write(this.AudioAttributesCompatParcelizer, this.write, p0, this, this.read, null), 1);
                    return;
                case 2:
                    getInputCodeComment getinputcodecomment = this.RemoteActionCompatParcelizer;
                    if (getinputcodecomment != null) {
                        getinputcodecomment.IconCompatParcelizer();
                    }
                    this.write.onCommand();
                    return;
                case 3:
                    this.write.onCustomAction();
                    return;
                case 4:
                    this.write.AudioAttributesImplApi26Parcelizer();
                    return;
                case 5:
                case 6:
                case 7:
                    return;
                default:
                    throw new RenewEligibleCreator();
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
            int AudioAttributesImplApi21Parcelizer;
            private /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
            final /* synthetic */ _truncate IconCompatParcelizer;
            final /* synthetic */ hasGetter RemoteActionCompatParcelizer;
            final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<keyUsing> read;
            final /* synthetic */ View write;

            /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                    int r1 = r7.AudioAttributesImplApi21Parcelizer
                    r2 = 1
                    if (r1 == 0) goto L1d
                    if (r1 != r2) goto L15
                    java.lang.Object r0 = r7.AudioAttributesImplApi26Parcelizer
                    o.setPassingYear r0 = (kotlin.setPassingYear) r0
                    kotlin.SdkPayloadData.IconCompatParcelizer(r8)     // Catch: java.lang.Throwable -> L13
                    goto L67
                L13:
                    r8 = move-exception
                    goto L80
                L15:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L1d:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                    java.lang.Object r8 = r7.AudioAttributesImplApi26Parcelizer
                    o.TopUserCompanion r8 = (kotlin.TopUserCompanion) r8
                    r1 = 0
                    o.MagicModuleUseCaseImplWhenMappings$write<o.keyUsing> r3 = r7.read     // Catch: java.lang.Throwable -> L82
                    T r3 = r3.write     // Catch: java.lang.Throwable -> L82
                    o.keyUsing r3 = (kotlin.keyUsing) r3     // Catch: java.lang.Throwable -> L82
                    if (r3 == 0) goto L55
                    android.view.View r4 = r7.write     // Catch: java.lang.Throwable -> L82
                    android.content.Context r4 = r4.getContext()     // Catch: java.lang.Throwable -> L82
                    android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L82
                    o.setUpdatedStatus r4 = kotlin.ConfigOverride.RemoteActionCompatParcelizer(r4)     // Catch: java.lang.Throwable -> L82
                    java.lang.Object r5 = r4.IconCompatParcelizer()     // Catch: java.lang.Throwable -> L82
                    java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L82
                    float r5 = r5.floatValue()     // Catch: java.lang.Throwable -> L82
                    r3.IconCompatParcelizer(r5)     // Catch: java.lang.Throwable -> L82
                    o.ConfigOverride$RemoteActionCompatParcelizer$write$RemoteActionCompatParcelizer r5 = new o.ConfigOverride$RemoteActionCompatParcelizer$write$RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L82
                    r5.<init>(r4, r3, r1)     // Catch: java.lang.Throwable -> L82
                    o.MagicModuleSubmissionRequestBody r5 = (kotlin.MagicModuleSubmissionRequestBody) r5     // Catch: java.lang.Throwable -> L82
                    r3 = 3
                    o.setPassingYear r8 = kotlin.setModifiedEndTimestampMs.AudioAttributesCompatParcelizer(r8, r1, r1, r5, r3)     // Catch: java.lang.Throwable -> L82
                    goto L56
                L55:
                    r8 = r1
                L56:
                    o._truncate r1 = r7.IconCompatParcelizer     // Catch: java.lang.Throwable -> L7c
                    r3 = r7
                    o.SampleVideos r3 = (kotlin.SampleVideos) r3     // Catch: java.lang.Throwable -> L7c
                    r7.AudioAttributesImplApi26Parcelizer = r8     // Catch: java.lang.Throwable -> L7c
                    r7.AudioAttributesImplApi21Parcelizer = r2     // Catch: java.lang.Throwable -> L7c
                    java.lang.Object r1 = r1.read(r3)     // Catch: java.lang.Throwable -> L7c
                    if (r1 != r0) goto L66
                    return r0
                L66:
                    r0 = r8
                L67:
                    if (r0 == 0) goto L6c
                    o.setPassingYear.read.write(r0)
                L6c:
                    o.hasGetter r8 = r7.RemoteActionCompatParcelizer
                    o.anyIgnorals r8 = r8.getLifecycle()
                    o.ConfigOverride$RemoteActionCompatParcelizer r7 = r7.AudioAttributesCompatParcelizer
                    o.findExplicitNames r7 = (kotlin.findExplicitNames) r7
                    r8.AudioAttributesCompatParcelizer(r7)
                    o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
                    return r7
                L7c:
                    r0 = move-exception
                    r6 = r0
                    r0 = r8
                    r8 = r6
                L80:
                    r1 = r0
                    goto L83
                L82:
                    r8 = move-exception
                L83:
                    if (r1 == 0) goto L88
                    o.setPassingYear.read.write(r1)
                L88:
                    o.hasGetter r0 = r7.RemoteActionCompatParcelizer
                    o.anyIgnorals r0 = r0.getLifecycle()
                    o.ConfigOverride$RemoteActionCompatParcelizer r7 = r7.AudioAttributesCompatParcelizer
                    o.findExplicitNames r7 = (kotlin.findExplicitNames) r7
                    r0.AudioAttributesCompatParcelizer(r7)
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ConfigOverride.RemoteActionCompatParcelizer.write.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX INFO: renamed from: o.ConfigOverride$RemoteActionCompatParcelizer$write$RemoteActionCompatParcelizer, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class C0023RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                final /* synthetic */ keyUsing AudioAttributesCompatParcelizer;
                final /* synthetic */ setUpdatedStatus<Float> IconCompatParcelizer;
                int write;

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                    int i = this.write;
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        setUpdatedStatus<Float> setupdatedstatus = this.IconCompatParcelizer;
                        final keyUsing keyusing = this.AudioAttributesCompatParcelizer;
                        this.write = 1;
                        if (setupdatedstatus.write(new getValidationToken() { // from class: o.ConfigOverride.RemoteActionCompatParcelizer.write.RemoteActionCompatParcelizer.2
                            @Override // kotlin.getValidationToken
                            public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                                return IconCompatParcelizer(((Number) obj2).floatValue(), (SampleVideos<? super getShowPopup>) sampleVideos);
                            }

                            public final Object IconCompatParcelizer(float f, SampleVideos<? super getShowPopup> sampleVideos) {
                                keyusing.IconCompatParcelizer(f);
                                return getShowPopup.INSTANCE;
                            }
                        }, this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SdkPayloadData.IconCompatParcelizer(obj);
                    }
                    throw new PlanDetailsCreator();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0023RemoteActionCompatParcelizer(setUpdatedStatus<Float> setupdatedstatus, keyUsing keyusing, SampleVideos<? super C0023RemoteActionCompatParcelizer> sampleVideos) {
                    super(2, sampleVideos);
                    this.IconCompatParcelizer = setupdatedstatus;
                    this.AudioAttributesCompatParcelizer = keyusing;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new C0023RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((C0023RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            write(MagicModuleUseCaseImplWhenMappings.write<keyUsing> writeVar, _truncate _truncateVar, hasGetter hasgetter, RemoteActionCompatParcelizer remoteActionCompatParcelizer, View view, SampleVideos<? super write> sampleVideos) {
                super(2, sampleVideos);
                this.read = writeVar;
                this.IconCompatParcelizer = _truncateVar;
                this.RemoteActionCompatParcelizer = hasgetter;
                this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
                this.write = view;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                write writeVar = new write(this.read, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write, sampleVideos);
                writeVar.AudioAttributesImplApi26Parcelizer = obj;
                return writeVar;
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }
    }
}
