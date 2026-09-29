package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.MediaRouteVolumeSlider;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/MediaRouteVolumeSlider;", "", "<init>", "()V", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MediaRouteVolumeSlider {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o.MediaRouteVolumeSlider$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJO\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\u000e\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u000e\u0010\u001dJG\u0010!\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0013H\u0001¢\u0006\u0004\b!\u0010\"J/\u0010\u000e\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020#H\u0001¢\u0006\u0004\b\u000e\u0010$JC\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\u0007\u001a\u00020'2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0(2\b\u0010\u000b\u001a\u0004\u0018\u00010\u001fH\u0001¢\u0006\u0004\b\u001b\u0010)JC\u0010\u000e\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020#2\u0006\u0010\t\u001a\u00020'2\u0006\u0010\u000b\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0(H\u0001¢\u0006\u0004\b\u000e\u0010+JW\u0010/\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020,2\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020'2\u0006\u0010\u000b\u001a\u00020-2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0(2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u001a0(H\u0001¢\u0006\u0004\b/\u00100JW\u0010!\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020,2\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020'2\u0006\u0010\u000b\u001a\u00020-2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0(2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u001a0(H\u0001¢\u0006\u0004\b!\u00100J3\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020'2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0(H\u0001¢\u0006\u0004\b\u001b\u00101J\u001d\u0010/\u001a\u0002022\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u000202¢\u0006\u0004\b/\u00103"}, d2 = {"Lo/MediaRouteVolumeSlider$write;", "", "<init>", "()V", "Lo/WebViewSubtitleOutput;", "p0", "Lo/PropertyValueAny;", "p1", "Lo/tryToResolveUnresolved;", "p2", "Lo/deserializeFromNumber;", "p3", "Lo/setAmount;", "", "AudioAttributesCompatParcelizer", "(Lo/WebViewSubtitleOutput;JLo/tryToResolveUnresolved;Lo/deserializeFromNumber;)Lo/setAmount;", "Lo/JsonParserDelegate;", "Lo/hasValueTypeDeserializer;", "Lo/findProperty;", "Lo/SettableBeanProperty;", "p4", "p5", "Lo/releaseBuffers;", "p6", "Lo/switchToNext;", "p7", "", "RemoteActionCompatParcelizer", "(Lo/JsonParserDelegate;Lo/hasValueTypeDeserializer;JJLo/SettableBeanProperty;Lo/deserializeFromNumber;Lo/releaseBuffers;J)V", "(Lo/JsonParserDelegate;JLo/SettableBeanProperty;Lo/deserializeFromNumber;Lo/releaseBuffers;)V", "Lo/isAbstract;", "Lo/fillInStackTrace;", "", "write", "(Lo/hasValueTypeDeserializer;Lo/WebViewSubtitleOutput;Lo/deserializeFromNumber;Lo/isAbstract;Lo/fillInStackTrace;ZLo/SettableBeanProperty;)V", "Lo/hasStableIds;", "(Lo/fillInStackTrace;Lo/hasValueTypeDeserializer;Lo/SettableBeanProperty;Lo/hasStableIds;)V", "", "Lo/findBeanDeserializer;", "Lo/DeserializersBase;", "Lkotlin/Function1;", "(Ljava/util/List;Lo/DeserializersBase;Lo/getAnswerMap;Lo/fillInStackTrace;)V", "Lo/getReferencedType;", "(JLo/hasStableIds;Lo/DeserializersBase;Lo/SettableBeanProperty;Lo/getAnswerMap;)V", "Lo/setViews;", "Lo/KeyDeserializers;", "Lo/ResolvableDeserializer;", "IconCompatParcelizer", "(Lo/setViews;Lo/hasValueTypeDeserializer;Lo/DeserializersBase;Lo/KeyDeserializers;Lo/getAnswerMap;Lo/getAnswerMap;)Lo/fillInStackTrace;", "(Lo/fillInStackTrace;Lo/DeserializersBase;Lo/getAnswerMap;)V", "Lo/withDelegate;", "(JLo/withDelegate;)Lo/withDelegate;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public final Triple<Integer, Integer, deserializeFromNumber> AudioAttributesCompatParcelizer(WebViewSubtitleOutput p0, long p1, tryToResolveUnresolved p2, deserializeFromNumber p3) {
            deserializeFromNumber deserializefromnumber = p0.read(p1, p2, p3);
            return new Triple<>(Integer.valueOf((int) (deserializefromnumber.getRead() >> 32)), Integer.valueOf((int) deserializefromnumber.getRead()), deserializefromnumber);
        }

        @getMagicModuleMeta
        public final void RemoteActionCompatParcelizer(JsonParserDelegate p0, hasValueTypeDeserializer p1, long p2, long p3, SettableBeanProperty p4, deserializeFromNumber p5, releaseBuffers p6, long p7) {
            if (!findProperty.write(p2)) {
                p6.AudioAttributesCompatParcelizer(p7);
                AudioAttributesCompatParcelizer(p0, p2, p4, p5, p6);
            } else if (!findProperty.write(p3)) {
                switchToNext switchtonextWrite = switchToNext.write(p5.getIconCompatParcelizer().getRead().MediaBrowserCompatCustomActionResultReceiver());
                if (switchtonextWrite.getIconCompatParcelizer() == 16) {
                    switchtonextWrite = null;
                }
                long iconCompatParcelizer = switchtonextWrite != null ? switchtonextWrite.getIconCompatParcelizer() : switchToNext.INSTANCE.AudioAttributesCompatParcelizer();
                p6.AudioAttributesCompatParcelizer(switchToNext.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, switchToNext.RemoteActionCompatParcelizer(iconCompatParcelizer) * 0.2f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null));
                AudioAttributesCompatParcelizer(p0, p3, p4, p5, p6);
            } else if (!findProperty.write(p1.getAudioAttributesCompatParcelizer())) {
                p6.AudioAttributesCompatParcelizer(p7);
                AudioAttributesCompatParcelizer(p0, p1.getAudioAttributesCompatParcelizer(), p4, p5, p6);
            }
            getValueType.INSTANCE.write(p0, p5);
        }

        private final void AudioAttributesCompatParcelizer(JsonParserDelegate p0, long p1, SettableBeanProperty p2, deserializeFromNumber p3, releaseBuffers p4) {
            int iRemoteActionCompatParcelizer = p2.RemoteActionCompatParcelizer(findProperty.MediaBrowserCompatCustomActionResultReceiver(p1));
            int iRemoteActionCompatParcelizer2 = p2.RemoteActionCompatParcelizer(findProperty.AudioAttributesImplApi26Parcelizer(p1));
            if (iRemoteActionCompatParcelizer != iRemoteActionCompatParcelizer2) {
                p0.write(p3.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2), p4);
            }
        }

        @getMagicModuleMeta
        public final void write(hasValueTypeDeserializer p0, final WebViewSubtitleOutput p1, deserializeFromNumber p2, isAbstract p3, fillInStackTrace p4, boolean p5, SettableBeanProperty p6) {
            if (p5) {
                p4.read(setHideThumb.read(p2, p3, p6.RemoteActionCompatParcelizer(findProperty.AudioAttributesImplApi26Parcelizer(p0.getAudioAttributesCompatParcelizer())), new getCreatedOnDateMs() { // from class: o.setThumb
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return MediaRouteVolumeSlider.Companion.AudioAttributesCompatParcelizer(p1);
                    }
                }));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getKey AudioAttributesCompatParcelizer(WebViewSubtitleOutput webViewSubtitleOutput) {
            return getKey.AudioAttributesCompatParcelizer(setHideThumb.read$default(webViewSubtitleOutput.getRead(), webViewSubtitleOutput.getAudioAttributesImplApi26Parcelizer(), webViewSubtitleOutput.getMediaBrowserCompatItemReceiver(), null, 0, 24, null));
        }

        @getMagicModuleMeta
        public final void AudioAttributesCompatParcelizer(fillInStackTrace p0, hasValueTypeDeserializer p1, SettableBeanProperty p2, hasStableIds p3) {
            isAbstract write;
            isAbstract read = p3.getRead();
            if (read == null || !read.MediaBrowserCompatItemReceiver() || (write = p3.getWrite()) == null) {
                return;
            }
            p0.AudioAttributesCompatParcelizer(p1, p2, p3.getAudioAttributesCompatParcelizer(), new AudioAttributesCompatParcelizer(read), setItemSpacingDp.read(read), read.write(write, false));
        }

        /* JADX INFO: renamed from: o.MediaRouteVolumeSlider$write$AudioAttributesCompatParcelizer */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AudioAttributesCompatParcelizer implements getAnswerMap<resetWithShared, getShowPopup> {
            final /* synthetic */ isAbstract read;

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(resetWithShared resetwithshared) {
                AudioAttributesCompatParcelizer(resetwithshared.getIconCompatParcelizer());
                return getShowPopup.INSTANCE;
            }

            public final void AudioAttributesCompatParcelizer(float[] fArr) {
                if (this.read.MediaBrowserCompatItemReceiver()) {
                    hasRawClass.RemoteActionCompatParcelizer(this.read).read(this.read, fArr);
                }
            }

            AudioAttributesCompatParcelizer(isAbstract isabstract) {
                this.read = isabstract;
            }
        }

        @getMagicModuleMeta
        public final void RemoteActionCompatParcelizer(List<? extends findBeanDeserializer> p0, DeserializersBase p1, getAnswerMap<? super hasValueTypeDeserializer, getShowPopup> p2, fillInStackTrace p3) {
            hasValueTypeDeserializer hasvaluetypedeserializer = p1.read(p0);
            if (p3 != null) {
                p3.read(null, hasvaluetypedeserializer);
            }
            p2.invoke(hasvaluetypedeserializer);
        }

        @getMagicModuleMeta
        public final void AudioAttributesCompatParcelizer(long p0, hasStableIds p1, DeserializersBase p2, SettableBeanProperty p3, getAnswerMap<? super hasValueTypeDeserializer, getShowPopup> p4) {
            p4.invoke(hasValueTypeDeserializer.AudioAttributesCompatParcelizer$default(p2.getWrite(), null, getValueInstantiator.IconCompatParcelizer(p3.write(hasStableIds.RemoteActionCompatParcelizer$default(p1, p0, false, 2, null))), null, 5, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, o.fillInStackTrace] */
        @getMagicModuleMeta
        public final fillInStackTrace IconCompatParcelizer(setViews p0, hasValueTypeDeserializer p1, final DeserializersBase p2, KeyDeserializers p3, final getAnswerMap<? super hasValueTypeDeserializer, getShowPopup> p4, getAnswerMap<? super ResolvableDeserializer, getShowPopup> p5) {
            final MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
            writeVar.write = p0.write(p1, p3, new getAnswerMap() { // from class: o.setColor
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return MediaRouteVolumeSlider.Companion.read(p2, p4, writeVar, (List) obj);
                }
            }, p5);
            return (fillInStackTrace) writeVar.write;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final getShowPopup read(DeserializersBase deserializersBase, getAnswerMap getanswermap, MagicModuleUseCaseImplWhenMappings.write writeVar, List list) {
            MediaRouteVolumeSlider.INSTANCE.RemoteActionCompatParcelizer((List<? extends findBeanDeserializer>) list, deserializersBase, (getAnswerMap<? super hasValueTypeDeserializer, getShowPopup>) getanswermap, (fillInStackTrace) writeVar.write);
            return getShowPopup.INSTANCE;
        }

        @getMagicModuleMeta
        public final fillInStackTrace write(setViews p0, hasValueTypeDeserializer p1, DeserializersBase p2, KeyDeserializers p3, getAnswerMap<? super hasValueTypeDeserializer, getShowPopup> p4, getAnswerMap<? super ResolvableDeserializer, getShowPopup> p5) {
            return IconCompatParcelizer(p0, p1, p2, p3, p4, p5);
        }

        @getMagicModuleMeta
        public final void RemoteActionCompatParcelizer(fillInStackTrace p0, DeserializersBase p1, getAnswerMap<? super hasValueTypeDeserializer, getShowPopup> p2) {
            p2.invoke(hasValueTypeDeserializer.AudioAttributesCompatParcelizer$default(p1.getWrite(), null, 0L, null, 3, null));
            p0.read();
        }

        public final withDelegate IconCompatParcelizer(long p0, withDelegate p1) {
            int iRemoteActionCompatParcelizer = p1.getRead().RemoteActionCompatParcelizer(findProperty.AudioAttributesImplBaseParcelizer(p0));
            int iRemoteActionCompatParcelizer2 = p1.getRead().RemoteActionCompatParcelizer(findProperty.read(p0));
            int iMin = Math.min(iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
            int iMax = Math.max(iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
            AbstractDeserializer.IconCompatParcelizer iconCompatParcelizer = new AbstractDeserializer.IconCompatParcelizer(p1.getAudioAttributesCompatParcelizer());
            iconCompatParcelizer.RemoteActionCompatParcelizer(new _findPropertyUnwrapper(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, renameAll.INSTANCE.AudioAttributesCompatParcelizer(), null, null, null, 61439, null), iMin, iMax);
            return new withDelegate(iconCompatParcelizer.RemoteActionCompatParcelizer(), p1.getRead());
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
