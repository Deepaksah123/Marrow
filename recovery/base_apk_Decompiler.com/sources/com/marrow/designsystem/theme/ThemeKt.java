package com.marrow.designsystem.theme;

import com.google.android.exoplayer2.RendererCapabilities;
import kotlin.CharacterEscapes;
import kotlin.ContentReference;
import kotlin.JsonAnySetter;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin._appendEscaped;
import kotlin._handleUnrecognizedCharacterEscape;
import kotlin._validJsonValueList;
import kotlin.getCreatedOnDateMs;
import kotlin.getShowPopup;
import kotlin.isFullscreen;
import kotlin.isSetterVisible;
import kotlin.multiplyFft;
import kotlin.releaseNameCopyBuffer;
import kotlin.resetAsNaN;
import kotlin.setJavaScriptInterface;
import kotlin.switchToNext;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00100\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0018"}, d2 = {"DarkColorPalette", "Landroidx/compose/material/Colors;", "LightColorPalette", "sepiaColorPalette", "lightExtendedColors", "Lcom/marrow/designsystem/theme/ExtendedColors;", "darkExtendedColors", "sepiaExtendedColors", "LocalExtendedColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalExtendedColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalCurrentTheme", "Lcom/marrow/designsystem/theme/AppTheme;", "getLocalCurrentTheme", "MarrowTheme", "", "defaultTheme", "shouldApplySepiaTheme", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lcom/marrow/designsystem/theme/AppTheme;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "designsystem_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ThemeKt {
    private static final ExtendedColors AudioAttributesImplApi26Parcelizer;
    private static final CharacterEscapes<ExtendedColors> IconCompatParcelizer;
    private static final ExtendedColors MediaBrowserCompatItemReceiver;
    private static final CharacterEscapes<AppTheme> RemoteActionCompatParcelizer;
    private static final ExtendedColors write;
    private static final isFullscreen AudioAttributesCompatParcelizer = setJavaScriptInterface.AudioAttributesCompatParcelizer(ColorKt.onSkipToQueueItem(), ColorKt.PlaybackStateCompat(), switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer(), switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer(), ColorKt.accessaddObserverForBackInvoker(), ColorKt.accessgetReportFullyDrawnExecutorp(), ColorKt.addObserverForBackInvoker(), ColorKt.PlaybackStateCompat(), switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer(), ColorKt.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw(), ColorKt.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw(), switchToNext.INSTANCE.AudioAttributesImplApi26Parcelizer());
    private static final isFullscreen read = setJavaScriptInterface.IconCompatParcelizer(ColorKt.onSkipToQueueItem(), ColorKt.PlaybackStateCompat(), switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer(), switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer(), ColorKt.ResultReceiver(), ColorKt.PlaybackStateCompat(), ColorKt.addObserverForBackInvoker(), ColorKt.PlaybackStateCompat(), switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer(), ColorKt.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0(), ColorKt.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0(), switchToNext.INSTANCE.AudioAttributesImplApi26Parcelizer());
    private static final isFullscreen AudioAttributesImplBaseParcelizer = setJavaScriptInterface.IconCompatParcelizer(ColorKt.onSkipToQueueItem(), ColorKt.PlaybackStateCompat(), switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer(), switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer(), ColorKt.addMenuProvider(), ColorKt.addOnTrimMemoryListener(), ColorKt.addObserverForBackInvoker(), ColorKt.PlaybackStateCompat(), switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer(), ColorKt.addContentView(), ColorKt.addContentView(), switchToNext.INSTANCE.AudioAttributesImplApi26Parcelizer());

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[AppTheme.values().length];
            try {
                iArr[AppTheme.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppTheme.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            read = iArr;
        }
    }

    static {
        long jOnSkipToQueueItem = ColorKt.onSkipToQueueItem();
        long jMediaSessionCompatQueueItem = ColorKt.MediaSessionCompatQueueItem();
        long j = ColorKt.read();
        long savedStateRegistryControllerannotations = ColorKt.getSavedStateRegistryControllerannotations();
        long jOnCustomAction = ColorKt.onCustomAction();
        long jR8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = ColorKt.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        long jOnSetShuffleMode = ColorKt.onSetShuffleMode();
        long jOnSkipToQueueItem2 = ColorKt.onSkipToQueueItem();
        long jOnPlayFromSearch = ColorKt.onPlayFromSearch();
        long jAccessonBackPresseds1027565324 = ColorKt.accessonBackPresseds1027565324();
        long onBackPressedDispatcherannotations = ColorKt.getOnBackPressedDispatcherannotations();
        long jPlaybackStateCompat = ColorKt.PlaybackStateCompat();
        long defaultViewModelCreationExtras = ColorKt.getDefaultViewModelCreationExtras();
        long defaultViewModelCreationExtras2 = ColorKt.getDefaultViewModelCreationExtras();
        long jOnSkipToNext = ColorKt.onSkipToNext();
        long defaultViewModelProviderFactory = ColorKt.getDefaultViewModelProviderFactory();
        long jOnSkipToQueueItem3 = ColorKt.onSkipToQueueItem();
        long defaultViewModelCreationExtras3 = ColorKt.getDefaultViewModelCreationExtras();
        long jAudioAttributesImplBaseParcelizer = ColorKt.AudioAttributesImplBaseParcelizer();
        long jEnsureViewModelStore = ColorKt.ensureViewModelStore();
        long defaultViewModelCreationExtras4 = ColorKt.getDefaultViewModelCreationExtras();
        long savedStateRegistryControllerannotations2 = ColorKt.getSavedStateRegistryControllerannotations();
        long jOnAddQueueItem = ColorKt.onAddQueueItem();
        long jPlaybackStateCompat2 = ColorKt.PlaybackStateCompat();
        long jOnPrepareFromSearch = ColorKt.onPrepareFromSearch();
        long jOnRewind = ColorKt.onRewind();
        long jOnSetShuffleMode2 = ColorKt.onSetShuffleMode();
        long jOnPlayFromUri = ColorKt.onPlayFromUri();
        long jOnPrepareFromMediaId = ColorKt.onPrepareFromMediaId();
        long jAddObserverForBackInvoker = ColorKt.addObserverForBackInvoker();
        long jAddOnMultiWindowModeChangedListener = ColorKt.addOnMultiWindowModeChangedListener();
        long jAddObserverForBackInvokerlambda7 = ColorKt.addObserverForBackInvokerlambda7();
        long jOnSkipToQueueItem4 = ColorKt.onSkipToQueueItem();
        long jRemoteActionCompatParcelizer = ColorKt.RemoteActionCompatParcelizer();
        long jMediaBrowserCompatItemReceiver = ColorKt.MediaBrowserCompatItemReceiver();
        long defaultViewModelProviderFactory2 = ColorKt.getDefaultViewModelProviderFactory();
        long j_init_lambda4 = ColorKt._init_lambda4();
        long jR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = ColorKt.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        long j_init_lambda3 = ColorKt._init_lambda3();
        long j_init_lambda2 = ColorKt._init_lambda2();
        long jR8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw2 = ColorKt.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        long jR8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = ColorKt.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0();
        long jR8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP02 = ColorKt.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0();
        long jAccessgetReportFullyDrawnExecutorp = ColorKt.accessgetReportFullyDrawnExecutorp();
        long jPlaybackStateCompat3 = ColorKt.PlaybackStateCompat();
        long jOnSkipToQueueItem5 = ColorKt.onSkipToQueueItem();
        long jR8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = ColorKt.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
        long jPlaybackStateCompat4 = ColorKt.PlaybackStateCompat();
        MediaBrowserCompatItemReceiver = new ExtendedColors(jOnSkipToQueueItem, jMediaSessionCompatQueueItem, j, savedStateRegistryControllerannotations, jOnCustomAction, jR8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, jOnSetShuffleMode, jOnSkipToQueueItem2, jOnPlayFromSearch, jAccessonBackPresseds1027565324, onBackPressedDispatcherannotations, jPlaybackStateCompat, defaultViewModelCreationExtras, defaultViewModelCreationExtras2, jOnSkipToNext, defaultViewModelProviderFactory, jOnSkipToQueueItem3, defaultViewModelCreationExtras3, jAudioAttributesImplBaseParcelizer, jEnsureViewModelStore, defaultViewModelCreationExtras4, savedStateRegistryControllerannotations2, jOnAddQueueItem, jPlaybackStateCompat2, jOnPrepareFromSearch, jOnRewind, jOnSetShuffleMode2, jOnPlayFromUri, jOnPrepareFromMediaId, jAddObserverForBackInvoker, jAddOnMultiWindowModeChangedListener, jAddObserverForBackInvokerlambda7, jOnSkipToQueueItem4, jRemoteActionCompatParcelizer, jMediaBrowserCompatItemReceiver, defaultViewModelProviderFactory2, j_init_lambda4, jR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, j_init_lambda3, j_init_lambda2, jR8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw2, jR8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0, jR8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP02, ColorKt.MediaSessionCompatToken(), ColorKt.PlaybackStateCompatCustomAction(), ColorKt.MediaSessionCompatResultReceiverWrapper(), ColorKt.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(), ColorKt.onPrepare(), jAccessgetReportFullyDrawnExecutorp, jPlaybackStateCompat3, jOnSkipToQueueItem5, jR8lambdaKUbBm7ckfqTc9QCgukC86fguu4, ColorKt.PlaybackStateCompat(), ColorKt.PlaybackStateCompat(), jPlaybackStateCompat4, ColorKt.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw(), ColorKt.onStop(), ColorKt.addOnContextAvailableListener(), ColorKt.AudioAttributesCompatParcelizer(), ColorKt.ResultReceiver(), null);
        write = new ExtendedColors(ColorKt.onSkipToQueueItem(), ColorKt.MediaSessionCompatQueueItem(), ColorKt.read(), ColorKt.MediaBrowserCompatMediaItem(), ColorKt.RatingCompat(), ColorKt.onAddQueueItem(), ColorKt.setSessionImpl(), ColorKt.accessgetReportFullyDrawnExecutorp(), ColorKt.onPlayFromSearch(), ColorKt.accessonBackPresseds1027565324(), ColorKt.MediaBrowserCompatMediaItem(), ColorKt.onPrepare(), ColorKt.onSeekTo(), ColorKt.onRemoveQueueItem(), ColorKt.onSkipToPrevious(), ColorKt.MediaBrowserCompatSearchResultReceiver(), ColorKt.onPlayFromSearch(), ColorKt.onSetPlaybackSpeed(), ColorKt.ParcelableVolumeInfo(), ColorKt.ensureViewModelStore(), ColorKt.accessgetReportFullyDrawnExecutorp(), ColorKt.accessgetReportFullyDrawnExecutorp(), ColorKt.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw(), ColorKt.PlaybackStateCompat(), ColorKt.onSetCaptioningEnabled(), ColorKt.onRewind(), ColorKt.onRemoveQueueItemAt(), ColorKt.onPlayFromUri(), ColorKt.onRewind(), ColorKt.addObserverForBackInvoker(), ColorKt.addOnPictureInPictureModeChangedListener(), ColorKt.createFullyDrawnExecutor(), ColorKt.onSkipToQueueItem(), ColorKt.RemoteActionCompatParcelizer(), ColorKt.onSkipToQueueItem(), ColorKt.menuHostHelperlambda0(), ColorKt.PlaybackStateCompat(), ColorKt.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(), ColorKt._init_lambda3(), ColorKt.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28(), ColorKt.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28(), ColorKt.onRewind(), ColorKt.onFastForward(), ColorKt.MediaSessionCompatToken(), ColorKt.PlaybackStateCompatCustomAction(), ColorKt.MediaSessionCompatResultReceiverWrapper(), ColorKt.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(), ColorKt.onPrepare(), ColorKt.PlaybackStateCompat(), ColorKt.accessgetReportFullyDrawnExecutorp(), ColorKt.onSkipToQueueItem(), ColorKt._init_lambda4(), ColorKt.accessensureViewModelStore(), ColorKt.onPlay(), ColorKt.onPlayFromMediaId(), ColorKt._init_lambda5(), ColorKt.AudioAttributesImplApi26Parcelizer(), ColorKt.addOnContextAvailableListener(), ColorKt.AudioAttributesCompatParcelizer(), ColorKt.onPause(), null);
        AudioAttributesImplApi26Parcelizer = new ExtendedColors(ColorKt.onSkipToQueueItem(), ColorKt.PlaybackStateCompat(), ColorKt.read(), ColorKt.MediaBrowserCompatCustomActionResultReceiver(), ColorKt.AudioAttributesImplApi21Parcelizer(), ColorKt.onMediaButtonEvent(), ColorKt.setSessionImpl(), ColorKt.getOnBackPressedDispatcherannotations(), ColorKt.onPlayFromSearch(), ColorKt.accessonBackPresseds1027565324(), ColorKt.getOnBackPressedDispatcherannotations(), ColorKt.onPrepare(), ColorKt.onPrepareFromUri(), ColorKt.PlaybackStateCompat(), ColorKt.PlaybackStateCompat(), ColorKt.PlaybackStateCompat(), ColorKt.PlaybackStateCompat(), ColorKt.PlaybackStateCompat(), ColorKt.AudioAttributesImplBaseParcelizer(), ColorKt.ensureViewModelStore(), ColorKt.onSetRepeatMode(), ColorKt.accessgetReportFullyDrawnExecutorp(), ColorKt.onMediaButtonEvent(), ColorKt.addContentView(), ColorKt.onPrepareFromMediaId(), ColorKt.onSetRating(), ColorKt.write(), ColorKt.onPlayFromUri(), ColorKt.write(), ColorKt.addObserverForBackInvoker(), ColorKt.addOnUserLeaveHintListener(), ColorKt.addObserverForBackInvokerlambda7(), ColorKt.onSkipToQueueItem(), ColorKt.RemoteActionCompatParcelizer(), ColorKt.IconCompatParcelizer(), ColorKt.addOnConfigurationChangedListener(), ColorKt.MediaMetadataCompat(), ColorKt.MediaDescriptionCompat(), ColorKt.onCommand(), ColorKt.handleMediaPlayPauseIfPendingOnHandler(), ColorKt.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28(), ColorKt.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0(), ColorKt.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0(), ColorKt.MediaSessionCompatToken(), ColorKt.PlaybackStateCompatCustomAction(), ColorKt.MediaSessionCompatResultReceiverWrapper(), ColorKt.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(), ColorKt.onPrepare(), ColorKt.accessgetReportFullyDrawnExecutorp(), ColorKt.PlaybackStateCompat(), ColorKt.onSkipToQueueItem(), ColorKt.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), ColorKt.PlaybackStateCompat(), ColorKt.PlaybackStateCompat(), ColorKt.PlaybackStateCompat(), ColorKt.onMediaButtonEvent(), ColorKt.onStop(), ColorKt.addOnContextAvailableListener(), ColorKt.AudioAttributesCompatParcelizer(), ColorKt.ResultReceiver(), null);
        IconCompatParcelizer = resetAsNaN.RemoteActionCompatParcelizer$default(null, new getCreatedOnDateMs() { // from class: com.marrow.designsystem.theme.ThemeKt$$ExternalSyntheticLambda2
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return ThemeKt.AudioAttributesImplApi21Parcelizer();
            }
        }, 1, null);
        RemoteActionCompatParcelizer = resetAsNaN.RemoteActionCompatParcelizer$default(null, new getCreatedOnDateMs() { // from class: com.marrow.designsystem.theme.ThemeKt$$ExternalSyntheticLambda3
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return ThemeKt.RemoteActionCompatParcelizer();
            }
        }, 1, null);
    }

    public static final CharacterEscapes<ExtendedColors> write() {
        return IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExtendedColors AudioAttributesImplApi21Parcelizer() {
        return MediaBrowserCompatItemReceiver;
    }

    public static final CharacterEscapes<AppTheme> IconCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppTheme RemoteActionCompatParcelizer() {
        return AppTheme.RemoteActionCompatParcelizer;
    }

    public static final void read(AppTheme appTheme, boolean z, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        int i3;
        AppTheme appTheme2;
        ExtendedColors extendedColors;
        final isFullscreen isfullscreen;
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1472857294);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(appTheme == null ? -1 : appTheme.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 256 : 128;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 147) != 146, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (i4 != 0) {
                appTheme = null;
            }
            if (i5 != 0) {
                z = false;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1472857294, i3, -1, "com.marrow.designsystem.theme.MarrowTheme (Theme.kt:338)");
            }
            if (appTheme == null) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1923340397);
                appTheme2 = (AppTheme) isSetterVisible.AudioAttributesCompatParcelizer(AppThemeManager.IconCompatParcelizer(), _handleunrecognizedcharacterescapeWrite, 0).getRemoteActionCompatParcelizer();
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1923342908);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                appTheme2 = appTheme;
            }
            if (z && AppThemeManager.AudioAttributesCompatParcelizer() && appTheme2 == AppTheme.RemoteActionCompatParcelizer) {
                appTheme2 = AppTheme.AudioAttributesCompatParcelizer;
            }
            int i6 = WhenMappings.read[appTheme2.ordinal()];
            if (i6 == 1) {
                extendedColors = write;
            } else if (i6 == 2) {
                extendedColors = AudioAttributesImplApi26Parcelizer;
            } else {
                extendedColors = MediaBrowserCompatItemReceiver;
            }
            int i7 = WhenMappings.read[appTheme2.ordinal()];
            if (i7 == 1) {
                isfullscreen = AudioAttributesCompatParcelizer;
            } else if (i7 == 2) {
                isfullscreen = AudioAttributesImplBaseParcelizer;
            } else {
                isfullscreen = read;
            }
            resetAsNaN.AudioAttributesCompatParcelizer(new ContentReference[]{IconCompatParcelizer.AudioAttributesCompatParcelizer(extendedColors), RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(appTheme2)}, multiplyFft.AudioAttributesCompatParcelizer(-1594066546, true, new MagicModuleSubmissionRequestBody() { // from class: com.marrow.designsystem.theme.ThemeKt$$ExternalSyntheticLambda0
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return ThemeKt.AudioAttributesCompatParcelizer(isfullscreen, magicModuleSubmissionRequestBody, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, ContentReference.write | 48);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        final AppTheme appTheme3 = appTheme;
        final boolean z2 = z;
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: com.marrow.designsystem.theme.ThemeKt$$ExternalSyntheticLambda1
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return ThemeKt.read(appTheme3, z2, magicModuleSubmissionRequestBody, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(isFullscreen isfullscreen, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1594066546, i, -1, "com.marrow.designsystem.theme.MarrowTheme.<anonymous> (Theme.kt:359)");
            }
            JsonAnySetter.read(isfullscreen, TypeKt.write(), ShapeKt.IconCompatParcelizer(), magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, 432, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(AppTheme appTheme, boolean z, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(appTheme, z, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
