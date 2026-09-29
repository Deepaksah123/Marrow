package kotlin;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.forScope;
import kotlin.getSystemGestureInsets;
import kotlin.setOverriddenInsets;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a?\u0010\u000e\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\t\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u0014\u001a+\u0010\u0015\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\"\u0016\u0010\u001d\u001a\u00020\u001eX\u0080\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 \"\u0016\u0010\"\u001a\u00020\u001eX\u0080\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b#\u0010 \"\u0016\u0010$\u001a\u00020\u001eX\u0080\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b%\u0010 \"\u0010\u0010&\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010!\"\u0010\u0010'\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010!\"\u0010\u0010(\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010!\"\u0010\u0010)\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010!\"\u0010\u0010*\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010!\"\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120,X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010-\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010!\"\u0010\u0010.\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010!\"\u000e\u0010/\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u00100\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010!¨\u00061²\u0006\n\u00102\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\u0018\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005X\u008a\u0084\u0002²\u0006\n\u00104\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u00105\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u00106\u001a\u00020\u0018X\u008a\u0084\u0002"}, d2 = {"Switch", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/SwitchColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SwitchColors;Landroidx/compose/runtime/Composer;II)V", "SwitchImpl", "Landroidx/compose/foundation/layout/BoxScope;", "thumbValue", "Lkotlin/Function0;", "", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material/SwitchColors;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)V", "drawTrack", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "trackColor", "Landroidx/compose/ui/graphics/Color;", "trackWidth", "strokeWidth", "drawTrack-RPmYEkk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFF)V", "TrackWidth", "Landroidx/compose/ui/unit/Dp;", "getTrackWidth", "()F", "F", "TrackStrokeWidth", "getTrackStrokeWidth", "ThumbDiameter", "getThumbDiameter", "ThumbRippleRadius", "DefaultSwitchPadding", "SwitchWidth", "SwitchHeight", "ThumbPathLength", "AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "ThumbDefaultElevation", "ThumbPressedElevation", "SwitchPositionalThreshold", "SwitchVelocityThreshold", "material", "forceAnimationCheck", "currentOnCheckedChange", "currentChecked", "thumbColor", "resolvedThumbColor"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class forScope {
    private static final float AudioAttributesCompatParcelizer;
    private static final float AudioAttributesImplApi21Parcelizer;
    private static final float AudioAttributesImplApi26Parcelizer;
    private static final float AudioAttributesImplBaseParcelizer;
    private static final float IconCompatParcelizer;
    private static final float MediaBrowserCompatCustomActionResultReceiver;
    private static final float MediaBrowserCompatItemReceiver;
    private static final float MediaBrowserCompatSearchResultReceiver;
    private static final float MediaDescriptionCompat;
    private static final safeSizeOf<Float> RemoteActionCompatParcelizer;
    private static final float read;
    private static final float write;

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AudioAttributesCompatParcelizer(float f) {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float IconCompatParcelizer(float f) {
        return f * 0.7f;
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write(final boolean r35, final kotlin.getAnswerMap<? super java.lang.Boolean, kotlin.getShowPopup> r36, kotlin._handleOddName r37, boolean r38, kotlin.hashCode r39, kotlin.canUseFor r40, kotlin._handleUnrecognizedCharacterEscape r41, final int r42, final int r43) {
        /*
            Method dump skipped, instruction units count: 1010
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.forScope.write(boolean, o.getAnswerMap, o._handleOddName, boolean, o.hashCode, o.canUseFor, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(float f, float f2, consumeAttributes consumeattributes) {
        consumeattributes.AudioAttributesCompatParcelizer(Boolean.FALSE, f);
        consumeattributes.AudioAttributesCompatParcelizer(Boolean.TRUE, f2);
        return getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ InputAccessor<Boolean> AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        final /* synthetic */ parseDouble<getAnswerMap<Boolean, getShowPopup>> RemoteActionCompatParcelizer;
        final /* synthetic */ Glide<Boolean> read;
        final /* synthetic */ parseDouble<Boolean> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                final Glide<Boolean> glide = this.read;
                this.IconCompatParcelizer = 1;
                if (VerifyNewNumberRequest.AudioAttributesCompatParcelizer(_qbuf.IconCompatParcelizer(new getCreatedOnDateMs() { // from class: o.ObjectIdGeneratorsBase
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return Boolean.valueOf(forScope.RemoteActionCompatParcelizer.read(glide));
                    }
                }), new AnonymousClass4(this.write, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, null), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: renamed from: o.forScope$RemoteActionCompatParcelizer$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "newValue", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<Boolean, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ parseDouble<getAnswerMap<Boolean, getShowPopup>> AudioAttributesCompatParcelizer;
            final /* synthetic */ InputAccessor<Boolean> IconCompatParcelizer;
            int RemoteActionCompatParcelizer;
            /* synthetic */ boolean read;
            final /* synthetic */ parseDouble<Boolean> write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getYear.IconCompatParcelizer();
                if (this.RemoteActionCompatParcelizer == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    boolean z = this.read;
                    if (forScope.AudioAttributesCompatParcelizer(this.write) != z) {
                        getAnswerMap getanswermapIconCompatParcelizer = forScope.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
                        if (getanswermapIconCompatParcelizer != null) {
                            getanswermapIconCompatParcelizer.invoke(QBankStatsResponse.AudioAttributesCompatParcelizer(z));
                        }
                        forScope.read(this.IconCompatParcelizer, !forScope.AudioAttributesCompatParcelizer(r1));
                    }
                    return getShowPopup.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass4(parseDouble<Boolean> parsedouble, parseDouble<? extends getAnswerMap<? super Boolean, getShowPopup>> parsedouble2, InputAccessor<Boolean> inputAccessor, SampleVideos<? super AnonymousClass4> sampleVideos) {
                super(2, sampleVideos);
                this.write = parsedouble;
                this.AudioAttributesCompatParcelizer = parsedouble2;
                this.IconCompatParcelizer = inputAccessor;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.write, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
                anonymousClass4.read = ((Boolean) obj).booleanValue();
                return anonymousClass4;
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final /* synthetic */ Object invoke(Boolean bool, SampleVideos<? super getShowPopup> sampleVideos) {
                return write(bool.booleanValue(), sampleVideos);
            }

            public final Object write(boolean z, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass4) create(Boolean.valueOf(z), sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean read(Glide glide) {
            return ((Boolean) glide.AudioAttributesCompatParcelizer()).booleanValue();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(Glide<Boolean> glide, parseDouble<Boolean> parsedouble, parseDouble<? extends getAnswerMap<? super Boolean, getShowPopup>> parsedouble2, InputAccessor<Boolean> inputAccessor, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = glide;
            this.write = parsedouble;
            this.RemoteActionCompatParcelizer = parsedouble2;
            this.AudioAttributesCompatParcelizer = inputAccessor;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.read, this.write, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;
        final /* synthetic */ Glide<Boolean> RemoteActionCompatParcelizer;
        final /* synthetic */ boolean read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                if (this.read != this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().booleanValue()) {
                    this.AudioAttributesCompatParcelizer = 1;
                    if (LottieAnimationViewSavedState.write$default(this.RemoteActionCompatParcelizer, QBankStatsResponse.AudioAttributesCompatParcelizer(this.read), BitmapDescriptorFactory.HUE_RED, this, 2, null) == objIconCompatParcelizer) {
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
        write(boolean z, Glide<Boolean> glide, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.read = z;
            this.RemoteActionCompatParcelizer = glide;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.read, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AudioAttributesCompatParcelizer(Glide glide) {
        return glide.MediaMetadataCompat();
    }

    private static final void RemoteActionCompatParcelizer(final writeReplace writereplace, final boolean z, final boolean z2, final canUseFor canusefor, final getCreatedOnDateMs<Float> getcreatedondatems, final inset insetVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        float f;
        int i3;
        boolean z3;
        long jAudioAttributesImplBaseParcelizer;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(70908914);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(writereplace) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(canusefor) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(insetVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i4 = i2;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((74899 & i4) != 74898, i4 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(70908914, i4, -1, "androidx.compose.material.SwitchImpl (Switch.kt:219)");
            }
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = _qbuf.write();
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objOnPause;
            boolean z4 = (458752 & i4) == 131072;
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z4 || audioAttributesCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                audioAttributesCompatParcelizerOnPause = new AudioAttributesCompatParcelizer(insetVar, snapshotStateList, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(audioAttributesCompatParcelizerOnPause);
            }
            StreamReadException.IconCompatParcelizer(insetVar, (MagicModuleSubmissionRequestBody) audioAttributesCompatParcelizerOnPause, _handleunrecognizedcharacterescapeWrite, (i4 >> 15) & 14);
            if (!snapshotStateList.isEmpty()) {
                f = AudioAttributesImplApi21Parcelizer;
            } else {
                f = MediaBrowserCompatCustomActionResultReceiver;
            }
            float f2 = f;
            int i5 = ((i4 >> 6) & 14) | (i4 & 112) | ((i4 >> 3) & 896);
            final parseDouble<switchToNext> parsedouble = canusefor.read(z2, z, _handleunrecognizedcharacterescapeWrite, i5);
            _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(writereplace.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer()), BitmapDescriptorFactory.HUE_RED, 1, null);
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(parsedouble);
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zAudioAttributesCompatParcelizer || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getAnswerMap() { // from class: o.key
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return forScope.IconCompatParcelizer(parsedouble, (findSetterInfo) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            setPrimaryDirectionalMotionAxisOverrider2epLt8ui.write(_handleoddnameIconCompatParcelizer$default, (getAnswerMap) objOnPause2, _handleunrecognizedcharacterescapeWrite, 0);
            parseDouble<switchToNext> parsedoubleAudioAttributesCompatParcelizer = canusefor.AudioAttributesCompatParcelizer(z2, z, _handleunrecognizedcharacterescapeWrite, i5);
            setColorFilter setcolorfilter = (setColorFilter) _handleunrecognizedcharacterescapeWrite.write(setShimmer.RemoteActionCompatParcelizer());
            float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(((assignParameter) _handleunrecognizedcharacterescapeWrite.write(setShimmer.read())).getRemoteActionCompatParcelizer() + f2);
            if (switchToNext.RemoteActionCompatParcelizer(AudioAttributesImplBaseParcelizer(parsedoubleAudioAttributesCompatParcelizer), enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, 6).MediaBrowserCompatSearchResultReceiver()) && setcolorfilter != null) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-674840005);
                z3 = true;
                i3 = i4;
                jAudioAttributesImplBaseParcelizer = setcolorfilter.write(AudioAttributesImplBaseParcelizer(parsedoubleAudioAttributesCompatParcelizer), fIconCompatParcelizer, _handleunrecognizedcharacterescapeWrite, 0);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                i3 = i4;
                z3 = true;
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-674751066);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                jAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(parsedoubleAudioAttributesCompatParcelizer);
            }
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            parseDouble<switchToNext> parsedouble2 = setTextMetricsParamsCompat.read(jAudioAttributesImplBaseParcelizer, null, null, null, _handleunrecognizedcharacterescapeWrite, 0, 14);
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer = writereplace.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.MediaBrowserCompatItemReceiver());
            boolean z5 = (i3 & 57344) == 16384 ? z3 : false;
            Object objOnPause3 = _handleunrecognizedcharacterescape2.onPause();
            if (z5 || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getAnswerMap() { // from class: o.ObjectIdGeneratorsPropertyGenerator
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return forScope.read(getcreatedondatems, (bufferMapProperty) obj);
                    }
                };
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(objOnPause3);
            }
            isInLayout.RemoteActionCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer(_writeSegment.IconCompatParcelizer$default(isAdded.MediaBrowserCompatItemReceiver(setResetBlock.AudioAttributesCompatParcelizer(getExitAnim.IconCompatParcelizer(_handleoddnameAudioAttributesCompatParcelizer, (getAnswerMap<? super bufferMapProperty, hasReferringProperties>) objOnPause3), insetVar, JsonIncludeValue.IconCompatParcelizer$default(false, MediaBrowserCompatItemReceiver, 0L, 4, null)), AudioAttributesImplBaseParcelizer), f2, setPlayer.IconCompatParcelizer(), false, 0L, 0L, 24, null), AudioAttributesImplApi26Parcelizer(parsedouble2), setPlayer.IconCompatParcelizer()), _handleunrecognizedcharacterescape2, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.ObjectIdResolver
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return forScope.IconCompatParcelizer(writereplace, z, z2, canusefor, getcreatedondatems, insetVar, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ inset RemoteActionCompatParcelizer;
        final /* synthetic */ SnapshotStateList<isRound> read;
        int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                NewNumberOtpResendRequest<isRound> newNumberOtpResendRequestAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
                final SnapshotStateList<isRound> snapshotStateList = this.read;
                this.write = 1;
                if (newNumberOtpResendRequestAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.forScope.AudioAttributesCompatParcelizer.5
                    @Override // kotlin.getValidationToken
                    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                    public final Object IconCompatParcelizer(isRound isround, SampleVideos<? super getShowPopup> sampleVideos) {
                        if (isround instanceof setOverriddenInsets.read) {
                            snapshotStateList.add(isround);
                        } else if (isround instanceof setOverriddenInsets.write) {
                            snapshotStateList.remove(((setOverriddenInsets.write) isround).getRead());
                        } else if (isround instanceof setOverriddenInsets.IconCompatParcelizer) {
                            snapshotStateList.remove(((setOverriddenInsets.IconCompatParcelizer) isround).getRemoteActionCompatParcelizer());
                        } else if (isround instanceof getSystemGestureInsets.AudioAttributesCompatParcelizer) {
                            snapshotStateList.add(isround);
                        } else if (isround instanceof getSystemGestureInsets.IconCompatParcelizer) {
                            snapshotStateList.remove(((getSystemGestureInsets.IconCompatParcelizer) isround).getIconCompatParcelizer());
                        } else if (isround instanceof getSystemGestureInsets.write) {
                            snapshotStateList.remove(((getSystemGestureInsets.write) isround).getAudioAttributesCompatParcelizer());
                        }
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
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(inset insetVar, SnapshotStateList<isRound> snapshotStateList, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = insetVar;
            this.read = snapshotStateList;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.read, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(parseDouble parsedouble, findSetterInfo findsetterinfo) {
        AudioAttributesCompatParcelizer(findsetterinfo, write((parseDouble<switchToNext>) parsedouble), findsetterinfo.AudioAttributesCompatParcelizer(MediaDescriptionCompat), findsetterinfo.AudioAttributesCompatParcelizer(MediaBrowserCompatSearchResultReceiver));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hasReferringProperties read(getCreatedOnDateMs getcreatedondatems, bufferMapProperty buffermapproperty) {
        return hasReferringProperties.write(hasReferringProperties.read(((long) getOnline.RemoteActionCompatParcelizer(((Number) getcreatedondatems.invoke()).floatValue())) << 32));
    }

    private static final void AudioAttributesCompatParcelizer(findSetterInfo findsetterinfo, long j, float f, float f2) {
        float f3 = f2 / 2.0f;
        long j2 = -1;
        long j3 = -1;
        findSetterInfo.IconCompatParcelizer$default(findsetterinfo, j, getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) findsetterinfo.AudioAttributesImplApi26Parcelizer()))) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))))), getReferencedType.AudioAttributesCompatParcelizer((((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32))) & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) findsetterinfo.AudioAttributesImplApi26Parcelizer())))) | (Float.floatToRawIntBits(f - f3) << 32)), f2, findAutoDetectVisibility.INSTANCE.RemoteActionCompatParcelizer(), (setCurrentLength) null, BitmapDescriptorFactory.HUE_RED, (switchAndReturnNext) null, 0, 480, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(InputAccessor<Boolean> inputAccessor, boolean z) {
        inputAccessor.write(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getAnswerMap<Boolean, getShowPopup> IconCompatParcelizer(parseDouble<? extends getAnswerMap<? super Boolean, getShowPopup>> parsedouble) {
        return (getAnswerMap) parsedouble.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(parseDouble<Boolean> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().booleanValue();
    }

    private static final long write(parseDouble<switchToNext> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().getIconCompatParcelizer();
    }

    private static final long AudioAttributesImplBaseParcelizer(parseDouble<switchToNext> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().getIconCompatParcelizer();
    }

    private static final long AudioAttributesImplApi26Parcelizer(parseDouble<switchToNext> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().getIconCompatParcelizer();
    }

    static {
        float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(34.0f);
        MediaDescriptionCompat = fIconCompatParcelizer;
        MediaBrowserCompatSearchResultReceiver = assignParameter.IconCompatParcelizer(14.0f);
        float fIconCompatParcelizer2 = assignParameter.IconCompatParcelizer(20.0f);
        AudioAttributesImplBaseParcelizer = fIconCompatParcelizer2;
        MediaBrowserCompatItemReceiver = assignParameter.IconCompatParcelizer(24.0f);
        AudioAttributesCompatParcelizer = assignParameter.IconCompatParcelizer(2.0f);
        IconCompatParcelizer = fIconCompatParcelizer;
        write = fIconCompatParcelizer2;
        AudioAttributesImplApi26Parcelizer = assignParameter.IconCompatParcelizer(fIconCompatParcelizer - fIconCompatParcelizer2);
        RemoteActionCompatParcelizer = new safeSizeOf<>(100, 0, null, 6, null);
        MediaBrowserCompatCustomActionResultReceiver = assignParameter.IconCompatParcelizer(1.0f);
        AudioAttributesImplApi21Parcelizer = assignParameter.IconCompatParcelizer(6.0f);
        read = assignParameter.IconCompatParcelizer(125.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(boolean z, getAnswerMap getanswermap, _handleOddName _handleoddname, boolean z2, hashCode hashcode, canUseFor canusefor, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        write(z, getanswermap, _handleoddname, z2, hashcode, canusefor, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(writeReplace writereplace, boolean z, boolean z2, canUseFor canusefor, getCreatedOnDateMs getcreatedondatems, inset insetVar, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        RemoteActionCompatParcelizer(writereplace, z, z2, canusefor, getcreatedondatems, insetVar, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
