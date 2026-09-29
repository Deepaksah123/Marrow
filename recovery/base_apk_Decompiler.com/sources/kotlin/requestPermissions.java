package kotlin;

import android.os.Trace;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.WindowInsetsCompatImpl30;
import kotlin._skipWSOrEnd;
import kotlin.parseDigitsRecursive;
import kotlin.requestPermissions;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a¢\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u001b¢\u0006\u0002\b\u001dH\u0001¢\u0006\u0002\u0010\u001e\u001a\u0085\u0001\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0003¢\u0006\u0002\u0010*\u001a\"\u0010+\u001a\u00020\u0001*\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00100\u001a\u000201H\u0002¨\u00062"}, d2 = {"LazyList", "", "modifier", "Landroidx/compose/ui/Modifier;", NotesDispatchAddressRequestKt.KEY_STATE, "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "beyondBoundsItemCount", "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;ILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "rememberLazyListMeasurePolicy", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasurePolicy;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "stickyItemsPlacement", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasurePolicy;", "keepAroundItems", "Landroidx/compose/foundation/lazy/layout/CacheWindowLogic;", "visibleItemsList", "", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class requestPermissions {
    /* JADX WARN: Removed duplicated region for block: B:114:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void read(final kotlin._handleOddName r32, final kotlin.setSharedElementReturnTransition r33, final kotlin.getReturnTransition r34, final boolean r35, final boolean r36, final kotlin.CoordinatorLayout r37, final boolean r38, final kotlin.setLastHorizontalStyle r39, int r40, o._skipWSOrEnd.write r41, o.WindowInsetsCompatImpl30.RatingCompat r42, o._skipWSOrEnd.read r43, o.WindowInsetsCompatImpl30.write r44, final kotlin.getAnswerMap<? super kotlin.setReenterTransition, kotlin.getShowPopup> r45, kotlin._handleUnrecognizedCharacterEscape r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instruction units count: 889
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.requestPermissions.read(o._handleOddName, o.setSharedElementReturnTransition, o.getReturnTransition, boolean, boolean, o.CoordinatorLayout, boolean, o.setLastHorizontalStyle, int, o._skipWSOrEnd$write, o.WindowInsetsCompatImpl30$RatingCompat, o._skipWSOrEnd$read, o.WindowInsetsCompatImpl30$write, o.getAnswerMap, o._handleUnrecognizedCharacterEscape, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlin.addAnalyticsListener RemoteActionCompatParcelizer(kotlin.getCreatedOnDateMs<? extends kotlin.performStart> r21, kotlin.setSharedElementReturnTransition r22, kotlin.getReturnTransition r23, boolean r24, boolean r25, int r26, o._skipWSOrEnd.write r27, o._skipWSOrEnd.read r28, o.WindowInsetsCompatImpl30.write r29, o.WindowInsetsCompatImpl30.RatingCompat r30, kotlin.TopUserCompanion r31, kotlin.buf r32, kotlin.setSkipSilenceEnabled r33, kotlin._handleUnrecognizedCharacterEscape r34, int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.requestPermissions.RemoteActionCompatParcelizer(o.getCreatedOnDateMs, o.setSharedElementReturnTransition, o.getReturnTransition, boolean, boolean, int, o._skipWSOrEnd$write, o._skipWSOrEnd$read, o.WindowInsetsCompatImpl30$write, o.WindowInsetsCompatImpl30$RatingCompat, o.TopUserCompanion, o.buf, o.setSkipSilenceEnabled, o._handleUnrecognizedCharacterEscape, int, int):o.addAnalyticsListener");
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read implements addAnalyticsListener {
        final /* synthetic */ _skipWSOrEnd.write AudioAttributesCompatParcelizer;
        final /* synthetic */ WindowInsetsCompatImpl30.write AudioAttributesImplApi21Parcelizer;
        final /* synthetic */ boolean AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ setSharedElementReturnTransition AudioAttributesImplBaseParcelizer;
        final /* synthetic */ int IconCompatParcelizer;
        final /* synthetic */ boolean MediaBrowserCompatCustomActionResultReceiver;
        final /* synthetic */ getCreatedOnDateMs<performStart> MediaBrowserCompatItemReceiver;
        final /* synthetic */ WindowInsetsCompatImpl30.RatingCompat MediaDescriptionCompat;
        final /* synthetic */ _skipWSOrEnd.read MediaMetadataCompat;
        final /* synthetic */ setSkipSilenceEnabled RatingCompat;
        final /* synthetic */ TopUserCompanion RemoteActionCompatParcelizer;
        final /* synthetic */ getReturnTransition read;
        final /* synthetic */ buf write;

        @Override // kotlin.addAnalyticsListener
        public final withHandlersFrom IconCompatParcelizer(final Mp4LocationData mp4LocationData, final long j) {
            int iIconCompatParcelizer;
            int iIconCompatParcelizer2;
            int i;
            float read;
            int iAudioAttributesImplBaseParcelizer;
            int i2;
            long j2;
            float mediaBrowserCompatMediaItem;
            setAuxEffectInfo.write(this.AudioAttributesImplBaseParcelizer.MediaMetadataCompat());
            boolean z = this.AudioAttributesImplBaseParcelizer.getAudioAttributesCompatParcelizer() || mp4LocationData.r_();
            ComposeView.read(j, this.MediaBrowserCompatCustomActionResultReceiver ? superDispatchKeyEvent.write : superDispatchKeyEvent.AudioAttributesCompatParcelizer);
            if (this.MediaBrowserCompatCustomActionResultReceiver) {
                iIconCompatParcelizer = mp4LocationData.IconCompatParcelizer(this.read.read(mp4LocationData.getAudioAttributesCompatParcelizer()));
            } else {
                iIconCompatParcelizer = mp4LocationData.IconCompatParcelizer(getParentFragment.write(this.read, mp4LocationData.getAudioAttributesCompatParcelizer()));
            }
            if (this.MediaBrowserCompatCustomActionResultReceiver) {
                iIconCompatParcelizer2 = mp4LocationData.IconCompatParcelizer(this.read.RemoteActionCompatParcelizer(mp4LocationData.getAudioAttributesCompatParcelizer()));
            } else {
                iIconCompatParcelizer2 = mp4LocationData.IconCompatParcelizer(getParentFragment.read(this.read, mp4LocationData.getAudioAttributesCompatParcelizer()));
            }
            int iIconCompatParcelizer3 = mp4LocationData.IconCompatParcelizer(this.read.getRead());
            int iIconCompatParcelizer4 = mp4LocationData.IconCompatParcelizer(this.read.getRemoteActionCompatParcelizer());
            final int i3 = iIconCompatParcelizer3 + iIconCompatParcelizer4;
            int i4 = iIconCompatParcelizer + iIconCompatParcelizer2;
            boolean z2 = this.MediaBrowserCompatCustomActionResultReceiver;
            int i5 = z2 ? i3 : i4;
            if (z2 && !this.AudioAttributesImplApi26Parcelizer) {
                i = iIconCompatParcelizer3;
            } else if (z2 && this.AudioAttributesImplApi26Parcelizer) {
                i = iIconCompatParcelizer4;
            } else {
                i = (z2 || this.AudioAttributesImplApi26Parcelizer) ? iIconCompatParcelizer2 : iIconCompatParcelizer;
            }
            int i6 = i5 - i;
            long jIconCompatParcelizer = PropertyValueBuffer.IconCompatParcelizer(j, -i4, -i3);
            performStart performstartInvoke = this.MediaBrowserCompatItemReceiver.invoke();
            performstartInvoke.getAudioAttributesCompatParcelizer().IconCompatParcelizer(PropertyValueAny.AudioAttributesImplBaseParcelizer(jIconCompatParcelizer), PropertyValueAny.AudioAttributesImplApi21Parcelizer(jIconCompatParcelizer));
            if (this.MediaBrowserCompatCustomActionResultReceiver) {
                WindowInsetsCompatImpl30.RatingCompat ratingCompat = this.MediaDescriptionCompat;
                if (ratingCompat != null) {
                    read = ratingCompat.getRead();
                } else {
                    getRootStableInsets.read("null verticalArrangement when isVertical == true");
                    throw new PlanDetailsCreator();
                }
            } else {
                WindowInsetsCompatImpl30.write writeVar = this.AudioAttributesImplApi21Parcelizer;
                if (writeVar != null) {
                    read = writeVar.getRead();
                } else {
                    getRootStableInsets.read("null horizontalAlignment when isVertical == false");
                    throw new PlanDetailsCreator();
                }
            }
            int iIconCompatParcelizer5 = mp4LocationData.IconCompatParcelizer(read);
            int i7 = performstartInvoke.read();
            if (this.MediaBrowserCompatCustomActionResultReceiver) {
                iAudioAttributesImplBaseParcelizer = PropertyValueAny.AudioAttributesImplApi21Parcelizer(j) - i3;
            } else {
                iAudioAttributesImplBaseParcelizer = PropertyValueAny.AudioAttributesImplBaseParcelizer(j) - i4;
            }
            int i8 = iAudioAttributesImplBaseParcelizer;
            if (this.AudioAttributesImplApi26Parcelizer && i8 <= 0) {
                boolean z3 = this.MediaBrowserCompatCustomActionResultReceiver;
                if (!z3) {
                    iIconCompatParcelizer += i8;
                }
                if (z3) {
                    iIconCompatParcelizer3 += i8;
                }
                i2 = i4;
                long j3 = -1;
                j2 = hasReferringProperties.read((((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32))) & ((long) iIconCompatParcelizer3)) | (((long) iIconCompatParcelizer) << 32));
            } else {
                i2 = i4;
                long j4 = -1;
                j2 = hasReferringProperties.read((((((long) 0) << 32) | (j4 - ((j4 >> 63) << 32))) & ((long) iIconCompatParcelizer3)) | (((long) iIconCompatParcelizer) << 32));
            }
            final int i9 = i2;
            write writeVar2 = new write(jIconCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, performstartInvoke, mp4LocationData, i7, iIconCompatParcelizer5, this.AudioAttributesCompatParcelizer, this.MediaMetadataCompat, this.AudioAttributesImplApi26Parcelizer, i, i6, j2, this.AudioAttributesImplBaseParcelizer);
            parseDigitsRecursive.Companion companion = parseDigitsRecursive.INSTANCE;
            setSharedElementReturnTransition setsharedelementreturntransition = this.AudioAttributesImplBaseParcelizer;
            parseDigitsRecursive parsedigitsrecursiveIconCompatParcelizer = companion.IconCompatParcelizer();
            getAnswerMap<Object, getShowPopup> getanswermapAudioAttributesImplApi26Parcelizer = parsedigitsrecursiveIconCompatParcelizer != null ? parsedigitsrecursiveIconCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null;
            parseDigitsRecursive parsedigitsrecursive = companion.read(parsedigitsrecursiveIconCompatParcelizer);
            try {
                int iRemoteActionCompatParcelizer = setsharedelementreturntransition.RemoteActionCompatParcelizer(performstartInvoke, setsharedelementreturntransition.AudioAttributesImplApi21Parcelizer());
                int iMediaBrowserCompatItemReceiver = setsharedelementreturntransition.MediaBrowserCompatItemReceiver();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
                List<Integer> list = onStopLoading.read(performstartInvoke, this.AudioAttributesImplBaseParcelizer.getOnPlayFromMediaId(), this.AudioAttributesImplBaseParcelizer.getOnAddQueueItem());
                if (mp4LocationData.r_() || !z) {
                    mediaBrowserCompatMediaItem = this.AudioAttributesImplBaseParcelizer.getMediaBrowserCompatMediaItem();
                } else {
                    mediaBrowserCompatMediaItem = this.AudioAttributesImplBaseParcelizer.onPlayFromMediaId();
                }
                write writeVar3 = writeVar2;
                setEnterTransition setentertransitionWrite = requireView.write(i7, writeVar3, i8, i, i6, iIconCompatParcelizer5, iRemoteActionCompatParcelizer, iMediaBrowserCompatItemReceiver, mediaBrowserCompatMediaItem, jIconCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaDescriptionCompat, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplApi26Parcelizer, mp4LocationData, this.AudioAttributesImplBaseParcelizer.MediaBrowserCompatSearchResultReceiver(), this.IconCompatParcelizer, list, z, mp4LocationData.r_(), this.RemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), this.write, this.RatingCompat, new getModuleData() { // from class: o.requireContext
                    @Override // kotlin.getModuleData
                    public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                        return requestPermissions.read.RemoteActionCompatParcelizer(mp4LocationData, j, i9, i3, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (getAnswerMap) obj3);
                    }
                });
                setSharedElementReturnTransition.IconCompatParcelizer$default(this.AudioAttributesImplBaseParcelizer, setentertransitionWrite, mp4LocationData.r_(), false, 4, (Object) null);
                Object read2 = this.AudioAttributesImplBaseParcelizer.getRead();
                onCancelLoad oncancelload = read2 instanceof onCancelLoad ? (onCancelLoad) read2 : null;
                if (oncancelload != null) {
                    requestPermissions.RemoteActionCompatParcelizer(oncancelload, setentertransitionWrite.AudioAttributesImplBaseParcelizer(), writeVar3);
                }
                return setentertransitionWrite;
            } catch (Throwable th) {
                companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
                throw th;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J?\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/requestPermissions$read$write;", "Lo/setArguments;", "", "p0", "", "p1", "p2", "", "Lo/_parser;", "p3", "Lo/PropertyValueAny;", "p4", "Lo/setAllowReturnTransitionOverlap;", "write", "(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)Lo/setAllowReturnTransitionOverlap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class write extends setArguments {
            final /* synthetic */ _skipWSOrEnd.write AudioAttributesCompatParcelizer;
            final /* synthetic */ setSharedElementReturnTransition AudioAttributesImplApi21Parcelizer;
            final /* synthetic */ boolean AudioAttributesImplApi26Parcelizer;
            final /* synthetic */ Mp4LocationData AudioAttributesImplBaseParcelizer;
            final /* synthetic */ int IconCompatParcelizer;
            final /* synthetic */ int MediaBrowserCompatCustomActionResultReceiver;
            final /* synthetic */ _skipWSOrEnd.read MediaBrowserCompatItemReceiver;
            final /* synthetic */ long MediaDescriptionCompat;
            final /* synthetic */ int RemoteActionCompatParcelizer;
            final /* synthetic */ boolean read;
            final /* synthetic */ int write;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            write(long j, boolean z, performStart performstart, Mp4LocationData mp4LocationData, int i, int i2, _skipWSOrEnd.write writeVar, _skipWSOrEnd.read readVar, boolean z2, int i3, int i4, long j2, setSharedElementReturnTransition setsharedelementreturntransition) {
                super(j, z, performstart, mp4LocationData, null);
                this.read = z;
                this.AudioAttributesImplBaseParcelizer = mp4LocationData;
                this.RemoteActionCompatParcelizer = i;
                this.MediaBrowserCompatCustomActionResultReceiver = i2;
                this.AudioAttributesCompatParcelizer = writeVar;
                this.MediaBrowserCompatItemReceiver = readVar;
                this.AudioAttributesImplApi26Parcelizer = z2;
                this.IconCompatParcelizer = i3;
                this.write = i4;
                this.MediaDescriptionCompat = j2;
                this.AudioAttributesImplApi21Parcelizer = setsharedelementreturntransition;
            }

            @Override // kotlin.setArguments
            public final setAllowReturnTransitionOverlap write(int p0, Object p1, Object p2, List<? extends _parser> p3, long p4) {
                return new setAllowReturnTransitionOverlap(p0, p3, this.read, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplBaseParcelizer.getAudioAttributesCompatParcelizer(), this.AudioAttributesImplApi26Parcelizer, this.IconCompatParcelizer, this.write, p0 == this.RemoteActionCompatParcelizer + (-1) ? 0 : this.MediaBrowserCompatCustomActionResultReceiver, this.MediaDescriptionCompat, p1, p2, this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatSearchResultReceiver(), p4, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final withHandlersFrom RemoteActionCompatParcelizer(Mp4LocationData mp4LocationData, long j, int i, int i2, int i3, int i4, getAnswerMap getanswermap) {
            return mp4LocationData.AudioAttributesCompatParcelizer(PropertyValueBuffer.IconCompatParcelizer(j, i3 + i), PropertyValueBuffer.RemoteActionCompatParcelizer(j, i4 + i2), VideoTimelineResponseBody.read(), getanswermap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        read(setSharedElementReturnTransition setsharedelementreturntransition, boolean z, getReturnTransition getreturntransition, boolean z2, getCreatedOnDateMs<? extends performStart> getcreatedondatems, WindowInsetsCompatImpl30.RatingCompat ratingCompat, WindowInsetsCompatImpl30.write writeVar, int i, TopUserCompanion topUserCompanion, buf bufVar, setSkipSilenceEnabled setskipsilenceenabled, _skipWSOrEnd.write writeVar2, _skipWSOrEnd.read readVar) {
            this.AudioAttributesImplBaseParcelizer = setsharedelementreturntransition;
            this.MediaBrowserCompatCustomActionResultReceiver = z;
            this.read = getreturntransition;
            this.AudioAttributesImplApi26Parcelizer = z2;
            this.MediaBrowserCompatItemReceiver = getcreatedondatems;
            this.MediaDescriptionCompat = ratingCompat;
            this.AudioAttributesImplApi21Parcelizer = writeVar;
            this.IconCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = topUserCompanion;
            this.write = bufVar;
            this.RatingCompat = setskipsilenceenabled;
            this.AudioAttributesCompatParcelizer = writeVar2;
            this.MediaMetadataCompat = readVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(onCancelLoad oncancelload, List<setAllowReturnTransitionOverlap> list, setArguments setarguments) {
        Trace.beginSection("compose:lazy:cache_window:keepAroundItems");
        try {
            if (oncancelload.write() && !list.isEmpty()) {
                int iconCompatParcelizer = ((setAllowReturnTransitionOverlap) IntermediateLoginResponseBody.RatingCompat((List) list)).getIconCompatParcelizer();
                int iconCompatParcelizer2 = ((setAllowReturnTransitionOverlap) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) list)).getIconCompatParcelizer();
                for (int audioAttributesImplApi21Parcelizer = oncancelload.getAudioAttributesImplApi21Parcelizer(); audioAttributesImplApi21Parcelizer < iconCompatParcelizer; audioAttributesImplApi21Parcelizer++) {
                    setarguments.IconCompatParcelizer(audioAttributesImplApi21Parcelizer);
                }
                int i = iconCompatParcelizer2 + 1;
                int mediaBrowserCompatCustomActionResultReceiver = oncancelload.getMediaBrowserCompatCustomActionResultReceiver();
                if (i <= mediaBrowserCompatCustomActionResultReceiver) {
                    while (true) {
                        setarguments.IconCompatParcelizer(i);
                        if (i == mediaBrowserCompatCustomActionResultReceiver) {
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
    public static final getShowPopup IconCompatParcelizer(_handleOddName _handleoddname, setSharedElementReturnTransition setsharedelementreturntransition, getReturnTransition getreturntransition, boolean z, boolean z2, CoordinatorLayout coordinatorLayout, boolean z3, setLastHorizontalStyle setlasthorizontalstyle, int i, _skipWSOrEnd.write writeVar, WindowInsetsCompatImpl30.RatingCompat ratingCompat, _skipWSOrEnd.read readVar, WindowInsetsCompatImpl30.write writeVar2, getAnswerMap getanswermap, int i2, int i3, int i4, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i5) {
        read(_handleoddname, setsharedelementreturntransition, getreturntransition, z, z2, coordinatorLayout, z3, setlasthorizontalstyle, i, writeVar, ratingCompat, readVar, writeVar2, getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), _appendEscaped.RemoteActionCompatParcelizer(i3), i4);
        return getShowPopup.INSTANCE;
    }
}
