package kotlin;

import java.lang.reflect.Field;
import java.util.Set;
import kotlin.setFirstAnswer;
import kotlin.setFirstAnswerIndex;
import kotlin.setGuessed;

/* JADX INFO: loaded from: classes4.dex */
public final class setServerAnswer implements setFirstAnswer {
    private static /* synthetic */ isResolutionNotSupported<Object>[] AudioAttributesCompatParcelizer = {toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "withDefinedIn", "getWithDefinedIn()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "modifiers", "getModifiers()Ljava/util/Set;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "startFromName", "getStartFromName()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "debugMode", "getDebugMode()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "verbose", "getVerbose()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "unitReturnType", "getUnitReturnType()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "withoutReturnType", "getWithoutReturnType()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "enhancedTypes", "getEnhancedTypes()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "renderDefaultModality", "getRenderDefaultModality()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "receiverAfterName", "getReceiverAfterName()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(toMagicModuleMetaDataUcModel.write(setServerAnswer.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    private final PlaybackConfigRootResponseBody AudioAttributesImplApi21Parcelizer;
    private final PlaybackConfigRootResponseBody AudioAttributesImplApi26Parcelizer;
    private final PlaybackConfigRootResponseBody AudioAttributesImplBaseParcelizer;
    private final PlaybackConfigRootResponseBody IconCompatParcelizer;
    private final PlaybackConfigRootResponseBody MediaBrowserCompatCustomActionResultReceiver;
    private final PlaybackConfigRootResponseBody MediaBrowserCompatItemReceiver = RemoteActionCompatParcelizer(setFirstAnswerIndex.write.IconCompatParcelizer);
    private final PlaybackConfigRootResponseBody MediaBrowserCompatMediaItem;
    private final PlaybackConfigRootResponseBody MediaBrowserCompatSearchResultReceiver;
    private final PlaybackConfigRootResponseBody MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final PlaybackConfigRootResponseBody MediaDescriptionCompat;
    private final PlaybackConfigRootResponseBody MediaMetadataCompat;
    private final PlaybackConfigRootResponseBody MediaSessionCompatQueueItem;
    private final PlaybackConfigRootResponseBody MediaSessionCompatResultReceiverWrapper;
    private final PlaybackConfigRootResponseBody MediaSessionCompatToken;
    private final PlaybackConfigRootResponseBody ParcelableVolumeInfo;
    private final PlaybackConfigRootResponseBody PlaybackStateCompat;
    private final PlaybackConfigRootResponseBody RatingCompat;
    private final PlaybackConfigRootResponseBody RemoteActionCompatParcelizer;
    private final PlaybackConfigRootResponseBody handleMediaPlayPauseIfPendingOnHandler;
    private final PlaybackConfigRootResponseBody onAddQueueItem;
    private boolean onCommand;
    private final PlaybackConfigRootResponseBody onCustomAction;
    private final PlaybackConfigRootResponseBody onFastForward;
    private final PlaybackConfigRootResponseBody onMediaButtonEvent;
    private final PlaybackConfigRootResponseBody onPause;
    private final PlaybackConfigRootResponseBody onPlay;
    private final PlaybackConfigRootResponseBody onPlayFromMediaId;
    private final PlaybackConfigRootResponseBody onPlayFromSearch;
    private final PlaybackConfigRootResponseBody onPlayFromUri;
    private final PlaybackConfigRootResponseBody onPrepare;
    private final PlaybackConfigRootResponseBody onPrepareFromMediaId;
    private final PlaybackConfigRootResponseBody onPrepareFromSearch;
    private final PlaybackConfigRootResponseBody onPrepareFromUri;
    private final PlaybackConfigRootResponseBody onRemoveQueueItem;
    private final PlaybackConfigRootResponseBody onRemoveQueueItemAt;
    private final PlaybackConfigRootResponseBody onRewind;
    private final PlaybackConfigRootResponseBody onSeekTo;
    private final PlaybackConfigRootResponseBody onSetCaptioningEnabled;
    private final PlaybackConfigRootResponseBody onSetPlaybackSpeed;
    private final PlaybackConfigRootResponseBody onSetRating;
    private final PlaybackConfigRootResponseBody onSetRepeatMode;
    private final PlaybackConfigRootResponseBody onSetShuffleMode;
    private final PlaybackConfigRootResponseBody onSkipToNext;
    private final PlaybackConfigRootResponseBody onSkipToPrevious;
    private final PlaybackConfigRootResponseBody onSkipToQueueItem;
    private final PlaybackConfigRootResponseBody onStop;
    private final PlaybackConfigRootResponseBody read;
    private final PlaybackConfigRootResponseBody setSessionImpl;
    private final PlaybackConfigRootResponseBody write;

    public setServerAnswer() {
        Boolean bool = Boolean.TRUE;
        this.MediaSessionCompatQueueItem = RemoteActionCompatParcelizer(bool);
        this.MediaSessionCompatResultReceiverWrapper = RemoteActionCompatParcelizer(bool);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = RemoteActionCompatParcelizer(isSillyMistake.read);
        Boolean bool2 = Boolean.FALSE;
        this.onSetCaptioningEnabled = RemoteActionCompatParcelizer(bool2);
        this.onSetRepeatMode = RemoteActionCompatParcelizer(bool2);
        this.AudioAttributesImplBaseParcelizer = RemoteActionCompatParcelizer(bool2);
        this.AudioAttributesImplApi21Parcelizer = RemoteActionCompatParcelizer(bool2);
        this.setSessionImpl = RemoteActionCompatParcelizer(bool2);
        this.onSkipToQueueItem = RemoteActionCompatParcelizer(bool);
        this.MediaSessionCompatToken = RemoteActionCompatParcelizer(bool2);
        this.MediaBrowserCompatMediaItem = RemoteActionCompatParcelizer(bool2);
        this.onCustomAction = RemoteActionCompatParcelizer(bool2);
        this.onRemoveQueueItemAt = RemoteActionCompatParcelizer(bool);
        this.onRewind = RemoteActionCompatParcelizer(bool);
        this.onPlayFromSearch = RemoteActionCompatParcelizer(bool2);
        this.onSeekTo = RemoteActionCompatParcelizer(bool2);
        this.RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bool2);
        this.onSkipToNext = RemoteActionCompatParcelizer(bool2);
        this.onAddQueueItem = RemoteActionCompatParcelizer(bool2);
        this.PlaybackStateCompat = RemoteActionCompatParcelizer(bool2);
        this.ParcelableVolumeInfo = RemoteActionCompatParcelizer(bool2);
        this.onSkipToPrevious = RemoteActionCompatParcelizer(RemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
        this.MediaBrowserCompatCustomActionResultReceiver = RemoteActionCompatParcelizer(read.read);
        this.onSetShuffleMode = RemoteActionCompatParcelizer(bool);
        this.onPause = RemoteActionCompatParcelizer(setSelectedAnswerIndex.RENDER_OPEN);
        this.onStop = RemoteActionCompatParcelizer(setGuessed.MediaMetadataCompat.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
        this.onSetPlaybackSpeed = RemoteActionCompatParcelizer(McqAnswerIndexModel.PLAIN);
        this.onPlayFromMediaId = RemoteActionCompatParcelizer(setRight.ALL);
        this.onPrepare = RemoteActionCompatParcelizer(bool2);
        this.onPrepareFromSearch = RemoteActionCompatParcelizer(bool2);
        this.onMediaButtonEvent = RemoteActionCompatParcelizer(getRightAnswerIndex.DEBUG);
        this.onPrepareFromMediaId = RemoteActionCompatParcelizer(bool2);
        this.MediaBrowserCompatSearchResultReceiver = RemoteActionCompatParcelizer(bool2);
        this.RatingCompat = RemoteActionCompatParcelizer(getKycMessage.read());
        setParentId setparentid = setParentId.write;
        this.MediaDescriptionCompat = RemoteActionCompatParcelizer(setParentId.read());
        this.IconCompatParcelizer = RemoteActionCompatParcelizer((Object) null);
        this.read = RemoteActionCompatParcelizer(isFirstAnswerSkipped.NO_ARGUMENTS);
        this.write = RemoteActionCompatParcelizer(bool2);
        this.onPlayFromUri = RemoteActionCompatParcelizer(bool);
        this.onSetRating = RemoteActionCompatParcelizer(bool);
        this.onPrepareFromUri = RemoteActionCompatParcelizer(bool2);
        this.MediaMetadataCompat = RemoteActionCompatParcelizer(bool);
        this.onFastForward = RemoteActionCompatParcelizer(bool);
        this.onRemoveQueueItem = RemoteActionCompatParcelizer(bool2);
        this.onPlay = RemoteActionCompatParcelizer(bool2);
        this.AudioAttributesImplApi26Parcelizer = RemoteActionCompatParcelizer(bool2);
        this.handleMediaPlayPauseIfPendingOnHandler = RemoteActionCompatParcelizer(bool);
    }

    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return setFirstAnswer.IconCompatParcelizer.write(this);
    }

    public final boolean onAddQueueItem() {
        return setFirstAnswer.IconCompatParcelizer.RemoteActionCompatParcelizer(this);
    }

    public final boolean r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() {
        return this.onCommand;
    }

    public final void r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        this.onCommand = true;
    }

    public final setServerAnswer read() {
        setServerAnswer setserveranswer = new setServerAnswer();
        Field[] declaredFields = getClass().getDeclaredFields();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaredFields, "");
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                LicenseLevelRsModel licenseLevelRsModel = obj instanceof LicenseLevelRsModel ? (LicenseLevelRsModel) obj : null;
                if (licenseLevelRsModel != null) {
                    String name = field.getName();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
                    TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(name, "is");
                    isHdPlaybackError ishdplaybackerrorWrite = toMagicModuleMetaDataUcModel.write(setServerAnswer.class);
                    String name2 = field.getName();
                    StringBuilder sb = new StringBuilder("get");
                    String name3 = field.getName();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name3, "");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String strSubstring = name3.substring(1);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(upperCase);
                        sb2.append(strSubstring);
                        name3 = sb2.toString();
                    }
                    sb.append(name3);
                    field.set(setserveranswer, setserveranswer.RemoteActionCompatParcelizer(licenseLevelRsModel.read(this, new downloadMagicModuleMetalambda0(ishdplaybackerrorWrite, name2, sb.toString()))));
                }
            }
        }
        return setserveranswer;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class AudioAttributesCompatParcelizer<T> extends LicenseLevelRsModel<T> {
        private /* synthetic */ setServerAnswer AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(Object obj, setServerAnswer setserveranswer) {
            super(obj);
            this.AudioAttributesCompatParcelizer = setserveranswer;
        }

        @Override // kotlin.LicenseLevelRsModel
        public final boolean write(isResolutionNotSupported<?> isresolutionnotsupported) {
            toMagicModuleMetaRepoModel.write(isresolutionnotsupported, "");
            if (this.AudioAttributesCompatParcelizer.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4()) {
                throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
            }
            return true;
        }
    }

    private final <T> PlaybackConfigRootResponseBody<setServerAnswer, T> RemoteActionCompatParcelizer(T t) {
        getEdition getedition = getEdition.INSTANCE;
        return new AudioAttributesCompatParcelizer(t, this);
    }

    @Override // kotlin.setFirstAnswer
    public final void AudioAttributesCompatParcelizer(setFirstAnswerIndex setfirstanswerindex) {
        toMagicModuleMetaRepoModel.write(setfirstanswerindex, "");
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer[0], setfirstanswerindex);
    }

    public final setFirstAnswerIndex MediaBrowserCompatSearchResultReceiver() {
        return (setFirstAnswerIndex) this.MediaBrowserCompatItemReceiver.read(this, AudioAttributesCompatParcelizer[0]);
    }

    @Override // kotlin.setFirstAnswer
    public final void AudioAttributesImplBaseParcelizer(boolean z) {
        this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer[1], Boolean.valueOf(z));
    }

    public final boolean ParcelableVolumeInfo() {
        return ((Boolean) this.MediaSessionCompatQueueItem.read(this, AudioAttributesCompatParcelizer[1])).booleanValue();
    }

    public final boolean PlaybackStateCompat() {
        return ((Boolean) this.MediaSessionCompatResultReceiverWrapper.read(this, AudioAttributesCompatParcelizer[2])).booleanValue();
    }

    @Override // kotlin.setFirstAnswer
    public final void RemoteActionCompatParcelizer(Set<? extends isSillyMistake> set) {
        toMagicModuleMetaRepoModel.write(set, "");
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer[3], set);
    }

    public final Set<isSillyMistake> onCustomAction() {
        return (Set) this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(this, AudioAttributesCompatParcelizer[3]);
    }

    public final boolean onSetShuffleMode() {
        return ((Boolean) this.onSetCaptioningEnabled.read(this, AudioAttributesCompatParcelizer[4])).booleanValue();
    }

    @Override // kotlin.setFirstAnswer
    public final void read(boolean z) {
        this.onSetCaptioningEnabled.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer[4], Boolean.valueOf(z));
    }

    public final boolean onSetRating() {
        return ((Boolean) this.onSetRepeatMode.read(this, AudioAttributesCompatParcelizer[5])).booleanValue();
    }

    @Override // kotlin.setFirstAnswer
    public final void IconCompatParcelizer(boolean z) {
        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer[6], Boolean.valueOf(z));
    }

    @Override // kotlin.setFirstAnswer
    public final boolean IconCompatParcelizer() {
        return ((Boolean) this.AudioAttributesImplBaseParcelizer.read(this, AudioAttributesCompatParcelizer[6])).booleanValue();
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return ((Boolean) this.AudioAttributesImplApi21Parcelizer.read(this, AudioAttributesCompatParcelizer[7])).booleanValue();
    }

    public final boolean setSessionImpl() {
        return ((Boolean) this.setSessionImpl.read(this, AudioAttributesCompatParcelizer[8])).booleanValue();
    }

    @Override // kotlin.setFirstAnswer
    public final void write(boolean z) {
        this.setSessionImpl.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer[8], Boolean.valueOf(z));
    }

    public final boolean onSkipToPrevious() {
        return ((Boolean) this.onSkipToQueueItem.read(this, AudioAttributesCompatParcelizer[9])).booleanValue();
    }

    public final boolean MediaSessionCompatToken() {
        return ((Boolean) this.MediaSessionCompatToken.read(this, AudioAttributesCompatParcelizer[10])).booleanValue();
    }

    @Override // kotlin.setFirstAnswer
    public final boolean AudioAttributesCompatParcelizer() {
        return ((Boolean) this.MediaBrowserCompatMediaItem.read(this, AudioAttributesCompatParcelizer[11])).booleanValue();
    }

    public final boolean onPlayFromMediaId() {
        return ((Boolean) this.onCustomAction.read(this, AudioAttributesCompatParcelizer[12])).booleanValue();
    }

    public final boolean onRewind() {
        return ((Boolean) this.onRemoveQueueItemAt.read(this, AudioAttributesCompatParcelizer[13])).booleanValue();
    }

    public final boolean onRemoveQueueItem() {
        return ((Boolean) this.onRewind.read(this, AudioAttributesCompatParcelizer[14])).booleanValue();
    }

    public final boolean onPrepareFromMediaId() {
        return ((Boolean) this.onPlayFromSearch.read(this, AudioAttributesCompatParcelizer[15])).booleanValue();
    }

    public final boolean onRemoveQueueItemAt() {
        return ((Boolean) this.onSeekTo.read(this, AudioAttributesCompatParcelizer[16])).booleanValue();
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return ((Boolean) this.RemoteActionCompatParcelizer.read(this, AudioAttributesCompatParcelizer[17])).booleanValue();
    }

    public final boolean onStop() {
        return ((Boolean) this.onSkipToNext.read(this, AudioAttributesCompatParcelizer[18])).booleanValue();
    }

    public final boolean onCommand() {
        return ((Boolean) this.onAddQueueItem.read(this, AudioAttributesCompatParcelizer[19])).booleanValue();
    }

    @Override // kotlin.setFirstAnswer
    public final void AudioAttributesImplApi21Parcelizer(boolean z) {
        this.PlaybackStateCompat.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer[20], Boolean.valueOf(z));
    }

    public final boolean MediaSessionCompatQueueItem() {
        return ((Boolean) this.PlaybackStateCompat.read(this, AudioAttributesCompatParcelizer[20])).booleanValue();
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getLink, getLink> {
        public static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getLink invoke(getLink getlink) {
            return RemoteActionCompatParcelizer(getlink);
        }

        RemoteActionCompatParcelizer() {
            super(1);
        }

        private static getLink RemoteActionCompatParcelizer(getLink getlink) {
            toMagicModuleMetaRepoModel.write(getlink, "");
            return getlink;
        }
    }

    @Override // kotlin.setFirstAnswer
    public final void AudioAttributesImplApi26Parcelizer(boolean z) {
        this.ParcelableVolumeInfo.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer[21], Boolean.valueOf(z));
    }

    public final boolean MediaSessionCompatResultReceiverWrapper() {
        return ((Boolean) this.ParcelableVolumeInfo.read(this, AudioAttributesCompatParcelizer[21])).booleanValue();
    }

    static final class read extends MagicModuleUseCase implements getAnswerMap<getMeta, String> {
        public static final read read = new read();

        private static String read(getMeta getmeta) {
            toMagicModuleMetaRepoModel.write(getmeta, "");
            return "...";
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ String invoke(getMeta getmeta) {
            return read(getmeta);
        }

        read() {
            super(1);
        }
    }

    public final getAnswerMap<getLink, getLink> onSkipToNext() {
        return (getAnswerMap) this.onSkipToPrevious.read(this, AudioAttributesCompatParcelizer[22]);
    }

    public final getAnswerMap<getMeta, String> MediaMetadataCompat() {
        return (getAnswerMap) this.MediaBrowserCompatCustomActionResultReceiver.read(this, AudioAttributesCompatParcelizer[23]);
    }

    public final boolean onSetCaptioningEnabled() {
        return ((Boolean) this.onSetShuffleMode.read(this, AudioAttributesCompatParcelizer[24])).booleanValue();
    }

    public final setSelectedAnswerIndex onPause() {
        return (setSelectedAnswerIndex) this.onPause.read(this, AudioAttributesCompatParcelizer[25]);
    }

    public final setGuessed.MediaMetadataCompat onSkipToQueueItem() {
        return (setGuessed.MediaMetadataCompat) this.onStop.read(this, AudioAttributesCompatParcelizer[26]);
    }

    public final McqAnswerIndexModel onSetRepeatMode() {
        return (McqAnswerIndexModel) this.onSetPlaybackSpeed.read(this, AudioAttributesCompatParcelizer[27]);
    }

    @Override // kotlin.setFirstAnswer
    public final void write(McqAnswerIndexModel mcqAnswerIndexModel) {
        toMagicModuleMetaRepoModel.write(mcqAnswerIndexModel, "");
        this.onSetPlaybackSpeed.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer[27], mcqAnswerIndexModel);
    }

    @Override // kotlin.setFirstAnswer
    public final void IconCompatParcelizer(setRight setright) {
        toMagicModuleMetaRepoModel.write(setright, "");
        this.onPlayFromMediaId.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer[28], setright);
    }

    public final setRight onFastForward() {
        return (setRight) this.onPlayFromMediaId.read(this, AudioAttributesCompatParcelizer[28]);
    }

    @Override // kotlin.setFirstAnswer
    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.onPrepare.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer[29], Boolean.valueOf(z));
    }

    public final boolean onPlayFromUri() {
        return ((Boolean) this.onPrepare.read(this, AudioAttributesCompatParcelizer[29])).booleanValue();
    }

    @Override // kotlin.setFirstAnswer
    public final void RemoteActionCompatParcelizer(boolean z) {
        this.onPrepareFromSearch.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer[30], Boolean.valueOf(z));
    }

    public final boolean onPrepareFromSearch() {
        return ((Boolean) this.onPrepareFromSearch.read(this, AudioAttributesCompatParcelizer[30])).booleanValue();
    }

    public final getRightAnswerIndex onPrepare() {
        return (getRightAnswerIndex) this.onMediaButtonEvent.read(this, AudioAttributesCompatParcelizer[31]);
    }

    public final boolean onPrepareFromUri() {
        return ((Boolean) this.onPrepareFromMediaId.read(this, AudioAttributesCompatParcelizer[32])).booleanValue();
    }

    public final boolean RatingCompat() {
        return ((Boolean) this.MediaBrowserCompatSearchResultReceiver.read(this, AudioAttributesCompatParcelizer[33])).booleanValue();
    }

    public final Set<getNotesCount> MediaBrowserCompatMediaItem() {
        return (Set) this.RatingCompat.read(this, AudioAttributesCompatParcelizer[34]);
    }

    @Override // kotlin.setFirstAnswer
    public final void read(Set<getNotesCount> set) {
        toMagicModuleMetaRepoModel.write(set, "");
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer[35], set);
    }

    @Override // kotlin.setFirstAnswer
    public final Set<getNotesCount> write() {
        return (Set) this.MediaDescriptionCompat.read(this, AudioAttributesCompatParcelizer[35]);
    }

    public final getAnswerMap<dummyEditor, Boolean> AudioAttributesImplBaseParcelizer() {
        return (getAnswerMap) this.IconCompatParcelizer.read(this, AudioAttributesCompatParcelizer[36]);
    }

    @Override // kotlin.setFirstAnswer
    public final isFirstAnswerSkipped RemoteActionCompatParcelizer() {
        return (isFirstAnswerSkipped) this.read.read(this, AudioAttributesCompatParcelizer[37]);
    }

    @Override // kotlin.setFirstAnswer
    public final void read(isFirstAnswerSkipped isfirstanswerskipped) {
        toMagicModuleMetaRepoModel.write(isfirstanswerskipped, "");
        this.read.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer[37], isfirstanswerskipped);
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return ((Boolean) this.write.read(this, AudioAttributesCompatParcelizer[38])).booleanValue();
    }

    public final boolean onPlayFromSearch() {
        return ((Boolean) this.onPlayFromUri.read(this, AudioAttributesCompatParcelizer[39])).booleanValue();
    }

    public final boolean onSetPlaybackSpeed() {
        return ((Boolean) this.onSetRating.read(this, AudioAttributesCompatParcelizer[40])).booleanValue();
    }

    public final boolean onSeekTo() {
        return ((Boolean) this.onPrepareFromUri.read(this, AudioAttributesCompatParcelizer[41])).booleanValue();
    }

    public final boolean MediaDescriptionCompat() {
        return ((Boolean) this.MediaMetadataCompat.read(this, AudioAttributesCompatParcelizer[42])).booleanValue();
    }

    public final boolean onPlay() {
        return ((Boolean) this.onFastForward.read(this, AudioAttributesCompatParcelizer[43])).booleanValue();
    }

    public final boolean onMediaButtonEvent() {
        return ((Boolean) this.onPlay.read(this, AudioAttributesCompatParcelizer[45])).booleanValue();
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return ((Boolean) this.AudioAttributesImplApi26Parcelizer.read(this, AudioAttributesCompatParcelizer[46])).booleanValue();
    }

    public final boolean handleMediaPlayPauseIfPendingOnHandler() {
        return ((Boolean) this.handleMediaPlayPauseIfPendingOnHandler.read(this, AudioAttributesCompatParcelizer[47])).booleanValue();
    }
}
