package kotlin;

import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.getCameraDistancePx;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJS\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0017\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020 H\u0004¢\u0006\u0004\b!\u0010\"J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020 H\u0004¢\u0006\u0004\b\u0017\u0010\"R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0018\u0010\u0013\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010&"}, d2 = {"Lo/getCameraDistancePx;", "Lo/invoke;", "Lo/hashCode;", "p0", "Lo/setParentLayoutDirection;", "p1", "", "p2", "p3", "", "p4", "Lo/keyDeserializers;", "p5", "Lkotlin/Function0;", "", "p6", "<init>", "(Lo/hashCode;Lo/setParentLayoutDirection;ZZLjava/lang/String;Lo/keyDeserializers;Lo/getCreatedOnDateMs;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/handleWeirdStringValue;", "read", "()Lo/handleWeirdStringValue;", "Lo/getKey;", "Lo/calloc;", "RemoteActionCompatParcelizer", "(J)J", "Lo/DeserializationContext;", "Lo/_shapeForToken;", "write", "(Lo/DeserializationContext;Lo/_shapeForToken;J)V", "MediaBrowserCompatMediaItem", "()V", "(Lo/hashCode;Lo/setParentLayoutDirection;ZZLjava/lang/String;Lo/keyDeserializers;Lo/getCreatedOnDateMs;)V", "Lo/constructType;", "IconCompatParcelizer", "(Landroid/view/KeyEvent;)Z", "Z", "AudioAttributesCompatParcelizer", "Lo/getArrayBuilders;", "Lo/getArrayBuilders;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class getCameraDistancePx extends invoke {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private getArrayBuilders read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    @Override // kotlin.invoke
    protected final boolean IconCompatParcelizer(KeyEvent p0) {
        return false;
    }

    private getCameraDistancePx(hashCode hashcode, setParentLayoutDirection setparentlayoutdirection, boolean z, boolean z2, String str, C0184keyDeserializers c0184keyDeserializers, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        super(hashcode, setparentlayoutdirection, z, z2, str, c0184keyDeserializers, getcreatedondatems, null);
        this.AudioAttributesCompatParcelizer = (getDesignInfoListui_tooling.IconCompatParcelizer && getDesignInfoListui_tooling.write) ? false : true;
    }

    @Override // kotlin.invoke
    public handleWeirdStringValue read() {
        if (this.AudioAttributesCompatParcelizer) {
            return hasSomeOfFeatures.write(new RemoteActionCompatParcelizer());
        }
        return null;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer implements PointerInputEventHandler {

        /* JADX INFO: renamed from: o.getCameraDistancePx$RemoteActionCompatParcelizer$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "offset", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 extends getMagicModuleStats implements getModuleData<RemoteActionCompat, getReferencedType, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ getCameraDistancePx AudioAttributesCompatParcelizer;
            private /* synthetic */ Object IconCompatParcelizer;
            int RemoteActionCompatParcelizer;
            /* synthetic */ long write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.RemoteActionCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    RemoteActionCompat remoteActionCompat = (RemoteActionCompat) this.IconCompatParcelizer;
                    long j = this.write;
                    if (this.AudioAttributesCompatParcelizer.getMediaBrowserCompatItemReceiver()) {
                        this.RemoteActionCompatParcelizer = 1;
                        if (this.AudioAttributesCompatParcelizer.IconCompatParcelizer(remoteActionCompat, j, this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(getCameraDistancePx getcameradistancepx, SampleVideos<? super AnonymousClass2> sampleVideos) {
                super(3, sampleVideos);
                this.AudioAttributesCompatParcelizer = getcameradistancepx;
            }

            @Override // kotlin.getModuleData
            public final /* synthetic */ Object AudioAttributesCompatParcelizer(RemoteActionCompat remoteActionCompat, getReferencedType getreferencedtype, SampleVideos<? super getShowPopup> sampleVideos) {
                return read(remoteActionCompat, getreferencedtype.getWrite(), sampleVideos);
            }

            public final Object read(RemoteActionCompat remoteActionCompat, long j, SampleVideos<? super getShowPopup> sampleVideos) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.AudioAttributesCompatParcelizer, sampleVideos);
                anonymousClass2.IconCompatParcelizer = remoteActionCompat;
                anonymousClass2.write = j;
                return anonymousClass2.invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(handleBadMerge handlebadmerge, SampleVideos<? super getShowPopup> sampleVideos) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(getCameraDistancePx.this, null);
            final getCameraDistancePx getcameradistancepx = getCameraDistancePx.this;
            Object objIconCompatParcelizer = isSpanStillValid.IconCompatParcelizer(handlebadmerge, anonymousClass2, new getAnswerMap() { // from class: o.setCameraDistancePx
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return getCameraDistancePx.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(getcameradistancepx, (getReferencedType) obj);
                }
            }, sampleVideos);
            return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesCompatParcelizer(getCameraDistancePx getcameradistancepx, getReferencedType getreferencedtype) {
            if (getcameradistancepx.getMediaBrowserCompatItemReceiver()) {
                getcameradistancepx.AudioAttributesImplApi26Parcelizer().invoke();
            }
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer() {
        }
    }

    private final long RemoteActionCompatParcelizer(long p0) {
        long jD_ = collectLongDefaults.write((Module) this).d_(((CoercionConfig) MappingJsonFactory.write(this, getDefaultNullValueSerializer.onAddQueueItem())).write());
        long j = -1;
        return calloc.write((((long) Float.floatToRawIntBits(Math.max(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) jD_) - ((int) p0)) / 2.0f)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(Math.max(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (jD_ >> 32)) - ((int) (p0 >> 32))) / 2.0f)) << 32));
    }

    @Override // kotlin.invoke, kotlin.forRootType
    public void write(DeserializationContext p0, _shapeForToken p1, long p2) {
        super.write(p0, p1, p2);
        if (this.AudioAttributesCompatParcelizer) {
            return;
        }
        if (p1 == _shapeForToken.AudioAttributesCompatParcelizer) {
            getArrayBuilders getarraybuilders = this.read;
            if (getarraybuilders == null) {
                if (isSpanStillValid.write$default(p0, true, false, 2, (Object) null)) {
                    getArrayBuilders getarraybuilders2 = p0.AudioAttributesCompatParcelizer().get(0);
                    getarraybuilders2.RemoteActionCompatParcelizer();
                    this.read = getarraybuilders2;
                    if (getMediaBrowserCompatItemReceiver()) {
                        write(getarraybuilders2.getRead(), false);
                        return;
                    }
                    return;
                }
                return;
            }
            List<getArrayBuilders> listAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer();
            int size = listAudioAttributesCompatParcelizer.size();
            for (int i = 0; i < size; i++) {
                if (!bufferAsCopyOfValue.RemoteActionCompatParcelizer(listAudioAttributesCompatParcelizer.get(i))) {
                    long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p2);
                    List<getArrayBuilders> listAudioAttributesCompatParcelizer2 = p0.AudioAttributesCompatParcelizer();
                    int size2 = listAudioAttributesCompatParcelizer2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        getArrayBuilders getarraybuilders3 = listAudioAttributesCompatParcelizer2.get(i2);
                        if (getarraybuilders3.MediaDescriptionCompat() || bufferAsCopyOfValue.write(getarraybuilders3, p2, jRemoteActionCompatParcelizer)) {
                            this.read = null;
                            write(false);
                            return;
                        }
                    }
                    return;
                }
            }
            p0.AudioAttributesCompatParcelizer().get(0).RemoteActionCompatParcelizer();
            if (getMediaBrowserCompatItemReceiver()) {
                read(getarraybuilders.getRead(), false);
                AudioAttributesImplApi26Parcelizer().invoke();
            }
            this.read = null;
            return;
        }
        if (p1 != _shapeForToken.read || this.read == null) {
            return;
        }
        List<getArrayBuilders> listAudioAttributesCompatParcelizer3 = p0.AudioAttributesCompatParcelizer();
        int size3 = listAudioAttributesCompatParcelizer3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            getArrayBuilders getarraybuilders4 = listAudioAttributesCompatParcelizer3.get(i3);
            if (getarraybuilders4.MediaDescriptionCompat() && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getarraybuilders4, this.read)) {
                this.read = null;
                write(false);
                return;
            }
        }
    }

    @Override // kotlin.invoke, kotlin.forRootType
    public void MediaBrowserCompatMediaItem() {
        super.MediaBrowserCompatMediaItem();
        if (this.read != null) {
            this.read = null;
            write(false);
        }
    }

    public final void RemoteActionCompatParcelizer(hashCode p0, setParentLayoutDirection p1, boolean p2, boolean p3, String p4, C0184keyDeserializers p5, getCreatedOnDateMs<getShowPopup> p6) {
        read(p0, p1, p2, p3, p4, p5, p6);
    }

    @Override // kotlin.invoke
    protected final boolean RemoteActionCompatParcelizer(KeyEvent p0) {
        AudioAttributesImplApi26Parcelizer().invoke();
        return true;
    }

    public /* synthetic */ getCameraDistancePx(hashCode hashcode, setParentLayoutDirection setparentlayoutdirection, boolean z, boolean z2, String str, C0184keyDeserializers c0184keyDeserializers, getCreatedOnDateMs getcreatedondatems, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(hashcode, setparentlayoutdirection, z, z2, str, c0184keyDeserializers, getcreatedondatems);
    }
}
