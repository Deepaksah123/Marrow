package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\u001a:\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\n\u001a\u001e\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0000\u001a:\u0010\u0012\u001a\u00020\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\tH\u0003¢\u0006\u0002\u0010\u0015\u001a9\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e2\u0006\u0010\u001f\u001a\u00020\u000f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0003¢\u0006\u0002\u0010!\u001a)\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e2\u0006\u0010\u001f\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010#\"\u000e\u0010$\u001a\u00020%X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020%X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020%X\u0082T¢\u0006\u0002\n\u0000*b\b\u0002\u0010\u0016\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0002\b\t¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\t2-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0002\b\t¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\t¨\u0006("}, d2 = {"SnackbarHost", "", "hostState", "Landroidx/compose/material/SnackbarHostState;", "modifier", "Landroidx/compose/ui/Modifier;", "snackbar", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarData;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material/SnackbarHostState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "toMillis", "", "Landroidx/compose/material/SnackbarDuration;", "hasAction", "", "accessibilityManager", "Landroidx/compose/ui/platform/AccessibilityManager;", "FadeInFadeOutWithScale", "current", "content", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FadeInFadeOutTransition", "Lkotlin/Function0;", "Lkotlin/ParameterName;", "name", "animatedOpacity", "Landroidx/compose/runtime/State;", "", "animation", "Landroidx/compose/animation/core/AnimationSpec;", "visible", "onAnimationFinish", "(Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animatedScale", "(Landroidx/compose/animation/core/AnimationSpec;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "SnackbarFadeInMillis", "", "SnackbarFadeOutMillis", "SnackbarInBetweenDelayMillis", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JsonRootName {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[JsonPropertyDescription.values().length];
            try {
                iArr[JsonPropertyDescription.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JsonPropertyDescription.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JsonPropertyDescription.AudioAttributesCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            read = iArr;
        }
    }

    public static final void IconCompatParcelizer(final JsonSubTypes jsonSubTypes, _handleOddName _handleoddname, getModuleData<? super namespace, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1351125615);
        if ((i & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(jsonSubTypes) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getmoduledata) ? 256 : 128;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 147) != 146, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (i4 != 0) {
                _handleoddname = _handleOddName.INSTANCE;
            }
            if (i5 != 0) {
                getmoduledata = CTFlushPushImpressionsWork.RemoteActionCompatParcelizer.read();
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1351125615, i3, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:155)");
            }
            namespace namespaceVarAudioAttributesCompatParcelizer = jsonSubTypes.AudioAttributesCompatParcelizer();
            internSimpleName internsimplename = (internSimpleName) _handleunrecognizedcharacterescapeWrite.write(getDefaultNullValueSerializer.read());
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(namespaceVarAudioAttributesCompatParcelizer);
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(internsimplename);
            read readVarOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zIconCompatParcelizer | zIconCompatParcelizer2) || readVarOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                readVarOnPause = new read(namespaceVarAudioAttributesCompatParcelizer, internsimplename, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(readVarOnPause);
            }
            StreamReadException.IconCompatParcelizer(namespaceVarAudioAttributesCompatParcelizer, (MagicModuleSubmissionRequestBody) readVarOnPause, _handleunrecognizedcharacterescapeWrite, 0);
            RemoteActionCompatParcelizer(jsonSubTypes.AudioAttributesCompatParcelizer(), _handleoddname, getmoduledata, _handleunrecognizedcharacterescapeWrite, i3 & AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        final _handleOddName _handleoddname2 = _handleoddname;
        final getModuleData<? super namespace, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmoduledata2 = getmoduledata;
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.JsonSubTypesType
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return JsonRootName.AudioAttributesCompatParcelizer(jsonSubTypes, _handleoddname2, getmoduledata2, i, i2, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ namespace AudioAttributesCompatParcelizer;
        final /* synthetic */ internSimpleName RemoteActionCompatParcelizer;
        int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                namespace namespaceVar = this.AudioAttributesCompatParcelizer;
                if (namespaceVar != null) {
                    JsonPropertyDescription iconCompatParcelizer = namespaceVar.getIconCompatParcelizer();
                    boolean z = this.AudioAttributesCompatParcelizer.getRead() != null;
                    this.read = 1;
                    if (setCountry.IconCompatParcelizer(JsonRootName.read(iconCompatParcelizer, z, this.RemoteActionCompatParcelizer), this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                }
                return getShowPopup.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(namespace namespaceVar, internSimpleName internsimplename, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = namespaceVar;
            this.RemoteActionCompatParcelizer = internsimplename;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final long read(JsonPropertyDescription jsonPropertyDescription, boolean z, internSimpleName internsimplename) {
        long j;
        int i = WhenMappings.read[jsonPropertyDescription.ordinal()];
        if (i == 1) {
            j = Long.MAX_VALUE;
        } else if (i == 2) {
            j = 10000;
        } else {
            if (i != 3) {
                throw new RenewEligibleCreator();
            }
            j = 4000;
        }
        long j2 = j;
        return internsimplename == null ? j2 : internsimplename.AudioAttributesCompatParcelizer(j2, true, true, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void RemoteActionCompatParcelizer(final kotlin.namespace r22, kotlin._handleOddName r23, final kotlin.getModuleData<? super kotlin.namespace, ? super kotlin._handleUnrecognizedCharacterEscape, ? super java.lang.Integer, kotlin.getShowPopup> r24, kotlin._handleUnrecognizedCharacterEscape r25, final int r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.JsonRootName.RemoteActionCompatParcelizer(o.namespace, o._handleOddName, o.getModuleData, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(final namespace namespaceVar, namespace namespaceVar2, List list, final hideShimmer hideshimmer, final String str, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = i | (_handleunrecognizedcharacterescape.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 19) != 18, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1032415134, i2, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:257)");
            }
            final boolean zRemoteActionCompatParcelizer = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(namespaceVar, namespaceVar2);
            int i3 = zRemoteActionCompatParcelizer ? 150 : 75;
            int i4 = (!zRemoteActionCompatParcelizer || ArrayBlockingQueueDeserializer.RemoteActionCompatParcelizer(list).size() == 1) ? 0 : 75;
            safeSizeOf safesizeofRemoteActionCompatParcelizer = setVerticalGravity.RemoteActionCompatParcelizer(i3, i4, setShowText.read());
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(namespaceVar);
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(hideshimmer);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zIconCompatParcelizer | zIconCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.JsonRawValue
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return JsonRootName.RemoteActionCompatParcelizer(namespaceVar, hideshimmer);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            parseDouble<Float> parsedoubleIconCompatParcelizer = IconCompatParcelizer(safesizeofRemoteActionCompatParcelizer, zRemoteActionCompatParcelizer, (getCreatedOnDateMs<getShowPopup>) objOnPause, _handleunrecognizedcharacterescape, 0, 0);
            parseDouble<Float> parsedoubleAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(setVerticalGravity.RemoteActionCompatParcelizer(i3, i4, setShowText.AudioAttributesCompatParcelizer()), zRemoteActionCompatParcelizer, _handleunrecognizedcharacterescape, 0);
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = expand.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, parsedoubleAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer().floatValue(), parsedoubleAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer().floatValue(), parsedoubleIconCompatParcelizer.getRemoteActionCompatParcelizer().floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0L, null, false, null, 0L, 0L, 0, 131064, null);
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(zRemoteActionCompatParcelizer);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(str);
            boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(namespaceVar);
            Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2 | zIconCompatParcelizer3) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getAnswerMap() { // from class: o.JsonPropertyOrder
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return JsonRootName.RemoteActionCompatParcelizer(zRemoteActionCompatParcelizer, str, namespaceVar, (getConfigOverride) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
            }
            _handleOddName _handleoddname = withValueInstantiators.read$default(_handleoddnameAudioAttributesCompatParcelizer$default, false, (getAnswerMap) objOnPause2, 1, null);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iAudioAttributesCompatParcelizer = _getBigDecimal.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 0);
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddname);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            MagicModuleSubmissionRequestBody<getDependencies, Integer, getShowPopup> magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer = getDependencies.INSTANCE.AudioAttributesCompatParcelizer();
            if (_handleunrecognizedcharacterescape2.getParcelableVolumeInfo() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2.onPause(), Integer.valueOf(iAudioAttributesCompatParcelizer))) {
                _handleunrecognizedcharacterescape2.RemoteActionCompatParcelizer(Integer.valueOf(iAudioAttributesCompatParcelizer));
                _handleunrecognizedcharacterescape2.read(Integer.valueOf(iAudioAttributesCompatParcelizer), magicModuleSubmissionRequestBodyAudioAttributesCompatParcelizer);
            }
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescape, Integer.valueOf(i2 & 14));
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(final namespace namespaceVar, hideShimmer hideshimmer) {
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(namespaceVar, hideshimmer.getWrite())) {
            IntermediateLoginResponseBody.read(hideshimmer.AudioAttributesCompatParcelizer(), new getAnswerMap() { // from class: o.contentNulls
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(JsonRootName.read(namespaceVar, (ShimmerFrameLayout) obj));
                }
            });
            escapesFor iconCompatParcelizer = hideshimmer.getIconCompatParcelizer();
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.AudioAttributesCompatParcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(namespace namespaceVar, ShimmerFrameLayout shimmerFrameLayout) {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(shimmerFrameLayout.RemoteActionCompatParcelizer(), namespaceVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(boolean z, String str, final namespace namespaceVar, getConfigOverride getconfigoverride) {
        if (z) {
            MapperBuilder.AudioAttributesCompatParcelizer(getconfigoverride, hasAbstractTypeResolvers.INSTANCE.read());
        }
        MapperBuilder.IconCompatParcelizer(getconfigoverride, str);
        MapperBuilder.read$default(getconfigoverride, (String) null, new getCreatedOnDateMs() { // from class: o.alphabetic
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(JsonRootName.RemoteActionCompatParcelizer(namespaceVar));
            }
        }, 1, (Object) null);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(namespace namespaceVar) {
        namespaceVar.IconCompatParcelizer();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getModuleData getmoduledata, namespace namespaceVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(2017516783, i, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:317)");
            }
            toMagicModuleMetaRepoModel.write(namespaceVar);
            getmoduledata.AudioAttributesCompatParcelizer(namespaceVar, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer() {
        return getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ getCreatedOnDateMs<getShowPopup> AudioAttributesCompatParcelizer;
        final /* synthetic */ setOrientation<Float> IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        final /* synthetic */ LinearLayoutCompat<Float, setHoverListener> read;
        final /* synthetic */ boolean write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                LinearLayoutCompat<Float, setHoverListener> linearLayoutCompat = this.read;
                float f = this.write ? 1.0f : BitmapDescriptorFactory.HUE_RED;
                this.RemoteActionCompatParcelizer = 1;
                if (LinearLayoutCompat.AudioAttributesCompatParcelizer$default(linearLayoutCompat, QBankStatsResponse.write(f), this.IconCompatParcelizer, null, null, this, 12, null) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            this.AudioAttributesCompatParcelizer.invoke();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(LinearLayoutCompat<Float, setHoverListener> linearLayoutCompat, boolean z, setOrientation<Float> setorientation, getCreatedOnDateMs<getShowPopup> getcreatedondatems, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = linearLayoutCompat;
            this.write = z;
            this.IconCompatParcelizer = setorientation;
            this.AudioAttributesCompatParcelizer = getcreatedondatems;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.read, this.write, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static final parseDouble<Float> AudioAttributesCompatParcelizer(setOrientation<Float> setorientation, boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(2003504988, i, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:350)");
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = FitWindowsLinearLayout.read$default(!z ? 1.0f : 0.8f, BitmapDescriptorFactory.HUE_RED, 2, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objOnPause;
        boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(linearLayoutCompat);
        boolean z2 = (((i & 112) ^ 48) > 32 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(z)) || (i & 48) == 32;
        boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(setorientation);
        Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
        if ((zIconCompatParcelizer | z2 | zIconCompatParcelizer2) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause2 = (MagicModuleSubmissionRequestBody) new write(linearLayoutCompat, z, setorientation, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
        }
        StreamReadException.IconCompatParcelizer(Boolean.valueOf(z), (MagicModuleSubmissionRequestBody) objOnPause2, _handleunrecognizedcharacterescape, (i >> 3) & 14);
        parseDouble<Float> parsedouble = linearLayoutCompat.read();
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return parsedouble;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ setOrientation<Float> AudioAttributesCompatParcelizer;
        final /* synthetic */ LinearLayoutCompat<Float, setHoverListener> IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        final /* synthetic */ boolean write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                LinearLayoutCompat<Float, setHoverListener> linearLayoutCompat = this.IconCompatParcelizer;
                float f = this.write ? 1.0f : 0.8f;
                this.RemoteActionCompatParcelizer = 1;
                if (LinearLayoutCompat.AudioAttributesCompatParcelizer$default(linearLayoutCompat, QBankStatsResponse.write(f), this.AudioAttributesCompatParcelizer, null, null, this, 12, null) == objIconCompatParcelizer) {
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
        write(LinearLayoutCompat<Float, setHoverListener> linearLayoutCompat, boolean z, setOrientation<Float> setorientation, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = linearLayoutCompat;
            this.write = z;
            this.AudioAttributesCompatParcelizer = setorientation;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.IconCompatParcelizer, this.write, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static final parseDouble<Float> IconCompatParcelizer(setOrientation<Float> setorientation, boolean z, getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        if ((i2 & 4) != 0) {
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.nulls
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return JsonRootName.AudioAttributesCompatParcelizer();
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            getcreatedondatems = (getCreatedOnDateMs) objOnPause;
        }
        getCreatedOnDateMs<getShowPopup> getcreatedondatems2 = getcreatedondatems;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1016418159, i, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:340)");
        }
        Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause2 = FitWindowsLinearLayout.read$default(!z ? 1.0f : 0.0f, BitmapDescriptorFactory.HUE_RED, 2, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
        }
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objOnPause2;
        boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(linearLayoutCompat);
        boolean z2 = true;
        boolean z3 = (((i & 112) ^ 48) > 32 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(z)) || (i & 48) == 32;
        boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(setorientation);
        if ((((i & 896) ^ RendererCapabilities.MODE_SUPPORT_MASK) <= 256 || !_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getcreatedondatems2)) && (i & RendererCapabilities.MODE_SUPPORT_MASK) != 256) {
            z2 = false;
        }
        Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
        if ((zIconCompatParcelizer | z3 | zIconCompatParcelizer2 | z2) || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause3 = (MagicModuleSubmissionRequestBody) new IconCompatParcelizer(linearLayoutCompat, z, setorientation, getcreatedondatems2, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
        }
        StreamReadException.IconCompatParcelizer(Boolean.valueOf(z), (MagicModuleSubmissionRequestBody) objOnPause3, _handleunrecognizedcharacterescape, (i >> 3) & 14);
        parseDouble<Float> parsedouble = linearLayoutCompat.read();
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return parsedouble;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(namespace namespaceVar, _handleOddName _handleoddname, getModuleData getmoduledata, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        RemoteActionCompatParcelizer(namespaceVar, _handleoddname, getmoduledata, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(JsonSubTypes jsonSubTypes, _handleOddName _handleoddname, getModuleData getmoduledata, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        IconCompatParcelizer(jsonSubTypes, _handleoddname, (getModuleData<? super namespace, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) getmoduledata, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
