package kotlin;

import android.os.Trace;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.WindowInsetsCompatImpl30;
import kotlin.onActivityPostStarted;
import kotlin.parseDigitsRecursive;
import kotlin.setOnApplyWindowInsetsListener;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0088\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0002\b\u0019H\u0001¢\u0006\u0002\u0010\u001a\u001aq\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0003¢\u0006\u0002\u0010&\u001a*\u0010'\u001a\u00020\u0001*\u00020(2\u0006\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010.\u001a\u00020/H\u0002¨\u00060"}, d2 = {"LazyGrid", "", "modifier", "Landroidx/compose/ui/Modifier;", NotesDispatchAddressRequestKt.KEY_STATE, "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "slots", "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "rememberLazyGridMeasurePolicy", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasurePolicy;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "stickyItemsScrollBehavior", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasurePolicy;", "keepAroundItems", "Landroidx/compose/foundation/lazy/layout/CacheWindowLogic;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "visibleItemsList", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setOnApplyWindowInsetsListener {
    /* JADX WARN: Removed duplicated region for block: B:100:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write(kotlin._handleOddName r32, final kotlin.onActivityPostCreated r33, final kotlin.completeWakefulIntent r34, kotlin.getReturnTransition r35, boolean r36, final boolean r37, kotlin.CoordinatorLayout r38, final boolean r39, final kotlin.setLastHorizontalStyle r40, final o.WindowInsetsCompatImpl30.RatingCompat r41, final o.WindowInsetsCompatImpl30.write r42, final kotlin.getAnswerMap<? super kotlin.startWakefulService, kotlin.getShowPopup> r43, kotlin._handleUnrecognizedCharacterEscape r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instruction units count: 819
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setOnApplyWindowInsetsListener.write(o._handleOddName, o.onActivityPostCreated, o.completeWakefulIntent, o.getReturnTransition, boolean, boolean, o.CoordinatorLayout, boolean, o.setLastHorizontalStyle, o.WindowInsetsCompatImpl30$RatingCompat, o.WindowInsetsCompatImpl30$write, o.getAnswerMap, o._handleUnrecognizedCharacterEscape, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlin.addAnalyticsListener IconCompatParcelizer(kotlin.getCreatedOnDateMs<? extends kotlin.onPostResume> r19, kotlin.onActivityPostCreated r20, kotlin.completeWakefulIntent r21, kotlin.getReturnTransition r22, boolean r23, boolean r24, o.WindowInsetsCompatImpl30.write r25, o.WindowInsetsCompatImpl30.RatingCompat r26, kotlin.TopUserCompanion r27, kotlin.buf r28, kotlin.setSkipSilenceEnabled r29, kotlin._handleUnrecognizedCharacterEscape r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setOnApplyWindowInsetsListener.IconCompatParcelizer(o.getCreatedOnDateMs, o.onActivityPostCreated, o.completeWakefulIntent, o.getReturnTransition, boolean, boolean, o.WindowInsetsCompatImpl30$write, o.WindowInsetsCompatImpl30$RatingCompat, o.TopUserCompanion, o.buf, o.setSkipSilenceEnabled, o._handleUnrecognizedCharacterEscape, int, int):o.addAnalyticsListener");
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer implements addAnalyticsListener {
        final /* synthetic */ getReturnTransition AudioAttributesCompatParcelizer;
        final /* synthetic */ boolean AudioAttributesImplApi21Parcelizer;
        final /* synthetic */ onActivityPostCreated AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ getCreatedOnDateMs<onPostResume> AudioAttributesImplBaseParcelizer;
        final /* synthetic */ WindowInsetsCompatImpl30.write IconCompatParcelizer;
        final /* synthetic */ setSkipSilenceEnabled MediaBrowserCompatCustomActionResultReceiver;
        final /* synthetic */ completeWakefulIntent MediaBrowserCompatItemReceiver;
        final /* synthetic */ WindowInsetsCompatImpl30.RatingCompat MediaDescriptionCompat;
        final /* synthetic */ buf RemoteActionCompatParcelizer;
        final /* synthetic */ boolean read;
        final /* synthetic */ TopUserCompanion write;

        @Override // kotlin.addAnalyticsListener
        public final withHandlersFrom IconCompatParcelizer(final Mp4LocationData mp4LocationData, final long j) {
            int iIconCompatParcelizer;
            int iIconCompatParcelizer2;
            int i;
            float read;
            int iAudioAttributesImplBaseParcelizer;
            int i2;
            Mp4LocationData mp4LocationData2;
            long j2;
            int i3;
            int i4;
            long j3;
            int iRemoteActionCompatParcelizer;
            int iMediaBrowserCompatCustomActionResultReceiver;
            float mediaMetadataCompat;
            setAuxEffectInfo.write(this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat());
            boolean z = this.AudioAttributesImplApi26Parcelizer.getRemoteActionCompatParcelizer() || mp4LocationData.r_();
            ComposeView.read(j, this.read ? superDispatchKeyEvent.write : superDispatchKeyEvent.AudioAttributesCompatParcelizer);
            if (this.read) {
                iIconCompatParcelizer = mp4LocationData.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.read(mp4LocationData.getAudioAttributesCompatParcelizer()));
            } else {
                iIconCompatParcelizer = mp4LocationData.IconCompatParcelizer(getParentFragment.write(this.AudioAttributesCompatParcelizer, mp4LocationData.getAudioAttributesCompatParcelizer()));
            }
            if (this.read) {
                iIconCompatParcelizer2 = mp4LocationData.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(mp4LocationData.getAudioAttributesCompatParcelizer()));
            } else {
                iIconCompatParcelizer2 = mp4LocationData.IconCompatParcelizer(getParentFragment.read(this.AudioAttributesCompatParcelizer, mp4LocationData.getAudioAttributesCompatParcelizer()));
            }
            int iIconCompatParcelizer3 = mp4LocationData.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.getRead());
            int iIconCompatParcelizer4 = mp4LocationData.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer());
            int i5 = iIconCompatParcelizer3 + iIconCompatParcelizer4;
            int i6 = iIconCompatParcelizer + iIconCompatParcelizer2;
            boolean z2 = this.read;
            int i7 = z2 ? i5 : i6;
            if (z2 && !this.AudioAttributesImplApi21Parcelizer) {
                i = iIconCompatParcelizer3;
            } else if (z2 && this.AudioAttributesImplApi21Parcelizer) {
                i = iIconCompatParcelizer4;
            } else {
                i = (z2 || this.AudioAttributesImplApi21Parcelizer) ? iIconCompatParcelizer2 : iIconCompatParcelizer;
            }
            int i8 = i7 - i;
            long jIconCompatParcelizer = PropertyValueBuffer.IconCompatParcelizer(j, -i6, -i5);
            onPostResume onpostresumeInvoke = this.AudioAttributesImplBaseParcelizer.invoke();
            final onActivityPostStarted onactivitypoststartedIconCompatParcelizer = onpostresumeInvoke.IconCompatParcelizer();
            Mp4LocationData mp4LocationData3 = mp4LocationData;
            ProcessLifecycleInitializer processLifecycleInitializerWrite = this.MediaBrowserCompatItemReceiver.write(mp4LocationData3, jIconCompatParcelizer);
            int length = processLifecycleInitializerWrite.getAudioAttributesCompatParcelizer().length;
            onactivitypoststartedIconCompatParcelizer.write(length);
            if (this.read) {
                WindowInsetsCompatImpl30.RatingCompat ratingCompat = this.MediaDescriptionCompat;
                if (ratingCompat != null) {
                    read = ratingCompat.getRead();
                } else {
                    getRootStableInsets.read("null verticalArrangement when isVertical == true");
                    throw new PlanDetailsCreator();
                }
            } else {
                WindowInsetsCompatImpl30.write writeVar = this.IconCompatParcelizer;
                if (writeVar != null) {
                    read = writeVar.getRead();
                } else {
                    getRootStableInsets.read("null horizontalArrangement when isVertical == false");
                    throw new PlanDetailsCreator();
                }
            }
            int iIconCompatParcelizer5 = mp4LocationData.IconCompatParcelizer(read);
            int i9 = onpostresumeInvoke.read();
            if (this.read) {
                iAudioAttributesImplBaseParcelizer = PropertyValueAny.AudioAttributesImplApi21Parcelizer(j) - i5;
            } else {
                iAudioAttributesImplBaseParcelizer = PropertyValueAny.AudioAttributesImplBaseParcelizer(j) - i6;
            }
            int i10 = iAudioAttributesImplBaseParcelizer;
            if (this.AudioAttributesImplApi21Parcelizer && i10 <= 0) {
                boolean z3 = this.read;
                if (!z3) {
                    iIconCompatParcelizer += i10;
                }
                if (z3) {
                    iIconCompatParcelizer3 += i10;
                }
                i2 = length;
                mp4LocationData2 = mp4LocationData3;
                j2 = jIconCompatParcelizer;
                i3 = i5;
                i4 = i6;
                long j4 = -1;
                j3 = hasReferringProperties.read((((long) iIconCompatParcelizer3) & ((((long) 0) << 32) | (j4 - ((j4 >> 63) << 32)))) | (((long) iIconCompatParcelizer) << 32));
            } else {
                i2 = length;
                mp4LocationData2 = mp4LocationData3;
                j2 = jIconCompatParcelizer;
                i3 = i5;
                i4 = i6;
                long j5 = -1;
                j3 = hasReferringProperties.read((((long) iIconCompatParcelizer) << 32) | (((long) iIconCompatParcelizer3) & ((((long) 0) << 32) | (j5 - ((j5 >> 63) << 32)))));
            }
            int i11 = i2;
            long j6 = j2;
            final int i12 = i3;
            final int i13 = i4;
            write writeVar2 = new write(onpostresumeInvoke, mp4LocationData, iIconCompatParcelizer5, this.AudioAttributesImplApi26Parcelizer, this.read, this.AudioAttributesImplApi21Parcelizer, i, i8, j3);
            final C0146AudioAttributesCompatParcelizer c0146AudioAttributesCompatParcelizer = new C0146AudioAttributesCompatParcelizer(this.read, processLifecycleInitializerWrite, i9, iIconCompatParcelizer5, writeVar2, onactivitypoststartedIconCompatParcelizer);
            getAnswerMap getanswermap = new getAnswerMap() { // from class: o.findFragmentById
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return setOnApplyWindowInsetsListener.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(onactivitypoststartedIconCompatParcelizer, c0146AudioAttributesCompatParcelizer, ((Integer) obj).intValue());
                }
            };
            getAnswerMap getanswermap2 = new getAnswerMap() { // from class: o.findFragmentByTag
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Integer.valueOf(setOnApplyWindowInsetsListener.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(onactivitypoststartedIconCompatParcelizer, ((Integer) obj).intValue()));
                }
            };
            parseDigitsRecursive.Companion companion = parseDigitsRecursive.INSTANCE;
            onActivityPostCreated onactivitypostcreated = this.AudioAttributesImplApi26Parcelizer;
            parseDigitsRecursive parsedigitsrecursiveIconCompatParcelizer = companion.IconCompatParcelizer();
            getAnswerMap<Object, getShowPopup> getanswermapAudioAttributesImplApi26Parcelizer = parsedigitsrecursiveIconCompatParcelizer != null ? parsedigitsrecursiveIconCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null;
            parseDigitsRecursive parsedigitsrecursive = companion.read(parsedigitsrecursiveIconCompatParcelizer);
            try {
                int iWrite = onactivitypostcreated.write(onpostresumeInvoke, onactivitypostcreated.AudioAttributesImplBaseParcelizer());
                if (iWrite < i9 || i9 <= 0) {
                    iRemoteActionCompatParcelizer = onactivitypoststartedIconCompatParcelizer.RemoteActionCompatParcelizer(iWrite);
                    iMediaBrowserCompatCustomActionResultReceiver = onactivitypostcreated.MediaBrowserCompatCustomActionResultReceiver();
                } else {
                    iRemoteActionCompatParcelizer = onactivitypoststartedIconCompatParcelizer.RemoteActionCompatParcelizer(i9 - 1);
                    iMediaBrowserCompatCustomActionResultReceiver = 0;
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
                List<Integer> list = onStopLoading.read(onpostresumeInvoke, this.AudioAttributesImplApi26Parcelizer.getOnMediaButtonEvent(), this.AudioAttributesImplApi26Parcelizer.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
                if (mp4LocationData.r_() || !z) {
                    mediaMetadataCompat = this.AudioAttributesImplApi26Parcelizer.getMediaMetadataCompat();
                } else {
                    mediaMetadataCompat = this.AudioAttributesImplApi26Parcelizer.onPause();
                }
                C0146AudioAttributesCompatParcelizer c0146AudioAttributesCompatParcelizer2 = c0146AudioAttributesCompatParcelizer;
                destroyInternalPathIterator destroyinternalpathiteratorRemoteActionCompatParcelizer = setup.RemoteActionCompatParcelizer(i9, c0146AudioAttributesCompatParcelizer2, writeVar2, i10, i, i8, iIconCompatParcelizer5, iRemoteActionCompatParcelizer, iMediaBrowserCompatCustomActionResultReceiver, mediaMetadataCompat, j6, this.read, this.MediaDescriptionCompat, this.IconCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, mp4LocationData2, this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatSearchResultReceiver(), i11, list, z, mp4LocationData.r_(), this.AudioAttributesImplApi26Parcelizer.getWrite(), this.write, this.AudioAttributesImplApi26Parcelizer.handleMediaPlayPauseIfPendingOnHandler(), this.RemoteActionCompatParcelizer, getanswermap, getanswermap2, this.MediaBrowserCompatCustomActionResultReceiver, new getModuleData() { // from class: o.FragmentManagerLaunchedFragmentInfo
                    @Override // kotlin.getModuleData
                    public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                        return setOnApplyWindowInsetsListener.AudioAttributesCompatParcelizer.IconCompatParcelizer(mp4LocationData, j, i13, i12, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (getAnswerMap) obj3);
                    }
                });
                onActivityPostCreated.RemoteActionCompatParcelizer$default(this.AudioAttributesImplApi26Parcelizer, destroyinternalpathiteratorRemoteActionCompatParcelizer, mp4LocationData.r_(), false, 4, null);
                Object iconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.getIconCompatParcelizer();
                onCancelLoad oncancelload = iconCompatParcelizer instanceof onCancelLoad ? (onCancelLoad) iconCompatParcelizer : null;
                if (oncancelload != null) {
                    setOnApplyWindowInsetsListener.read(oncancelload, destroyinternalpathiteratorRemoteActionCompatParcelizer.getHandleMediaPlayPauseIfPendingOnHandler(), destroyinternalpathiteratorRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer(), c0146AudioAttributesCompatParcelizer2);
                }
                return destroyinternalpathiteratorRemoteActionCompatParcelizer;
            } catch (Throwable th) {
                companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
                throw th;
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J_\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/setOnApplyWindowInsetsListener$AudioAttributesCompatParcelizer$write;", "Lo/internalConicToQuadratics;", "", "p0", "", "p1", "p2", "p3", "p4", "", "Lo/_parser;", "p5", "Lo/PropertyValueAny;", "p6", "p7", "p8", "Lo/createInternalPathIterator;", "read", "(ILjava/lang/Object;Ljava/lang/Object;IILjava/util/List;JII)Lo/createInternalPathIterator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class write extends internalConicToQuadratics {
            final /* synthetic */ boolean AudioAttributesCompatParcelizer;
            final /* synthetic */ long AudioAttributesImplBaseParcelizer;
            final /* synthetic */ int IconCompatParcelizer;
            final /* synthetic */ Mp4LocationData MediaBrowserCompatItemReceiver;
            final /* synthetic */ int RemoteActionCompatParcelizer;
            final /* synthetic */ onActivityPostCreated read;
            final /* synthetic */ boolean write;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            write(onPostResume onpostresume, Mp4LocationData mp4LocationData, int i, onActivityPostCreated onactivitypostcreated, boolean z, boolean z2, int i2, int i3, long j) {
                super(onpostresume, mp4LocationData, i);
                this.MediaBrowserCompatItemReceiver = mp4LocationData;
                this.read = onactivitypostcreated;
                this.AudioAttributesCompatParcelizer = z;
                this.write = z2;
                this.RemoteActionCompatParcelizer = i2;
                this.IconCompatParcelizer = i3;
                this.AudioAttributesImplBaseParcelizer = j;
            }

            @Override // kotlin.internalConicToQuadratics
            public final createInternalPathIterator read(int p0, Object p1, Object p2, int p3, int p4, List<? extends _parser> p5, long p6, int p7, int p8) {
                return new createInternalPathIterator(p0, p1, this.AudioAttributesCompatParcelizer, p3, p4, this.write, this.MediaBrowserCompatItemReceiver.getAudioAttributesCompatParcelizer(), this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, p5, this.AudioAttributesImplBaseParcelizer, p2, this.read.MediaBrowserCompatSearchResultReceiver(), p6, p7, p8, null);
            }
        }

        /* JADX INFO: renamed from: o.setOnApplyWindowInsetsListener$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/setOnApplyWindowInsetsListener$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer;", "Lo/internalPathIteratorHasNext;", "", "p0", "", "Lo/createInternalPathIterator;", "p1", "", "Lo/init;", "p2", "p3", "Lo/PathIteratorPreApi34Impl;", "AudioAttributesCompatParcelizer", "(I[Lo/createInternalPathIterator;Ljava/util/List;I)Lo/PathIteratorPreApi34Impl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0146AudioAttributesCompatParcelizer extends internalPathIteratorHasNext {
            final /* synthetic */ boolean AudioAttributesCompatParcelizer;
            final /* synthetic */ ProcessLifecycleInitializer write;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0146AudioAttributesCompatParcelizer(boolean z, ProcessLifecycleInitializer processLifecycleInitializer, int i, int i2, write writeVar, onActivityPostStarted onactivitypoststarted) {
                super(z, processLifecycleInitializer, i, i2, writeVar, onactivitypoststarted);
                this.AudioAttributesCompatParcelizer = z;
                this.write = processLifecycleInitializer;
            }

            @Override // kotlin.internalPathIteratorHasNext
            public final PathIteratorPreApi34Impl AudioAttributesCompatParcelizer(int p0, createInternalPathIterator[] p1, List<init> p2, int p3) {
                return new PathIteratorPreApi34Impl(p0, p1, this.write, p2, this.AudioAttributesCompatParcelizer, p3);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ArrayList RemoteActionCompatParcelizer(onActivityPostStarted onactivitypoststarted, C0146AudioAttributesCompatParcelizer c0146AudioAttributesCompatParcelizer, int i) {
            onActivityPostStarted.IconCompatParcelizer iconCompatParcelizerAudioAttributesCompatParcelizer = onactivitypoststarted.AudioAttributesCompatParcelizer(i);
            int remoteActionCompatParcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer();
            ArrayList arrayList = new ArrayList(iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer().size());
            List<init> listIconCompatParcelizer = iconCompatParcelizerAudioAttributesCompatParcelizer.IconCompatParcelizer();
            int size = listIconCompatParcelizer.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iRemoteActionCompatParcelizer = init.RemoteActionCompatParcelizer(listIconCompatParcelizer.get(i3).getWrite());
                arrayList.add(setAction.write(Integer.valueOf(remoteActionCompatParcelizer), PropertyValueAny.read(c0146AudioAttributesCompatParcelizer.read(i2, iRemoteActionCompatParcelizer))));
                remoteActionCompatParcelizer++;
                i2 += iRemoteActionCompatParcelizer;
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int RemoteActionCompatParcelizer(onActivityPostStarted onactivitypoststarted, int i) {
            return onactivitypoststarted.RemoteActionCompatParcelizer(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final withHandlersFrom IconCompatParcelizer(Mp4LocationData mp4LocationData, long j, int i, int i2, int i3, int i4, getAnswerMap getanswermap) {
            return mp4LocationData.AudioAttributesCompatParcelizer(PropertyValueBuffer.IconCompatParcelizer(j, i3 + i), PropertyValueBuffer.RemoteActionCompatParcelizer(j, i4 + i2), VideoTimelineResponseBody.read(), getanswermap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(onActivityPostCreated onactivitypostcreated, boolean z, getReturnTransition getreturntransition, boolean z2, getCreatedOnDateMs<? extends onPostResume> getcreatedondatems, completeWakefulIntent completewakefulintent, WindowInsetsCompatImpl30.RatingCompat ratingCompat, WindowInsetsCompatImpl30.write writeVar, TopUserCompanion topUserCompanion, buf bufVar, setSkipSilenceEnabled setskipsilenceenabled) {
            this.AudioAttributesImplApi26Parcelizer = onactivitypostcreated;
            this.read = z;
            this.AudioAttributesCompatParcelizer = getreturntransition;
            this.AudioAttributesImplApi21Parcelizer = z2;
            this.AudioAttributesImplBaseParcelizer = getcreatedondatems;
            this.MediaBrowserCompatItemReceiver = completewakefulintent;
            this.MediaDescriptionCompat = ratingCompat;
            this.IconCompatParcelizer = writeVar;
            this.write = topUserCompanion;
            this.RemoteActionCompatParcelizer = bufVar;
            this.MediaBrowserCompatCustomActionResultReceiver = setskipsilenceenabled;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(onCancelLoad oncancelload, superDispatchKeyEvent superdispatchkeyevent, List<createInternalPathIterator> list, internalPathIteratorHasNext internalpathiteratorhasnext) {
        Trace.beginSection("compose:lazy:cache_window:keepAroundItems");
        try {
            if (oncancelload.write() && !list.isEmpty()) {
                int iIconCompatParcelizer = onStateNotSaved.IconCompatParcelizer((onResumeFragments) IntermediateLoginResponseBody.RatingCompat((List) list), superdispatchkeyevent);
                int iIconCompatParcelizer2 = onStateNotSaved.IconCompatParcelizer((onResumeFragments) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) list), superdispatchkeyevent);
                for (int iRemoteActionCompatParcelizer = oncancelload.getAudioAttributesImplApi21Parcelizer(); iRemoteActionCompatParcelizer < iIconCompatParcelizer; iRemoteActionCompatParcelizer++) {
                    internalpathiteratorhasnext.IconCompatParcelizer(iRemoteActionCompatParcelizer);
                }
                int i = iIconCompatParcelizer2 + 1;
                int iIconCompatParcelizer3 = oncancelload.getMediaBrowserCompatCustomActionResultReceiver();
                if (i <= iIconCompatParcelizer3) {
                    while (true) {
                        internalpathiteratorhasnext.IconCompatParcelizer(i);
                        if (i == iIconCompatParcelizer3) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(_handleOddName _handleoddname, onActivityPostCreated onactivitypostcreated, completeWakefulIntent completewakefulintent, getReturnTransition getreturntransition, boolean z, boolean z2, CoordinatorLayout coordinatorLayout, boolean z3, setLastHorizontalStyle setlasthorizontalstyle, WindowInsetsCompatImpl30.RatingCompat ratingCompat, WindowInsetsCompatImpl30.write writeVar, getAnswerMap getanswermap, int i, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i4) {
        write(_handleoddname, onactivitypostcreated, completewakefulintent, getreturntransition, z, z2, coordinatorLayout, z3, setlasthorizontalstyle, ratingCompat, writeVar, getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), _appendEscaped.RemoteActionCompatParcelizer(i2), i3);
        return getShowPopup.INSTANCE;
    }
}
