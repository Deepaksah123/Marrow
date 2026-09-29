package kotlin;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.MagicModuleUseCaseImplWhenMappings;

/* JADX INFO: loaded from: classes3.dex */
public final class addOnConnectionFailedListener {
    public static final _handleOddName RemoteActionCompatParcelizer(_handleOddName _handleoddname, boolean z, getCreatedOnDateMs<getShowPopup> getcreatedondatems, getAnswerMap<? super Long, getShowPopup> getanswermap, getAnswerMap<? super Long, getShowPopup> getanswermap2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        InputAccessor inputAccessor;
        InputAccessor inputAccessor2;
        Map map;
        RuntimeShader runtimeShader;
        Set set;
        Map map2;
        _handleOddName _handleoddname2;
        toMagicModuleMetaRepoModel.write(_handleoddname, "");
        _handleunrecognizedcharacterescape.IconCompatParcelizer(1059490970);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1059490970, 6, -1, "com.marrow2.ui.home.util.zenWaterRipple (WaterRippleModifier.kt:56)");
        }
        if (Build.VERSION.SDK_INT < 33) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            return _handleoddname;
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = available.RemoteActionCompatParcelizer$default(getKey.AudioAttributesCompatParcelizer(getKey.INSTANCE.RemoteActionCompatParcelizer()), null, 2, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        final InputAccessor inputAccessor3 = (InputAccessor) objOnPause;
        boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver(inputAccessor3));
        Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
        if (zIconCompatParcelizer || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause2 = (((int) (MediaBrowserCompatCustomActionResultReceiver(inputAccessor3) >> 32)) <= 0 || ((int) MediaBrowserCompatCustomActionResultReceiver(inputAccessor3)) <= 0) ? null : new setGravityForPopups((int) (MediaBrowserCompatCustomActionResultReceiver(inputAccessor3) >> 32), (int) MediaBrowserCompatCustomActionResultReceiver(inputAccessor3));
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
        }
        final setGravityForPopups setgravityforpopups = (setGravityForPopups) objOnPause2;
        Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
        Object obj = objOnPause3;
        if (objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            useDefaultAccount usedefaultaccount = useDefaultAccount.INSTANCE;
            RuntimeShader runtimeShader2 = new RuntimeShader(useDefaultAccount.IconCompatParcelizer());
            runtimeShader2.setFloatUniform("refractStrength", 0.11f);
            runtimeShader2.setFloatUniform("normalScale", 22.0f);
            runtimeShader2.setFloatUniform("lightDir", -0.45f, -0.62f, 0.65f);
            runtimeShader2.setFloatUniform("specularPower", 48.0f);
            runtimeShader2.setFloatUniform("specularStrength", 0.55f);
            runtimeShader2.setFloatUniform("specularColor", 0.86f, 0.96f, 1.0f);
            runtimeShader2.setFloatUniform("diffuseBase", 0.955f);
            runtimeShader2.setFloatUniform("diffuseScale", 0.09f);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(runtimeShader2);
            obj = runtimeShader2;
        }
        RuntimeShader runtimeShader3 = (RuntimeShader) obj;
        View view = (View) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.MediaBrowserCompatItemReceiver());
        Object objOnPause4 = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause4 = (Map) new LinkedHashMap();
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause4);
        }
        Map map3 = (Map) objOnPause4;
        Object objOnPause5 = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause5 = (Map) new LinkedHashMap();
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause5);
        }
        Map map4 = (Map) objOnPause5;
        Object objOnPause6 = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause6 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause6 = (Set) new LinkedHashSet();
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause6);
        }
        Set set2 = (Set) objOnPause6;
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(z);
        Object objOnPause7 = _handleunrecognizedcharacterescape.onPause();
        if (zAudioAttributesCompatParcelizer || objOnPause7 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause7 = (Map) new LinkedHashMap();
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause7);
        }
        Map map5 = (Map) objOnPause7;
        boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setgravityforpopups);
        Object objOnPause8 = _handleunrecognizedcharacterescape.onPause();
        if (zAudioAttributesCompatParcelizer2 || objOnPause8 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause8 = available.RemoteActionCompatParcelizer$default(null, null, 2, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause8);
        }
        InputAccessor inputAccessor4 = (InputAccessor) objOnPause8;
        boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setgravityforpopups);
        Object objOnPause9 = _handleunrecognizedcharacterescape.onPause();
        if (zAudioAttributesCompatParcelizer3 || objOnPause9 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause9 = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause9);
        }
        InputAccessor inputAccessor5 = (InputAccessor) objOnPause9;
        boolean zAudioAttributesCompatParcelizer4 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(setgravityforpopups);
        Object objOnPause10 = _handleunrecognizedcharacterescape.onPause();
        if (zAudioAttributesCompatParcelizer4 || objOnPause10 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause10 = available.RemoteActionCompatParcelizer$default(0L, null, 2, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause10);
        }
        InputAccessor inputAccessor6 = (InputAccessor) objOnPause10;
        boolean zIconCompatParcelizer2 = IconCompatParcelizer(inputAccessor5);
        boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(setgravityforpopups);
        boolean zAudioAttributesCompatParcelizer5 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(inputAccessor5);
        boolean zAudioAttributesCompatParcelizer6 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(inputAccessor4);
        boolean zAudioAttributesCompatParcelizer7 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(inputAccessor6);
        Object objOnPause11 = _handleunrecognizedcharacterescape.onPause();
        if (((zIconCompatParcelizer3 | zAudioAttributesCompatParcelizer5 | zAudioAttributesCompatParcelizer6) || zAudioAttributesCompatParcelizer7) || objOnPause11 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            inputAccessor = inputAccessor5;
            inputAccessor2 = inputAccessor4;
            map = map5;
            runtimeShader = runtimeShader3;
            set = set2;
            map2 = map4;
            objOnPause11 = (MagicModuleSubmissionRequestBody) new write(setgravityforpopups, inputAccessor, inputAccessor2, inputAccessor6, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause11);
        } else {
            map = map5;
            set = set2;
            runtimeShader = runtimeShader3;
            inputAccessor = inputAccessor5;
            inputAccessor2 = inputAccessor4;
            map2 = map4;
        }
        StreamReadException.IconCompatParcelizer(setgravityforpopups, Boolean.valueOf(zIconCompatParcelizer2), (MagicModuleSubmissionRequestBody) objOnPause11, _handleunrecognizedcharacterescape, 0);
        Object objOnPause12 = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause12 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause12 = new getAnswerMap() { // from class: o.addScope
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj2) {
                    return addOnConnectionFailedListener.AudioAttributesCompatParcelizer(inputAccessor3, (getKey) obj2);
                }
            };
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause12);
        }
        _handleOddName _handleoddnameAudioAttributesCompatParcelizer = isCachable.AudioAttributesCompatParcelizer(_handleoddname, (getAnswerMap) objOnPause12);
        boolean zIconCompatParcelizer4 = _handleunrecognizedcharacterescape.IconCompatParcelizer(map3);
        boolean zIconCompatParcelizer5 = _handleunrecognizedcharacterescape.IconCompatParcelizer(map2);
        boolean zAudioAttributesCompatParcelizer8 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(z);
        boolean zIconCompatParcelizer6 = _handleunrecognizedcharacterescape.IconCompatParcelizer(view);
        boolean zIconCompatParcelizer7 = _handleunrecognizedcharacterescape.IconCompatParcelizer(setgravityforpopups);
        boolean zAudioAttributesCompatParcelizer9 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(inputAccessor6);
        boolean zAudioAttributesCompatParcelizer10 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(inputAccessor);
        boolean zAudioAttributesCompatParcelizer11 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getcreatedondatems);
        Set set3 = set;
        boolean zIconCompatParcelizer8 = _handleunrecognizedcharacterescape.IconCompatParcelizer(set3);
        Map map6 = map;
        boolean zIconCompatParcelizer9 = _handleunrecognizedcharacterescape.IconCompatParcelizer(map6);
        boolean zAudioAttributesCompatParcelizer12 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getanswermap);
        boolean zAudioAttributesCompatParcelizer13 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getanswermap2);
        Object objOnPause13 = _handleunrecognizedcharacterescape.onPause();
        if (((zIconCompatParcelizer4 | zIconCompatParcelizer5 | zAudioAttributesCompatParcelizer8 | zIconCompatParcelizer6 | zIconCompatParcelizer7 | zAudioAttributesCompatParcelizer9 | zAudioAttributesCompatParcelizer10 | zAudioAttributesCompatParcelizer11 | zIconCompatParcelizer8 | zIconCompatParcelizer9 | zAudioAttributesCompatParcelizer12) || zAudioAttributesCompatParcelizer13) || objOnPause13 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            _handleoddname2 = _handleoddnameAudioAttributesCompatParcelizer;
            objOnPause13 = (PointerInputEventHandler) new AudioAttributesCompatParcelizer(map3, map2, z, view, getcreatedondatems, set3, map6, getanswermap, getanswermap2, setgravityforpopups, inputAccessor6, inputAccessor);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause13);
        } else {
            _handleoddname2 = _handleoddnameAudioAttributesCompatParcelizer;
        }
        _handleOddName _handleoddnameIconCompatParcelizer = hasSomeOfFeatures.IconCompatParcelizer(_handleoddname2, setgravityforpopups, (PointerInputEventHandler) objOnPause13);
        final InputAccessor inputAccessor7 = inputAccessor2;
        boolean zAudioAttributesCompatParcelizer14 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(inputAccessor7);
        boolean zIconCompatParcelizer10 = _handleunrecognizedcharacterescape.IconCompatParcelizer(setgravityforpopups);
        final RuntimeShader runtimeShader4 = runtimeShader;
        boolean zIconCompatParcelizer11 = _handleunrecognizedcharacterescape.IconCompatParcelizer(runtimeShader4);
        Object objOnPause14 = _handleunrecognizedcharacterescape.onPause();
        if ((zAudioAttributesCompatParcelizer14 | zIconCompatParcelizer10 | zIconCompatParcelizer11) || objOnPause14 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause14 = new getAnswerMap() { // from class: o.GoogleApiClientOnConnectionFailedListener
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj2) {
                    return addOnConnectionFailedListener.cQ_(setgravityforpopups, runtimeShader4, inputAccessor7, (validateAppend) obj2);
                }
            };
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause14);
        }
        _handleOddName _handleoddnameIconCompatParcelizer2 = expand.IconCompatParcelizer(_handleoddnameIconCompatParcelizer, (getAnswerMap) objOnPause14);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return _handleoddnameIconCompatParcelizer2;
    }

    private static final void IconCompatParcelizer(InputAccessor<getKey> inputAccessor, long j) {
        inputAccessor.write(getKey.AudioAttributesCompatParcelizer(j));
    }

    private static final long MediaBrowserCompatCustomActionResultReceiver(InputAccessor<getKey> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private static final Bitmap write(InputAccessor<Bitmap> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IconCompatParcelizer(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long MediaBrowserCompatItemReceiver(InputAccessor<Long> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(setGravityForPopups setgravityforpopups, InputAccessor<Long> inputAccessor, InputAccessor<Boolean> inputAccessor2, float f, float f2, float f3, float f4) {
        if (setgravityforpopups == null) {
            return;
        }
        setgravityforpopups.write(f, f2, f3, f4);
        AudioAttributesCompatParcelizer(inputAccessor, SystemClock.uptimeMillis());
        write(inputAccessor2, true);
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private float AudioAttributesCompatParcelizer;
        private long AudioAttributesImplApi21Parcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private Object AudioAttributesImplBaseParcelizer;
        private /* synthetic */ setGravityForPopups IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private long MediaBrowserCompatItemReceiver;
        private int RatingCompat;
        private /* synthetic */ InputAccessor<Long> RemoteActionCompatParcelizer;
        private /* synthetic */ InputAccessor<Bitmap> read;
        private /* synthetic */ InputAccessor<Boolean> write;

        /* JADX INFO: Access modifiers changed from: private */
        public static final long IconCompatParcelizer(long j) {
            return j;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b5 -> B:50:0x0115). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00df -> B:41:0x00e5). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 281
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.addOnConnectionFailedListener.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: o.addOnConnectionFailedListener$write$3, reason: invalid class name */
        static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Bitmap>, Object> {
            private /* synthetic */ MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer IconCompatParcelizer;
            private /* synthetic */ setGravityForPopups RemoteActionCompatParcelizer;
            private int read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getYear.IconCompatParcelizer();
                SdkPayloadData.IconCompatParcelizer(obj);
                return this.RemoteActionCompatParcelizer.write(this.IconCompatParcelizer.AudioAttributesCompatParcelizer);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(setGravityForPopups setgravityforpopups, MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer, SampleVideos<? super AnonymousClass3> sampleVideos) {
                super(2, sampleVideos);
                this.RemoteActionCompatParcelizer = setgravityforpopups;
                this.IconCompatParcelizer = iconCompatParcelizer;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass3(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Bitmap> sampleVideos) {
                return ((AnonymousClass3) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(setGravityForPopups setgravityforpopups, InputAccessor<Boolean> inputAccessor, InputAccessor<Bitmap> inputAccessor2, InputAccessor<Long> inputAccessor3, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = setgravityforpopups;
            this.write = inputAccessor;
            this.read = inputAccessor2;
            this.RemoteActionCompatParcelizer = inputAccessor3;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.IconCompatParcelizer, this.write, this.read, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesCompatParcelizer implements PointerInputEventHandler {
        private /* synthetic */ InputAccessor<Boolean> AudioAttributesCompatParcelizer;
        private /* synthetic */ Set<Long> AudioAttributesImplApi21Parcelizer;
        private /* synthetic */ getAnswerMap<Long, getShowPopup> AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ setGravityForPopups AudioAttributesImplBaseParcelizer;
        private /* synthetic */ InputAccessor<Long> IconCompatParcelizer;
        private /* synthetic */ Map<Long, getReferencedType> MediaBrowserCompatCustomActionResultReceiver;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> MediaBrowserCompatItemReceiver;
        private /* synthetic */ View MediaBrowserCompatMediaItem;
        private /* synthetic */ boolean MediaMetadataCompat;
        private /* synthetic */ Map<Long, Long> RemoteActionCompatParcelizer;
        private /* synthetic */ Map<Long, Boolean> read;
        private /* synthetic */ getAnswerMap<Long, getShowPopup> write;

        /* JADX INFO: renamed from: o.addOnConnectionFailedListener$AudioAttributesCompatParcelizer$3, reason: invalid class name */
        static final class AnonymousClass3 extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<getConstructorDetector, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ getAnswerMap<Long, getShowPopup> AudioAttributesCompatParcelizer;
            private /* synthetic */ setGravityForPopups AudioAttributesImplApi21Parcelizer;
            private /* synthetic */ Set<Long> AudioAttributesImplApi26Parcelizer;
            private /* synthetic */ getCreatedOnDateMs<getShowPopup> AudioAttributesImplBaseParcelizer;
            private /* synthetic */ Map<Long, Long> IconCompatParcelizer;
            private /* synthetic */ Map<Long, getReferencedType> MediaBrowserCompatCustomActionResultReceiver;
            private /* synthetic */ getAnswerMap<Long, getShowPopup> MediaBrowserCompatItemReceiver;
            private /* synthetic */ Object MediaBrowserCompatMediaItem;
            private /* synthetic */ View MediaBrowserCompatSearchResultReceiver;
            private int MediaMetadataCompat;
            private /* synthetic */ boolean RatingCompat;
            private /* synthetic */ Map<Long, Boolean> RemoteActionCompatParcelizer;
            private /* synthetic */ InputAccessor<Boolean> read;
            private /* synthetic */ InputAccessor<Long> write;

            /* JADX WARN: Path cross not found for [B:14:0x0052, B:79:0x0279], limit reached: 93 */
            /* JADX WARN: Path cross not found for [B:72:0x025a, B:71:0x0256], limit reached: 93 */
            /* JADX WARN: Path cross not found for [B:79:0x0279, B:14:0x0052], limit reached: 93 */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0187  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002f -> B:12:0x0032). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r40) {
                /*
                    Method dump skipped, instruction units count: 645
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.addOnConnectionFailedListener.AudioAttributesCompatParcelizer.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(Map<Long, Long> map, Map<Long, getReferencedType> map2, boolean z, View view, getCreatedOnDateMs<getShowPopup> getcreatedondatems, Set<Long> set, Map<Long, Boolean> map3, getAnswerMap<? super Long, getShowPopup> getanswermap, getAnswerMap<? super Long, getShowPopup> getanswermap2, setGravityForPopups setgravityforpopups, InputAccessor<Long> inputAccessor, InputAccessor<Boolean> inputAccessor2, SampleVideos<? super AnonymousClass3> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = map;
                this.MediaBrowserCompatCustomActionResultReceiver = map2;
                this.RatingCompat = z;
                this.MediaBrowserCompatSearchResultReceiver = view;
                this.AudioAttributesImplBaseParcelizer = getcreatedondatems;
                this.AudioAttributesImplApi26Parcelizer = set;
                this.RemoteActionCompatParcelizer = map3;
                this.AudioAttributesCompatParcelizer = getanswermap;
                this.MediaBrowserCompatItemReceiver = getanswermap2;
                this.AudioAttributesImplApi21Parcelizer = setgravityforpopups;
                this.write = inputAccessor;
                this.read = inputAccessor2;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.IconCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.RatingCompat, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi21Parcelizer, this.write, this.read, sampleVideos);
                anonymousClass3.MediaBrowserCompatMediaItem = obj;
                return anonymousClass3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Object invoke(getConstructorDetector getconstructordetector, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass3) create(getconstructordetector, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(handleBadMerge handlebadmerge, SampleVideos<? super getShowPopup> sampleVideos) {
            Object obj = handlebadmerge.read(new AnonymousClass3(this.RemoteActionCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaMetadataCompat, this.MediaBrowserCompatMediaItem, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi21Parcelizer, this.read, this.write, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplBaseParcelizer, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, null), sampleVideos);
            return obj == getYear.IconCompatParcelizer() ? obj : getShowPopup.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(Map<Long, Long> map, Map<Long, getReferencedType> map2, boolean z, View view, getCreatedOnDateMs<getShowPopup> getcreatedondatems, Set<Long> set, Map<Long, Boolean> map3, getAnswerMap<? super Long, getShowPopup> getanswermap, getAnswerMap<? super Long, getShowPopup> getanswermap2, setGravityForPopups setgravityforpopups, InputAccessor<Long> inputAccessor, InputAccessor<Boolean> inputAccessor2) {
            this.RemoteActionCompatParcelizer = map;
            this.MediaBrowserCompatCustomActionResultReceiver = map2;
            this.MediaMetadataCompat = z;
            this.MediaBrowserCompatMediaItem = view;
            this.MediaBrowserCompatItemReceiver = getcreatedondatems;
            this.AudioAttributesImplApi21Parcelizer = set;
            this.read = map3;
            this.write = getanswermap;
            this.AudioAttributesImplApi26Parcelizer = getanswermap2;
            this.AudioAttributesImplBaseParcelizer = setgravityforpopups;
            this.IconCompatParcelizer = inputAccessor;
            this.AudioAttributesCompatParcelizer = inputAccessor2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(InputAccessor inputAccessor, getKey getkey) {
        IconCompatParcelizer((InputAccessor<getKey>) inputAccessor, getkey.getRemoteActionCompatParcelizer());
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup cQ_(setGravityForPopups setgravityforpopups, RuntimeShader runtimeShader, InputAccessor inputAccessor, validateAppend validateappend) {
        toMagicModuleMetaRepoModel.write(validateappend, "");
        Bitmap bitmapWrite = write(inputAccessor);
        if (bitmapWrite == null || setgravityforpopups == null) {
            validateappend.IconCompatParcelizer((parseVersionPart) null);
            return getShowPopup.INSTANCE;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapWrite, tileMode, tileMode);
        bitmapShader.setFilterMode(1);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        runtimeShader.setInputShader(NotesDispatchAddressRequestKt.KEY_STATE, bitmapShader);
        runtimeShader.setFloatUniform("size", Float.intBitsToFloat((int) (validateappend.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() >> 32)), Float.intBitsToFloat((int) validateappend.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()));
        runtimeShader.setFloatUniform("grid", setgravityforpopups.RemoteActionCompatParcelizer(), setgravityforpopups.write());
        RenderEffect renderEffectCreateRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShader, "content");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(renderEffectCreateRuntimeShaderEffect, "");
        validateappend.IconCompatParcelizer(DefaultIndenter.ca_(renderEffectCreateRuntimeShaderEffect));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(InputAccessor<Bitmap> inputAccessor, Bitmap bitmap) {
        inputAccessor.write(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(InputAccessor<Boolean> inputAccessor, boolean z) {
        inputAccessor.write(Boolean.valueOf(z));
    }

    private static final void AudioAttributesCompatParcelizer(InputAccessor<Long> inputAccessor, long j) {
        inputAccessor.write(Long.valueOf(j));
    }
}
